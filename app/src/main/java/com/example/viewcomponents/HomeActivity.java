package com.example.viewcomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView textEmail;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Bundle extras = getIntent().getExtras();
        String emailUsuario = extras.getString("valorEmail");

        textEmail = findViewById(R.id.textViewEmail);
        textEmail.setText("Bienvenido : "+ emailUsuario);
    }
}
