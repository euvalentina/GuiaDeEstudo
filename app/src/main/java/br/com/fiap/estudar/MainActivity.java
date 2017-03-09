package br.com.fiap.estudar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView resultado;
        RadioGroup grupoPrincipal;
        CheckBox arroz;
        CheckBox feijao;
        CheckBox batata;
        CheckBox legume;
        CheckBox pure;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = (TextView) findViewById(R.id.txtResultado);
        

    }

    public void btnCalcular(View view) {

    }
}
