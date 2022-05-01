package com.example.el_friv

import android.graphics.Color
import android.graphics.Color.green
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

        var Lletra11 = findViewById<TextView>(R.id.lletra11)
        var Lletra21 = findViewById<TextView>(R.id.lletra21)
        var Lletra31 = findViewById<TextView>(R.id.lletra31)
        var Lletra41 = findViewById<TextView>(R.id.lletra41)
        var Lletra51 = findViewById<TextView>(R.id.lletra51)
        var Fila_1 = arrayOf(Lletra11,Lletra21,Lletra31,Lletra41, Lletra51)

        var Lletra12 = findViewById<TextView>(R.id.lletra12)
        var Lletra22 = findViewById<TextView>(R.id.lletra22)
        var Lletra32 = findViewById<TextView>(R.id.lletra32)
        var Lletra42 = findViewById<TextView>(R.id.lletra42)
        var Lletra52 = findViewById<TextView>(R.id.lletra52)
        var Fila_2 = arrayOf(Lletra12,Lletra22,Lletra32,Lletra42, Lletra52)

        var Lletra13 = findViewById<TextView>(R.id.lletra13)
        var Lletra23 = findViewById<TextView>(R.id.lletra23)
        var Lletra33 = findViewById<TextView>(R.id.lletra33)
        var Lletra43 = findViewById<TextView>(R.id.lletra43)
        var Lletra53 = findViewById<TextView>(R.id.lletra53)
        var Fila_3 = arrayOf(Lletra13,Lletra23,Lletra33,Lletra43, Lletra53)

        var Lletra14 = findViewById<TextView>(R.id.lletra14)
        var Lletra24 = findViewById<TextView>(R.id.lletra24)
        var Lletra34 = findViewById<TextView>(R.id.lletra34)
        var Lletra44 = findViewById<TextView>(R.id.lletra44)
        var Lletra54 = findViewById<TextView>(R.id.lletra54)
        var Fila_4 = arrayOf(Lletra14,Lletra24,Lletra34,Lletra44, Lletra54)

        var Lletra15 = findViewById<TextView>(R.id.lletra15)
        var Lletra25 = findViewById<TextView>(R.id.lletra25)
        var Lletra35 = findViewById<TextView>(R.id.lletra35)
        var Lletra45 = findViewById<TextView>(R.id.lletra45)
        var Lletra55 = findViewById<TextView>(R.id.lletra55)
        var Fila_5 = arrayOf(Lletra15,Lletra25,Lletra35,Lletra45, Lletra55)

        val Palabras_Secretas= arrayOf("REINA", "MADRE", "NOVIA","WARRO")
        var torns=0
        var guanyat = false

        val Palabra_Juego = Palabras_Secretas.random()

        fun getTorns() : Int{
            return torns
        }

        fun setTorns(num: Int){
            torns = num
        }

        fun setGuanyat(num: Boolean){
            guanyat = num
        }


        fun JocPrimeraFila(palabra: String)
        {
            Lletra11.setText(palabra[0].toString())
            Lletra21.setText(palabra[1].toString())
            Lletra31.setText(palabra[2].toString())
            Lletra41.setText(palabra[3].toString())
            Lletra51.setText(palabra[4].toString())

            if(palabra == Palabra_Juego){
                setGuanyat(true)
                Text_Error.setText("¡¡Has Ganado!!")
                Text_Error.setVisibility(View.VISIBLE)
            }
            var contador=0
            for (i in 0 until 5)
            {
                contador=0
                for (j in 0 until 5)
                {
                    if(palabra[i]==Palabra_Juego[j])
                    {
                        if (j == i)
                        {
                            Fila_1[i].setBackgroundColor(Color.parseColor("#00ff00"))
                        }
                        else
                        {
                            Fila_1[i].setBackgroundColor(Color.parseColor("#ffff00"))
                        }
                    }
                    else
                    {
                        contador++
                        if(contador==5)
                        {
                            Fila_1[i].setBackgroundColor(Color.parseColor("#808080"))
                        }
                    }
                }

            }

        }

        fun JocSegonaFila(palabra: String)
        {
            Lletra12.setText(palabra[0].toString())
            Lletra22.setText(palabra[1].toString())
            Lletra32.setText(palabra[2].toString())
            Lletra42.setText(palabra[3].toString())
            Lletra52.setText(palabra[4].toString())

            if(palabra == Palabra_Juego){
                setGuanyat(true)
                Text_Error.setText("¡¡Has Ganado!!")
                Text_Error.setVisibility(View.VISIBLE)
            }
            var contador=0
            for (i in 0 until 5)
            {
                contador=0
                for (j in 0 until 5)
                {
                    if(palabra[i]==Palabra_Juego[j])
                    {
                        if (j == i)
                        {
                            Fila_2[i].setBackgroundColor(Color.parseColor("#00ff00"))
                        }
                        else
                        {
                            Fila_2[i].setBackgroundColor(Color.parseColor("#ffff00"))
                        }
                    }
                    else
                    {
                        contador++
                        if(contador==5)
                        {
                            Fila_2[i].setBackgroundColor(Color.parseColor("#808080"))
                        }
                    }
                }

            }
        }


        fun JocTerceraFila(palabra: String)
        {
            Lletra13.setText(palabra[0].toString())
            Lletra23.setText(palabra[1].toString())
            Lletra33.setText(palabra[2].toString())
            Lletra43.setText(palabra[3].toString())
            Lletra53.setText(palabra[4].toString())

            if(palabra == Palabra_Juego){
                setGuanyat(true)
                Text_Error.setText("¡¡Has Ganado!!")
                Text_Error.setVisibility(View.VISIBLE)
            }
            var contador=0
            for (i in 0 until 5)
            {
                contador=0
                for (j in 0 until 5)
                {
                    if(palabra[i]==Palabra_Juego[j])
                    {
                        if (j == i)
                        {
                            Fila_3[i].setBackgroundColor(Color.parseColor("#00ff00"))
                        }
                        else
                        {
                            Fila_3[i].setBackgroundColor(Color.parseColor("#ffff00"))
                        }
                    }
                    else
                    {
                        contador++
                        if(contador==5)
                        {
                            Fila_3[i].setBackgroundColor(Color.parseColor("#808080"))
                        }
                    }
                }

            }
        }

        fun JocQuartaFila(palabra: String)
        {
            Lletra14.setText(palabra[0].toString())
            Lletra24.setText(palabra[1].toString())
            Lletra34.setText(palabra[2].toString())
            Lletra44.setText(palabra[3].toString())
            Lletra54.setText(palabra[4].toString())

            if(palabra == Palabra_Juego){
                guanyat = true
                Text_Error.setText("¡¡Has Ganado!!")
                Text_Error.setVisibility(View.VISIBLE)
            }
            var contador=0
            for (i in 0 until 5)
            {
                contador=0
                for (j in 0 until 5)
                {
                    if(palabra[i]==Palabra_Juego[j])
                    {
                        if (j == i)
                        {
                            Fila_4[i].setBackgroundColor(Color.parseColor("#00ff00"))
                        }
                        else
                        {
                            Fila_4[i].setBackgroundColor(Color.parseColor("#ffff00"))
                        }
                    }
                    else
                    {
                        contador++
                        if(contador==5)
                        {
                            Fila_4[i].setBackgroundColor(Color.parseColor("#808080"))
                        }
                    }
                }

            }
        }

        fun JocCinquenaFila(palabra: String)
        {
            Lletra15.setText(palabra[0].toString())
            Lletra25.setText(palabra[1].toString())
            Lletra35.setText(palabra[2].toString())
            Lletra45.setText(palabra[3].toString())
            Lletra55.setText(palabra[4].toString())

            if(palabra == Palabra_Juego){
                guanyat = true
                Text_Error.setText("¡¡Has Ganado!!")
                Text_Error.setVisibility(View.VISIBLE)
            }
            var contador=0
            for (i in 0 until 5)
            {
                contador=0
                for (j in 0 until 5)
                {
                    if(palabra[i]==Palabra_Juego[j])
                    {
                        if (j == i)
                        {
                            Fila_5[i].setBackgroundColor(Color.parseColor("#00ff00"))
                        }
                        else
                        {
                            Fila_5[i].setBackgroundColor(Color.parseColor("#ffff00"))
                        }
                    }
                    else
                    {
                        contador++
                        if(contador==5)
                        {
                            Fila_5[i].setBackgroundColor(Color.parseColor("#808080"))
                        }
                    }
                }

            }
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

                    }
                    else {
                        Text_Error.setVisibility(View.INVISIBLE)
                        palabra = Text_Input.toString()
                        palabra = palabra.uppercase()

                        //Aixo ho tocarem ja despres en les comprovacions canviant colors i tal
                        //Podria fer una funcio mena JocPrimeraFila on implementar
                        JocPrimeraFila(palabra)

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
                        JocSegonaFila(palabra)


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

                    }
                    else {
                        Text_Error.setVisibility(View.INVISIBLE)

                        palabra = Text_Input.toString()
                        palabra = palabra.uppercase()
                        JocTerceraFila(palabra)
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

                    }
                    else {
                        Text_Error.setVisibility(View.INVISIBLE)

                        palabra = Text_Input.toString()
                        palabra = palabra.uppercase()
                        JocQuartaFila(palabra)
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

                    }
                    else {
                        Text_Error.setVisibility(View.INVISIBLE)
                        palabra = Text_Input.toString()
                        palabra = palabra.uppercase()
                        JocCinquenaFila(palabra)
                    }

                }
            }
        }
        if((torns <5) && !guanyat) {
            button1.setOnClickListener()
            {
                game()
                torns++
            }
        }

        }

    }









//you know is not the same as it was as it was AS IT WAAAAS
//HARRY WAPO TE QUIEROO