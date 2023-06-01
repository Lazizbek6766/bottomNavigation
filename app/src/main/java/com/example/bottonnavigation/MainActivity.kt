package com.example.bottonnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottonnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            bottomNavigationView.background = null
            bottomNavigationView.menu.getItem(2).isEnabled = false
        }

    }
}