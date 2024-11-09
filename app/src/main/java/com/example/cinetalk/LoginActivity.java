package com.example.cinetalk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private Button buttonEntrar;
    private TextView btnTxtCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login_activity);

        btnTxtCadastro = findViewById(R.id.textViewRegistrar);

        btnTxtCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.cadastro_activity);
                Intent intent = new Intent(LoginActivity.this, CadastroActivity.class);
            }
        });
    }
}