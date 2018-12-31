package com.forms.sti.progresslitieigb

import android.content.Context
import android.os.Handler
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import com.airbnb.lottie.LottieAnimationView
import com.forms.sti.progresslitieigb.Model.Setting


class ProgressLoadingIGB {

    companion object {
        lateinit var alert: AlertDialog
        var isShowing: Boolean = false

        inline fun startLoadingIGB(context:Context,obj: Setting.() -> Unit) {

            val setting = Setting()
            val managerLoadingIGB = ManagerLoadingIGB()

            setting.obj()
            managerLoadingIGB.beginLoading(setting,context)

        }
    }

}

