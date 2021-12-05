package com.example.getorder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.getorder.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainActivity: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivity = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivity.root)
    }
}