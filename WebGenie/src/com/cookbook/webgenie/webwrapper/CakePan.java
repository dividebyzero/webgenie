package com.cookbook.webgenie.webwrapper;


public class CakePan {

	static{
	//	System.loadLibrary("libName");
	}
	
	
	public CakePan(){
		//empty c'tor
	}
	
	@android.webkit.JavascriptInterface
	public double bakePi(){
		//FIXME:
		return 3.147;
		//return nBakePi();
	}
	
	//private native double nBakePi();
	
}
