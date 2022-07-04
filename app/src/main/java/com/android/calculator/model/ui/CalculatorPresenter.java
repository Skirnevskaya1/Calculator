package com.android.calculator.model.ui;

import com.android.calculator.model.Calculator;
import com.android.calculator.model.Operator;

public class CalculatorPresenter {

    private CalculatorView view;
    private Calculator calculator;

    public CalculatorPresenter(CalculatorView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    public void keyOnePressed() {
    }

    public void onPressed(Integer integer) {

    }

    public void onOperatorsPressed(Operator operator) {
    }

    public void onPointPressed() {
    }
}
