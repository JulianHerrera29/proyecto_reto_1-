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

public class registro_plastico_Activity extends AppCompatActivity {

    Spinner SpnRegistroMesPlastico;
    ImageButton IbtnRegresarCategoriaPlastico, IconoPapel2RegistroPlastico, Iconovidrio2RegistroPlastico, IconoCarton2RegistroPlastico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro_plastico);

        SpnRegistroMesPlastico = findViewById(R.id.Spn_registro_mes_plastico);
        IbtnRegresarCategoriaPlastico = findViewById(R.id.Ibtn_regresar_categoria_plastico);
        IconoPapel2RegistroPlastico = findViewById(R.id.Icono_papel_2_registro_plastico);
        Iconovidrio2RegistroPlastico = findViewById(R.id.Icono_vidrio_2_registro_plastico);
        IconoCarton2RegistroPlastico = findViewById(R.id.Icono_carton_2_registro_plastico);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Seleccion_meses, android.R.layout.simple_spinner_item);
        SpnRegistroMesPlastico.setAdapter(adapter);

        IbtnRegresarCategoriaPlastico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registro_plastico_Activity.this, categorias_Activity.class);
                startActivity(intent);
            }
        });

        IconoPapel2RegistroPlastico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registro_plastico_Activity.this, registro_papel_Activity.class);
                startActivity(intent);
            }
        });

        Iconovidrio2RegistroPlastico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registro_plastico_Activity.this, registro_vidrio_Activity.class);
                startActivity(intent);
            }
        });

        IconoCarton2RegistroPlastico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registro_plastico_Activity.this, registro_carton_Activity.class);
                startActivity(intent);
            }
        });

        };
    }
