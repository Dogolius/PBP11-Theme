package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBeli = findViewById(R.id.btn_beli);
        btnBeli.setOnClickListener(this);

        Button btnDial = findViewById(R.id.btn_dial_number);
        btnDial.setOnClickListener(this);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("OnePlus 9");
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_beli:
                Intent move = new Intent(MainActivity.this, HasilActivity.class);
                startActivity(move);
                break;
            case R.id.btn_dial_number:
                String phoneNumber = "082114384818";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}