package com.example.bressani.remembering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);

        Intent intencao = getIntent();

        String nome = intencao.getStringExtra(Principal.codigoNome);
        String sobrenome = intencao.getStringExtra(Principal.codigoSobrenome);


        TextView nomeText = (TextView) findViewById(R.id.nome);
        TextView sobrenomeText = (TextView) findViewById(R.id.sobrenome);

        nomeText.setText(nome);
        sobrenomeText.setText(sobrenome);

    }
}