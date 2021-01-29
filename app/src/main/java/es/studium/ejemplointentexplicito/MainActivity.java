package es.studium.ejemplointentexplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = findViewById(R.id.textoEvento);
        //Le añadimos el Listener correspondiente
        texto.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        //Escribimos el código necesario para iniciar el segundo activity2 se trata de un intent explisito.
        Intent intentMain2 = new Intent(this,MainActivity2.class);
        intentMain2.putExtra("numero",23);
        intentMain2.putExtra("nombre","Lucía");
        startActivity(intentMain2);
    }
}