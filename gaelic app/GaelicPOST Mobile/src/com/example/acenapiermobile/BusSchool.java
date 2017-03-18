// BUSINESS SCHOOL
package com.example.acenapiermobile;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import lewis.acenapiermobile.R;

public class BusSchool extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bus_school);
		
		// BUTTON TO MOVE TO ACCOUNTING, FINANCIAL SERVICES AND LAW WINDOW
		Button AFSL = (Button) findViewById(R.id.btnAFSL);
        AFSL.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoAFSL = new Intent(BusSchool.this, AFSL.class); // once clicked on move user to AFSL window
    			
    			startActivity(movetoAFSL);
    		}
        });
        // BUTTON TO MOVE TO MANANGEMENT LANGUAGES AND LAW WINDOW
        Button MTL = (Button) findViewById(R.id.btnMTL);
        MTL.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoMTL = new Intent(BusSchool.this, MTL.class); // once clicked on move user to MTL window
    			
    			startActivity(movetoMTL);
    		}
        });

        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_bus_school, menu);
		return true;
	}

}
