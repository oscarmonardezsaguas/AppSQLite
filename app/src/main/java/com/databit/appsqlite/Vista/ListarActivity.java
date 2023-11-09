package com.databit.appsqlite.Vista;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.databit.appsqlite.Controlador.ConexionHelper;
import com.databit.appsqlite.Controlador.Utility;
import com.databit.appsqlite.Modelo.Usuario;
import com.databit.appsqlite.R;

import java.util.ArrayList;

public class ListarActivity extends AppCompatActivity {
    ListView listViewUsuarios;
    ArrayList<String> listaInformacion;
    ArrayList<Usuario> listaUsuarios;

    ConexionHelper conn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

    }

}