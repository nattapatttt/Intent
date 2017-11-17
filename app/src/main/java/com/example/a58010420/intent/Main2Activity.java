package com.example.a58010420.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    Button btnBack;
    public String showanswer;
    TextView text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text2 = (TextView) findViewById(R.id.text2);
        Intent intent = getIntent();
        showanswer = getIntent().getStringExtra("Name");
        text2.setText(showanswer);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

    }

    public void onClick(View v) {
        Intent i = new Intent(this, MainActivity.class);

        startActivity(i);
    }
}