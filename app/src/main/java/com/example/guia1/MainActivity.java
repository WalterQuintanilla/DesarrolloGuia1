package com.example.guia1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaracion de las variables
    private Button btnCalculadora;
    private Button btnLogin;
    private Button btnDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicialixamos los controles
    this.btnCalculadora=findViewById(R.id.btnCalculadora);
    this.btnLogin=findViewById(R.id.btnLogin);
    this.btnDatos=findViewById(R.id.btnDatos);

    btnCalculadora.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent nueva = new Intent(getApplicationContext(), Segunda.class);
            startActivity(nueva);
        }
    }
    );

    btnLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent login = new Intent(getApplicationContext(), Tercera.class);
            startActivity(login);
        }
    });

    btnDatos.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent datos = new Intent(getApplicationContext(), Cuarta.class);
            startActivity(datos);
        }
    });
    }
}
