package com.example.vendingmachine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    AppCompatButton login,registration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initComponent();
        settingUpListners();
    }

    private void settingUpListners() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
            }
        });
    }
    public void callRegisteration(View view){
        startActivity(new Intent(getApplicationContext(),RegisterationActivity.class));
    }
    private void initComponent() {
        login = findViewById(R.id.login);
        registration = findViewById(R.id.registeration);
    }
}