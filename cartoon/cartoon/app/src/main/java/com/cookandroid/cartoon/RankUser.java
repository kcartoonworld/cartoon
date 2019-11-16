package com.cookandroid.cartoon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class RankUser extends AppCompatActivity {
    ImageButton cartoonranking;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank_user);
        intent = getIntent();
        cartoonranking = (ImageButton) findViewById(R.id.toRankC);

        cartoonranking.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Rankcartoon.class);
                startActivity(intent);
            }
        });
    }

}
