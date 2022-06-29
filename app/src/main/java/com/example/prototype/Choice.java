package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Choice extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        Button btnChild = (Button)findViewById(R.id.btnChild);
    }
    @Override
    public void onClick(View view) {
        if(findViewById(R.id.btnChild).callOnClick())
        {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}