package com.zaaviyah.class_navigation_14_1_18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

     Button b1Next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1Next =(Button)findViewById(R.id.btNext);


        b1Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent nextIntent = new Intent(MainActivity.this,WebActivity.class);
                startActivity(nextIntent);
            }
        });
    }
}
