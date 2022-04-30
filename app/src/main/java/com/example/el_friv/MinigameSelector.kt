package com.example.el_friv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MinigameSelector : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minigame_selector)

        val btnTresEnRalla = findViewById<Button>(R.id.btnTresEnRaya)
        val btnFallingBricks = findViewById<Button>(R.id.btnFallingBricks)


        btnTresEnRalla.setOnClickListener {
            val intent = Intent(this@MinigameSelector, TresEnRalla::class.java)
            startActivity(intent)
        }

        btnFallingBricks.setOnClickListener {
            val intent = Intent(this@MinigameSelector, FallingBricks::class.java)
            startActivity(intent)
        }
    }
}