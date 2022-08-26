package com.example.mycalcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mycalcapp.R;
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
        TextView sign = findViewById(R.id.correctSign);

        // all the buttons ID in order to change the colors once the division button is pressed
        Button divisionSign = findViewById(R.id.divide);
        Button multiplicationSign = findViewById(R.id.multiply);
        Button additionSign = findViewById(R.id.add);
        Button subtractionSign = findViewById(R.id.subtract);

        // making sure the user has inputted 2 numbers
        if(firstNum.getText().toString().trim().length() == 0 || secondNum.getText().toString().trim().length() == 0){
            sumOf.setText("Input both");
        }
        else {
            // making them Integer values to be able to do math with them
            double num1 = Integer.parseInt(firstNum.getText().toString());
            double num2 = Integer.parseInt(secondNum.getText().toString());

            double sum = num1 + num2;

            sumOf.setText("" + sum);
        }

        //changing the color of the sign that the user pressed and resetting others
        divisionSign.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        multiplicationSign.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        additionSign.setBackgroundColor(getResources().getColor(R.color.orange));
        subtractionSign.setBackgroundColor(getResources().getColor(R.color.lightBlue));

        // set the correct sign for the operation the suer chose
        sign.setText("+");

    }

    // this subtracts the 2 numbers that the user inputs in the calculator app.
    // so it will give you the difference of the two
    public void findDifference(View view){
        TextInputEditText firstNum = findViewById(R.id.firstNum);
        TextInputEditText secondNum = findViewById(R.id.secondNum);
        TextView sumOf = findViewById(R.id.result);
        TextView sign = findViewById(R.id.correctSign);

        // all the buttons ID in order to change the colors once the division button is pressed
        Button divisionSign = findViewById(R.id.divide);
        Button multiplicationSign = findViewById(R.id.multiply);
        Button additionSign = findViewById(R.id.add);
        Button subtractionSign = findViewById(R.id.subtract);

        // making sure the user has inputted 2 numbers
        if(firstNum.getText().toString().trim().length() == 0 || secondNum.getText().toString().trim().length() == 0){
            sumOf.setText("Input both");
        }
        else {

            double num1 = Integer.parseInt(firstNum.getText().toString());
            double num2 = Integer.parseInt(secondNum.getText().toString());
            double sum = num1 - num2;

            sumOf.setText("" + sum);
        }

        //changing the color of the sign that the user pressed and resetting others
        divisionSign.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        multiplicationSign.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        additionSign.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        subtractionSign.setBackgroundColor(getResources().getColor(R.color.orange));

        // set the correct sign for the operation the suer chose
        sign.setText("-");
    }


    // this will multiply the two numbers the user inputs together,
    // giving you the product of the two
    public void findProduct(View view){
        TextInputEditText firstNum = findViewById(R.id.firstNum);
        TextInputEditText secondNum = findViewById(R.id.secondNum);
        TextView sumOf = findViewById(R.id.result);
        TextView sign = findViewById(R.id.correctSign);

        // all the buttons ID in order to change the colors once the division button is pressed
        Button divisionSign = findViewById(R.id.divide);
        Button multiplicationSign = findViewById(R.id.multiply);
        Button additionSign = findViewById(R.id.add);
        Button subtractionSign = findViewById(R.id.subtract);

        // making sure the user has inputted 2 numbers
        if(firstNum.getText().toString().trim().length() == 0 || secondNum.getText().toString().trim().length() == 0){
            sumOf.setText("Input both");
        }
        else {
            double num1 = Integer.parseInt(firstNum.getText().toString());
            double num2 = Integer.parseInt(secondNum.getText().toString());
            double sum = num1 * num2;

            sumOf.setText("" + sum);
        }

        //changing the color of the sign that the user pressed and resetting others
        divisionSign.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        multiplicationSign.setBackgroundColor(getResources().getColor(R.color.orange));
        additionSign.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        subtractionSign.setBackgroundColor(getResources().getColor(R.color.lightBlue));

        // set the correct sign for the operation the suer chose
        sign.setText("x");
    }

    // this will divide the two numbers the user inputs together,
    // giving you the quotient of the two
    public void findQuotient(View view){
        TextInputEditText firstNum = findViewById(R.id.firstNum);
        TextInputEditText secondNum = findViewById(R.id.secondNum);
        TextView sumOf = findViewById(R.id.result);
        TextView sign = findViewById(R.id.correctSign);

        // all the buttons ID in order to change the colors once the division button is pressed
        Button divisionSign = findViewById(R.id.divide);
        Button multiplicationSign = findViewById(R.id.multiply);
        Button additionSign = findViewById(R.id.add);
        Button subtractionSign = findViewById(R.id.subtract);

        // making sure the user has inputted 2 numbers
        if(firstNum.getText().toString().trim().length() == 0 || secondNum.getText().toString().trim().length() == 0){
            sumOf.setText("Input both");
        }
        else {
            double num1 = Integer.parseInt(firstNum.getText().toString());
            double num2 = Integer.parseInt(secondNum.getText().toString());
            double sum = num1 / num2;

            sumOf.setText("" + sum);
        }

        //changing the color of the sign that the user pressed and resetting others
        divisionSign.setBackgroundColor(getResources().getColor(R.color.orange));
        multiplicationSign.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        additionSign.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        subtractionSign.setBackgroundColor(getResources().getColor(R.color.lightBlue));

        // set the correct sign for the operation the suer chose
        sign.setText("/");
    }

    // Citing:
    // to change button colors : https://stackoverflow.com/questions/13842447/android-set-button-background-programmatically

}
