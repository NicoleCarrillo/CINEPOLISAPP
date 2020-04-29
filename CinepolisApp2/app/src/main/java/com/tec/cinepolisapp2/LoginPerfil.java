package com.tec.cinepolisapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPerfil extends AppCompatActivity {

    EditText nickname, tarj;
    Button loginLButton;
    String name="Luis Nuñez",tarjeta="123456789",
            name2="Nicole Carrillo",tarjeta2="987654321",
            name3="Roberto Castro",tarjeta3="135792468";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_perfil);

        nickname = (EditText)findViewById(R.id.nicknameLField);
        tarj = (EditText)findViewById(R.id.tarjetaField);
        loginLButton = (Button)findViewById(R.id.loginLButton);

        loginLButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String entryNickname = nickname.getText().toString();
                String entryTarjeta = tarj.getText().toString();

                if((name.equals(entryNickname)&& tarjeta.equals(entryTarjeta)) || (name2.equals(entryNickname)&& tarjeta2.equals(entryTarjeta)) ||
                        (name3.equals(entryNickname)&& tarjeta3.equals(entryTarjeta))){
                    Toast.makeText(getApplicationContext(),"Login exitoso", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginPerfil.this, Perfil.class);
                    intent.putExtra("message", entryNickname);
                    startActivity(intent);

                }
                else {
                    Toast.makeText(getApplicationContext(),"Datos incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}