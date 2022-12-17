package com.android.calculator.viewmodel

import androidx.lifecycle.ViewModel
import com.android.calculator.domain.CalculatorInteractor
import com.android.calculator.views.KeyboardKey
import kotlin.properties.Delegates

// todo
// 1. отнаследовать от гугловой ViewModel
// 2. создать внутри MainActivity через фабрику
// 3. extension функции и свойства - прочитать (kotlin)
// 4. SharedFlow, StateFlow

class CalculatorViewModel {

    private val interactor = CalculatorInteractor()

    fun onKeyPressed(expression: String, key: KeyboardKey) {
        when {
            key.isDigitOrOperation() -> tryAddNewSymbol(expression, key)
            key.isClearExpression() -> clearExpression()
            key.isEquals() -> calculateExpression()
        }
    }

    private fun tryAddNewSymbol(expression: String, key: KeyboardKey) {

    }

    private fun clearExpression() {
        // todo implement me
    }

    private fun calculateExpression() {
        // todo implement me
    }

    private fun KeyboardKey.isDigitOrOperation(): Boolean {
        return false
    }

    private fun KeyboardKey.isClearExpression(): Boolean {
        return false
    }

    private fun KeyboardKey.isEquals(): Boolean {
        return this == KeyboardKey.BUTTON_EQUALS
    }

}