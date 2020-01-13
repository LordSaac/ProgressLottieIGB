package com.forms.sti.progresslitieigb

import android.annotation.SuppressLint
import android.content.Context
import android.os.Handler
import android.support.constraint.ConstraintLayout
import android.support.graphics.drawable.VectorDrawableCompat
import android.support.v4.content.ContextCompat
import android.support.v4.graphics.drawable.DrawableCompat
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView
import com.forms.sti.progresslitieigb.Inteface.IProgressLoadingActions
import com.forms.sti.progresslitieigb.Model.JSetting
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
        val params: LinearLayout.LayoutParams = LinearLayout.LayoutParams(setting.hight,setting.width)
        val paramsButton: ConstraintLayout.LayoutParams = ConstraintLayout.LayoutParams(setting.cancelButtonWidth,setting.cancelButtonHight)
        val close = dialogView.findViewById(R.id.close) as Button
        val contentButton = dialogView.findViewById(R.id.cl_button) as ConstraintLayout


        lotieView.setAnimation(setting.srcLottieJson)
        lotieView.layoutParams = params
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

        if(setting.cancelButton){
            close.setBackgroundResource(setting.cancelButtonBackground)
            DrawableCompat.setTint(close.background, ContextCompat.getColor(context, setting.cancelButtonColor))
            close.layoutParams = paramsButton
            close.alpha = setting.cancelButtonAlpha
            contentButton.visibility = View.VISIBLE
        }

        close.setOnClickListener {
            ProgressLoadingIGB.alert.dismiss()
            ProgressLoadingIGB.isShowing = false

            if (context is IProgressLoadingActions)
                   context.CancelButton()
        }
    }

    @SuppressLint("WrongViewCast")
    fun beginJLoading(setting: JSetting, context: Context){

        val dialogAlert: AlertDialog
        val dialogBuilder = AlertDialog.Builder(context, R.style.DialogTheme)
        dialogBuilder.setCancelable(false)
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val dialogView = inflater.inflate(R.layout.dialog_progress, null)
        dialogBuilder.setView(dialogView)

        val lotieView = dialogView.findViewById(R.id.lotie) as LottieAnimationView
        val text = dialogView.findViewById(R.id.tv_loading) as TextView
        val params: LinearLayout.LayoutParams = LinearLayout.LayoutParams(setting.hight,setting.width)
        val close = dialogView.findViewById(R.id.close) as Button
        val contentButton = dialogView.findViewById(R.id.cl_button) as ConstraintLayout
        val paramsButton: ConstraintLayout.LayoutParams = ConstraintLayout.LayoutParams(setting.cancelButtonWidth,setting.cancelButtonHight)

        lotieView.setAnimation(setting.srcLottieJson)
        lotieView.layoutParams = params
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

        if(setting.cancelButton){
            close.setBackgroundResource(setting.cancelButtonBackground)
            DrawableCompat.setTint(close.background, ContextCompat.getColor(context, setting.cancelButtonColor))
            close.layoutParams = paramsButton
            close.alpha = setting.cancelButtonAlpha
            contentButton.visibility = View.VISIBLE
        }


        close.setOnClickListener {
            ProgressLoadingIGB.alert.dismiss()
            ProgressLoadingIGB.isShowing = false

            if (context is IProgressLoadingActions)
                context.CancelButton()
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