package com.example.rasel.bdnewspaper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class NewsPaper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_paper);

        Bundle extras = getIntent().getExtras();
        String url;

        WebView webViewResult = findViewById(R.id.webView);
        final ProgressBar progressBar = findViewById(R.id.progressBar);
        //progressBar.setVisibility(View.VISIBLE);


        if (extras != null) {
            url = extras.getString("url");

            webViewResult.setWebViewClient(new WebViewClient());
            webViewResult.loadUrl(url);

            WebSettings webSettings = webViewResult.getSettings();
            webSettings.setJavaScriptEnabled(true);

            webViewResult.setWebViewClient(new WebViewClient() {

                public void onPageFinished(WebView view, String url) {
                    progressBar.setVisibility(View.GONE);
                }
            });

        }
    }
}
