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
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.paradise.nw_ccp.components.CountryCodePicker
import com.paradise.nwccp.ui.theme.NWCCPTheme
import com.paradise.nw_ccp.utils.getListCountries
import java.text.NumberFormat
import java.util.*

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
    val countryCodePicker by remember { mutableStateOf(CountryCodePicker("us")) }
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
            defaultSelectedCountry = getListCountries().single {
                it.countryCode == "us"
            },
            dialogSearch = true,
            dialogRounded = 22
        )
        Text(
            NumberFormat.getCurrencyInstance(
                Locale(
                    "", countryCodePicker.getCurrentCountryCode()
                )
            ).format(1),
            modifier = Modifier.align(CenterHorizontally)
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