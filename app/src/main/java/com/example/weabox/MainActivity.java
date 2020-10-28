package com.example.weabox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        webView=(WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setUseWideViewPort(true);
        webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true); //設定內建的縮放控制元件。若為false，則該WebView不可縮放
        webSettings.setDisplayZoomControls(false); //隱藏原生的縮放控制元件




        webView.loadUrl("https://thingspeak.com/channels/1024822/charts/1?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&title=%E6%BA%AB%E5%BA%A6%E6%84%9F%E6%B8%AC&type=line");



    }


    public void btn1(View view) {
        webView.loadUrl("https://thingspeak.com/channels/1024822/charts/1?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&title=%E6%BA%AB%E5%BA%A6%E6%84%9F%E6%B8%AC&type=line");
    }

    public void btn2(View view) {
        webView.loadUrl("https://thingspeak.com/channels/1024822/charts/5?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&type=line&update=15");
    }

    public void btn3(View view) {
        webView.loadUrl("https://thingspeak.com/channels/1024822/charts/6?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&type=line&update=15");
    }

    public void btn4(View view) {
        webView.loadUrl("https://thingspeak.com/channels/1024822/charts/4?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&type=line&update=15");
    }

    public void btn5(View view) {
        webView.loadUrl("https://thingspeak.com/channels/1024822/charts/2?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&title=%E6%BF%95%E5%BA%A6%E6%84%9F%E6%B8%AC&type=line");
    }

    public void btn6(View view) {
        webView.loadUrl("https://thingspeak.com/channels/1024822/charts/3?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&title=%E9%9B%A8%E6%B0%B4%E6%84%9F%E6%B8%AC&type=line");
    }


    public void ent_btn(View view) {
        webView.loadUrl("http://yntpcom.youp.ga/competition/#");
    }
}
