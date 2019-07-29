package com.joluhelo.resistorcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //variables
    private var valor = ""
    private var valor2 = ""
    private var valor3 = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bnCalcular.setOnClickListener {

            if (valor2.equals("") || valor3.equals("")) {
                resultado.text = "Error"
            }

                var respuesta = valor + valor2 + valor3 + " Ohmios"
                resultado.text = respuesta

        }

        bnBorrar.setOnClickListener {
            var respuesta = " "
            valor = ""
            valor2 = ""
            valor3 = ""
            resultado.text = respuesta
        }
    }

    fun onButtonClicked(view: View){

        if (view is Button){
            when (view.id){
                R.id.btn0 ->
                    if (view.isClickable) {
                        valor = " "
                    }
                R.id.btn1 ->
                    if (view.isClickable) {
                        valor = "1"
                    }
                R.id.btn2 ->
                    if (view.isClickable) {
                        valor = "2"
                    }
                R.id.btn3 ->
                    if (view.isClickable) {
                        valor = "3"
                    }
                R.id.btn4 ->
                    if (view.isClickable) {
                        valor = "4"
                    }
                R.id.btn5 ->
                    if (view.isClickable) {
                        valor = "5"
                    }
                R.id.btn6 ->
                    if (view.isClickable) {
                        valor = "6"
                    }
                R.id.btn7 ->
                    if (view.isClickable) {
                        valor = "7"
                    }
                R.id.btn8 ->
                    if (view.isClickable) {
                        valor = "8"
                    }
                R.id.btn9 ->
                    if (view.isClickable) {
                        valor = "9"
                    }
                R.id.btn00 ->
                    if (view.isClickable) {
                        valor2 = "0"
                    }
                R.id.btn01 ->
                    if (view.isClickable) {
                        valor2 = "1"
                    }
                R.id.btn02 ->
                    if (view.isClickable) {
                        valor2 = "2"
                    }
                R.id.btn03 ->
                    if (view.isClickable) {
                        valor2 = "3"
                    }
                R.id.btn04 ->
                    if (view.isClickable) {
                        valor2 = "4"
                    }
                R.id.btn05 ->
                    if (view.isClickable) {
                        valor2 = "5"
                    }
                R.id.btn06 ->
                    if (view.isClickable) {
                        valor2 = "6"
                    }
                R.id.btn07 ->
                    if (view.isClickable) {
                        valor2 = "7"
                    }
                R.id.btn08 ->
                    if (view.isClickable) {
                        valor2 = "8"
                    }
                R.id.btn09 ->
                    if (view.isClickable) {
                        valor2 = "9"
                    }
                R.id.btnx0 ->
                    if (view.isClickable) {
                        valor3 = " "
                    }
                R.id.btnx1 ->
                    if (view.isClickable) {
                        valor3 = "0"
                    }
                R.id.btnx2 ->
                    if (view.isClickable) {
                        valor3 = "00"
                    }
                R.id.btnx3 ->
                    if (view.isClickable) {
                        valor3 = "K"
                    }
                R.id.btnx4 ->
                    if (view.isClickable) {
                        valor3 = "0K"
                    }
                R.id.btnx5 ->
                    if (view.isClickable) {
                        valor3 = "00K"
                    }
                R.id.btnx6 ->
                    if (view.isClickable) {
                        valor3 = "M"
                    }

            }
        }
    }

}


