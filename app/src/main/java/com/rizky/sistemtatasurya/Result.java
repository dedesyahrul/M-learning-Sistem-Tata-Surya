package com.rizky.sistemtatasurya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView txt_nilai,txt_comment;
    Button cobalagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        txt_nilai = findViewById(R.id.txt_nilai);
        txt_comment = findViewById(R.id.txt_comment);
        cobalagi = findViewById(R.id.btn_cobalagi);

        int nilai = getIntent().getExtras().getInt("nilai");
        txt_nilai.setText(String.valueOf(nilai));

        if(nilai >= 80) {
            txt_comment.setText("Kamu lulus, dan kamu pendapatkan ranking");
        }else if(nilai >= 60) {
            txt_comment.setText("Kamu lulus");
        }else {
            txt_comment.setText("Kamu harus belajar lagi");
        }

        cobalagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Result.this, Kuis.class);
                startActivity(i);
                finish();
            }
        });


    }

    public void BackHome(View view) {
        Intent intent =
                new Intent(Result.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}