package com.rizky.sistemtatasurya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Modul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul);
        String url = getIntent().getStringExtra("pdf_url");
        WebView webView = findViewById(R.id.web);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setJavaScriptEnabled(true);
        String strPdf="https://rizkysyahrultech.000webhostapp.com/assets/pdfile/menu_module.pdf";
        webView.loadUrl("https://docs.google.com/gview?embedded=true&url=" + strPdf);
    }

    public void BackHome(View view) {
        Intent intent =
                new Intent(Modul.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}