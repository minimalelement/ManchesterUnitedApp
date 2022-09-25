package com.example.manutdapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RatingBar;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;



public class MainActivity4 extends AppCompatActivity {

    CheckBox dev1,dev2;
    RadioButton app1,app2,app3,app4;
    RatingBar ratinginput;
    String totalStars,rating;
    Button sub,btn;
    FloatingActionButton home;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        home=(FloatingActionButton)findViewById(R.id.home1);
        dev1 = (CheckBox) findViewById(R.id.dev1);
        dev2 = (CheckBox) findViewById(R.id.dev2);
        app1 = (RadioButton)findViewById(R.id.select1);
        app2 = (RadioButton)findViewById(R.id.select2);
        ratinginput = (RatingBar) findViewById(R.id.ratinginput);
        sub = (Button) findViewById(R.id.submit);
        Button btn = (Button) findViewById(R.id.button2);

        if(dev1.isChecked()){
            if(app1.isChecked()){
                totalStars = "Total Stars:: " + ratinginput.getNumStars();
                rating = "Rating :: " + ratinginput.getRating();
            }
            else if(app3.isChecked()){
                totalStars = "Total Stars:: " + ratinginput.getNumStars();
                rating = "Rating :: " + ratinginput.getRating();

            }
            else{
                totalStars = "Total Stars:: " + ratinginput.getNumStars();
                rating = "Rating :: " + ratinginput.getRating();
            }
        }
        else if(dev2.isChecked()){
            if(app2.isChecked()){
                totalStars = "Total Stars:: " + ratinginput.getNumStars();
                rating = "Rating :: " + ratinginput.getRating();
            }
            else if(app4.isChecked()){
                totalStars = "Total Stars:: " + ratinginput.getNumStars();
                rating = "Rating :: " + ratinginput.getRating();

            }
            else{
                totalStars = "Total Stars:: " + ratinginput.getNumStars();
                rating = "Rating :: " + ratinginput.getRating();
            }
        }

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalStars = "Total Stars:: " + ratinginput.getNumStars();
                rating = "Rating :: " + ratinginput.getRating();
                Snackbar.make(view, "your stars "+totalStars+" "+"your rating "+rating, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(intent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tonext = new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(tonext);
            }
        });
    }
}
