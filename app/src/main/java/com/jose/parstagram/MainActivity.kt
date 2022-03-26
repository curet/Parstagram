package com.jose.parstagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 *  User is able to create a post by taking a picture with their camera
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}