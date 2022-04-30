package com.example.el_friv

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class TresEnRalla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tres_en_ralla)

        var torn: Boolean = true // true -> x / false -> o

        val text_torn = findViewById<TextView>(R.id.txtTornDe)
        val text_guanyador = findViewById<TextView>(R.id.textView)

        // Llista de botons
        val btn_00 = findViewById<Button>(R.id.btn_00)
        val btn_01 = findViewById<Button>(R.id.btn_01)
        val btn_02 = findViewById<Button>(R.id.btn_02)
        val btn_10 = findViewById<Button>(R.id.btn_10)
        val btn_11 = findViewById<Button>(R.id.btn_11)
        val btn_12 = findViewById<Button>(R.id.btn_12)
        val btn_20 = findViewById<Button>(R.id.btn_20)
        val btn_21 = findViewById<Button>(R.id.btn_21)
        val btn_22 = findViewById<Button>(R.id.btn_22)

        //Llista de imatges
        val imatge00X = findViewById<ImageView>(R.id.image_00_x)
        val imatge00O = findViewById<ImageView>(R.id.image_00_o)
        val imatge01X = findViewById<ImageView>(R.id.image_01_x)
        val imatge01O = findViewById<ImageView>(R.id.image_01_o)
        val imatge02X = findViewById<ImageView>(R.id.image_02_x)
        val imatge02O = findViewById<ImageView>(R.id.image_02_o)
        val imatge10X = findViewById<ImageView>(R.id.image_10_x)
        val imatge10O = findViewById<ImageView>(R.id.image_10_o)
        val imatge11X = findViewById<ImageView>(R.id.image_11_x)
        val imatge11O = findViewById<ImageView>(R.id.image_11_o)
        val imatge12X = findViewById<ImageView>(R.id.image_12_x)
        val imatge12O = findViewById<ImageView>(R.id.image_12_o)
        val imatge20X = findViewById<ImageView>(R.id.image_20_x)
        val imatge20O = findViewById<ImageView>(R.id.image_20_o)
        val imatge21X = findViewById<ImageView>(R.id.image_21_x)
        val imatge21O = findViewById<ImageView>(R.id.image_21_o)
        val imatge22X = findViewById<ImageView>(R.id.image_22_x)
        val imatge22O = findViewById<ImageView>(R.id.image_22_o)

        // Set all images invisible
        imatge00X.setVisibility(View.INVISIBLE)
        imatge00O.setVisibility(View.INVISIBLE)
        imatge01X.setVisibility(View.INVISIBLE)
        imatge01O.setVisibility(View.INVISIBLE)
        imatge02X.setVisibility(View.INVISIBLE)
        imatge02O.setVisibility(View.INVISIBLE)
        imatge10X.setVisibility(View.INVISIBLE)
        imatge10O.setVisibility(View.INVISIBLE)
        imatge11X.setVisibility(View.INVISIBLE)
        imatge11O.setVisibility(View.INVISIBLE)
        imatge12X.setVisibility(View.INVISIBLE)
        imatge12O.setVisibility(View.INVISIBLE)
        imatge20X.setVisibility(View.INVISIBLE)
        imatge20O.setVisibility(View.INVISIBLE)
        imatge21X.setVisibility(View.INVISIBLE)
        imatge21O.setVisibility(View.INVISIBLE)
        imatge22X.setVisibility(View.INVISIBLE)
        imatge22O.setVisibility(View.INVISIBLE)

        //Llista de posicions Vàlides
        val posicionsFetes = arrayOf<Int>(0, 0, 0, 0, 0, 0, 0, 0, 0)
        var fil0 = arrayOf(-1, -1, -1)
        var fil1 = arrayOf(-1, -1, -1)
        var fil2 = arrayOf(-1, -1, -1)


        //aquesta funcio retornara si algu ha guanyat o no
        fun guany(torn: Boolean): Boolean {
            var guany = false

            //columnas

            for (i in 0 until 3) {
                if (fil0[i] == fil1[i] && fil0[i] == fil2[i] && fil0[i] != -1)
                    guany = true
            }

            //filas

            if (fil0[0] == fil0[1] && fil0[0] == fil0[2] && fil0[0] != -1)
                guany = true
            if (fil1[0] == fil1[1] && fil1[0] == fil1[2] && fil1[0] != -1)
                guany = true
            if (fil2[0] == fil2[1] && fil2[0] == fil2[2] && fil2[0] != -1)
                guany = true

            //Diagonals

            if (fil0[0] == fil1[1] && fil0[0] == fil2[2] && fil0[0] != -1)
                guany = true
            if (fil2[0] == fil1[1] && fil2[0] == fil0[2] && fil2[0] != -1)
                guany = true

            if(guany)
            {
                if(torn==true)
                    text_guanyador.setText("Ha guanyat: O")
                else
                    text_guanyador.setText("Ha guanyat: X")
            }

            return guany
        }

        fun joc(_torn: Boolean) {

            var Guany = guany(torn)
            var torn = _torn
            var n_Tirades =0




            while(!Guany && n_Tirades<9) {

                if (torn) {
                    text_torn.text = "Torn del Jugador X:"
                    text_torn.setTextColor(Color.WHITE)
                }
                else {
                    text_torn.text = "Torn del Jugador O:"
                    text_torn.setTextColor(Color.WHITE)
                }

                btn_00.setOnClickListener()
                {
                    if (posicionsFetes[0] == 0 && !Guany) {
                        if (torn) {
                            imatge00X.visibility = View.VISIBLE
                            fil0[0] = 0
                            torn = false
                            Guany = guany(torn)
                            posicionsFetes[0] = 1
                            text_torn.setText("pinga")
                            if (torn) {
                                text_torn.text = "Torn del Jugador X:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                            else {
                                text_torn.text = "Torn del Jugador O:"
                                text_torn.setTextColor(Color.WHITE)
                            }


                        } else {
                            imatge00O.visibility = View.VISIBLE
                            fil0[0] = 1
                            torn = true
                            Guany = guany(torn)
                            posicionsFetes[0] = 2
                            if (torn) {
                                text_torn.text = "Torn del Jugador X:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                            else {
                                text_torn.text = "Torn del Jugador O:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                        }
                    }
                }
                btn_01.setOnClickListener()
                {
                    if (posicionsFetes[1] == 0 && !Guany) {

                        if (torn) {
                            imatge01X.visibility = View.VISIBLE
                            fil0[1] = 0
                            torn = false
                            Guany = guany(torn)
                            posicionsFetes[1] = 1
                            if (torn) {
                                text_torn.text = "Torn del Jugador X:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                            else {
                                text_torn.text = "Torn del Jugador O:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                        } else {
                            imatge01O.visibility = View.VISIBLE
                            fil0[1] = 1
                            torn = true
                            Guany = guany(torn)
                            posicionsFetes[1] = 2
                            if (torn) {
                                text_torn.text = "Torn del Jugador X:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                            else {
                                text_torn.text = "Torn del Jugador O:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                        }
                    }
                }

                btn_02.setOnClickListener()
                {
                    if (posicionsFetes[2] == 0 && !Guany) {

                        if (torn) {
                            imatge02X.visibility = View.VISIBLE
                            fil0[2] = 0
                            torn = false
                            Guany = guany(torn)
                            posicionsFetes[2] = 1
                            if (torn) {
                                text_torn.text = "Torn del Jugador X:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                            else {
                                text_torn.text = "Torn del Jugador O:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                        } else {
                            imatge02O.visibility = View.VISIBLE
                            fil0[2] = 1
                            torn = true
                            Guany = guany(torn)
                            posicionsFetes[2] = 2
                            if (torn) {
                                text_torn.text = "Torn del Jugador X:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                            else {
                                text_torn.text = "Torn del Jugador O:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                        }
                    }
                }

                btn_10.setOnClickListener()
                {
                    if (posicionsFetes[3] == 0 && !Guany) {

                        if (torn) {
                            imatge10X.visibility = View.VISIBLE
                            fil1[0] = 0
                            torn = false
                            Guany = guany(torn)
                            posicionsFetes[3] = 1
                            if (torn) {
                                text_torn.text = "Torn del Jugador X:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                            else {
                                text_torn.text = "Torn del Jugador O:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                        } else {
                            imatge10O.visibility = View.VISIBLE
                            fil1[0] = 1
                            torn = true
                            Guany = guany(torn)
                            posicionsFetes[3] = 2
                            if (torn) {
                                text_torn.text = "Torn del Jugador X:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                            else {
                                text_torn.text = "Torn del Jugador O:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                        }
                    }
                }

                btn_11.setOnClickListener()
                {
                    if (posicionsFetes[4] == 0 && !Guany) {

                        if (torn) {
                            imatge11X.visibility = View.VISIBLE
                            fil1[1] = 0
                            torn = false
                            Guany = guany(torn)
                            posicionsFetes[4] = 1
                            if (torn) {
                                text_torn.text = "Torn del Jugador X:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                            else {
                                text_torn.text = "Torn del Jugador O:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                        } else {
                            imatge11O.visibility = View.VISIBLE
                            fil1[1] = 1
                            torn = true
                            Guany = guany(torn)
                            posicionsFetes[4] = 2
                            if (torn) {
                                text_torn.text = "Torn del Jugador X:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                            else {
                                text_torn.text = "Torn del Jugador O:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                        }
                    }
                }

                btn_12.setOnClickListener()
                {
                    if (posicionsFetes[5] == 0 && !Guany) {
                        if (torn) {
                            imatge12X.visibility = View.VISIBLE
                            fil1[2] = 0
                            torn = false
                            Guany = guany(torn)
                            posicionsFetes[5] = 1
                            if (torn) {
                                text_torn.text = "Torn del Jugador X:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                            else {
                                text_torn.text = "Torn del Jugador O:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                        } else {
                            imatge12O.visibility = View.VISIBLE
                            fil1[2] = 1
                            torn = true
                            Guany = guany(torn)
                            posicionsFetes[5] = 2
                            if (torn) {
                                text_torn.text = "Torn del Jugador X:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                            else {
                                text_torn.text = "Torn del Jugador O:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                        }
                    }
                }

                btn_20.setOnClickListener()
                {
                    if (posicionsFetes[6] == 0 && !Guany) {

                        if (torn) {
                            imatge20X.visibility = View.VISIBLE
                            fil2[0] = 0
                            torn = false
                            Guany = guany(torn)
                            posicionsFetes[6] = 1
                            if (torn) {
                                text_torn.text = "Torn del Jugador X:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                            else {
                                text_torn.text = "Torn del Jugador O:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                        } else {
                            imatge20O.visibility = View.VISIBLE
                            fil2[0] = 1
                            torn = true
                            Guany = guany(torn)
                            posicionsFetes[6] = 2
                            if (torn) {
                                text_torn.text = "Torn del Jugador X:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                            else {
                                text_torn.text = "Torn del Jugador O:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                        }
                    }
                }

                btn_21.setOnClickListener()
                {
                    if (posicionsFetes[7] == 0 && !Guany) {

                        if (torn) {
                            imatge21X.visibility = View.VISIBLE
                            fil2[1] = 0
                            torn = false
                            Guany = guany(torn)
                            posicionsFetes[7] = 1
                            if (torn) {
                                text_torn.text = "Torn del Jugador X:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                            else {
                                text_torn.text = "Torn del Jugador O:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                        } else {
                            imatge21O.visibility = View.VISIBLE
                            fil2[1] = 1
                            torn = true
                            Guany = guany(torn)
                            posicionsFetes[7] = 2
                            if (torn) {
                                text_torn.text = "Torn del Jugador X:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                            else {
                                text_torn.text = "Torn del Jugador O:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                        }
                    }
                }

                btn_22.setOnClickListener()
                {
                    if (posicionsFetes[8] == 0 && !Guany) {

                        if (torn) {
                            imatge22X.visibility = View.VISIBLE
                            fil2[2] = 0
                            torn = false
                            Guany = guany(torn)
                            posicionsFetes[8] = 1
                            if (torn) {
                                text_torn.text = "Torn del Jugador X:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                            else {
                                text_torn.text = "Torn del Jugador O:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                        } else {
                            imatge22O.visibility = View.VISIBLE
                            fil2[2] = 1
                            torn = true
                            Guany = guany(torn)
                            posicionsFetes[8] = 2
                            if (torn) {
                                text_torn.text = "Torn del Jugador X:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                            else {
                                text_torn.text = "Torn del Jugador O:"
                                text_torn.setTextColor(Color.WHITE)
                            }
                        }
                    }
                }


                n_Tirades++
            }

        }



        joc(torn)



    }
}




