package com.example.class0305;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {

    Button btn3,btn4;
    CheckBox ch1,ch2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        ch1 = findViewById(R.id.cBox1);
        ch2 = findViewById(R.id.cBox2);
        btn4 = findViewById(R.id.btn4);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ch1.isChecked()){
                    Toast.makeText(getApplicationContext(), "Female",Toast.LENGTH_LONG).show();
                }
                if(ch2.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Male", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}