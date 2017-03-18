// SUPPORT : NSA : VOLUNTEERING
package com.example.acenapiermobile;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import lewis.acenapiermobile.R;

public class Volunteering extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_volunteering);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_volunteering, menu);
		return true;
	}

}
