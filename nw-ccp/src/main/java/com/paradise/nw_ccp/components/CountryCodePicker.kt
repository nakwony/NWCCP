package com.paradise.nw_ccp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog

import com.paradise.nw_ccp.utils.CountryCode
import com.paradise.nw_ccp.utils.getFlagMasterResID
import com.paradise.nw_ccp.utils.getListCountries
import java.util.*

class CountryCodePicker {
    private val currentCountryCode = mutableStateOf(Locale.getDefault().country.lowercase())

    fun getCurrentCountryCode(): String {
        return currentCountryCode.value
    }

    @Preview
    @Composable
    private fun PreviewCountryCodeDialog() {
        CountryCodeDialog(
            pickedCountry = {},
            defaultSelectedCountry = getListCountries().single { it.countryCode == Locale.getDefault().country.lowercase() },
        )
    }

    @Preview
    @Composable
    private fun PreviewCountryCodeDialogNoIconReducedPadding() {
        CountryCodeDialog(
            pickedCountry = {},
            defaultSelectedCountry = getListCountries().single { it.countryCode == Locale.getDefault().country.lowercase() },
            isOnlyFlagShow = true,
            isShowIcon = false,
            padding = 2.dp
        )
    }

    private val SaveMap = mutableMapOf<String, KeyParams>()

    private data class KeyParams(
        val params: String = "",
        val index: Int,
        val scrollOffset: Int
    )

    @Composable
    fun rememberForeverLazyListState(
        key: String,
        params: String = "",
        initialFirstVisibleItemIndex: Int = 0,
        initialFirstVisibleItemScrollOffset: Int = 0
    ): LazyListState {
        val scrollState = rememberSaveable(saver = LazyListState.Saver) {
            var savedValue = SaveMap[key]
            if (savedValue?.params != params) savedValue = null
            val savedIndex = savedValue?.index ?: initialFirstVisibleItemIndex
            val savedOffset = savedValue?.scrollOffset ?: initialFirstVisibleItemScrollOffset
            LazyListState(
                savedIndex,
                savedOffset
            )
        }
        DisposableEffect(Unit) {
            onDispose {
                val lastIndex = scrollState.firstVisibleItemIndex
                val lastOffset = scrollState.firstVisibleItemScrollOffset
                SaveMap[key] = KeyParams(params, lastIndex, lastOffset)
            }
        }
        return scrollState
    }

    @Composable
    fun CountryCodeDialog(
        modifier: Modifier = Modifier,
        padding: Dp = 15.dp,
        isOnlyFlagShow: Boolean = false,
        isShowIcon: Boolean = true,
        defaultSelectedCountry: CountryCode = getListCountries().first(),
        pickedCountry: (CountryCode) -> Unit,
        dialogSearch: Boolean = true,
        dialogRounded: Int = 12
    ) {
        val countryList: List<CountryCode> = getListCountries()
        var isPickCountry by remember { mutableStateOf(defaultSelectedCountry) }
        var isOpenDialog by rememberSaveable { mutableStateOf(false) }
        var searchValue by remember { mutableStateOf("") }
        Card(
            modifier = modifier
                .padding(3.dp)
                .clickable { isOpenDialog = true }
        ) {
            Column(modifier = Modifier.padding(padding)) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(
                            id = getFlagMasterResID(
                                isPickCountry.countryCode
                            )
                        ), contentDescription = null
                    )
                    if (!isOnlyFlagShow) {
                        Text(
                            "${
                                Currency.getInstance(
                                    Locale(
                                        "",
                                        isPickCountry.countryCode
                                    )
                                ).displayName
                            } ",
                            Modifier.padding(horizontal = 18.dp)
                        )
                    }
                    if (isShowIcon) {
                        Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = null)
                    }
                }
            }

            //Dialog
            if (isOpenDialog) {
                Dialog(
                    onDismissRequest = { isOpenDialog = false },
                ) {
                    Card(
                        Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.85f),
                        elevation = 4.dp,
                        shape = RoundedCornerShape(dialogRounded.dp)
                    ) {
                        Column {
                            if (dialogSearch) {
                                searchValue = dialogSearchView()
                            }

                            LazyColumn(state = rememberForeverLazyListState(key = "Overview")) {
                                items(
                                    (if (searchValue.isEmpty()) {
                                        countryList
                                    } else {
                                        countryList.searchCountryList(searchValue)
                                    })
                                ) { countryItem ->
                                    Row(
                                        Modifier
                                            .padding(
                                                horizontal = 18.dp,
                                                vertical = 18.dp
                                            )
                                            .clickable {
                                                pickedCountry(countryItem)
                                                isPickCountry = countryItem
                                                currentCountryCode.value = countryItem.countryCode
                                                isOpenDialog = false
                                            }) {
                                        Image(
                                            painter = painterResource(
                                                id = getFlagMasterResID(
                                                    countryItem.countryCode
                                                )
                                            ), contentDescription = null
                                        )
                                        Text(
                                            Locale("", countryItem.countryCode).displayName,
                                            Modifier.padding(horizontal = 18.dp)
                                        )
                                    }
                                }
                            }

                        }
                    }
                }
            }
        }
    }

    @Composable
    private fun dialogSearchView(): String {
        var searchValue by remember { mutableStateOf("") }
        Row {
            CustomTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                value = searchValue,
                onValueChange = {
                    searchValue = it
                },
                fontSize = 14.sp,
                textAlign = TextAlign.Start,
            )
        }
        return searchValue
    }

    @Composable
    private fun CustomTextField(
        modifier: Modifier = Modifier,
        value: String,
        onValueChange: (String) -> Unit,
        hint: String = "Search ...",
        fontSize: TextUnit = 16.sp,
        textAlign: TextAlign = TextAlign.Center
    ) {
        Box(
            modifier = modifier
                .background(
                    color = Color.White.copy(alpha = 0.1f)
                )
        ) {
            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = value,
                onValueChange = onValueChange,
                textStyle = LocalTextStyle.current.copy(
                    textAlign = textAlign,
                    fontSize = fontSize
                ),
                singleLine = true,
                leadingIcon = {
                    Icon(
                        Icons.Default.Search,
                        contentDescription = null,
                        tint = Color.Black.copy(0.2f)
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )
            if (value.isEmpty()) {
                Text(
                    text = hint,
                    style = MaterialTheme.typography.body1,
                    color = Color.Gray,
                    modifier = Modifier.then(
                        Modifier
                            .align(Alignment.CenterStart)
                            .padding(start = 52.dp)
                    )
                )
            }
        }
    }
}
