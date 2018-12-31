package com.forms.sti.progresslitieigb;

import android.content.Context;
import com.forms.sti.progresslitieigb.Model.Setting;

public class ProgressLoadingJIGB {

    public static void startLoadingJIGB(Context context, int srcLottie, String message, int timer){

        ManagerLoadingIGB managerLoadingIGB = new ManagerLoadingIGB();
        Setting setting = new Setting();

        setting.setSrcLottieJson(srcLottie);
        setting.setMessage(message);
        setting.setTimer(timer);

        managerLoadingIGB.beginLoading(setting,context);
    }

    public static void finishLoadingJIGB(Context context){
        ManagerLoadingIGB.Companion.finishLoadingJIGB(context);
    }
}
