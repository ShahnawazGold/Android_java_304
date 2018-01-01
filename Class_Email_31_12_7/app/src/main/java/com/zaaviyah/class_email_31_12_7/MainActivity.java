package com.zaaviyah.class_email_31_12_7;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1Send,b2Home;
    EditText etTEXT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1Send = (Button)findViewById(R.id.btSend);
        etTEXT = (EditText) findViewById(R.id.etEmail);


        b1Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail();
            }
        });

    }

    protected void sendEmail(){
        Log.d("sending email start", "");



        String [] CC = {" "} ;
        String [] TO = {" "};

        Intent sendEmail = new Intent(Intent.ACTION_SEND);

        sendEmail.setType("text/plain");
        sendEmail.setData(Uri.parse("mailto"));
        sendEmail.putExtra(Intent.EXTRA_CC, CC);
        sendEmail.putExtra(Intent.EXTRA_EMAIL,TO);
        sendEmail.putExtra(Intent.EXTRA_SUBJECT, "welcome");
        sendEmail.putExtra(Intent.EXTRA_TEXT, "YESJ JJ");


        try {

            startActivity(Intent.createChooser( sendEmail, "start ectivity"));
            Log.d("sending ", "");

        }
        catch ( android.content.ActivityNotFoundException ex){

            Toast.makeText(MainActivity.this, " sending not install", Toast.LENGTH_SHORT).show();
        }



    }
}
