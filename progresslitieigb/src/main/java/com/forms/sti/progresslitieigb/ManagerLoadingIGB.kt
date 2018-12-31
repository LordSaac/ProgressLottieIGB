package com.forms.sti.progresslitieigb

import android.annotation.SuppressLint
import android.content.Context
import android.os.Handler
import android.speech.tts.TextToSpeech
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView
import com.forms.sti.progresslitieigb.Model.Setting


class ManagerLoadingIGB{

    @SuppressLint("WrongViewCast")
    fun beginLoading(setting: Setting, context: Context){

        val dialogAlert: AlertDialog
        val dialogBuilder = AlertDialog.Builder(context, R.style.DialogTheme)
        dialogBuilder.setCancelable(false)
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val dialogView = inflater.inflate(R.layout.dialog_progress, null)
        dialogBuilder.setView(dialogView)

        val lotieView = dialogView.findViewById(R.id.lotie) as LottieAnimationView
        val text = dialogView.findViewById(R.id.tv_loading) as TextView

        lotieView.setAnimation(setting.srcLottieJson)

        dialogAlert = dialogBuilder.create()

        ProgressLoadingIGB.alert = dialogAlert

        ProgressLoadingIGB.alert.show()

        ProgressLoadingIGB.isShowing = true

        if(setting.timer > 0)
            Handler().postDelayed({
                ProgressLoadingIGB.alert.dismiss()
                ProgressLoadingIGB.isShowing = false
            }, setting.timer.toLong())

        if(setting.message.isNotEmpty()){
            text.visibility = View.VISIBLE
            text.text = setting.message
        }
    }

    companion object {

        // Use only one for code java
        fun Context.finishLoadingJIGB() {

            if (ProgressLoadingIGB.isShowing) {
                ProgressLoadingIGB.alert.dismiss()
                ProgressLoadingIGB.isShowing = false
            }
        }
    }

}

fun Context.starLoadingSimpleIGB(srcLotieJson: Int) {

    val dialogAlert: AlertDialog
    val dialogBuilder = AlertDialog.Builder(this, R.style.DialogTheme)
    dialogBuilder.setCancelable(false)
    val inflater = this.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    val dialogView = inflater.inflate(R.layout.dialog_progress, null)
    dialogBuilder.setView(dialogView)

    val lotieView = dialogView.findViewById(R.id.lotie) as LottieAnimationView

    lotieView.setAnimation(srcLotieJson)

    dialogAlert = dialogBuilder.create()

    ProgressLoadingIGB.alert = dialogAlert

    ProgressLoadingIGB.alert.show()

    ProgressLoadingIGB.isShowing = true
}

fun Context.finishLoadingIGB(){

    if(ProgressLoadingIGB.isShowing){
        ProgressLoadingIGB.alert.dismiss()
        ProgressLoadingIGB.isShowing = false
    }

}