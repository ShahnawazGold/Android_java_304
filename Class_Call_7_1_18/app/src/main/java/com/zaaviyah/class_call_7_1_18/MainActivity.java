package com.zaaviyah.class_call_7_1_18;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1call ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1call = (Button)findViewById(R.id.btCall);


        b1call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Call = new Intent(Intent.ACTION_CALL);
                Call.setData(Uri.parse("tel:0377778888"));

                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                return;
                }
                startActivity(Call);
            }
        });

    }
}
