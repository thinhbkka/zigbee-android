package com.example.myhouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageButton imgbtnLivingroom;
    ImageButton imgbtnKitchenroom;
    ImageButton imgbtnBedroom;
    TextView txtvLivingroom;
    TextView txtvKitchenroom;
    TextView txtvBedroom;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgbtnLivingroom = (ImageButton)findViewById(R.id.imageButtonLivingroom) ;
        imgbtnKitchenroom = (ImageButton)findViewById(R.id.imageButtonKitchenroom);
        imgbtnBedroom = (ImageButton)findViewById(R.id.imageButtonBedroom);
        txtvLivingroom = (TextView)findViewById(R.id.textViewLivingroom);
        txtvKitchenroom = (TextView)findViewById((R.id.textViewKitchenRoom));
        txtvBedroom = (TextView)findViewById(R.id.textViewBedroom);


        imgbtnLivingroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh1 = new Intent(MainActivity.this,LIVINGROOM.class);
                startActivity(mh1);
            }
        });

        imgbtnKitchenroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh2 = new Intent(MainActivity.this,KITCHENROOM.class);
                startActivity(mh2);
            }
        });

        imgbtnBedroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh3 = new Intent(MainActivity.this,BEDROOM.class);
                startActivity(mh3);
            }
        });
    }
}
