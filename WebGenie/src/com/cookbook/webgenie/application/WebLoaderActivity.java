package com.cookbook.webgenie.application;


import com.cookbook.webgenie.webwrapper.CakePan;
import com.cookbook.webjni.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class WebLoaderActivity extends Activity{

	WebView mWebView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acv_webloader);
		mWebView=(WebView)findViewById(R.id.webView1);
		initWebView();
	}

	

	@SuppressLint("JavascriptInterface") 
	private void initWebView() {
		mWebView.getSettings().setJavaScriptEnabled(true);
		mWebView.getSettings().setDomStorageEnabled(true);
		mWebView.addJavascriptInterface(new CakePan(), "jsCakePan");
		//show webview errors as toasts
		mWebView.setWebViewClient(new WebViewClient() {
			
			public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
			     Toast.makeText(WebLoaderActivity.this, "Error: " + description, Toast.LENGTH_SHORT).show();
			   }
			 });
		
		//support JS alerts as toasts
		 mWebView.setWebChromeClient(new
				 WebChromeClient() {            
				 @Override
				 public boolean onJsAlert(WebView view, String url, String message, final android.webkit.JsResult result) {
					 android.util.Log.w("JSALERTS",message);
					 Toast.makeText(WebLoaderActivity.this, message, Toast.LENGTH_SHORT).show();	 	
				        return true;
				 }
		 });
		 
	}

	private void loadWebsite() {

		mWebView.loadUrl("file:///android_asset/sweet_tooth.html");

	}
	
	@Override
	protected void onResume(){
		super.onResume();
		loadWebsite();
	}
	
}
