package com.android.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.android.calculator.views.KeyboardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<KeyboardView>(R.id.keyboard).setOnKeyPressedListener { key ->
            Toast.makeText(this, "$key is clicked", Toast.LENGTH_LONG).show()
        }
    }
}


