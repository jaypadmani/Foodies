package com.example.foodies.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.foodies.MainActivity;
import com.example.foodies.R;

public class RegistationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registation);

    }

    public void login(View view) {
        startActivity(new Intent(RegistationActivity.this, LoginActivity.class));
    }


    public void mainActivity(View view) {
        startActivity(new Intent(RegistationActivity.this, MainActivity.class));
    }
}