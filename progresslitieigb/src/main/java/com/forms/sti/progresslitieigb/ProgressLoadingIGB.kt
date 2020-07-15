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

//        var loading_1:Int = R.raw.loading_1
//        var loading_2:Int = R.raw.loading_2
//        var loading_3:Int = R.raw.loading_3
//        var loading_4:Int = R.raw.loading_4
//        var loading_5:Int = R.raw.loading_5
//        var loading_6:Int = R.raw.loading_6

        inline fun startLoadingIGB(context:Context,obj: Setting.() -> Unit) {

            val setting = Setting()
            val managerLoadingIGB = ManagerLoadingIGB()

            setting.obj()
            managerLoadingIGB.beginLoading(setting,context)

        }
    }

}

