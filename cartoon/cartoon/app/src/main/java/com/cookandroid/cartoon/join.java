package com.cookandroid.cartoon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class join extends Login {
    Button back, cancle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        setTitle("회원 가입 구성");

        back = (Button) findViewById(R.id.bt_join_ok);
        cancle = (Button) findViewById(R.id.bt_cancle);

        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                Toast.makeText(join.this,"회원가입 성공",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        cancle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent2 = new Intent(getApplicationContext(), Login.class);
                Toast.makeText(join.this,"회원가입 취소",Toast.LENGTH_SHORT).show();
                startActivity(intent2);
            }
        });
    }
}