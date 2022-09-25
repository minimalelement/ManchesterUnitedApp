package com.example.manutdapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.manutdapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(),
                        MainActivity2.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);
                //Intent is used to switch from one activity to another.
                //invoke the SecondActivity.

                finish();
                //the current activity will get finished.
            }
        }, 2000);


    }


}


//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(this, "Process Started", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(this, "Process Stopped", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(this, "Process Paused", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Toast.makeText(this, "Process Resumed", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Toast.makeText(this, "Process Restarted", Toast.LENGTH_SHORT).show();
//    }
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(this, "Process Destroyed", Toast.LENGTH_SHORT).show();
//    }
