package com.saldo.testhc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.helpcrunch.library.core.Callback
import com.helpcrunch.library.core.HelpCrunch
import com.helpcrunch.library.core.options.HCOptions
import com.helpcrunch.library.core.options.design.HCTheme
import com.saldo.testhc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            openHc()
        }
    }

    private fun openHc() {
        HelpCrunch.showChatScreen(
            options = HCOptions
                .Builder()
                .setTheme(
                    HCTheme
                        .Builder(HCTheme.Type.DARK)
                        .build()
                )
                .build(),
            callback = object : Callback<Any?>() {
                override fun onError(message: String) {
                    Snackbar.make(binding.button, message, Snackbar.LENGTH_LONG).show()
                }
            }
        )
    }
}