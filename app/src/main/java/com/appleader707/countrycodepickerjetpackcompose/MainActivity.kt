package com.appleader707.countrycodepickerjetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.appleader707.ccp.components.CountryCodePicker
import com.appleader707.ccp.utils.getListCountries
import com.appleader707.countrycodepickerjetpackcompose.ui.theme.CountryCodePickerJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CountryCodePickerJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    CCP()
                }
            }
        }
    }
}

@Composable
fun CCP() {
    val countryCode = CountryCodePicker() // create a new Object
    countryCode.CountryCodeDialog(
        pickedCountry = {
            Log.v("TAG", "country name is : ${it.countryName}")
        },
        defaultSelectedCountry = getListCountries().single { it.countryCode == "ir" },
        dialogSearch = true,
        dialogRounded = 22
    )
}

