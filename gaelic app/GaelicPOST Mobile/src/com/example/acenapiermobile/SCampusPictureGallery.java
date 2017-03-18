// SIGHTHILL CAMPUS PICTURE GALLERY
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

public class SCampusPictureGallery extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scampus_picture_gallery);
		// BUTTON IDS
		final Button button1 = (Button) findViewById(R.id.btnS1);
		final Button button2 = (Button) findViewById(R.id.btnS2);
		final Button button3 = (Button) findViewById(R.id.btnS3);
		final Button button4 = (Button) findViewById(R.id.btnS4);
		final Button button5 = (Button) findViewById(R.id.btnS5);
		final Button button6 = (Button) findViewById(R.id.btnS6);
		final Button button7 = (Button) findViewById(R.id.btnS7);
		final Button button8 = (Button) findViewById(R.id.btnS8);


		OnClickListener listener = new OnClickListener() {
		    @Override
		    public void onClick(View v) {
		    	  // IF BUTTON _ CLICKED THEN DISPLAY THE ASSOCIATED CAMPUS IMAGE
		        if (v.equals(button1)) {
		        	ImageView image = (ImageView) findViewById(R.id.imageView2);
		              image.setImageResource(R.drawable.sighthill1);
		              TextView tv = (TextView)findViewById(R.id.textView2);
		              tv.setText("Sighthill Campus");
		        } 
		        else if (v.equals(button2)) {
		        	ImageView image = (ImageView) findViewById(R.id.imageView2);
		              image.setImageResource(R.drawable.sighthill2);
		              TextView tv = (TextView)findViewById(R.id.textView2);
		              tv.setText("Sighthill Campus");
		        }
		        else if (v.equals(button3)) {
		        	ImageView image = (ImageView) findViewById(R.id.imageView2);
		              image.setImageResource(R.drawable.sighthill3);
		              TextView tv = (TextView)findViewById(R.id.textView2);
		              tv.setText("Sighthill Campus");
		        }
		        else if (v.equals(button4)) {
		        	ImageView image = (ImageView) findViewById(R.id.imageView2);
		              image.setImageResource(R.drawable.sighthill4);
		              TextView tv = (TextView)findViewById(R.id.textView2);
		              tv.setText("Sighthill Campus Main Foyer");
		        }
		        else if (v.equals(button5)) {
		        	ImageView image = (ImageView) findViewById(R.id.imageView2);
		              image.setImageResource(R.drawable.sighthill5);
		              TextView tv = (TextView)findViewById(R.id.textView2);
		              tv.setText("Sighthill Campus Science Lab");
		        }
		        else if (v.equals(button6)) {
		        	ImageView image = (ImageView) findViewById(R.id.imageView2);
		              image.setImageResource(R.drawable.sighthill6);
		              TextView tv = (TextView)findViewById(R.id.textView2);
		              tv.setText("Sighthill Campus Cafe Area");
		        }
		        else if (v.equals(button7)) {
		        	ImageView image = (ImageView) findViewById(R.id.imageView2);
		              image.setImageResource(R.drawable.sighthill7);
		              TextView tv = (TextView)findViewById(R.id.textView2);
		              tv.setText("Sighthill Campus");
		        }
		        else if (v.equals(button8)) {
		        	ImageView image = (ImageView) findViewById(R.id.imageView2);
		              image.setImageResource(R.drawable.sighthill8);
		              TextView tv = (TextView)findViewById(R.id.textView2);
		              tv.setText("Sighthill Campus Learning Resource Centre (LRC)");
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
				.inflate(R.menu.activity_scampus_picture_gallery, menu);
		return true;
	}

}
