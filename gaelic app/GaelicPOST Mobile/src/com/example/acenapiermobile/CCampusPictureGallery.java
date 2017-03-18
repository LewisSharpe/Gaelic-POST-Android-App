// CRAIGLOCKHART CAMPUS PICUTURE GALLERY
package com.example.acenapiermobile;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import lewis.acenapiermobile.R;

public class CCampusPictureGallery extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ccampus_picture_gallery);
		// BUTTON IDS
		final Button button1 = (Button) findViewById(R.id.btnC1);
		final Button button2 = (Button) findViewById(R.id.btnC2);
		final Button button3 = (Button) findViewById(R.id.btnC3);
		final Button button4 = (Button) findViewById(R.id.btnC4);
		final Button button5 = (Button) findViewById(R.id.btnC5);
		final Button button6 = (Button) findViewById(R.id.btnC6);
		final Button button7 = (Button) findViewById(R.id.btnC7);
		final Button button8 = (Button) findViewById(R.id.btnC8);


		OnClickListener listener = new OnClickListener() {
		    @Override
		    // IF BUTTON _ CLICKED THEN DISPLAY THE ASSOCIATED CAMPUS IMAGE
		    public void onClick(View v) {
		        if (v.equals(button1)) {
		        	ImageView image = (ImageView) findViewById(R.id.imageView2);
		              image.setImageResource(R.drawable.craiglockhart1);
		              TextView tv = (TextView)findViewById(R.id.textView2);
		              tv.setText("Craiglockhart Campus");
		        } 
		        else if (v.equals(button2)) {
		        	ImageView image = (ImageView) findViewById(R.id.imageView2);
		              image.setImageResource(R.drawable.craiglockhart2);
		              TextView tv = (TextView)findViewById(R.id.textView2);
		              tv.setText("Craiglockhart Campus");
		        }
		        else if (v.equals(button3)) {
		        	ImageView image = (ImageView) findViewById(R.id.imageView2);
		              image.setImageResource(R.drawable.craiglockhart3);
		              TextView tv = (TextView)findViewById(R.id.textView2);
		              tv.setText("Craiglockhart Campus Lecture Theatre");
		        }
		        else if (v.equals(button4)) {
		        	ImageView image = (ImageView) findViewById(R.id.imageView2);
		              image.setImageResource(R.drawable.craiglockhart4);
		              TextView tv = (TextView)findViewById(R.id.textView2);
		              tv.setText("Craiglockhart Campus");
		        }
		        else if (v.equals(button5)) {
		        	ImageView image = (ImageView) findViewById(R.id.imageView2);
		              image.setImageResource(R.drawable.craiglockhart5);
		              TextView tv = (TextView)findViewById(R.id.textView2);
		              tv.setText("Craiglockhart Campus Main Foyer");
		        }
		        else if (v.equals(button6)) {
		        	ImageView image = (ImageView) findViewById(R.id.imageView2);
		              image.setImageResource(R.drawable.craiglockhart6);
		              TextView tv = (TextView)findViewById(R.id.textView2);
		              tv.setText("Craiglockhart Campus Lecture Theatre");
		        }
		        else if (v.equals(button7)) {
		        	ImageView image = (ImageView) findViewById(R.id.imageView2);
		              image.setImageResource(R.drawable.craiglockhart7);
		              TextView tv = (TextView)findViewById(R.id.textView2);
		              tv.setText("Craiglockhart Campus");
		        }
		        else if (v.equals(button8)) {
		        	ImageView image = (ImageView) findViewById(R.id.imageView2);
		              image.setImageResource(R.drawable.craiglockhart8);
		              TextView tv = (TextView)findViewById(R.id.textView2);
		              tv.setText("Craiglockhart Campus Main Foyer");
		        }
		    }
		};

		button1.setOnClickListener(listener);
		button2.setOnClickListener(listener);
		button3.setOnClickListener(listener);
		button4.setOnClickListener(listener);
		button5.setOnClickListener(listener);
		button6.setOnClickListener(listener);
		button7.setOnClickListener(listener);
		button8.setOnClickListener(listener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater()
				.inflate(R.menu.activity_ccampus_picture_gallery, menu);
		return true;
	}

}
