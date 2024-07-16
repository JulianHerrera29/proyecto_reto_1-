package com.grupo8.reto_01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class categorias_Activity extends AppCompatActivity {

    ImageButton IbtnRegresarCategorias, IbtnCategoriaPapel, IbtnCategoriaPlastico, IbtnCategoriaVidrio, IbtnCategoriaCarton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_categorias);

        IbtnRegresarCategorias = findViewById(R.id.Ibtn_regresar_categorias);
        IbtnCategoriaPapel = findViewById(R.id.Ibtn_categoria_papel);
        IbtnCategoriaPlastico = findViewById(R.id.Ibtn_categoria_plastico);
        IbtnCategoriaVidrio = findViewById(R.id.Ibtn_categoria_vidrio);
        IbtnCategoriaCarton = findViewById(R.id.Ibtn_categoria_carton);

        IbtnRegresarCategorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(categorias_Activity.this, screen_principal_Activity.class);
                startActivity(intent);
            }
        });

        IbtnCategoriaPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(categorias_Activity.this, registro_papel_Activity.class);
                startActivity(intent);
            }
        });

        IbtnCategoriaPlastico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(categorias_Activity.this, registro_plastico_Activity.class);
                startActivity(intent);
            }
        });

        IbtnCategoriaVidrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(categorias_Activity.this, registro_vidrio_Activity.class);
                startActivity(intent);
            }
        });

        IbtnCategoriaCarton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(categorias_Activity.this, registro_carton_Activity.class);
                startActivity(intent);
            }
        });

        };
    }
