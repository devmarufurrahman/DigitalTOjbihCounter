package com.example.digitaltojbih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class visibilityControlAndToast extends AppCompatActivity {

    ImageView img;
    Button visible, invisible, btnToast, nextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visibility_control_and_toast);

        img = findViewById(R.id.img);
        visible = findViewById(R.id.visibleBtn);
        invisible = findViewById(R.id.invisibleBtn);
        btnToast = findViewById(R.id.toastBtn);
        nextPage = findViewById(R.id.nextPageBtn);


        // Image visible Listener
        visible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setVisibility(View.VISIBLE);
            }
        });

        // Image invisible Listener
        invisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setVisibility(View.INVISIBLE);
            }
        });


        // Toast show button

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(visibilityControlAndToast.this,"This is a toast", Toast.LENGTH_LONG).show();
            }
        });


        // Next page
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(visibilityControlAndToast.this, MainActivity.class);
                startActivity(myIntent);
            }
        });

        //back to home page

    }
}