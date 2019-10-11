package com.example.tennistracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServerSelectorActivity extends AppCompatActivity {
    int i =0;

    public void sendMessage(View view) {
        Intent intent = new Intent(this, ServerSelectorActivity.class);


        intent.putExtra("MY_Key", i);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_selector);
        Button bt1 = findViewById(R.id.button);
        Button bt2 = findViewById(R.id.button2);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 1;
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 2;
            }
        });


    }
}
