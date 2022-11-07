package com.android.calculator.domain


sealed class CalculationResult {

    object Loading: CalculationResult()
    class Success(val result: Int): CalculationResult()
    class Error(val message: String): CalculationResult()
}