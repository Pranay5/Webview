package com.example.pranayarora.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv = (WebView)findViewById(R.id.webview);
        wv.loadUrl("https://www.facebook.com");
      //  String a = "<HTML><head> <TITLE>MY app</TITLE></HEAD><BODY><H1>WELCOME</H1></BODY></HTML>";
      //  wv.loadData(a,"TEXT/HTML","UTF-8");

    }
}
