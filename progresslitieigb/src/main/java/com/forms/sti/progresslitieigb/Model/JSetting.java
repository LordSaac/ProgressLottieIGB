package com.forms.sti.progresslitieigb.Model;

import android.graphics.Color;
import android.widget.LinearLayout;

import com.forms.sti.progresslitieigb.R;

public class JSetting {

    public int timer = 0;
    public String message = "";
    public int  srcLottieJson = 0;
    public int fontTextMessage = 0;
    public int fontColorMessage = Color.WHITE;
    public int styleDialog = R.style.DialogTheme;
    public float  sizeTextMessage = 14.0f;
    public int width = LinearLayout.LayoutParams.MATCH_PARENT;
    public int hight = 350;
    public boolean cancelButton = false;
    public int cancelButtonColor = R.color.colorAccent;
    public int cancelButtonWidth = 50;
    public int cancelButtonHight = 55;
    public float cancelButtonAlpha = 0.5f;
    public int cancelButtonBackground  = R.drawable.ic_times;
}
