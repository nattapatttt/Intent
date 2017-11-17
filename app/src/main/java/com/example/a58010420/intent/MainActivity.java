package com.example.a58010420.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnNext;
    EditText etName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = (EditText) findViewById(R.id.etName);
        btnNext = (Button) findViewById(R.id.btnNext);

        btnNext.setOnClickListener(this);

    }
    public void onClick(View v){
        float x = Float.parseFloat(etName.getText().toString());

        String s = Float.toString(x);
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("Name",s);
        startActivity(i);
    }
}
