package com.handeekin.numberguessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val random = (1..100).random()
        var sayac = 100;


        GuessButton.setOnClickListener {
            val guess = GuessText.text.toString().toInt()
            if (guess == random) {
                Message.text = "Congrats! Your guess is correct! Your score is: " +sayac.toString()
                GuessButton.isEnabled = false


            }
            else {
                sayac --;
                if (guess < random){
                    Message.text = "Sorry :( Your guess is lower than the number, try again. Your score is: " +sayac.toString()
                }
                else {
                    Message.text = "Sorry :( Your guess is higher than the number, try again. Your score is: " +sayac.toString()
                }
            }
        }









    }
}