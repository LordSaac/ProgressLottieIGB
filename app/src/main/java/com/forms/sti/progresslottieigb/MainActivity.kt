package com.forms.sti.progresslottieigb

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.forms.sti.progresslitieigb.Inteface.IProgressLoadingActions
import com.forms.sti.progresslitieigb.ProgressLoadingIGB
import com.forms.sti.progresslitieigb.finishLoadingIGB
import com.forms.sti.progresslitieigb.starLoadingSimpleIGB
import com.forms.sti.progresslotiemanagerigb.R


class MainActivity : AppCompatActivity(), IProgressLoadingActions {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

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

    fun clickOption2(view: View){

        starLoadingSimpleIGB(R.raw.funny)

        Handler().postDelayed({
            finishLoadingIGB()
        }, 1500)
    }

    fun clickActivity(view: View){
        val intent = Intent(this, Main2Activity::class.java)
        startActivity(intent)
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
