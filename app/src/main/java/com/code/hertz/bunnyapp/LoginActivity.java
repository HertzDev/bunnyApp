package com.code.hertz.bunnyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin,btnAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin=findViewById(R.id.btnLogin);
        btnAccount=findViewById(R.id.btnAccount);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onLogin();
            }
        });

        btnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAccount();
            }
        });
    }

    private void onLogin(){

        Intent intent =new Intent(getApplicationContext(),DashboardActivity.class);
        startActivity(intent);
    }

    private void onAccount(){

        Intent intent =new Intent(getApplicationContext(),CreateAccountActivity.class);
        startActivity(intent);
    }
}
