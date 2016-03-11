package com.example.sumit.playpause_master;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton ib;
    String status = "play";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ib = (ImageButton) findViewById(R.id.imageButton);
        Drawable drawable = ib.getDrawable();
        ib.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (status.toString().equals("play")) {
            ib.setBackgroundResource(R.drawable.pause);
            status = "pause";
            Toast.makeText(getApplicationContext(), "Playing", Toast.LENGTH_SHORT).show();
        } else {
            ib.setBackgroundResource(R.drawable.play);
            status = "play";
            Toast.makeText(getApplicationContext(), "Pause", Toast.LENGTH_SHORT).show();
        }


    }
}
