// SUPPORT : NSA : SPORTS AND SOCIETIES
package com.example.acenapiermobile;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import lewis.acenapiermobile.R;

public class SportsandSocs extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sportsand_socs);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_sportsand_socs, menu);
		return true;
	}

}
