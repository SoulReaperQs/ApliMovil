package com.example.alumno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btngo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("bichito", "La aplicacion acaba de ingresar a oncreate");
        btngo = (Button)findViewById(R.id.btngo);
        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,DetalleActivity.class);
                MainActivity.this.startActivity(x);
            }
        });
    }
        protected void onStart(){
        super.onStart();
        Log.v("bichito", "La aplicacion se acaba de ingresar a onstart");
    }
        protected void onResume(){
            Toast.makeText(this, "Gracias por usar", Toast.LENGTH_SHORT).show();
        super.onResume();
        Log.v("bichito", "La aplicacion se acaba de ingresar a onstart");
    }
    protected void onPause(){
        super.onPause();
        Log.v("bichito", "La aplicacion se acaba de ingresar a onstart");
    }
    protected void onStop(){
        super.onStop();
        Log.v("bichito", "La aplicacion se acaba de ingresar a onstart");
    }


}
