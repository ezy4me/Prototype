package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEnterChild = (Button)findViewById(R.id.btnEnterChild);
        Button btnRePassword = (Button)findViewById(R.id.btnRePassword);
    }
    @Override
    public void onClick(View view) {
        if(findViewById(R.id.btnEnterChild).callOnClick())
        {
            Intent i = new Intent(this, MainChild.class);
            startActivity(i);
        }
        if(findViewById(R.id.btnRePassword).callOnClick())
        {
            Intent i = new Intent(this, RePassword.class);
            startActivity(i);
        }
    }
}