package com.android.calculator.model.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.calculator.R;
import com.android.calculator.model.CalculatorImpl;
import com.android.calculator.model.Operator;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements CalculatorView {

    private TextView resultTxt;
    private CalculatorPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTxt = findViewById(R.id.result);
        presenter = new CalculatorPresenter(this, new CalculatorImpl());
        Map<Integer, Integer> map = new HashMap<>();
        map.put(R.id.button_0, 0);
        map.put(R.id.button_1, 1);
        map.put(R.id.button_2, 2);
        map.put(R.id.button_3, 3);
        map.put(R.id.button_4, 4);
        map.put(R.id.button_5, 5);
        map.put(R.id.button_6, 6);
        map.put(R.id.button_7, 7);
        map.put(R.id.button_8, 8);
        map.put(R.id.button_9, 9);

        View.OnClickListener mapClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onPressed(map.get(view.getId()));
            }
        };

        findViewById(R.id.button_0).setOnClickListener(mapClickListener);
        findViewById(R.id.button_1).setOnClickListener(mapClickListener);
        findViewById(R.id.button_2).setOnClickListener(mapClickListener);
        findViewById(R.id.button_3).setOnClickListener(mapClickListener);
        findViewById(R.id.button_4).setOnClickListener(mapClickListener);
        findViewById(R.id.button_5).setOnClickListener(mapClickListener);
        findViewById(R.id.button_6).setOnClickListener(mapClickListener);
        findViewById(R.id.button_7).setOnClickListener(mapClickListener);
        findViewById(R.id.button_8).setOnClickListener(mapClickListener);
        findViewById(R.id.button_9).setOnClickListener(mapClickListener);

        Map<Integer, Operator> operatorsMap = new HashMap<>();
        operatorsMap.put(R.id.button_plus, Operator.ADD);
        operatorsMap.put(R.id.button_minus, Operator.SUB);
        operatorsMap.put(R.id.button_multi, Operator.MULTI);
        operatorsMap.put(R.id.button_div, Operator.DIV);

        View.OnClickListener operatorsMapClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onOperatorsPressed(operatorsMap.get(view.getId()));
            }
        };

        findViewById(R.id.button_plus).setOnClickListener(operatorsMapClickListener);
        findViewById(R.id.button_minus).setOnClickListener(operatorsMapClickListener);
        findViewById(R.id.button_multi).setOnClickListener(operatorsMapClickListener);
        findViewById(R.id.button_div).setOnClickListener(operatorsMapClickListener);

        findViewById(R.id.button_point).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onPointPressed();
            }
        });
    }

    @Override
    public void showResult(String result) {
        resultTxt.setText(result);
    }

}