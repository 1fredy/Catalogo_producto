package com.ugb.catalogo_producto;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Damas;
    Button Hombres;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Damas = (Button) findViewById(R.id.btnDamas);
        Damas.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent Damas = new Intent(MainActivity.this, Catalogo_Damas.class);
                startActivity(Damas);
            }
        });

        Hombres = (Button) findViewById(R.id.btnHombres);
        Hombres.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent Hombres = new Intent(MainActivity.this, Catalogo_Hombres.class);
                startActivity(Hombres);
            }
        });
    }
}

