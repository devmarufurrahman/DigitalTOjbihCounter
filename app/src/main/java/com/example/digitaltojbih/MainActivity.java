package com.example.digitaltojbih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button addBtn, subBtn, resetBtn, backHomePage;
    TextView resultCount;
    int count = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addBtn = findViewById(R.id.btnAdd);
        subBtn = findViewById(R.id.btnSub);
        resetBtn = findViewById(R.id.btnReset);
        resultCount  = findViewById(R.id.resultNum);
        backHomePage = findViewById(R.id.backHomePage);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count++;
                resultCount.setText(""+count);
            }
        });


        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count == 0){
                    count= 0;
                    resultCount.setText(""+count);
                } else {
                    count--;
                    resultCount.setText(""+count);
                }
            }
        });


        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count= 0;
                resultCount.setText(""+count);
            }
        });

        backHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(MainActivity.this, visibilityControlAndToast.class);
                startActivity(homeIntent);
            }
        });

    }
}