package com.example.activitylifecycle;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText etFirstNumber, etSecondNumber;
    TextView tvResult;
    Button sum;

    int firstNumber;
    int secondNumber;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstNumber = findViewById(R.id.etFirstNumber);
        etSecondNumber = findViewById(R.id.etSecondNumber);
        tvResult = findViewById(R.id.tvResult);
        sum = findViewById(R.id.sum);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( v == sum) {
                    if (etFirstNumber.getText().toString().isEmpty() || etSecondNumber.getText().toString().isEmpty()) {
                        Toast.makeText(getBaseContext(), "Moi ban nhap so", Toast.LENGTH_LONG).show();
                    } else {
                        try {
                            firstNumber = Integer.parseInt(etFirstNumber.getText().toString());
                            secondNumber = Integer.parseInt(etSecondNumber.getText().toString());
                            result = firstNumber + secondNumber;

                            tvResult.setText(String.valueOf(result));
                        } catch (NumberFormatException nfe) {
                            Toast.makeText(getBaseContext(), "CC nhap dung so vo may!", Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }
        });
        if(savedInstanceState != null) {
            etFirstNumber.setText(String.valueOf(savedInstanceState.getInt("firstNumber")));
            etSecondNumber.setText(String.valueOf(savedInstanceState.getInt("secondNumber")));
            tvResult.setText(String.valueOf(savedInstanceState.getInt("result")));
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        if(!tvResult.getText().toString().isEmpty()) {
            outState.putInt("firstNumber", Integer.parseInt(etFirstNumber.getText().toString()));
            outState.putInt("secondNumber", Integer.parseInt(etSecondNumber.getText().toString()));
            outState.putInt("result", Integer.parseInt(tvResult.getText().toString()));
        }
        super.onSaveInstanceState(outState);
    }

}