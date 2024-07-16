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

public class registro_carton_Activity extends AppCompatActivity {

    Spinner SpnRegistroMesCarton;
    ImageButton IbtnRegresarCategoriaCarton, IconoPapel2RegistroCarton, IconoPlastico2RegistroCarton, IconoVidrio2RegistroCarton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro_carton);

        SpnRegistroMesCarton = findViewById(R.id.Spn_registro_mes_carton);
        IbtnRegresarCategoriaCarton = findViewById(R.id.Ibtn_regresar_categoria_carton);
        IconoPapel2RegistroCarton = findViewById(R.id.Icono_papel_2_registro_carton);
        IconoPlastico2RegistroCarton = findViewById(R.id.Icono_plastico_2_registro_carton);
        IconoVidrio2RegistroCarton = findViewById(R.id.Icono_vidrio_2_registro_carton);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Seleccion_meses, android.R.layout.simple_spinner_item);
        SpnRegistroMesCarton.setAdapter(adapter);

        IbtnRegresarCategoriaCarton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registro_carton_Activity.this, categorias_Activity.class);
                startActivity(intent);
            }
        });

        IconoPapel2RegistroCarton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registro_carton_Activity.this, registro_papel_Activity.class);
                startActivity(intent);
            }
        });

        IconoPlastico2RegistroCarton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registro_carton_Activity.this, registro_plastico_Activity.class);
                startActivity(intent);
            }
        });

        IconoVidrio2RegistroCarton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registro_carton_Activity.this, registro_vidrio_Activity.class);
                startActivity(intent);
            }
        });

        };
    }
