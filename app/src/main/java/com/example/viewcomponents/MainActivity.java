package com.example.viewcomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

   public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.buttonLogin);
        btnLogin.setOnClickListener(this);


    }

       @Override
       public void onClick(View v) {
           Log.i("APP","Click en Login" );

       }
   }
