package com.example.el_friv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class Wordle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wordle)

        val button1 = findViewById<Button>(R.id.button1)
        val Text_Error = findViewById<TextView>(R.id.Error)
        val Text_Output = findViewById<TextView>(R.id.Output)
        val Palabras_Secretas= arrayOf("REINA", "MADRE", "NOVIA")

        fun game(){
            button1.setOnClickListener{
                val Text_Input = findViewById<EditText>(R.id.Input).text
                val dim = Text_Input.length
                val i = dim - 1

                if(dim!=5)
                    Text_Error.setVisibility(View.VISIBLE)
                else {
                    Text_Error.setVisibility(View.INVISIBLE)
                    //Text_Output.setText(Text_Input)
                    var palabra= Text_Input.toString()
                    palabra = palabra.uppercase()

                    Text_Output.setText(palabra)
                }
            }
        }

        game()

    }



}





