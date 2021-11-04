package com.example.peliflix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivityP1 extends AppCompatActivity {

    private  EditText editTextTextPersonName;

    // private TextView textmensaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_p1);


        editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);



    }
    //enviar mensaje
    public void Enviar(View view){
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("dato", editTextTextPersonName.getText().toString());
        startActivity(i);

    }

}