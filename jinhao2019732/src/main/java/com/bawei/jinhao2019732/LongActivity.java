package com.bawei.jinhao2019732;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.bawei.jinhao2019732.beas.BeasActivity;

public class LongActivity extends BeasActivity {

    private WebView webView;
    @Override
    public int setinLoyout() {
        return R.layout.activity_long;
    }

    @Override
    public void intrView() {
       webView=findViewById(R.id.webw);
    }

    @Override
    public void intrData() {
        webView.setWebChromeClient(new WebChromeClient() );
      webView.loadUrl("https://hao.360.com/?y1001");
    }

    @Override
    public void intrEnder() {

    }
}
