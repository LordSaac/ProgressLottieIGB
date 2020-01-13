package com.forms.sti.progresslottieigb;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.forms.sti.progresslitieigb.Inteface.IProgressLoadingActions;
import com.forms.sti.progresslitieigb.Model.Setting;
import com.forms.sti.progresslitieigb.ProgressLoadingIGB;
import com.forms.sti.progresslitieigb.ProgressLoadingJIGB;
import com.forms.sti.progresslotiemanagerigb.R;
import kotlin.Unit;

public class Main2Activity extends AppCompatActivity implements IProgressLoadingActions {

    private Context context = this; // your context.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }

    public void clickOption(View v){

        /**
         * @deprecated We dont need this Method because ProgressLoadingJIGB.setupLoading
         */
       // ProgressLoadingJIGB.startLoadingJIGB(context,R.raw.pork_dance,"Happy New Year 2019...",0,200,200);


         /**
         * @Note funtion lambda for java, Compile in Java 8 ...
         */
        ProgressLoadingJIGB.setupLoading = (setup) ->  {
            setup.srcLottieJson = R.raw.sun; // Tour Source JSON Lottie
            setup.message = "Welcome Summer!";//  Center Message
            setup.timer = 0;   // Time of live for progress.
            setup.width = 200; // Optional
            setup.hight = 200; // Optional
            setup.cancelButton = true; // Optional
            setup.cancelButtonAlpha = 1f; // Optional
            setup.cancelButtonHight = 50; // Optional
            setup.cancelButtonWidth = 45; // Optional
           // setup.cancelButtonBackground = R.drawable.ic_launcher_background; //OPTIONAL recomendable use vector xml

        };

        ProgressLoadingJIGB.startLoading(context);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ProgressLoadingJIGB.finishLoadingJIGB(context);
            }
        }, 6000);
    }

    @Override
    public void CancelButton() {
        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Cancel");
        builder.setMessage("Here close any process");

        // add a button
        builder.setPositiveButton("OK", null);

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
