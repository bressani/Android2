package com.example.bressani.remembering;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity {
    public final static String codigoIntent = "codigo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void enviarParaSecundaria(View view) {
        Intent intencao = new Intent(this, Secundaria.class);

        EditText nomeEdit = (EditText) findViewById(R.id.nome);
        String nome = nomeEdit.getText().toString();

        EditText sobrenomeEdit = (EditText) findViewById(R.id.sobrenome);
        String sobrenome = sobrenomeEdit.getText().toString();

        Bundle nomes = new Bundle();
        nomes.putString("chaveNome", nome);
        nomes.putString("chaveSobrenome", sobrenome);

        intencao.putExtras(nomes);

        startActivity(intencao);
        /* não dá para enviar uma intent com duas extras
        EditText sobrenomeEdit = (EditText) findViewById(R.id.sobrenome);
        String sobrenome = nomeEdit.getText().toString();
        intencao.putExtra(codigoSobrenome, sobrenome);
        startActivity(intencao);
        */


    }
}
