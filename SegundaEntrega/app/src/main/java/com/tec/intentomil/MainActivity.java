package com.tec.intentomil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    ImageButton botonPoster1;
    ImageButton botonPoster2;
    ImageButton botonPoster3;
    ImageButton botonPoster4;
    ImageButton mapa;
    ImageButton login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonPoster1 = findViewById(R.id.imageButton5);
        botonPoster2 = findViewById(R.id.imageButton6);
        botonPoster3 = findViewById(R.id.imageButton7);
        botonPoster4 = findViewById(R.id.imageButton8);
        mapa=findViewById(R.id.imageButtonPlace);
        login=findViewById(R.id.imageButtonPerson);

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

        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent =new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(myIntent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent =new Intent(getApplicationContext(),LoginPerfil.class);
                startActivity(myIntent);
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

    public void showMenu(View v){
        PopupMenu popup=new PopupMenu(this,v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();

    }
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this,"Locacion Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2:
                Toast.makeText(this,"Locacion Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.item3:
                Toast.makeText(this,"Locacion Selected",Toast.LENGTH_LONG).show();
                return true;
            default:
                return false;
        }
    }
}
