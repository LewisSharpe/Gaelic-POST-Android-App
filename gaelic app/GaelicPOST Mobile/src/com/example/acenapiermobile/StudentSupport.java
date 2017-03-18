// STUDENT SUPPORT
package com.example.acenapiermobile;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import lewis.acenapiermobile.R;

public class StudentSupport extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_student_support);
		ImageView img = (ImageView)findViewById(R.id.imageView1);
		img.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("http://www.carnegie-trust.org/"));
		        startActivity(intent);
		    }
		});
		ImageView img2 = (ImageView)findViewById(R.id.imageView2);
		img2.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("http://www.ed.ac.uk/schools-departments/literatures-languages-cultures/celtic-scottish-studies"));
		        startActivity(intent);
		    }
		});
		ImageView img3 = (ImageView)findViewById(R.id.imageView3);
		img3.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("http://www.gaidhlig.org.uk"));
		        startActivity(intent);
		    }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_student_support, menu);
		return true;
	}

}
