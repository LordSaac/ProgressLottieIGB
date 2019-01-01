# Progress Lottie IGB

### Dependency

dependencies {
<br>
` implementation 'com.jgb.lordsaac.igb.progresslitieigb:progresslottieigb:0.0.1'`
 <br>
}

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
            message = "Good Morning!"      //  Center Message .  #OPTIONAL
            srcLottieJson = R.raw.loading_a // Your Source JSON Lottie 
            timer = 10000                   // Time of live for progress. #OPTIONAL
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

####  Code:
```
ProgressLoadingJIGB.startLoadingJIGB(context,R.raw.pork_dance,"Happy New Year 2019...",0);
```

#### Remove progress:  
```
  ProgressLoadingJIGB.finishLoadingJIGB(context);
```

#### Example:  
```
    ProgressLoadingJIGB.startLoadingJIGB(context,R.raw.pork_dance,"Happy New Year 2019...",0);

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

<br>
<h2>Released December 28, 2018</h2>

## Licence

Copyright 2018 Isaac G. Banda

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

