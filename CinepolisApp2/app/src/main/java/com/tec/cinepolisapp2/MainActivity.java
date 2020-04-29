package com.tec.cinepolisapp2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageButton botonpp;
    ImageButton boton4;
    ImageButton botonPoster1;
    ImageButton botonPoster2;
    ImageButton botonPoster3;
    ImageButton botonPoster4;
    ImageButton botonPoster5;
    ImageButton botonPoster6;
    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonpp=findViewById(R.id.botonLogin);
        boton4 = findViewById(R.id.botonMapa);
        botonPoster1 = findViewById(R.id.poster1);
        botonPoster2 = findViewById(R.id.poster2);
        botonPoster3 = findViewById(R.id.poster3);
        botonPoster4 = findViewById(R.id.poster4);
        botonPoster5 = findViewById(R.id.poster5);
        botonPoster6 = findViewById(R.id.poster6);
        listView = (ExpandableListView) findViewById(R.id.textView2);
        initData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listHash);
        listView.setAdapter(listAdapter);

       boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent =new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(myIntent);
            }
        });

        botonpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent =new Intent(getApplicationContext(),LoginPerfil.class);
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

    private void initData(){
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("VIP Andares  3.7 km");

        List<String> cines = new ArrayList<>();
        cines.add("Real Center  1.2 km");
        cines.add("Galerías Guadalajara  5.6 km");
        cines.add("La Gran Plaza  6.0 km");
        cines.add("Ciudadela Lifestyle Center  7.3 km");

        listHash.put(listDataHeader.get(0), cines);
    }
}

