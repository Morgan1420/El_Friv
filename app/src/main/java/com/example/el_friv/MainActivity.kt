package com.example.el_friv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import  android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playButton = findViewById<Button>(R.id.btnPlay)

        playButton.setOnClickListener{
           val intent = Intent(this@MainActivity, MinigameSelector::class.java)
            startActivity(intent)
        }



    }


}