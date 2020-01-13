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


## Kotlin Code

#### Code:  
```
    ProgressLoadingIGB.startLoadingIGB(this){
            message = "Good Morning!" //  Center Message
            srcLottieJson = R.raw.loading_a // Tour Source JSON Lottie
            timer = 10000                   // Time of live for progress.
            hight = 500 // Optional
            width = 500 // Optional
            
        }

```

## Use cancel button:  

#### Add **IProgressLoadingActions** in your class
#### Example:  
```
class MainActivity : AppCompatActivity(), IProgressLoadingActions {
      
      
      fun click(view: View){

        ProgressLoadingIGB.startLoadingIGB(this){
            message = "Good Morning!" //  Center Message
            srcLottieJson = R.raw.loader // Tour Source JSON Lottie
            timer = 10000                   // Time of live for progress.
            hight = 500 // Optional
            width = 500 // Optional
            cancelButton = true // Optional added cancel button
            cancelButtonAlpha = 0.6f  // Optional
            cancelButtonHight = 75  // Optional
            cancelButtonWidth = 60 // Optional
            cancelButtonColor = R.color.colorPrimary  // Optional
           // cancelButtonBackground = R.drawable.ic_launcher_background //OPTIONAL recomendable use vector xml
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

#### Simple Method:  

```
starLoadingSimpleIGB(R.raw.pork_dance)

```

#### Remove progress:  

```
finishLoadingIGB()
```

#### Example:  

```
      starLoadingSimpleIGB(R.raw.pork_dance)

        Handler().postDelayed({
            finishLoadingIGB()
        }, 1500)
```
## Java Code
It is recommended to use Java 8 onwards.
####  Code:
```
        ProgressLoadingJIGB.setupLoading = (setup) ->  {
            setup.srcLottieJson = R.raw.sun; // Tour Source JSON Lottie
            setup.message = "Welcome Summer!";//  Center Message
            setup.timer = 0;   // Time of live for progress.
            setup.width = 200; // Optional
            setup.hight = 200; // Optional
        };
```

## Use cancel button:  

#### Add **IProgressLoadingActions** in your class
#### Example:  
```
public class Main2Activity extends AppCompatActivity implements IProgressLoadingActions {
      
      
      public void clickOption(View v){

          ProgressLoadingJIGB.setupLoading = (setup) ->  {
            setup.srcLottieJson = R.raw.sun; // Tour Source JSON Lottie
            setup.message = "Welcome Summer!";//  Center Message
            setup.timer = 0;   // Time of live for progress.
            setup.width = 200; // Optional
            setup.hight = 200; // Optional
            setup.cancelButton = true; // Optional
            setup.cancelButtonAlpha = 1f; // Optional
            setup.cancelButtonHight = 50; // Optional
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

#### Remove progress:  
```
  ProgressLoadingJIGB.finishLoadingJIGB(context);
```

#### Example:  
```
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

### For More Animations:

Here: https://www.lottiefiles.com/

### Dependency:

dependencies {
<br>
` implementation 'com.jgb.lordsaac.igb.progresslitieigb:progresslottieigb:1.0.0'`
 <br>
}
<br>
<br>
:coffee: Oh, amazing, I buy you a coffee [Here](https://paypal.me/LordSaac?locale.x=es_XC)
<br>
:star: Or you could give a star [Here](https://github.com/LordSaac/ProgressLottieIGB)
<br>
:raised_hands: Thanks! 


<br>
<h2>Released January 13, 2020</h2>

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

