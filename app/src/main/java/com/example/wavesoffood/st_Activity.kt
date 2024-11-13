package com.example.wavesoffood

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.wavesoffood.databinding.ActivityStBinding

class st_Activity : AppCompatActivity() {
    private val binding:ActivityStBinding by lazy {
        ActivityStBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.nextbutton.setOnClickListener{
            val intent= Intent(this,activity_login::class.java)
            startActivity(intent)
        }
    }
}