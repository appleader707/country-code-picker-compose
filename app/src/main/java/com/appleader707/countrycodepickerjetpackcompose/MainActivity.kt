package com.appleader707.countrycodepickerjetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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

                    val isOpen = remember { mutableStateOf(false) }

                    Text(text = "Hello World")

                    Button(onClick = { isOpen.value = true }) {
                        Text(text = "Open CCP")
                    }

                    if (isOpen.value) {
                        CCP()
                    }
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

