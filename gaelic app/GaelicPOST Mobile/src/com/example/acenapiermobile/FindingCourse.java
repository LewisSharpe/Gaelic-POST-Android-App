// FINDING COURSE
package com.example.acenapiermobile;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import lewis.acenapiermobile.R;

public class FindingCourse extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_finding_course);
		
		// BUTTON TO MOVE TO COURSE SUITABLE CHECK WINDOW
		  Button CourseSuitableCheck = (Button) findViewById(R.id.btnCourseSuitableCheck);
	        CourseSuitableCheck.setOnClickListener(new OnClickListener()
	        
	        {
	    		public void onClick(View v)
	    		{
	    			Intent movetoCSC = new Intent(FindingCourse.this, CourseSuitableCheck.class); // once clicked on move user to course suitable check window
	    			
	    			startActivity(movetoCSC);
	    		}
	        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_finding_course, menu);
		return true;
	}

}
