package com.rizky.sistemtatasurya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Panduan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panduan);
    }

    public void BackHome(View view) {
        Intent intent =
                new Intent(Panduan.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}