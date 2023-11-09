package com.databit.appsqlite.Vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.databit.appsqlite.Controlador.ConexionHelper;
import com.databit.appsqlite.Controlador.Utility;
import com.databit.appsqlite.R;

public class MaintenanceActivity extends AppCompatActivity {
    EditText txtid;
    EditText txtnombre;
    EditText txtcorreo;
    Button btnconsultar, btnupdate, btndelete;

    ConexionHelper conn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance);

    }
}