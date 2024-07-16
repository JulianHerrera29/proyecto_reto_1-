package com.grupo8.reto_01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class restablecer_Activity extends AppCompatActivity {

    Button BtnRestablcer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_restablecer);

        BtnRestablcer = findViewById(R.id.Btn_restablecer);

        BtnRestablcer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(restablecer_Activity.this, iniciar_sesion_Activity.class);
                startActivity(intent);
            }
        });

        };
    }
