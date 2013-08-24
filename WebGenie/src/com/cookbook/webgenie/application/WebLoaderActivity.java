package com.cookbook.webgenie.application;


import com.cookbook.webgenie.webwrapper.CakePan;
import com.cookbook.webjni.R;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebLoaderActivity extends Activity{

	WebView mWebView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acv_webloader);
		mWebView=(WebView)findViewById(R.id.webView1);
		initWebView();
		loadWebsite();
	}

	

	private void initWebView() {
		mWebView.addJavascriptInterface(new CakePan(), "jsCakePan");
		
	}

	private void loadWebsite() {
	
		mWebView.loadUrl("file://android_asset/sweet_tooth.html");
		
	}
	
}
