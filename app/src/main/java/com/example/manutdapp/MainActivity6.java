package com.example.manutdapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    private androidx.appcompat.view.ActionMode mActionMode;
    private Button openFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        ImageView myImg = (ImageView)findViewById(R.id.pt1);

        registerForContextMenu(myImg);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        {
            NotificationChannel channel = new NotificationChannel("MyNotification", "MyNotification", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menu_example3, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.long_press1:

                // Code for Notificationss
                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity6.this, "MyNotification");
                builder.setContentTitle("Cart");
                builder.setSmallIcon(R.drawable.ic_ball);
                builder.setLargeIcon(BitmapFactory. decodeResource (getResources() , R.drawable.man_utd )) ;
                builder.setContentText("Item added to Cart");
                builder.setStyle(new NotificationCompat.BigTextStyle().bigText("Hurrah a new item ordered. Congrats and Good Luck! Nike Air Force 1332 - Man Utd Ltd Edition"));
                builder.setSmallIcon(R.drawable.ic_bolt);
                builder.setAutoCancel(true);

                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(MainActivity6.this);
                managerCompat.notify(1, builder.build());

                Toast.makeText(this, "Added to Cart", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.long_press2:
                Toast.makeText(this, "Added to Favourites", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    public void showPopup(View v)
    {
        PopupMenu popup= new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_example2);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.pop1:
                Toast.makeText(this, "Americas selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.pop2:
                Toast.makeText(this, "Asia Pacefic selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.pop3:
                Toast.makeText(this, "Europe selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.pop4:
                Toast.makeText(this, "Middle East selected", Toast.LENGTH_SHORT).show();
                return true;
        }

        return false;
    }

}