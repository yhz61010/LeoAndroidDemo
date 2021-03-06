package com.leovp.demo.basic_components.examples.provider

import android.os.Bundle
import com.leovp.demo.base.BaseDemonstrationActivity
import com.leovp.demo.databinding.ActivityProviderBinding
import com.leovp.log_sdk.base.ITAG

class ProviderActivity : BaseDemonstrationActivity<ActivityProviderBinding>() {
    override fun getTagName(): String = ITAG

    override fun getViewBinding(savedInstanceState: Bundle?): ActivityProviderBinding {
        return ActivityProviderBinding.inflate(layoutInflater)
    }
}