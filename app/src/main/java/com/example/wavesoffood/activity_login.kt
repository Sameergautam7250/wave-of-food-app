package com.example.wavesoffood

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.wavesoffood.databinding.ActivityLoginBinding

class activity_login : AppCompatActivity() {
    private val binding: ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.newAccount.setOnClickListener {
            val intent = Intent(this,signup_Activity::class.java)
            startActivity(intent)
        }
        binding.loginbutton.setOnClickListener{
            val intent=Intent(this,locationActivity::class.java)
            startActivity(intent)
        }

    }
    }
