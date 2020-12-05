package com.puki.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashBoard extends AppCompatActivity{
CardView cd1,cd2,cd3,cd4,cd5,cd6,cd7,cd8,cd9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        cd1=findViewById(R.id.cd1);
        cd2=findViewById(R.id.cd2);
        cd3= findViewById(R.id.cd3);
        cd4= findViewById(R.id.cd4);
        cd5= findViewById(R.id.cd5);
        cd6= findViewById(R.id.cd6);
        cd7= findViewById(R.id.cd7);
        cd8= findViewById(R.id.cd8);
        cd9= findViewById(R.id.cd9);

        cd2.setOnClickListener(view -> {
            Intent myIntent = new Intent(view.getContext(),Booking.class);
            startActivityForResult(myIntent,0);
        });

        cd8.setOnClickListener(view -> {
            Intent myIntent = new Intent(view.getContext(),Feedback.class);
            startActivityForResult(myIntent,0);
        });


            }


}