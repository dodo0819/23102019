package com.example.mypractical1wed3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random
import com.example.mypractical1wed3.R.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage1 : ImageView
    lateinit var diceImage2 : ImageView
    lateinit var diceImage3 : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button1)
        rollButton.setOnClickListener{rollDice()}

        diceImage1 = findViewById(R.id.dice1)
        diceImage2 = findViewById(R.id.dice2)
        diceImage3 = findViewById(R.id.dice3)

    }

    private fun rollDice(){
        val randomInt1 = Random.nextInt(6)+1
        val randomInt2 = Random.nextInt(6)+1
        val randomInt3 = Random.nextInt(6)+1

        val total: TextView = findViewById(R.id.totalNumber)
        total.text = "Total Number is" + (randomInt1 + randomInt2 + randomInt3).toString()

        val changeDice1 = when(randomInt1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val changeDice2 = when (randomInt2){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val changeDice3 = when (randomInt3){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage1.setImageResource(changeDice1)
        diceImage2.setImageResource(changeDice2)
        diceImage3.setImageResource(changeDice3)
    }
}
