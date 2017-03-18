// RATE APP
package com.example.acenapiermobile;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import lewis.acenapiermobile.R;

public class RateApp extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rate_app);
		// BUTTON TO MOVE TO SUBMIT RATING AND MOVE BACK TO MAIN WINDOW
        Button SubmitRating = (Button) findViewById(R.id.btnSubmit);
        SubmitRating.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Toast.makeText(RateApp.this,
    				 	
    		 	        "Thank you for rating the Offical Mobile App for the Articulation Centre of Excellence at Edinburgh Napier University.",
    		 	
    		 	            Toast.LENGTH_SHORT).show();
    			Intent movetoSupport = new Intent(RateApp.this, MainActivity.class); // once clicked on move user to submit rating and move back to main activity window
    			startActivity(movetoSupport);
    		}
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_rate_app, menu);
		return true;
	}

}
