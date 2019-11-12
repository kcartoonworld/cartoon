package com.cookandroid.cartoon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    Button log, legist;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setTitle("초기 화면");
        intent = getIntent();
        log = (Button) findViewById(R.id.btnLogin);
        legist = (Button) findViewById(R.id.btnLegist);


        log.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        legist.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), join.class);
                startActivity(intent);
            }
        });
    }
}