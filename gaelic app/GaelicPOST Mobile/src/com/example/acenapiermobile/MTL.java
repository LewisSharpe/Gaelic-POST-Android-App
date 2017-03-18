package com.example.acenapiermobile;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import lewis.acenapiermobile.R;

public class MTL extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mtl);
		WebView webview = (WebView) findViewById(R.id.webview);
		webview.loadUrl("http://socinnovation.napier.ac.uk/gaelic/tagger");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_mtl, menu);
		return true;
	}

}
