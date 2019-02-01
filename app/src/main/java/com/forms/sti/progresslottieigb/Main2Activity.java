package com.forms.sti.progresslottieigb;

import android.content.Context;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.forms.sti.progresslitieigb.Model.Setting;
import com.forms.sti.progresslitieigb.ProgressLoadingIGB;
import com.forms.sti.progresslitieigb.ProgressLoadingJIGB;
import com.forms.sti.progresslotiemanagerigb.R;
import kotlin.Unit;

public class Main2Activity extends AppCompatActivity {

    private Context context = this; // your context.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }

    public void clickOption(View v){


        ProgressLoadingJIGB.startLoadingJIGB(context,R.raw.pork_dance,"Happy New Year 2019...",0,200,200);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ProgressLoadingJIGB.finishLoadingJIGB(context);
            }
        }, 6000);
    }
}
