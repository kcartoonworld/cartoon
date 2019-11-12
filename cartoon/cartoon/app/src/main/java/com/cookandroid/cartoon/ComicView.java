package com.cookandroid.cartoon_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button next, draw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("만화 보기");

        next = (Button) findViewById(R.id.next);
        draw = (Button) findViewById(R.id.draw);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_1 = new Intent(getApplicationContext(), Next.class);
                startActivity(intent_1);
            }
        });

        draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_2 = new Intent(getApplicationContext(), Draw.class);
                startActivity(intent_2);
            }
        });

    }

}
