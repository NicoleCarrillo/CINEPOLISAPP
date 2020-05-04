package com.tec.intentomil;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class FragmentContainer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_container);

        Bundle bundle2 = new Bundle(getIntent().getExtras());
        String ID = bundle2.getString("ID");

        switch(ID)
        {
            case "1":
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FragmentPeli1()).commit();
                break;
            case "2":
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FragmentPeli2()).commit();
                break;

            case "3":
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FragmentPeli3()).commit();
                break;

            case "4":
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FragmentPeli4()).commit();
                break;
        }
    }
}
