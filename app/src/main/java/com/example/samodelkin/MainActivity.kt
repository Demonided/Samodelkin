package com.example.samodelkin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.samodelkin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var characterData = CharacterGenerator.generate()
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        characterData.run {
            binding.dexterityTextView.setOnClickListener { dex }
            binding.nameTextView.setOnClickListener { name }
            binding.raceTextView.setOnClickListener { race }
            binding.strengthTextView.setOnClickListener { str }
            binding.wisdomTextView.setOnClickListener { wis }
        }

        binding.generateButton.setOnClickListener { characterData }
    }


}




