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

        listViewUsuarios=(ListView) findViewById(R.id.listViewUsuarios);

        conn=new ConexionHelper(getApplicationContext(), "bd_usuarios", null, 1 );
        listViewUsuarios= (ListView) findViewById(R.id.listViewUsuarios);

        consultarListaUsuarios();

        ArrayAdapter adaptador=new ArrayAdapter(this, android.R.layout.simple_list_item_1,listaInformacion);
        listViewUsuarios.setAdapter(adaptador);

        listViewUsuarios.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String informacion="id: " + listaUsuarios.get(position).getId() +"\n";
                informacion+="Nombre: " + listaUsuarios.get(position).getNombre() +"\n";
                informacion+="Correo: " + listaUsuarios.get(position).getCorreo() +"\n";
                Toast.makeText(getApplicationContext(), informacion,Toast.LENGTH_LONG).show();
            }
        });

    }

    private void consultarListaUsuarios() {
        SQLiteDatabase db = conn.getReadableDatabase();
        Usuario usuario=null;
        listaUsuarios=new ArrayList<Usuario>();
        Cursor cursor=db.rawQuery("SELECT * FROM "+ Utility.TABLA_USUARIO, null);
        while (cursor.moveToNext()){
            usuario=new Usuario();
            usuario.setId(cursor.getInt(0));
            usuario.setNombre(cursor.getString(1));
            usuario.setCorreo(cursor.getString(2));
            listaUsuarios.add(usuario);
        }
        obtenerLista();
    }

    private void obtenerLista(){
        listaInformacion=new ArrayList<String>();
        for (int i=0; i<listaUsuarios.size(); i++){
            listaInformacion.add(listaUsuarios.get(i).getId()+ " - " + listaUsuarios.get(i).getNombre());
        }

    }

}