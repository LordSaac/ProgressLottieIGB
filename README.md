<h1  align="center"> Progress Lottie IGB </h1>


Manager of progress using Lottie JSON,  compatible for Java and Kotlin.

<p align="center">

|Int Top|In Bottom|
|:----:|:----:|
|<img  height="568" width="320" src="https://github.com/LordSaac/ProgressLottieIGB/blob/master/Media/Screenshot_2018-12-31-18-10-48.png">|<img  height="568" width="320" src="https://github.com/LordSaac/ProgressLottieIGB/blob/master/Media/Screenshot_2018-12-31-18-11-00.png">|
</p>

## Important Info:  
#### To create a raw folder:

- Right-click the res folder.
- Choose New.
- Choose Android Resource Directory.
- Name the directory raw.
- In the Resource Types Section add raw.
- Click ok.
- **Copy your JSON lottie in RAW folder**

***New options for personality:***

* Size text message
* Style Dialog
* Color text message
* Add font for text

Add font for your project check documents: 
https://developer.android.com/guide/topics/ui/look-and-feel/downloadable-fonts

<hr>
<h1 align="center">KOTLIN CODE </h1>

#### Code:  
```Kotlin
    ProgressLoadingIGB.startLoadingIGB(this){
            message = "Good Morning!" //  Center Message
            srcLottieJson = R.raw.loading_a // Tour Source JSON Lottie
            timer = 10000                   // Time of live for progress.
            hight = 500 // Optional
            width = 500 // Optional
            
        }

```



#### StartLoading Whith Simple Method:  

```Kotlin
starLoadingSimpleIGB(R.raw.pork_dance)

```

#### Remove progress:  

```Kotlin
finishLoadingIGB()
```

#### Example:  

```Kotlin
      starLoadingSimpleIGB(R.raw.pork_dance)

        Handler().postDelayed({
            finishLoadingIGB()
        }, 1500)
```

## Use cancel button:  
This method the user will active for cancel any process.
#### Add this implement in your class: ```Kotlin IProgressLoadingActions```
#### Example:  
```Kotlin
class MainActivity : AppCompatActivity(), IProgressLoadingActions {
      
      
       fun click(view: View){

        ProgressLoadingIGB.startLoadingIGB(this){
            message = "Please Wait" //  Center Message
            sizeTextMessage = 50.0f // Size text // Optional
            fontTextMessage = your font project// Set your personal font // Optional
            srcLottieJson = R.raw.loader // Your Source JSON Lottie
            fontColorMessage = Color.GREEN
            timer = 10000               // Time of live for progress.
            hight = 700 // Optional
            width = 700 // Optional
            cancelButton = true // Optional added cancel button
            cancelButtonAlpha = 0.6f  // Optional
            cancelButtonHight = 75  // Optional
            cancelButtonWidth = 60 // Optional
            cancelButtonColor = R.color.colorAccent  // Optional
           // cancelButtonBackground = R.drawable.ic_launcher_background //OPTIONAL recommendable use vector xml

        }
    }
      override fun CancelButton() {
        val builder =
            AlertDialog.Builder(this)
        builder.setTitle("Cancel")
        builder.setMessage("Here close any process")

        builder.setPositiveButton("OK", null)

        val dialog = builder.create()
        dialog.show()
    }
}
```

<hr>
<h1 align="center">JAVA CODE </h1>

It is recommended to use Java 8 onwards.
####  Code:
```Java
        ProgressLoadingJIGB.setupLoading = (setup) ->  {
            setup.srcLottieJson = R.raw.sun; // Tour Source JSON Lottie
            setup.message = "Welcome Summer!";//  Center Message
            setup.timer = 0;   // Time of live for progress.
            setup.width = 200; // Optional
            setup.hight = 200; // Optional
        };
```

#### StartLoading Whith Simple Method:  

```Java
ProgressLoadingJIGB.startLoading(this);

```

#### Remove progress:  
```Java
  ProgressLoadingJIGB.finishLoadingJIGB(context);
```
#### Example:  
```Java
           ProgressLoadingJIGB.setupLoading = (setup) ->  {
            setup.srcLottieJson = R.raw.sun; // Tour Source JSON Lottie
            setup.message = "Welcome Summer!";//  Center Message
            setup.timer = 0;   // Time of live for progress.
            setup.width = 200; // Optional
            setup.hight = 200; // Optional
        };

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ProgressLoadingJIGB.finishLoadingJIGB(context);
            }
        }, 6000);
```

## Use cancel button:  
This method the user will active for cancel any process.
#### Add this implement in your class: ```IProgressLoadingActions```
#### Example:  
```Java
public class Main2Activity extends AppCompatActivity implements IProgressLoadingActions {
      
      
      public void clickOption(View v){

           ProgressLoadingJIGB.setupLoading = (setup) ->  {
            setup.srcLottieJson = R.raw.travel; // Your Source JSON Lottie
            setup.message = "Welcome Summer!";//  Center Message
            setup.sizeTextMessage = 16.0f;// Size text // Optional
            setup.styleDialog = Your Style; // Optional
            setup.timer = 0;   // Time of live for progress.
            setup.width = 500; // Optional
            setup.hight = 500; // Optional
            setup.cancelButton = true; // Optional
            setup.cancelButtonAlpha = 1f; // Optional
            setup.cancelButtonHight = 75; // Optional
            setup.cancelButtonWidth = 45; // Optional
           // setup.cancelButtonBackground = R.drawable.ic_launcher_background; //OPTIONAL recomendable use vector xml

        };


      }
        
    @Override
    public void CancelButton() {
        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Cancel");
        builder.setMessage("Here close any process");

        // add a button
        builder.setPositiveButton("OK", null);

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
```


# Gradle

dependencies {
<br>
` implementation 'com.jgb.lordsaac.igb.progresslitieigb:progresslottieigb:1.0.2'`
 <br>
}
<br>
<br>
:coffee: Oh, amazing, I buy you a [coffee](https://paypal.me/LordSaac?locale.x=es_XC)
<br>
:star: Do you like library, give it a [star](https://github.com/LordSaac/ProgressLottieIGB)
<br>
:raised_hands: Thanks! 

# Android version:

:eight_spoked_asterisk: Do you need iOS Version for you project ?, check out here: https://github.com/LordSaac/IGProgressLottie-Swift

# Download more Animations:

See more animations here: https://www.lottiefiles.com/

<br>
<h2>Released July 17, 2020</h2>

## Licence

Copyright 2020 Isaac G. Banda

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

