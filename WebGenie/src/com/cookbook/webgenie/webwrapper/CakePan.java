package com.cookbook.webgenie.webwrapper;


public class CakePan {

	static{
		System.loadLibrary("mypie");
	}
	
	public CakePan(){
		//empty c'tor
	}
	
	@android.webkit.JavascriptInterface
	public double bakePi(){
		return nBakePi();
	}
	
	private native double nBakePi();
	
}
