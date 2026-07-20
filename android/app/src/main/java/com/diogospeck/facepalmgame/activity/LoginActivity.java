package com.diogospeck.facepalmgame.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.diogospeck.facepalmgame.R;

public class LoginActivity extends AppCompatActivity {

    private EditText edtUsuario;
    private EditText edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // Carrega o layout da tela de login
        setContentView(R.layout.activity_login);

        edtUsuario = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);
        Button btnEntrar = findViewById(R.id.btnEntrar);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnEntrar.setOnClickListener(v -> {

            String usuario = edtUsuario.getText().toString().trim();
            String senha = edtSenha.getText().toString();

            if (usuario.equals("admin") && senha.equals("123")) {

                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                finish();

            } else {

                Toast.makeText(
                        LoginActivity.this,
                        "Usuário ou senha inválidos",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}