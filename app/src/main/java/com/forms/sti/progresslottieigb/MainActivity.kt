package com.forms.sti.progresslottieigb

import android.content.Intent
import android.graphics.Color
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
            message = "Please Wait" //  Center Message
            sizeTextMessage = 50.0f // Size text // Optional
            fontTextMessage = R.raw.caveat_regular// Set your personal font // Optional
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
