package com.example.viewcomponents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button btnLogin;
    EditText editTextEmail , editTextPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.buttonLogin);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);


        btnLogin.setOnClickListener(this);


    }

       @Override
       public void onClick(View v) {
           Log.i("APP","Click en Login" );
           String email = editTextEmail.getText().toString();
           String pass  = editTextPassword.getText().toString();

           if(!email.isEmpty() && !pass.isEmpty()){
               Intent intentLogin = new Intent(this,HomeActivity.class);
               intentLogin.putExtra("valorEmail",email);
               startActivity(intentLogin);
           }


       }
   }
