package com.talhabilal.zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText cash = findViewById(R.id.editTextCash);
        EditText savings = findViewById(R.id.editTextSavings);
        EditText gold = findViewById(R.id.editTextGoldSilver);
        EditText loans = findViewById(R.id.editTextLoans);

        Button buttonCalculate = findViewById(R.id.buttonCalculate);
        TextView textViewPayableZakat = findViewById(R.id.textViewPayableZakat);

        buttonCalculate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int totalAmount = Integer.parseInt(cash.getText().toString()) + Integer.parseInt(savings.getText().toString()) + Integer.parseInt(gold.getText().toString()) - Integer.parseInt(loans.getText().toString());

                        textViewPayableZakat.setText("Zakat: " + totalAmount*0.025 + " PKR");
                    }
                }
        );
    }
}