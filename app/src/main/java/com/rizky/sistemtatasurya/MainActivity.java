package com.rizky.sistemtatasurya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void KD(View view) {
        Intent intent =
                new Intent(MainActivity.this, KomSar.class);
        startActivity(intent);
        finish();
    }

    public void mModul(View view) {
        Intent intent =
                new Intent(MainActivity.this, Modul.class);
        startActivity(intent);
        finish();
    }

    public void mVideo (View view) {
        Intent intent =
                new Intent(MainActivity.this, Video.class);
        startActivity(intent);
        finish();
    }

    public void mKuis (View view) {
        Intent intent =
                new Intent(MainActivity.this, Kuis.class);
        startActivity(intent);
        finish();
    }

    public void mPanduan (View view) {
        Intent intent =
                new Intent(MainActivity.this, Panduan.class);
        startActivity(intent);
        finish();
    }

    public void mAbout (View view) {
        Intent intent =
                new Intent(MainActivity.this, About.class);
        startActivity(intent);
        finish();
    }
}