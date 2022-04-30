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
        val btn_01 = findViewById<Button>(R.id.btn_01)
        val btn_02 = findViewById<Button>(R.id.btn_02)
        val btn_10 = findViewById<Button>(R.id.btn_10)
        val btn_11 = findViewById<Button>(R.id.btn_11)
        val btn_12 = findViewById<Button>(R.id.btn_12)
        val btn_20 = findViewById<Button>(R.id.btn_22)
        val btn_21 = findViewById<Button>(R.id.btn_22)
        val btn_22 = findViewById<Button>(R.id.btn_22)

        //Llista de imatges
        val imatge_00_x = findViewById<ImageView>(R.id.image_00_x)
        val imatge_00_o = findViewById<ImageView>(R.id.image_00_o)
        val imatge_01_x = findViewById<ImageView>(R.id.image_01_x)
        val imatge_01_o = findViewById<ImageView>(R.id.image_01_o)
        val imatge_02_x = findViewById<ImageView>(R.id.image_02_x)
        val imatge_02_o = findViewById<ImageView>(R.id.image_02_o)
        val imatge_10_x = findViewById<ImageView>(R.id.image_10_x)
        val imatge_10_o = findViewById<ImageView>(R.id.image_10_o)
        val imatge_11_x = findViewById<ImageView>(R.id.image_11_x)
        val imatge_11_o = findViewById<ImageView>(R.id.image_11_o)
        val imatge_12_x = findViewById<ImageView>(R.id.image_12_x)
        val imatge_12_o = findViewById<ImageView>(R.id.image_12_o)
        val imatge_20_x = findViewById<ImageView>(R.id.image_20_x)
        val imatge_20_o = findViewById<ImageView>(R.id.image_20_o)
        val imatge_21_x = findViewById<ImageView>(R.id.image_21_x)
        val imatge_21_o = findViewById<ImageView>(R.id.image_21_o)
        val imatge_22_x = findViewById<ImageView>(R.id.image_22_x)
        val imatge_22_o = findViewById<ImageView>(R.id.image_22_o)

        // Set all images invisible
        imatge_00_x.setVisibility(View.INVISIBLE)
        imatge_00_o.setVisibility(View.INVISIBLE)
        imatge_01_x.setVisibility(View.INVISIBLE)
        imatge_01_o.setVisibility(View.INVISIBLE)
        imatge_02_x.setVisibility(View.INVISIBLE)
        imatge_02_o.setVisibility(View.INVISIBLE)
        imatge_10_x.setVisibility(View.INVISIBLE)
        imatge_10_o.setVisibility(View.INVISIBLE)
        imatge_11_x.setVisibility(View.INVISIBLE)
        imatge_11_o.setVisibility(View.INVISIBLE)
        imatge_12_x.setVisibility(View.INVISIBLE)
        imatge_12_o.setVisibility(View.INVISIBLE)
        imatge_20_x.setVisibility(View.INVISIBLE)
        imatge_20_o.setVisibility(View.INVISIBLE)
        imatge_21_x.setVisibility(View.INVISIBLE)
        imatge_21_o.setVisibility(View.INVISIBLE)
        imatge_22_x.setVisibility(View.INVISIBLE)
        imatge_22_o.setVisibility(View.INVISIBLE)

        //Llista de posicions Vàlides
        val posicionsFetes = arrayOf<Int>(0, 0, 0, 0, 0, 0, 0, 0, 0)


        //Funcions
        btn_00.setOnClickListener {
            if (posicionsFetes[0] == 0){
                if (torn == true){
                    imatge_00_x.setVisibility(View.VISIBLE)
                    torn = false
                    posicionsFetes[0] = 1
                }else{
                    imatge_00_o.setVisibility(View.VISIBLE)
                    torn = true
                    posicionsFetes[0] = 2
                }
            }
        }
        btn_01.setOnClickListener {
            if(torn == true ) {
                imatge_01_x.setVisibility(View.VISIBLE)
                torn = false
            }else{
                imatge_01_o.setVisibility(View.VISIBLE)
                torn = true
            }
        }
    }



    fun checkWins(){

    }

    fun changeTorn(){
        torn != torn
    }


}


