package com.rizky.sistemtatasurya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KomSar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kom_sar);
    }

    public void Komsar(View view) {
        Intent intent =
                new Intent(KomSar.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}