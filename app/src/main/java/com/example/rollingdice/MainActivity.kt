package com.example.rollingdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun rollTheDice(view: View) {
        val diceImage : ImageView = findViewById(R.id.imageView)
        val result = Dice().roll().toInt()
        if(result==1){
            diceImage.setImageResource(R.drawable.dice_1)
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
        } else if(result==2) {
            diceImage.setImageResource(R.drawable.dice_2)
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
            } else if(result==3) {
            diceImage.setImageResource(R.drawable.dice_3)
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
            } else if(result==4) {
            diceImage.setImageResource(R.drawable.dice_4)
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
            } else if(result==5) {
            diceImage.setImageResource(R.drawable.dice_5)
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
            } else {
            diceImage.setImageResource(R.drawable.dice_6)
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
            }
    }
}


class Dice () {
    fun roll(): Int {
        return (1..6).random()
    }
}