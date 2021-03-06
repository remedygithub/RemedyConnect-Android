package com.remedywebsolutions.YourPractice;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;


public class AboutActivity extends DefaultActivity {
    public void onCreate(Bundle savedInstanceState) {
        reportPhase("About");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        setTitle(R.string.title_activity_about);
        Skin.applyThemeLogo(this);
        Skin.applyActivityBackground(this);

        WebView display = (WebView) findViewById(R.id.webView);
        Skin.applyViewBackground(this, display);
        display.setBackgroundColor(0);
        display.loadUrl("file:///android_asset/terms_and_conditions.html");
    }
}
