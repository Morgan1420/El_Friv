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

        val Text_Output0 = findViewById<TextView>(R.id.Output0)
        val Text_Output1 = findViewById<TextView>(R.id.Output1)
        val Text_Output2 = findViewById<TextView>(R.id.Output2)
        val Text_Output3 = findViewById<TextView>(R.id.Output3)
        val Text_Output4 = findViewById<TextView>(R.id.Output4)

        val Palabras_Secretas= arrayOf("REINA", "MADRE", "NOVIA","WARRO")
        var torns=0

        fun getTorns() : Int{
            return torns
        }

        fun setTorns(num: Int){
            torns = num
        }


        fun game(){

            when(torns){
                0 -> {
                    var torns = getTorns()
                    val Text_Input = findViewById<EditText>(R.id.Input).text
                    val dim = Text_Input.length
                    val i = dim - 1
                    var palabra = Text_Input.toString()

                    if (dim != 5)
                    {
                        Text_Error.setVisibility(View.VISIBLE)
                        setTorns(getTorns()-1)
                        println(torns)
                    }
                    else {
                        Text_Error.setVisibility(View.INVISIBLE)
                        palabra = Text_Input.toString()
                        palabra = palabra.uppercase()
                        Text_Output0.setText(palabra)
                        println(torns)
                    }

                }

                1 -> {

                    var torns = getTorns()
                    val Text_Input = findViewById<EditText>(R.id.Input).text
                    val dim = Text_Input.length
                    val i = dim - 1
                    var palabra= Text_Input.toString()

                    if (dim != 5)
                    {
                        Text_Error.setVisibility(View.VISIBLE)
                        setTorns(getTorns()-1)
                        println(torns)
                    }
                    else {
                        Text_Error.setVisibility(View.INVISIBLE)
                        palabra = Text_Input.toString()
                        palabra = palabra.uppercase()
                        Text_Output1.setText(palabra)
                        println(torns)
                    }
                            //you know is not the same as it was as it was AS IT WAAAAS
                            //HARRY WAPO TE QUIEROO


                }

                2 -> {
                    var torns = getTorns()
                    val Text_Input = findViewById<EditText>(R.id.Input).text
                    val dim = Text_Input.length
                    val i = dim - 1
                    var palabra = Text_Input.toString()

                    if (dim != 5)
                    {
                        Text_Error.setVisibility(View.VISIBLE)
                        setTorns(getTorns()-1)
                        println(torns)
                    }
                    else {
                        Text_Error.setVisibility(View.INVISIBLE)

                        palabra = Text_Input.toString()
                        palabra = palabra.uppercase()
                        Text_Output2.setText(palabra)
                        println(torns)
                    }

                }

                3 -> {
                    var torns = getTorns()
                    val Text_Input = findViewById<EditText>(R.id.Input).text
                    val dim = Text_Input.length
                    val i = dim - 1
                    var palabra = Text_Input.toString()

                    if (dim != 5)
                    {
                        Text_Error.setVisibility(View.VISIBLE)
                        setTorns(getTorns()-1)
                        println(torns)
                    }
                    else {
                        Text_Error.setVisibility(View.INVISIBLE)

                        palabra = Text_Input.toString()
                        palabra = palabra.uppercase()
                        Text_Output3.setText(palabra)
                        println(torns)
                    }

                }

                4 -> {
                    var torns = getTorns()
                    val Text_Input = findViewById<EditText>(R.id.Input).text
                    val dim = Text_Input.length
                    val i = dim - 1
                    var palabra = Text_Input.toString()

                    if (dim != 5)
                    {
                        Text_Error.setVisibility(View.VISIBLE)
                        setTorns(getTorns()-1)
                        println(torns)
                    }
                    else {
                        Text_Error.setVisibility(View.INVISIBLE)
                        palabra = Text_Input.toString()
                        palabra = palabra.uppercase()
                        Text_Output4.setText(palabra)
                        println(torns)
                    }

                }

                5 -> {
                    var torns = getTorns()
                    val Text_Input = findViewById<EditText>(R.id.Input).text
                    val dim = Text_Input.length
                    val i = dim - 1
                    var palabra = Text_Input.toString()

                    if (dim != 5)
                    {
                        Text_Error.setVisibility(View.VISIBLE)
                        setTorns(getTorns()-1)
                        println(torns)
                    }
                    else {
                        Text_Error.setVisibility(View.INVISIBLE)
                        palabra = Text_Input.toString()
                        palabra = palabra.uppercase()
                        Text_Output4.setText(palabra)
                        println(torns)
                    }

                }

            }
        }
        if(torns <5) {
            button1.setOnClickListener()
            {
                game()
                torns++
                println(torns)
            }
        }

        }


    }









//you know is not the same as it was as it was AS IT WAAAAS
//HARRY WAPO TE QUIEROO