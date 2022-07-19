package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener(View.OnClickListener {
            //Toast.makeText(applicationContext,"this is toast message",Toast.LENGTH_SHORT).show()
            rollDice()
        })

    }

    private fun rollDice() {
        val random= Random.nextInt(6)
        binding.textview.setText(random.toString())
    }
}