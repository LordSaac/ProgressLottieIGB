package com.forms.sti.progresslitieigb;

import android.content.Context;
import com.forms.sti.progresslitieigb.Inteface.IProgressLoadingIGB;
import com.forms.sti.progresslitieigb.Model.JSetting;
import com.forms.sti.progresslitieigb.Model.Setting;

public class ProgressLoadingJIGB {


    public static IProgressLoadingIGB setupLoading;
    private static JSetting setting = new JSetting();

    /**
     *@deprecated Please now use newMethod()
     *@see // STOPSHIP: 6/8/2019  ()
     */
    @SuppressWarnings( "deprecation" )
    public static void startLoadingJIGB(Context context, int srcLottie, String message, int timer, int width, int  higth){

        ManagerLoadingIGB managerLoadingIGB = new ManagerLoadingIGB();
        Setting setting = new Setting();

        setting.setSrcLottieJson(srcLottie);
        setting.setMessage(message);
        setting.setTimer(timer);

        if(width > 0)
            setting.setWidth(width);
        if(higth > 0)
            setting.setHight(width);

        managerLoadingIGB.beginLoading(setting,context);
    }


    public static void startLoading(Context context){
        setupLoading.body(setting);

        ManagerLoadingIGB managerLoadingIGB = new ManagerLoadingIGB();
        managerLoadingIGB.beginJLoading(setting,context);
    }

    public static void finishLoadingJIGB(Context context){
        ManagerLoadingIGB.Companion.finishLoadingJIGB(context);
    }


}
