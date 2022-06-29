package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Button btnBack = (Button)findViewById(R.id.btnBack);
    }
    @Override
    public void onClick(View view) {
        if(findViewById(R.id.btnBack).callOnClick())
        {
            Intent i = new Intent(this, MainChild.class);
            startActivity(i);
        }
    }
}