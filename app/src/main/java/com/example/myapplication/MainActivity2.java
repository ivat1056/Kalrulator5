package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity2 extends AppCompatActivity {
    boolean isNew = true;
    TextView firstNumber;

    TextView result;
    String operator;
    String oldNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        firstNumber = findViewById(R.id.firstNumber);

        result = findViewById(R.id.result);
    }

    public void clickNumber(View view) {
        if (isNew)
            firstNumber.setText("");

        isNew = false;
        String number = firstNumber.getText().toString();
        switch (view.getId()) {
            case R.id.seven:
                number = number + "7";
                break;
            case R.id.eight:
                number = number + "8";
                break;
            case R.id.nine:
                number = number + "9";
                break;
            case R.id.four:
                number = number + "4";
                break;
            case R.id.five:
                number = number + "5";
                break;
            case R.id.six:
                number = number + "6";
                break;
            case R.id.one:
                number = number + "1";
                break;
            case R.id.two:
                number = number + "2";
                break;
            case R.id.three:
                number = number + "3";
                break;
            case R.id.zero:
                number = number + "0";
                break;


        }
        firstNumber.setText(number);

    }

    public void operation(View view) {
        isNew = true;
        oldNumber = firstNumber.getText().toString();


        switch (view.getId()) {
            case R.id.plus:
                operator = "+";
                break;
            case R.id.minus:
                operator = "-";
                break;
            case R.id.multiply:
                operator = "X";
                break;
            case R.id.divide:
                operator = "/";
                break;
        }

    }

    public void clickEqual(View view) {
        String newNumber = firstNumber.getText().toString();
        Double resul = 0.0;
        switch (operator) {
            case "+":
                resul = Math.sin(Double.parseDouble(oldNumber));
                break;
            case "-":
                resul = Math.cos(Double.parseDouble(oldNumber));
                break;
            case "X":
                resul = Math.pow(Double.parseDouble(oldNumber), Double.parseDouble(newNumber));
                break;
            case "/":
                Double  num1 = Double.parseDouble(oldNumber);
                Double num2 = Double.parseDouble(newNumber);
                resul = Math.pow(num2,1/num1);
                break;
        }
        result.setText(String.valueOf(resul));
    }

    public void clickC(View view) {
        firstNumber.setText("");
        isNew = true;
    }
    public void operation1(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    }
