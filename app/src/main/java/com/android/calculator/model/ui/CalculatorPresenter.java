package com.android.calculator.model.ui;

import android.icu.number.NumberFormatter;
import android.icu.number.NumberRangeFormatter;
import android.icu.text.DecimalFormat;

import com.android.calculator.model.Calculator;
import com.android.calculator.model.Operator;

public class CalculatorPresenter {

    private final DecimalFormat decimalFormat = new DecimalFormat("#.##");
    private final CalculatorView view;
    private final Calculator calculator;

    private double arg1;
    private Double arg2;
    private Operator selectedOperator;

    public CalculatorPresenter(CalculatorView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    public void onPressed(int integer) {
        if (arg2 == null) {
            arg1 = arg1 * 10 + integer;
            showFormatter(arg1);
        } else {
            arg2 = arg2 * 10 + integer;
            showFormatter(arg2);
        }
    }

    public void onOperatorsPressed(Operator operator) {
        if (selectedOperator != null) {
            arg1 = calculator.perform(arg2, arg2, selectedOperator);
            showFormatter(arg1);
        }
        arg2 = 0.0;
        selectedOperator = operator;
    }

    public void onPointPressed() {
    }

    private void showFormatter(double value) {
        view.showResult(decimalFormat.format(value));
    }
}
