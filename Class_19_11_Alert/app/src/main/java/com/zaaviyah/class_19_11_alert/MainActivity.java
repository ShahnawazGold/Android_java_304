package com.zaaviyah.class_19_11_alert;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // create method

    public  void open (View view) {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);


        alertDialogBuilder.setMessage("Are you sure, You wanted to make decision");

        alertDialogBuilder.setPositiveButton("yes",new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface arg0, int arg1) {

               // Toast.makeText(MainActivity.this,"You clicked yes button",Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"yes click",Toast.LENGTH_LONG).show();
            }
        });

        alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }
}
