package com.example.foodies.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.foodies.MainActivity;
import com.example.foodies.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Register(View view) {
        startActivity(new Intent(LoginActivity.this, RegistationActivity.class));
    }
    public void mainActivity(View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));

    }
}