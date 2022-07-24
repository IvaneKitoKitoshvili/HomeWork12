package com.example.homework12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework12.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var PicsAdapter: PicsAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onRestart() {
        super.onRestart()
    }
}