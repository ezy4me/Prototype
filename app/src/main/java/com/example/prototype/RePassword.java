package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RePassword extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re_password);
        Button btnConfirm = (Button)findViewById(R.id.btnConfirm);
    }
    @Override
    public void onClick(View view) {
        if(findViewById(R.id.btnConfirm).callOnClick())
        {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}