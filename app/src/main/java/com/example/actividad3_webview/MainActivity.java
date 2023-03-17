package com.example.actividad3_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.actividad3_webview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding enlace;

    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enlace = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(enlace.getRoot());

        wv1 = enlace.WebView;

        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("https://www.google.es/");

    }
}