package com.example.el_friv

import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.random.Random


class FallingBricks : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_falling_bricks)

        // Variables and shit
        val rightBtn = findViewById<Button>(R.id.btnRight)
        val leftBtn = findViewById<Button>(R.id.btnLeft)

        val player = findViewById<ImageView>(R.id.player)
        val harmfullObject1 = findViewById<ImageView>(R.id.harmfullObject1)

        var xMovement = 400.0f
        val fallMovement = 200.0f

        //functions
        fun playerMovement(direction: Int){

            xMovement += 50.0f * direction
            if(xMovement > 800 || xMovement < 0)
                xMovement -= 50.0f * direction

            player.translationX = xMovement
        }
        fun objectFall(objecte: ImageView, extraSpeed: Float){
            objecte.translationY += fallMovement * extraSpeed
        }
        fun spawnObjects(objecte: ImageView, i: Long){

            if(i < 0)
                objecte.translationX = (i * -1) % 1000.0f
            else
                objecte.translationX = i % 1000.0f
            objecte.translationY = 10.0f
        }

        // Buttons
        rightBtn.setOnClickListener {
            playerMovement(1)

        }
        leftBtn.setOnClickListener {
            playerMovement(-1)
        }


        // game itself
        fun gameFunction(){


            var nextLevel = false
            var i:Long = 0;

            spawnObjects(harmfullObject1, Random.nextLong())

            while(!nextLevel) {

                // Actualitzem la posició objectes
                val handler = Handler()
                handler.postDelayed({
                    objectFall(harmfullObject1, 0.5f)
                }, 1000 * i)


                // comprovem si no hem augmentat el nivell
                if (i * 1000 > 10000)
                    nextLevel = true;

                i++
            }





        }




        gameFunction()

    }





}

/* Time control

    val handler = Handler()
    handler.postDelayed({
        // Do something
    }, 1000)

*/