package com.zaaviyah.class_alert_13_1_18;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // b1alert = (Button)findViewById(R.id.btAlert);

    }

    public void open (View view){


    AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);

        alertBuilder.setMessage("yes here ");

        alertBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(MainActivity.this, "yees",Toast.LENGTH_SHORT).show();
            }
        });


        alertBuilder.setNegativeButton("NO ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "NO",Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog = alertBuilder.create();

        alertDialog.show();


    }


}
