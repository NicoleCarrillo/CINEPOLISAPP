package com.tec.cinepolisapp2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton boton4;
    ImageButton botonPoster1;
    ImageButton botonPoster2;
    ImageButton botonPoster3;
    ImageButton botonPoster4;
    ImageButton botonPoster5;
    ImageButton botonPoster6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton4 = findViewById(R.id.botonMapa);
        botonPoster1 = findViewById(R.id.poster1);
        botonPoster2 = findViewById(R.id.poster2);
        botonPoster3 = findViewById(R.id.poster3);
        botonPoster4 = findViewById(R.id.poster4);
        botonPoster5 = findViewById(R.id.poster5);
        botonPoster6 = findViewById(R.id.poster6);


       boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent =new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(myIntent);
            }
        });

        botonPoster1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metodonic(1);
            }
        });

        botonPoster2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metodonic(2);
            }
        });

        botonPoster3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metodonic(3);
            }
        });

        botonPoster4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metodonic(4);
            }
        });

        botonPoster5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metodonic(5);
            }
        });

        botonPoster6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                metodonic(6);
            }
        });
    }

    public void metodonic(int numero){
        Bundle bundle=new Bundle();
        bundle.putString("ID",String.valueOf(numero));
        Intent myIntent =new Intent(getApplicationContext(),FragmentContainer.class);
        myIntent.putExtras(bundle);
        startActivity(myIntent);
    }
}
