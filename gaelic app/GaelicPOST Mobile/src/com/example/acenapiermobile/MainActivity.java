// MAIN WINDOW
package com.example.acenapiermobile;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import lewis.acenapiermobile.R;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // DISPLAY THE CURRENT DATE:-
        TextView tv = (TextView) findViewById(R.id.tvDate);
        Calendar c = Calendar.getInstance();
        SimpleDateFormat format1;
        format1 = new SimpleDateFormat("dd-MMMM-yyyy");
        tv.setText(format1.format(c.getTime()));

       
      
        
     
     // BUTTON TO MOVE TO ABOUT US WINDOW
        Button AboutUs = (Button) findViewById(R.id.btnAboutUs);
        AboutUs.setOnClickListener(new OnClickListener()
        
        {
			public void onClick(View v)
			{
				Intent movetoAboutUs = new Intent(MainActivity.this, AboutUs.class); // once clicked on move user to about us window
				
				startActivity(movetoAboutUs);
			}
        });
     // BUTTON TO MOVE TO SCHOOL OF ENGINERING COMPUTING AND CREATIVE INDUSTRIES (EECI) WINDOW
        Button EECI = (Button) findViewById(R.id.btnECCI);
        EECI.setOnClickListener(new OnClickListener()
        
        {
			public void onClick(View v)
			{
				Intent movetoECCI = new Intent(MainActivity.this, EECI.class); // once clicked on move user to eeci window
				
				startActivity(movetoECCI);
			}
        });
     // BUTTON TO MOVE TO BUSINESS SCHOOL WINDOW
        Button BusSchool = (Button) findViewById(R.id.btnBusSchool);
        BusSchool.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoBusSchool = new Intent(MainActivity.this, BusSchool.class); // once clicked on move user to business school window
    			
    			startActivity(movetoBusSchool);
    		}
        });
     // BUTTON TO MOVE TO SCHOOL OF HEALTH LIFE AND SOCIAL SCIENCES WINDOW
        Button HLSS = (Button) findViewById(R.id.btnHLSS);
        HLSS.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoHLSS = new Intent(MainActivity.this, HLSS.class); // once clicked on move user to hlss window
    			
    			startActivity(movetoHLSS);
    		}
        });
     // BUTTON TO MOVE TO CONTACT US WINDOW
        Button ContactUs = (Button) findViewById(R.id.btnContactUs);
        ContactUs.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoContact = new Intent(MainActivity.this, ContactUs.class); // once clicked on move user to contact us window
    			
    			startActivity(movetoContact);
    		}
        });

     // BUTTON TO MOVE TO 'WHAT SUPPORT IS AVAILABLE FOR YOU?' WINDOW
        Button Support = (Button) findViewById(R.id.btnSupport);
        Support.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoSupport = new Intent(MainActivity.this, StudentSupport.class); // once clicked on move user to support available window
    			
    			startActivity(movetoSupport);
    		}
        });
     // BUTTON TO MOVE TO RATE APP WINDOW
        Button RateApp = (Button) findViewById(R.id.btnRateApp);
        RateApp.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoRateApp = new Intent(MainActivity.this, RateApp.class); // once clicked on move user to rate app window	
    			startActivity(movetoRateApp);
    		}
        });
     // BUTTON TO MOVE TO RATE APP WINDOW
        Button GPOS = (Button) findViewById(R.id.btnGPOS);
        GPOS.setOnClickListener(new OnClickListener()
        
        {
    		public void onClick(View v)
    		{
    			Intent movetoGPOS = new Intent(MainActivity.this, GPOS.class); // once clicked on move user to rate app window	
    			startActivity(movetoGPOS);
    		}
        });
        // WEBSITE AND SOCIAL MEDIA:
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
        ImageView EdNapier = (ImageView) findViewById(R.id.ednapier);
        EdNapier.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.napier.ac.uk")));
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
