package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainChild extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_child);
        Button btnSettings = (Button)findViewById(R.id.btnSettings);
    }
    @Override
    public void onClick(View view) {
        if(findViewById(R.id.btnSettings).callOnClick())
        {
            Intent i = new Intent(this, SettingsActivity.class);
            startActivity(i);
        }
    }
}