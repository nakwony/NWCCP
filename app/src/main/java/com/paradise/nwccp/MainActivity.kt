package com.paradise.nwccp

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.tooling.preview.Preview
import com.paradise.nw_ccp.components.CountryCodePicker
import com.paradise.nwccp.ui.theme.NWCCPTheme
import com.paradise.nw_ccp.utils.getListCountries

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
        setContent {
            NWCCPTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column {
        CCP_Card()
    }
}

@Composable
fun CCP_Card() {
    val countryCodePicker by remember { mutableStateOf(CountryCodePicker()) }
    val context = LocalContext.current
    Column {
        countryCodePicker.CountryCodeDialog(
            pickedCountry = {
                Toast.makeText(
                    context,
                    "Selected Country ${it.countryName}",
                    Toast.LENGTH_SHORT
                ).show()
            },
            defaultSelectedCountry = getListCountries().single { it.countryCode == Locale.current.region.lowercase() },
            dialogSearch = true,
            dialogRounded = 22
        )
    }
}

@Preview("MainPreview", showBackground = true)
@Composable
fun DefaultPreview() {
    NWCCPTheme {
        MainScreen()
    }
}