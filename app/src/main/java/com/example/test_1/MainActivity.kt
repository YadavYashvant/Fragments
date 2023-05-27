package com.example.test_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Fragment1 = FragmentOne()
        val Fragment2 = FragmentTwo()
        val DefualtFragment = DefaultFragment()
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        supportFragmentManager.beginTransaction().setCustomAnimations(android.R.animator.fade_in,android.R.animator.fade_out).replace(R.id.fragmentContainerView,DefualtFragment).commit()
        button1.setOnClickListener {
            supportFragmentManager.beginTransaction().setCustomAnimations(android.R.animator.fade_in,android.R.animator.fade_out).replace(R.id.fragmentContainerView,Fragment1).commit()
        }

        button2.setOnClickListener {
            supportFragmentManager.beginTransaction().setCustomAnimations(android.R.animator.fade_in,android.R.animator.fade_out).replace(R.id.fragmentContainerView,Fragment2).commit()
        }
    }
}