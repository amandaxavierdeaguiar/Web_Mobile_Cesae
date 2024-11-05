package com.example.sharedatividades

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sharedatividades.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private val binding by lazy{
        ActivityMain3Binding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonMusica1.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(applicationContext, R.raw.zapsplat_science_fiction_alarm_thin_harsh_warning_92595)
            mediaPlayer.start()
        }
    }
}