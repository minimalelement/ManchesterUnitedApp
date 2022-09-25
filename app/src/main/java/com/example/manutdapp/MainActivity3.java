package com.example.manutdapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity3 extends AppCompatActivity implements AdapterView.OnItemSelectedListener

{

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_example, menu);
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {
        String text = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView)
    {

    }

    TextView textView;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.sub_item1:
                Toast.makeText(this, "Item selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.sub_item2:
                Toast.makeText(this, "Item 2 selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        textView=(TextView) findViewById(R.id.textViewname);
        Intent i=getIntent();
        String str=i.getStringExtra("msg");

        textView.setText("Welcome : "+str);


        Button store_bt = (Button)findViewById(R.id.store_btn);
        Button store_bt2 = (Button)findViewById(R.id.store_btn2);
        ImageButton ib1 = (ImageButton)findViewById(R.id.btn_clickme);
        ImageButton ib2 = (ImageButton)findViewById(R.id.btn_clickme2);
        ImageButton ib3 = (ImageButton)findViewById(R.id.btn_clickme3);
        ImageButton ib4 = (ImageButton)findViewById(R.id.btn_clickme4);
        ImageButton ib5 = (ImageButton)findViewById(R.id.newbtn);
        Spinner spn = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.teams , android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn.setAdapter(adapter);
        spn.setOnItemSelectedListener(this);

        store_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /// ivide mainactivity6.class aayirunnu
                Intent intent = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(intent);
            }
        });

        store_bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /// ivide mainactivity6.class aayirunnu
                Intent intent = new Intent(getApplicationContext(), MainActivity7.class);
                startActivity(intent);
            }
        });


        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Uri webpage= Uri.parse("https://www.manutd.com/");
                Intent web=new Intent(Intent.ACTION_VIEW,webpage);
                startActivity(web);
            }
        });

        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.com/maps/d/viewer?hl=en&ie=UTF8&msa=0&ll=53.463066%2C-2.291336000000004&spn=0.035773%2C0.072956&z=13&source=embed&mid=118mI_eAQvlFruldjAAmVT2aw0f8"));
                startActivity(intent);
            }
        });

        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("mailto:"+"ticketingandmembershipservices@manutd.co.uk"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Contact");
                intent.putExtra(Intent.EXTRA_TEXT, "Hello");
                try{
                    startActivity(intent);
                }
                catch(ActivityNotFoundException e){

                }
            }
        });

        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String videoId = "https://www.youtube.com/manutd";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"+videoId));
                intent.putExtra("VIDEO_ID", videoId);
                startActivity(intent);
            }
        });

        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(intent);
            }
        });
        }
}