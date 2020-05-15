package com.example.listadeinmuebles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Inmueble> lista= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarLista();
    }

    public void generarLista(){
        ArrayAdapter<Inmueble> adapter= new ListaAdapter(this,R.layout.item,lista,getLayoutInflater());
        ListView lv= findViewById(R.id.milista);
        lv.setAdapter(adapter);
    }

    public void cargarDatos(){

            lista.add(new Inmueble(R.drawable.img1,"Arizona",90000));
            lista.add(new Inmueble(R.drawable.img2,"La punta",100000));
            lista.add(new Inmueble(R.drawable.img3,"San luis",80000));

    }
}
