package com.saldo.testhc

import android.app.Application
import com.helpcrunch.library.core.HelpCrunch

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        initHC()
    }

    private fun initHC() {
        HelpCrunch.initialize(
            getString(R.string.hc_organization),
            resources.getInteger(R.integer.hc_app_id),
            getString(R.string.hc_secret)
        )
    }
}