package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Button btnReg = (Button)findViewById(R.id.btnReg);
        Button btnChoice = (Button)findViewById(R.id.btnChoice);
    }

    @Override
    public void onClick(View view) {
        if(findViewById(R.id.btnReg).callOnClick())
        {
            Intent i = new Intent(this, Reg.class);
            startActivity(i);
        }
        if(findViewById(R.id.btnChoice).callOnClick())
        {
            Intent i = new Intent(this, Choice.class);
            startActivity(i);
        }
    }
}