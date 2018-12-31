package com.forms.sti.progresslottieigb

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.forms.sti.progresslitieigb.ProgressLoadingIGB
import com.forms.sti.progresslitieigb.finishLoadingIGB
import com.forms.sti.progresslitieigb.starLoadingSimpleIGB
import com.forms.sti.progresslotiemanagerigb.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun click(view: View){

        ProgressLoadingIGB.startLoadingIGB(this){
            message = "Good Morning!" //  Center Message
            srcLottieJson = R.raw.loading_a // Tour Source JSON Lottie
            timer = 10000                   // Time of live for progress.



        }
    }

    fun clickOption2(view: View){

        starLoadingSimpleIGB(R.raw.pork_dance)

        Handler().postDelayed({
            finishLoadingIGB()
        }, 1500)
    }

    fun clickActivity(view: View){
        val intent = Intent(this, Main2Activity::class.java)
        startActivity(intent)
    }

}
