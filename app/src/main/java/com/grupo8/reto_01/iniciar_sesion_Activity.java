package com.grupo8.reto_01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class iniciar_sesion_Activity extends AppCompatActivity {

    TextView TxtOlvidasteTuContraseña;
    Button BtnIniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_iniciar_sesion);

        TxtOlvidasteTuContraseña = findViewById(R.id.Txt_olvisate_tu_contraseña);
        BtnIniciarSesion = findViewById(R.id.Btn_iniciar_sesión);

        TxtOlvidasteTuContraseña.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(iniciar_sesion_Activity.this, restablecer_Activity.class);
                startActivity(intent);
            }
        });
        BtnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(iniciar_sesion_Activity.this, screen_principal_Activity.class);
                startActivity(intent);
            }
        });
        }
    }