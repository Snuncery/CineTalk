package com.example.cinetalk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity {

    private Button btnCriar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.cadastro_activity);

        btnCriar = findViewById(R.id.btnCadastrarConta);

        btnCriar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CadastroActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}