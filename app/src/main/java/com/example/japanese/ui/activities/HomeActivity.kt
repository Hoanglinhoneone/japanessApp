package com.example.japanese.ui.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.japanese.R
//import com.example.japanese.databinding.ActivityHomeBinding
import com.example.japanese.ui.fragment.alphabet.MainAlphabetFragment
import com.example.japanese.ui.fragment.minna.MainMinnaFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
//    lateinit var binding : ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout, MainAlphabetFragment())
            commit()
        }
//        binding = ActivityHomeBinding.inflate(layoutInflater)
//        setContentView(binding.root)
        val bottomNavigationView = findViewById(R.id.bottomNavigationView) as BottomNavigationView
        bottomNavigationView.setOnItemSelectedListener   {
            when (it.itemId) {
                R.id.nav_alphabet -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.frameLayout, MainAlphabetFragment())
                        commit()
                    }
                    true
                }
                R.id.nav_minna -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.frameLayout, MainMinnaFragment())
                        commit()
                    }
                    true
                }
                else -> {
//                    supportFragmentManager.beginTransaction().apply {
//                        replace(R.id.frameLayout, AlphabetFragment())
//                        commit()
//                    }
                    true
                }
            }
        }
    }
}