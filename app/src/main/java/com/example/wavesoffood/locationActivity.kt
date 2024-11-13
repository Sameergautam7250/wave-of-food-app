package com.example.wavesoffood

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.AutoCompleteTextView
import com.example.wavesoffood.databinding.ActivityLocationBinding

class locationActivity : AppCompatActivity() {
    private val binding: ActivityLocationBinding by lazy {
        ActivityLocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)


        val localeList:Array<String> = arrayOf("Delhi","Mumbai","kolkata","Banglore","Hyderabad","Chennai")
        val adapter: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,localeList)
        val autoCompleteTextView:AutoCompleteTextView = binding.listoflocation
        binding.listoflocation.setAdapter(adapter)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}