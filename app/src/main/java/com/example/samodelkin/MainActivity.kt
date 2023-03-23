package com.example.samodelkin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.samodelkin.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private var characterData = CharacterGenerator.generate()
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        val nameTextView = findViewById<TextView>(R.id.nameTextView)
        val raceTextView = findViewById<TextView>(R.id.raceTextView)
        val dexterityTextView = findViewById<TextView>(R.id.dexterityTextView)
        val wisdomTextView = findViewById<TextView>(R.id.wisdomTextView)
        val strengthTextView = findViewById<TextView>(R.id.strengthTextView)
        val generateButton = findViewById<Button>(R.id.generateButton)

        initButton()

        characterData.run {
//            binding.dexterityTextView.setOnClickListener { dex }
//            binding.nameTextView.setOnClickListener { name }
//            binding.raceTextView.setOnClickListener { race }
//            binding.strengthTextView.setOnClickListener { str }
//            binding.wisdomTextView.setOnClickListener { wis }
            nameTextView.text = name
            raceTextView.text = race
            dexterityTextView.text = dex
            wisdomTextView.text = wis
            strengthTextView.text = str
        }

        binding.generateButton.setOnClickListener { characterData }
    }

    private fun initButton() {
        with(binding) {
            generateButton.setOnClickListener {
                characterData.run {
                    dexterityTextView.setOnClickListener { dex }
                }
            }
        }
    }


}




