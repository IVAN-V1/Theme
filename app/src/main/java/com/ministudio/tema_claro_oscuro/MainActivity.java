package com.ministudio.tema_claro_oscuro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.res.ResourcesCompat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Boolean  guarda_estado;

    SharedPreferences  sharedPreferences_leer;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button_activity=findViewById(R.id.button);

         textView  =findViewById(R.id.textView);



button_activity.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {


        Intent hh = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(hh);

    }
});




    }


    @Override
    protected void onResume() {
        super.onResume();



        sharedPreferences_leer =getSharedPreferences("guardar_tema", Context.MODE_PRIVATE);
        guarda_estado=sharedPreferences_leer.getBoolean("guarda_estado",false);


        if (guarda_estado == true) {


            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            textView.setText("TEMA OSCURO");
        }
        if (guarda_estado == false) {

            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

            textView.setText("TEMA CLARO");
        }



    }


    @Override
    protected void onDestroy() {
        super.onDestroy();



    }
}


