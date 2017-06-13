package com.example.ifc.sharedpref;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SharedPreferences sp = getSharedPreferences(getString(R.string.Banco), 0);
        TextView textview = (TextView) findViewById(R.id.nome);

        int chave = 0;
        while (sp.getAll().containsKey(Integer.toString(chave))){
            String nome = (String) sp.getString(Integer.toString(chave), "");
            textview.setText(textview.getText() + "\n" + nome);
            chave += 1;
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main2);
        SharedPreferences sp = getSharedPreferences(getString(R.string.Banco), 0);
        TextView textview = (TextView) findViewById(R.id.nome);

        int chave = 0;
        while (sp.getAll().containsKey(Integer.toString(chave))){
            String nome = (String) sp.getString(Integer.toString(chave), "");
            textview.setText(textview.getText() + "\n" + nome);
            chave += 1;
        }

    }
}
