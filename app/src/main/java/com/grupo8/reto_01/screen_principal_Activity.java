package com.grupo8.reto_01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class screen_principal_Activity extends AppCompatActivity {

    ImageView ImgeCerrarSesion;
    ImageButton IbtnCategorias, IbtnEstadisticas, IbtnConsejos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal_screen);

        ImgeCerrarSesion = findViewById(R.id.Img_cerrar_sesion);
        IbtnCategorias = findViewById(R.id.Ibtn_categorias);

        ImgeCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(screen_principal_Activity.this, iniciar_sesion_Activity.class);
                startActivity(intent);
            }
        });

        IbtnCategorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(screen_principal_Activity.this, categorias_Activity.class);
                startActivity(intent);
            }
        });



        };
    }
