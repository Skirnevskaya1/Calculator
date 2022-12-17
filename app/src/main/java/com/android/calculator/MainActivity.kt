package com.android.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.android.calculator.viewmodel.CalculatorViewModel
import com.android.calculator.views.KeyboardKey
import com.android.calculator.views.KeyboardView

// Домашка. циклы,
//Функциональный тип, функция высшего порядка, паттерн listener
// ЖЦ активити знать.
// смена конфигурации.
// про inner / nested классы.
// про sealed классы.
// про typealias.
// ввод клавиш должен отображаться в expression_view.
//CE удаляет только последнее введённое число.

class MainActivity : AppCompatActivity() {

    private val viewModel = CalculatorViewModel()

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val expressionView = findViewById<TextView>(R.id.expression_view)
        val resultView = findViewById<TextView>(R.id.result_view)

        // rv написать
        // 2-3 задачи на leetcode
        fun deleteSymbol() {
            if (expressionView.text.toString().isNotEmpty())
                expressionView.text = expressionView.text.toString().dropLast(1)
//                expressionView.text = expressionView.text.toString()
//                    .substring(0, expressionView.text.toString().length - 1)
            resultView.text = ""
        }

        findViewById<KeyboardView>(R.id.keyboard).setOnKeyPressedListener { key ->
            viewModel.onKeyPressed(key)

        }
    }

}

/*
InstrumentChartWidge
 when (key) {
                KeyboardKey.BUTTON_CE -> {
                    deleteSymbol()
                }

                KeyboardKey.BUTTON_MC -> {
                    expressionView.text = ""
                    resultView.text = ""
                }
                KeyboardKey.BUTTON_QUOTES -> expressionView.text =
                    expressionView.text.toString() + ">"
                KeyboardKey.BUTTON_DIV -> expressionView.text = expressionView.text.toString() + "/"
                KeyboardKey.BUTTON_7 -> expressionView.text = expressionView.text.toString() + "7"
                KeyboardKey.BUTTON_8 -> expressionView.text = expressionView.text.toString() + "8"
                KeyboardKey.BUTTON_9 -> expressionView.text = expressionView.text.toString() + "9"
                KeyboardKey.BUTTON_MULTI -> expressionView.text =
                    expressionView.text.toString() + "*"
                KeyboardKey.BUTTON_4 -> expressionView.text = expressionView.text.toString() + "4"
                KeyboardKey.BUTTON_5 -> expressionView.text = expressionView.text.toString() + "5"
                KeyboardKey.BUTTON_6 -> expressionView.text = expressionView.text.toString() + "6"
                KeyboardKey.BUTTON_MINUS -> expressionView.text =
                    expressionView.text.toString() + "-"
                KeyboardKey.BUTTON_1 -> expressionView.text = expressionView.text.toString() + "1"
                KeyboardKey.BUTTON_2 -> expressionView.text = expressionView.text.toString() + "2"
                KeyboardKey.BUTTON_3 -> expressionView.text = expressionView.text.toString() + "3"
                KeyboardKey.BUTTON_PLUS -> expressionView.text =
                    expressionView.text.toString() + "+"
                KeyboardKey.BUTTON_0 -> expressionView.text = expressionView.text.toString() + "0"
                KeyboardKey.BUTTON_COMMA -> expressionView.text =
                    expressionView.text.toString() + "."
                KeyboardKey.BUTTON_EQUALS -> expressionView.text =
                    expressionView.text.toString() + "="
            }
        }
* */
