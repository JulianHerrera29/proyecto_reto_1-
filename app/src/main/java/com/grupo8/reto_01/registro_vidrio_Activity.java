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

public class registro_vidrio_Activity extends AppCompatActivity {

    Spinner SpnRegistroMesVidrio;
    ImageButton IbtnRegresarCategoriaVidrio, IconoPapel2RegistroVidrio, Iconoplastico2RegistroVidrio, IconoCarton2RegistroVidrio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro_vidrio);

        SpnRegistroMesVidrio = findViewById(R.id.Spn_registro_mes_vidrio);
        IbtnRegresarCategoriaVidrio = findViewById(R.id.Ibtn_regresar_categoria_vidrio);
        IconoPapel2RegistroVidrio = findViewById(R.id.Icono_papel_2_registro_vidrio);
        Iconoplastico2RegistroVidrio = findViewById(R.id.Icono_plastico_2_registro_vidrio);
        IconoCarton2RegistroVidrio = findViewById(R.id.Icono_carton_2_registro_vidrio);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Seleccion_meses, android.R.layout.simple_spinner_item);
        SpnRegistroMesVidrio.setAdapter(adapter);

        IbtnRegresarCategoriaVidrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registro_vidrio_Activity.this, categorias_Activity.class);
                startActivity(intent);
            }
        });

        IconoPapel2RegistroVidrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registro_vidrio_Activity.this, registro_papel_Activity.class);
                startActivity(intent);
            }
        });

        Iconoplastico2RegistroVidrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registro_vidrio_Activity.this, registro_plastico_Activity.class);
                startActivity(intent);
            }
        });

        IconoCarton2RegistroVidrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(registro_vidrio_Activity.this, registro_carton_Activity.class);
                startActivity(intent);
            }
        });

        };
    }
