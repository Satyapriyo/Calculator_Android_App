package com.example.calculatorlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView2;
    private EditText editTextNumber;
    private EditText editTextNumber2;
    private Button button;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    char op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2 = findViewById(R.id.textView2);
        editTextNumber = findViewById(R.id.editTextNumber2);
        editTextNumber2 = findViewById(R.id.editTextNumber);
        button = findViewById(R.id.button);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = '+';
                Toast.makeText(MainActivity.this, "Addition", Toast.LENGTH_SHORT).show();


            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op ='-';
                Toast.makeText(MainActivity.this, "Subtraction", Toast.LENGTH_SHORT).show();


            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op ='p';
                Toast.makeText(MainActivity.this, "Power", Toast.LENGTH_SHORT).show();

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op ='i';
                Toast.makeText(MainActivity.this, "Integer division", Toast.LENGTH_SHORT).show();


            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op ='*';
                Toast.makeText(MainActivity.this, "Multiplication", Toast.LENGTH_SHORT).show();


            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op ='q';
                Toast.makeText(MainActivity.this, "SquareRoot", Toast.LENGTH_SHORT).show();


            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op='/';
                Toast.makeText(MainActivity.this, "Division", Toast.LENGTH_SHORT).show();
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op ='L';
                Toast.makeText(MainActivity.this, "Logarithm", Toast.LENGTH_SHORT).show();


            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op ='e';
                Toast.makeText(MainActivity.this, "Exponential", Toast.LENGTH_SHORT).show();

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = editTextNumber.getText().toString();
                String s2 = editTextNumber2.getText().toString();
                double num1 =Integer.parseInt(s2);
                double num2 =Integer.parseInt(s1);
                double ans =0;
                switch(op){
                    case '+':
                        ans = num1 + num2;
                        break;
                    case '-':
                        ans = num1-num2;
                        break;
                    case '*':
                        ans = num1*num2;
                        break;
                    case '/':
                        ans = (num1/num2);
                        break;
                    case 'i':
                        ans = (num2/num1);
                        ans = Math.round(ans);
                        break;
                    case 'L':
                        ans = Math.log(num2)/Math.log(num1);
                        break;
                    case 'e':
                        ans = Math.exp(num1);
                        break;
                    case 'q':
                        ans =Math.sqrt(num1);
                        break;
                    case 'p':
                        ans = Math.pow(num1,num2);
                        break;
                }
                String s= " " + ans;
                s = "answer will be " + s;
                textView2.setText(s);
            }
        });
    }

}