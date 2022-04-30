package com.example.el_friv

import android.os.Bundle
import android.os.Handler
import android.view.View
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
        // HarmfullObjects
        val harmfullObject1 = findViewById<ImageView>(R.id.harmfullObject1)
        val harmfullObject2 = findViewById<ImageView>(R.id.harmfullObject2)
        val harmfullObject3 = findViewById<ImageView>(R.id.harmfullObject3)
        val harmfullObject4 = findViewById<ImageView>(R.id.harmfullObject4)
        val harmfullObject5 = findViewById<ImageView>(R.id.harmfullObject5)
        val harmfullObject6 = findViewById<ImageView>(R.id.harmfullObject6)
        val harmfullObject7 = findViewById<ImageView>(R.id.harmfullObject7)
        val harmfullObject8 = findViewById<ImageView>(R.id.harmfullObject8)




        var xMovement = 400.0f
        val fallMovement = 200.0f

        var ho1_movement = 0.0f;
        var ho2_movement = 0.0f;
        var ho3_movement = 0.0f;
        var ho4_movement = 0.0f;
        var ho5_movement = 0.0f;
        var ho6_movement = 0.0f;
        var ho7_movement = 0.0f;
        var ho8_movement = 0.0f;


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
        fun spawnObjects(_objecte: ImageView, i: Long){
            _objecte.setVisibility(View.VISIBLE)

            if(i < 0)
                _objecte.translationX = (i * -1) % 1000.0f
            else
                _objecte.translationX = i % 1000.0f
            _objecte.translationY = 0.0f
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

            harmfullObject1.setVisibility(View.VISIBLE)

            if(i < 0)
                harmfullObject1.translationX = (i * -1) % 1000.0f
            else
                harmfullObject1.translationX = i % 1000.0f
            harmfullObject1.translationY = 0.0f

            while(!nextLevel) {

                // Actualitzem la posició objectes
                val handler = Handler()
                handler.postDelayed({
                    objectFall(harmfullObject1, 1.0f)
                    ho1_movement += fallMovement * 1.0f
                }, 1000 * i)

                //
                if(ho1_movement > 100)
                    if(i < 0)
                        harmfullObject1.translationX = (i * -1) % 1000.0f
                    else
                        harmfullObject1.translationX = i % 1000.0f
                    harmfullObject1.translationY = 0.0f

                // comprovem si no hem augmentat el nivell
                if (i * 1000 > 10000)
                    nextLevel = true;

                i++
            }

            spawnObjects(harmfullObject2, Random.nextLong())
            nextLevel = false
            while(!nextLevel) {

                // Actualitzem la posició objectes
                val handler = Handler()
                handler.postDelayed({
                    objectFall(harmfullObject1, 1.0f)
                }, 1000 * i)
                handler.postDelayed({
                    objectFall(harmfullObject2, 1.0f)
                }, 1000 * i)

                // comprovem si no hem augmentat el nivell
                if (i * 1000 > 20000)
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