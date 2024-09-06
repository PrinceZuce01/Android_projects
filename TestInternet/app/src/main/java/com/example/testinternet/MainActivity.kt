package com.example.testinternet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

private lateinit var internetLayout : RelativeLayout
private lateinit var noInternetLayout : RelativeLayout
private lateinit var tryAgainButton : Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}