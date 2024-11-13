package com.example.wavesoffood

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.wavesoffood.databinding.ActivityLoginBinding
import com.example.wavesoffood.databinding.ActivitySignupBinding

class signup_Activity : AppCompatActivity() {
     private val binding:ActivitySignupBinding by lazy {
         ActivitySignupBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.backlogin.setOnClickListener{
            val intent=Intent(this,activity_login::class.java)
            startActivity(intent)
        }
        binding.button4.setOnClickListener{
            val intent=Intent(this,locationActivity::class.java)
            startActivity(intent)
        }

        }
    }
