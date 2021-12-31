# CountryCodePickerJetpackCompose

Country Code Picker by Jetpack Compose

<h2>How to add in your project</h2>

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Appleader707:CountryCodePickerJetpackCompose:Tag'
	}
  
<h2>How to use ?</h2>

    val countryCode = CountryCodePicker() // create a new Object
    countryCode.CountryCodeDialog(
         pickedCountry = {
             Log.v("TAG", "country name is : ${it.countryName}")
         },
         defaultSelectedCountry = getListCountries().single { it.countryCode == "ir" },
         dialogSearch = true,
         dialogRounded = 22
     )
     
<h2>Preview</h2>






