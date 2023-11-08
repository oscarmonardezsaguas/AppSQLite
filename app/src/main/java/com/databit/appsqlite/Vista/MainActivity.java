package com.databit.appsqlite.Vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.databit.appsqlite.Controlador.ConexionHelper;
import com.databit.appsqlite.R;

public class MainActivity extends AppCompatActivity {
    Button btnregistro;
    Button btnconsultar;

    Button btnlistar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnregistro =(Button) findViewById(R.id.btnRegistrar);
        btnconsultar = (Button) findViewById(R.id.btnConsultar);
        btnlistar=(Button) findViewById(R.id.btnListar);


        btnregistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        btnconsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MaintenanceActivity.class);
                startActivity(intent);
            }
        });

        btnlistar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListarActivity.class);
                startActivity(intent);
            }
        });




    }
}

