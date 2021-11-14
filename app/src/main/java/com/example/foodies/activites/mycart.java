package com.example.foodies.activites;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodies.MainActivity;
import com.example.foodies.R;
import com.example.foodies.ui.MyCartFragment;

public class mycart extends AppCompatActivity {

    ImageView home_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.makeorder);

        home_button = findViewById(R.id.home_button);

        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mycart.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }



}
