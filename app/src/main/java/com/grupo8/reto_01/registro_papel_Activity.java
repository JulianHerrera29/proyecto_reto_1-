package com.grupo8.reto_01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class registro_papel_Activity extends AppCompatActivity {

    Spinner SpnRegistroMesPapel;
    ImageButton IbtnRegresarCategoriaPapel, IconoPlastico2RegistroPapel, IconoVidrio2RegistroPapel, IconoCarton2RegistroPapel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro_papel);

        SpnRegistroMesPapel = findViewById(R.id.Spn_registro_mes_papel);
        IbtnRegresarCategoriaPapel = findViewById(R.id.Ibtn_regresar_categoria_papel);
        IconoPlastico2RegistroPapel = findViewById(R.id.icono_plastico_2_registro_papel);
        IconoVidrio2RegistroPapel = findViewById(R.id.Icono_vidrio_2_registro_papel);
        IconoCarton2RegistroPapel = findViewById(R.id.Icono_carton_2_registro_papel);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Seleccion_meses, android.R.layout.simple_spinner_item);
        SpnRegistroMesPapel.setAdapter(adapter);

        IbtnRegresarCategoriaPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registro_papel_Activity.this, categorias_Activity.class);
                startActivity(intent);
            }
        });

        IconoPlastico2RegistroPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registro_papel_Activity.this, registro_plastico_Activity.class);
                startActivity(intent);
            }
        });

        IconoVidrio2RegistroPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registro_papel_Activity.this, registro_vidrio_Activity.class);
                startActivity(intent);
            }
        });

        IconoCarton2RegistroPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registro_papel_Activity.this, registro_carton_Activity.class);
                startActivity(intent);
            }
        });

        };



    }