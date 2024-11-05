package com.example.sharedatividades

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.sharedatividades.databinding.ActivityFullscreenBinding


class FullscreenActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityFullscreenBinding.inflate(layoutInflater)
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.addFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)


        binding.checkBateria.setOnClickListener {
            val isCheck = binding.checkBateria.isChecked
            if (isCheck) {
                val bateria: BroadcastReceiver = object : BroadcastReceiver() {
                    override fun onReceive(p0: Context?, intent: Intent?) {
                        if (intent != null) {
                            val nivel: Int = intent.getIntExtra(
                                BatteryManager.EXTRA_LEVEL,
                                0
                            )
                            binding.textNivelBateria.visibility = View . VISIBLE
                            binding.textNivelBateria.text = nivel.toString() + '%'
                        }
                    }
                }
                registerReceiver (bateria, IntentFilter(Intent.ACTION_BATTERY_CHANGED))
        } else {
            binding.textNivelBateria.visibility = View.GONE
        }
        }

        binding.layoutMenu.animate().translationY(500F)

        binding.imgFerramenta.setOnClickListener {
            binding.layoutMenu.animate().translationY(0F).setDuration(
                resources.getInteger(android.R.integer.config_mediumAnimTime).toLong()
            )
            binding.imgFerramenta.visibility = View.GONE
        }

        binding.imgClose.setOnClickListener {
            binding.imgFerramenta.visibility = View.VISIBLE
            binding.layoutMenu.animate().translationY(binding.layoutMenu.measuredHeight.toFloat())
                .setDuration(
                    resources.getInteger(android.R.integer.config_mediumAnimTime).toLong()
                )
        }
    }
}