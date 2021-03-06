package com.leovp.demo.basic_components.examples

import android.os.Bundle
import android.view.View
import com.leovp.androidbase.exts.android.toast
import com.leovp.demo.base.BaseDemonstrationActivity
import com.leovp.demo.databinding.ActivityTakeScreenshotBinding
import com.leovp.lib_image.writeToFile
import com.leovp.log_sdk.base.ITAG
import com.leovp.screencapture.screenshot.CaptureUtil
import java.io.File

class TakeScreenshotActivity : BaseDemonstrationActivity<ActivityTakeScreenshotBinding>() {
    override fun getTagName(): String = ITAG

    override fun getViewBinding(savedInstanceState: Bundle?): ActivityTakeScreenshotBinding {
        return ActivityTakeScreenshotBinding.inflate(layoutInflater)
    }

    fun onScreenshot(@Suppress("UNUSED_PARAMETER") view: View) {
        val bitmap = CaptureUtil.takeScreenshot(window)
        bitmap?.let {
            val screenshotFile = File(getExternalFilesDir(null), "screenshot.jpg")
            it.writeToFile(screenshotFile, 100)
            toast("Screenshot is saved in ${screenshotFile.absolutePath}")
        }
    }
}