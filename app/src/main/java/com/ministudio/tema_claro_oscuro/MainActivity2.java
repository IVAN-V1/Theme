package com.ministudio.tema_claro_oscuro;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.materialswitch.MaterialSwitch;

public class MainActivity2 extends AppCompatActivity {


    SharedPreferences sharedPreferences_insertar;

    SharedPreferences sharedPreferences_leer;
    Boolean guarda_estado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        MaterialSwitch on = findViewById(R.id.switch_indeter);

        sharedPreferences_leer =getSharedPreferences("guardar_tema", Context.MODE_PRIVATE);
         guarda_estado=sharedPreferences_leer.getBoolean("guarda_estado",false);

        MaterialSwitch  on2=findViewById(R.id.switch_indeter);
        if (guarda_estado == true) {

            on2.setChecked(true);
        }
        if (guarda_estado == false) {

            on2.setChecked(false);

        }


        on.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean activo) {

                sharedPreferences_insertar =getSharedPreferences("guardar_tema", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor= sharedPreferences_insertar.edit();
                editor.putBoolean("guarda_estado",activo);


                if (activo == true) {


                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }
                if (activo == false) {


                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }


                editor.commit();
            }
        });

    }



}