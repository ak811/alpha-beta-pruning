package com.example.ali.tic_tac_toe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initActionListener();
    }

    private void initActionListener() {
        Button onePlayer_btn = findViewById(R.id.onePlayer_btn);
        Button twoPlayer_btn = findViewById(R.id.twoPlayer_btn);

        onePlayer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OnePlayerActivity.class);
                startActivity(intent);
            }
        });
        twoPlayer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TwoPlayerActivity.class);
                startActivity(intent);
            }
        });
    }
}
