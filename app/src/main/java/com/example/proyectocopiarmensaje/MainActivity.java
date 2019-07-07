package com.example.proyectocopiarmensaje;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CopiarMensaje(View v){
        EditText auxOriginal = (EditText) findViewById(R.id.txtMensajeOriginal);
        EditText auxCopia = (EditText) findViewById(R.id.txtMensajeCopiado);
        String mensaje = auxOriginal.getText().toString();
        auxCopia.setText(mensaje);
    }
}
