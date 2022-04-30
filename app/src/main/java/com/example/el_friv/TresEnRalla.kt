package com.example.el_friv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class TresEnRalla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tres_en_ralla)

        var torn: Boolean = true // true -> x / false -> o

        // Llista de botons
        val btn_00 = findViewById<Button>(R.id.btn_00)
        /*val btn_01 = findViewById<Button>(R.id.btn_00)
        val btn_02 = findViewById<Button>(R.id.btn_00)
        val btn_10 = findViewById<Button>(R.id.btn_00)
        val btn_11 = findViewById<Button>(R.id.btn_00)
        val btn_12 = findViewById<Button>(R.id.btn_00)*/

        //Llista de imatges
        val imatge_00_x = findViewById<ImageView>(R.id.image_00_x)
        val imatge_00_o = findViewById<ImageView>(R.id.image_00_o)

        // Set all images invisible
        imatge_00_x.setVisibility(View.INVISIBLE)
        imatge_00_o.setVisibility(View.INVISIBLE)

        //Llista de posicions Vàlides


        //Funcions
        btn_00.setOnClickListener {
            if(torn == true) {
                imatge_00_x.setVisibility(View.VISIBLE)
                torn = false
            }else{
                imatge_00_o.setVisibility(View.VISIBLE)
                torn = true
            }

        }
    }



    fun buttonSelected(torn: Boolean, image: ImageView){
        image.setVisibility(View.VISIBLE)
    }



}


