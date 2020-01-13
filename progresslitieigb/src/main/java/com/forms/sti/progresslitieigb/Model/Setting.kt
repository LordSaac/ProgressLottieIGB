package com.forms.sti.progresslitieigb.Model
import android.widget.LinearLayout
import com.forms.sti.progresslitieigb.R

class Setting {

    var timer: Int = 0
    var message: String = ""
    var srcLottieJson: Int = 0
    var width: Int = LinearLayout.LayoutParams.MATCH_PARENT
    var hight: Int = 350
    var cancelButton: Boolean = false
    var cancelButtonColor: Int = R.color.colorAccent
    var cancelButtonBackground : Int = R.drawable.ic_times
    var cancelButtonWidth: Int = 50
    var cancelButtonHight: Int = 55
    var cancelButtonAlpha: Float = 0.5f
}