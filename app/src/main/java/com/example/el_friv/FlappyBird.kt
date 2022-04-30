package com.example.el_friv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView

class FlappyBird : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flappy_bird)

        val bird = findViewById<ImageView>(R.id.bird)
        val jumpBtn = findViewById<Button>(R.id.jumpBtn)
        var birdHeight = 10f;
        var jump = false



        fun falling(extra:Long){
            bird.translationY += 0.5f * extra
            birdHeight += 0.5f * extra
            bird.rotation+= extra / 35
        }

        fun jumpFunction(extra:Long){
            bird.translationY -= 50 * extra;
            birdHeight -= 50f * extra
            bird.setRotation(-25.0f)
        }

        fun gameFunction() {
            val handler = Handler()
            var gameOver = false;

            while (!gameOver) {

                var i = 0L
                jump = false
                while ((i < 99L) && (!jump) && (!gameOver)) {
                    // ocell cau
                    handler.postDelayed({
                        falling(i)
                    }, 80 * i)

                    jumpBtn.setOnClickListener {
                        jumpFunction(7)
                        jump = true

                    }
                    i++

                }

                if(birdHeight < 11f) {
                    gameOver = true
                }
                jumpFunction(5)

            }
        }



        gameFunction()
    }
}