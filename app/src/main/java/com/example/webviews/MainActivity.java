package com.example.webviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.printHello();
        WebView webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        //webView.loadUrl("https://www.commandrobotics.ai");
        webView.loadData("<html><body><h1>Hello world!</h1><p>This is my cool website!</p></body></html>", "text/html", "UTF-8");
    }
}