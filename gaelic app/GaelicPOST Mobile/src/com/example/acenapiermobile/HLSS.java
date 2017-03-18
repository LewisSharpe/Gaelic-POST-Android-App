// SCHOOL OF HEALTH LIFE SOCIAL SCIENCES
package com.example.acenapiermobile;

import android.os.Bundle;
import android.webkit.WebView;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import lewis.acenapiermobile.R;

public class HLSS extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hlss);
		WebView webview = (WebView) findViewById(R.id.webview);
		webview.loadUrl("http://socinnovation.napier.ac.uk/gaelic/doc");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_hlss, menu);
		return true;
	}

}
