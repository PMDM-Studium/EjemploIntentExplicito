package es.studium.ejemplointentexplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Recuperar parametros del intent
        //Bundle: Conjunto de elementos clave:valor
        Bundle extras=getIntent().getExtras();
        if(extras !=null){
            int numero =extras.getInt("numero");
            String nombre=extras.getString("nombre");
            Toast.makeText(this,"Número: "+numero,Toast.LENGTH_SHORT).show();
            Toast.makeText(this,"Nombre: "+nombre,Toast.LENGTH_SHORT).show();
        }
    }
}