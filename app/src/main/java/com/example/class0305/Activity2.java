package com.example.class0305;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    Button order;
    CheckBox pizza,icecream,coffee;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        pizza = findViewById(R.id.pizza);
        icecream = findViewById(R.id.icecream);
        coffee= findViewById(R.id.coffee);
        order = findViewById(R.id.order);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                result.append("The order includes: ");

                if(pizza.isChecked()){
                    result.append("\nPizza got selected");
                }
                if(icecream.isChecked()) {
                    result.append("\nIce cream got selected");
                }
                if(coffee.isChecked()) {
                    result.append("\nCoffee got selected");
                }
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}