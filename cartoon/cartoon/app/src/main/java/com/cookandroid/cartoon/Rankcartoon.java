package com.cookandroid.cartoon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rankcartoon extends main {
    Button userranking;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank_cartoon);

        intent = getIntent();
        userranking = (Button) findViewById(R.id.toRankU);

        userranking.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RankUser.class);
                startActivity(intent);
            }
        });

    }
}