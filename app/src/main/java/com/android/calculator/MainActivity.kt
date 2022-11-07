package com.android.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.android.calculator.viewmodel.CalculatorViewModel
import com.android.calculator.views.KeyboardView

// Домашка
// ЖЦ активити знать
// смена конфигурации
// про inner / nested классы
// про sealed классы
// про typealias
// ввод клавиш должен отображаться в expression_view

class MainActivity : AppCompatActivity() {

    private val viewModel = CalculatorViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<KeyboardView>(R.id.keyboard).setOnKeyPressedListener { key ->
            Toast.makeText(this, "$key is clicked", Toast.LENGTH_LONG).show()
        }
    }
}

