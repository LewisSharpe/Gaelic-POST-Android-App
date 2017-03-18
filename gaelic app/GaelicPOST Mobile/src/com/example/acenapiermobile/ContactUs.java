package com.example.acenapiermobile;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import lewis.acenapiermobile.R;

public class ContactUs extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact_us);
        // SOCIAL MEDIA
        ImageView Twitter = (ImageView) findViewById(R.id.twitter);
        Twitter.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/EdinburghNapier")));
            }
        });
        ImageView Facebook = (ImageView) findViewById(R.id.facebook);
        Facebook.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/EdinburghNapierUniversity?fref=ts")));
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_contact_us, menu);
		return true;
	}

}
