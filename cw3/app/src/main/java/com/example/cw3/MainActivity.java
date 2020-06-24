package com.example.cw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText p = findViewById(R.id.dd);
        EditText m = findViewById(R.id.ddd);

        Button pp = findViewById(R.id.pp);
        Button nn = findViewById(R.id.ppp);

        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String aString = p.getText().toString();
                String bString = m.getText().toString();

                int a = Integer.parseInt(aString);
                int b = Integer.parseInt(bString);

                int mm = Integer.parseInt((aString+bString));

                Toast
            }
        });








    }
}