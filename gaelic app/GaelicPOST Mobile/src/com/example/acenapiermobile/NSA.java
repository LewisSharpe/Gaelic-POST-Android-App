// SUPPORT : NSA
package com.example.acenapiermobile;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import lewis.acenapiermobile.R;

public class NSA extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ns);
		// BUTTON TO MOVE TO ISAS WINDOW
		Button ISAS = (Button) findViewById(R.id.btnIsas);
        ISAS.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoISAS = new Intent(NSA.this, Isas.class); // once clicked on move user to isas window
    			
    			startActivity(movetoISAS);
    		}
        });
     // BUTTON TO MOVE TO STUDENT EXECUTIVE WINDOW
        Button Executive = (Button) findViewById(R.id.btnExecutive);
        Executive.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoExecutive = new Intent(NSA.this, Executive.class); // once clicked on move user to student executive window
    			
    			startActivity(movetoExecutive);
    		}
        });
     // BUTTON TO MOVE TO SPORTS AND SOCIETIES WINDOW
        Button SportsAndSocs = (Button) findViewById(R.id.btnSportsAndSocs);
        SportsAndSocs.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoSportsAndSocs = new Intent(NSA.this, SportsandSocs.class); // once clicked on move user to sports and societies window
    			
    			startActivity(movetoSportsAndSocs);
    		}
        });
     // BUTTON TO MOVE TO VOLUNTEERING WINDOW
        Button Volunteering = (Button) findViewById(R.id.btnVolunteering);
        Volunteering.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoVolunteering = new Intent(NSA.this, Volunteering.class); // once clicked on move user to volunteering window
    			
    			startActivity(movetoVolunteering);
    		}
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_ns, menu);
		return true;
	}

}
