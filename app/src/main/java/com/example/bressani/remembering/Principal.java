package com.example.bressani.remembering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity {
    public final static String codigoNome = "enviarNome";
    public final static String codigoSobrenome = "enviarSobrenome";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void enviarParaSecundaria(View view) {
        Intent intencao = new Intent(this, Secundaria.class);
        EditText nomeEdit = (EditText) findViewById(R.id.nome);
        String nome = nomeEdit.getText().toString();
        intencao.putExtra(codigoNome, nome);


        EditText sobrenomeEdit = (EditText) findViewById(R.id.sobrenome);
        String sobrenome = nomeEdit.getText().toString();
        intencao.putExtra(codigoSobrenome, sobrenome);
        startActivity(intencao);
    }
}
