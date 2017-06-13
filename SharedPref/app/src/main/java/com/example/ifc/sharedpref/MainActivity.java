package com.example.ifc.sharedpref;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.salvar);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                SharedPreferences sp = getSharedPreferences(getString(R.string.Banco),0);
                SharedPreferences.Editor editor = sp.edit();
                TextView nome = (TextView) findViewById(R.id.nome);
                int chave = 0;
                while(sp.getAll().containsKey(Integer.toString(chave))){
                    chave += 1;
                }
                editor.putString(Integer.toString(chave), nome.getText().toString());
                editor.commit();
                Intent oi = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(oi);
            }
        });
    }
}
