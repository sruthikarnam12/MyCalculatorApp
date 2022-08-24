package com.example.mycalcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // this adds together the 2 numbers that the user inputs in the calculator app,
    // so this gives you the sum of the two numbers
    public void findSum(View view){
        TextInputEditText firstNum = findViewById(R.id.firstNum);
        TextInputEditText secondNum = findViewById(R.id.secondNum);
        TextView sumOf = findViewById(R.id.result);

        if(firstNum == null || secondNum == null){
            System.out.println("Please input a second number.");
        }

        int num1 = Integer.parseInt(firstNum.getText().toString());
        int num2 = Integer.parseInt(secondNum.getText().toString());
        int sum = num1 + num2;

        sumOf.setText("" + sum);
    }

    // this subtracts the 2 numbers that the user inputs in the calculator app.
    // so it will give you the difference of the two
    public void findDifference(View view){
        TextInputEditText firstNum = findViewById(R.id.firstNum);
        TextInputEditText secondNum = findViewById(R.id.secondNum);
        TextView sumOf = findViewById(R.id.result);

        int num1 = Integer.parseInt(firstNum.getText().toString());
        int num2 = Integer.parseInt(secondNum.getText().toString());
        int sum = num1 - num2;

        sumOf.setText("" + sum);
    }


    // this will multiply the two numbers the user inputs together,
    // giving you the product of the two
    public void findProduct(View view){
        TextInputEditText firstNum = findViewById(R.id.firstNum);
        TextInputEditText secondNum = findViewById(R.id.secondNum);
        TextView sumOf = findViewById(R.id.result);

        int num1 = Integer.parseInt(firstNum.getText().toString());
        int num2 = Integer.parseInt(secondNum.getText().toString());
        int sum = num1 * num2;

        sumOf.setText("" + sum);
    }

    // this will divide the two numbers the user inputs together,
    // giving you the quotient of the two
    public void findQuotient(View view){
        TextInputEditText firstNum = findViewById(R.id.firstNum);
        TextInputEditText secondNum = findViewById(R.id.secondNum);
        TextView sumOf = findViewById(R.id.result);

        double num1 = Integer.parseInt(firstNum.getText().toString());
        double num2 = Integer.parseInt(secondNum.getText().toString());
        double sum = num1 / num2;

        sumOf.setText("" + sum);
    }

    // want to make a clear text function tbh and then also enhance the over all look of the app

}