package com.example.manutdapp;

        import android.content.DialogInterface;
        import android.content.Intent;
        import android.os.Bundle;
        import android.os.Handler;
        import android.view.Menu;
        import android.view.MenuInflater;
        import android.view.View;
        import android.view.WindowManager;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import androidx.appcompat.app.AlertDialog;
        import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    Button button; // for activity 3 switch
    EditText editText1;

    private static int SPLASH_SCREEN_TIME_OUT=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //splashscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //This method is used so that your splash activity
        //can cover the entire screen.
        //this will bind your MainActivity.class file with activity_main.


        button = (Button) findViewById(R.id.button);
        editText1 = (EditText) findViewById(R.id.editTextTextPersonName);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
                builder.setTitle("Login Alert")
                        .setMessage("Are you sure, you want to continue ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
//                                Toast.makeText(MainActivity2.this,"Selected Option: YES",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                                String str= editText1.getText().toString();
                                intent.putExtra("msg",str);
                                startActivity(intent);
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity2.this,"Selected Option: No",Toast.LENGTH_SHORT).show();
                            }
                        });
                //Creating dialog box
                AlertDialog dialog  = builder.create();
                dialog.show();
            }
        });
    }
}


