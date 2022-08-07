package com.example.businesscard.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.businesscard.R
import com.example.businesscard.databinding.ActivityAddBusinessCardBinding
import com.example.businesscard.databinding.ActivityMainBinding

class AddBusinessCardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddBusinessCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBusinessCardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        insertListener()
    }

    private fun insertListener(){
        binding.ibClose.setOnClickListener{
            finish()
        }

        binding.btConfirm.setOnClickListener {

        }
    }
}