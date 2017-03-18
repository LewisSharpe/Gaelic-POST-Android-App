// COURSE SUITABLE CHECK
package com.example.acenapiermobile;

import java.util.ArrayList;
import java.util.List;
import lewis.acenapiermobile.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CourseSuitableCheck extends Activity {
	private Spinner spinner2; // COLLEGE SPINNER
	private Spinner spinner1; // COURSE COURSE SPINNER
	  private Button submit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_course_suitable_check);
		 addItemsOnSpinner2();
		 addItemsOnSpinner1();
		     addListenerOnButton();

	}

	 // add items into spinner dynamically
	//  LIST OF COLLEGES:
	  public void addItemsOnSpinner2() {
	    spinner2 = (Spinner) findViewById(R.id.spinner2);
	    List list = new ArrayList();
	    list.add("Edinburgh College");
	    list.add("Stevenson College, Edinburgh");
	    list.add("New College Lanarkshire");
	    list.add("West Lothian College");
	    list.add("Fife College");
	    list.add("Forth Valley College");
	    list.add("City of Glasgow College");
	    list.add("Other");
	    ArrayAdapter dataAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, list);
	    dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	    spinner2.setAdapter(dataAdapter);
	    
	  }
	  // LIST OF COLLEGE COURSES:
	  public void addItemsOnSpinner1() {
		    spinner1 = (Spinner) findViewById(R.id.spinner1);
		    List<String> list = new ArrayList<String>();
		    list.add("HNC Software Development");
		    list.add("HND Software Development");
		    list.add("HNC Computer Technical Support");
		    list.add("HND Computer Technical Support");
		    list.add("HNC Business Management");
		    list.add("HND Business Management");
		    list.add("HNC Accounting");
		    list.add("HND Accounting");
		    list.add("HNC Acting and Performance");
		    list.add("HND Acting and Performance");
		    list.add("HNC Adminstration and IT");
		    list.add("HND Adminstration and IT");
		    list.add("HNC Civil Engineering");
		    list.add("HND Civil Engineering");
		    list.add("HNC Communication with Media");
		    list.add("HND Communication with Media");
		    list.add("HNC Computing");
		    list.add("HND Computing");
		    list.add("HNC Construction Management");
		    list.add("HND Construction Management");
		    list.add("HNC Digital Design");
		    list.add("HND Digital Design");
		    list.add("HNC Television");
		    list.add("HND Television");
		    list.add("HNC Electrical Engineering");
		    list.add("HND Electrical Engineering");
		    list.add("HNC Engineering Systems");
		    list.add("HND Engineering Systems");
		    list.add("HNC Events");
		    list.add("HND Events");
		    list.add("HNC Events Management");
		    list.add("HND Events Management");
		    list.add("HNC Fitness, Health and Exercise");
		    list.add("HND Fitness, Health and Exercise");
		    list.add("HNC Graphic Design");
		    list.add("HND Graphic Design");
		    list.add("HNC Health Care");
		    list.add("HND Health Care");
		    list.add("HNC Hospitality Management");
		    list.add("HND Hospitality Management");
		    list.add("HNC Interactive Media");
		    list.add("HND Interactive Media");
		    list.add("HNC Mechinicial Engineering");
		    list.add("HND Mechinicial Engineering");
		    list.add("HNC Multimedia Computing: Web Development");
		    list.add("HND Multimedia Computing: Web Development");
		    list.add("HNC Social Care");
		    list.add("HND Social Care");
		    list.add("HNC Sports Coaching with Development of Sport");
		    list.add("HND Sports Coaching with Development of Sport");
		    list.add("HNC Sport Therapy");
		    list.add("HND Sport Therapy");
		    list.add("HNC Travel and Tourism");
		    list.add("HND Travel and Tourism");
		    list.add("Other- Course not listed");
		    ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
		    dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		    spinner1.setAdapter(dataAdapter);
		  }
		  
	 
	  public void addListenerOnButton() {
	
	    spinner2 = (Spinner) findViewById(R.id.spinner2);

	    submit = (Button) findViewById(R.id.btnSubmit);

	    submit.setOnClickListener(new OnClickListener() {

	    	   @Override
	 	      public void onClick(View v) {
	 	 
	 	        Toast.makeText(CourseSuitableCheck.this,
	 	
	 	        "Selection Result : " +
	 	             
	 	                "\nCollege Course Spinner : "+ String.valueOf(spinner2.getSelectedItem()),
	 	
	 	            Toast.LENGTH_SHORT).show();
	 	
	 	        TextView textView4 = (TextView) findViewById(R.id.textView4);
	 		  // WHEN THE BUTTON HAS BEEN CLICKED IF COURSE SELECTED THEN DISPLAY THE FOLLOWING SUITBALE DEGREES AVAILABLE:
		    if (spinner1.getSelectedItem().toString().equals("HNC Software Development")){
		    	textView4.setText("BSc (Hons) Computing (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BEng (Hons) Computing (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BEng/MEng (Hons) Software Engineering (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BSc (Hons) Games Development (Merchiston Campus, 2nd year Entry)"  + "\n" +
		    			"BEng (Hons) Web Technologies (Merchiston Campus, 2nd year Entry)"  + "\n" +
		    			"BEng (Hons) Web Technologies (Sandwich) (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BSc (Hons) Computer Science (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BSc (Hons) Information Technology (Merchiston Campus, 2nd year Entry");
		    } 
		    else if (spinner1.getSelectedItem().toString().equals("HND Software Development")){
		    	textView4.setText("BSc (Hons) Computing (Merchiston Campus, 3rd year Entry)" + "\n" +
		    			"BEng (Hons) Computing (Merchiston Campus, 3rd year Entry)" + "\n" +
		    			"BEng/MEng (Hons) Software Engineering (Merchiston Campus, 3nd year Entry)" + "\n" +
		    			"BSc (Hons) Games Development (Merchiston Campus, 3rd year Entry)"  + "\n" +
		    			"BEng (Hons) Web Technologies (Merchiston Campus, 3rd year Entry)"  + "\n" +
		    			"BEng (Hons) Web Technologies (Sandwich) (Merchiston Campus, 3rd year Entry)" + "\n" +
		    			"BSc Computer Science (Merchiston Campus, 3rd year Entry)" + "\n" +
		    			"BSc (Hons) Information Technology (Merchiston Campus, 3rd year Entry");
		    } 
		    else if (spinner1.getSelectedItem().toString().equals("HNC Computer Technical Support")){
		    	textView4.setText("BEng (Hons) Security and Forensics (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BSc (Hons) Computing (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BEng (Hons) Computer Security and Forensics (Merchiston Campus, 2nd year Entry)"+ "\n" +
		    			"BEng (Hons) Computer Systems and Networks (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BEng (Hons) Mobile Computing (Merchiston Campus, 2nd year Entry)");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Computer Technical Support")){
		    	textView4.setText("BEng (Hons) Security and Forensics (Merchiston Campus, 3rd year Entry)" + "\n" +
		    			"BSc (Hons) Computing (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BEng (Hons) Computer Security and Forensics (Merchiston Campus, 2nd year Entry)"+ "\n" +
		    			"BEng (Hons) Computer Systems and Networks (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BEng (Hons) Mobile Computing (Merchiston Campus, 2nd year Entry)");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Business Management")){
		    	textView4.setText("BA (Hons) Business Management (Craiglockhart Campus, 2nd year Entry)" + "\n" +
		    			"BA (Hons) Festival and Events Management (Craiglockhart Campus, 2nd year Entry) " + "\n" +
		    			"BSc (Hons) Business Information Systems (Merchiston Campus/Craiglockhart, 2nd year Entry");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Business Management")){
		    	textView4.setText("BA (Hons) Business Management (Craiglockhart Campus, 3rd year Entry)" + "\n" +
		    			"BA (Hons) Festival and Events Management (Craiglockhart Campus, 3rd year Entry) " + "\n" +
		    			"BSc (Hons) Business Information Systems (Merchiston Campus/Craiglockhart Campus, 2nd year Entry");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Accounting")){
		    	textView4.setText("BA (Hons) Accounting (Craiglockhart Campus, 2nd year Entry)");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Accounting")){
		    	textView4.setText("BA (Hons) Accounting (Craiglockhart Campus, 3rd year Entry)");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Acting and Performance")){
		    	textView4.setText("BA (Hons) Acting for Stage and Screen (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BA (Hons) Acting and English (Merchiston Campus, 2nd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Acting and Performance")){
		    	textView4.setText("BA (Hons) Acting for Stage and Screen (Merchiston Campus, 3rd year Entry)" + "\n" +
		    			"BA (Hons) Acting and English (Merchiston Campus, 3rd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Adminstration and IT")){
		    	textView4.setText("BA (Hons) Business Management (Craiglockhart Campus, 2nd year Entry)" + "\n" +
		    			"BSc (Hons) Information Technology (Merchiston Campus, 2nd year Entry)");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Adminstration and IT")){
		    	textView4.setText("BA (Hons) Business Management (Craiglockhart Campus, 3rd year Entry)" + "\n" +
		    			"BSc (Hons) Information Technology (Merchiston Campus, 3rd year Entry)");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Civil Engineering")){
		    	textView4.setText("BEng (Hons) Civil Engineering (Merchiston Campus, 2nd year Entry)");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Civil Engineering")){
		    	textView4.setText("BEng (Hons) Civil Engineering (Merchiston Campus, 3rd year Entry)");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Communication with Media")){
		    	textView4.setText("BA (Hons) Journalism (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BA (Hons) Television (Merchiston Campus, 2nd year Entry) " + "\n" +
		    			"BSc (Hons) Sound Design (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BA (Hons)  Communication, Advertising & Public Relations (Merchiston Campus/Craiglockhart Campus, 2nd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Communication with Media")){
		    	textView4.setText("BA Journalism (Merchiston Campus, 3rd year Entry)" + "\n" +
		    			"BA (Hons)  Television (Merchiston Campus, 3rd year Entry) " + "\n" +
		    			"BSc (Hons) Sound Design (Merchiston Campus, 3rd year Entry)" + "\n" +
		    			"BA (Hons) Communication, Advertising & Public Relations (Merchiston Campus/Craiglockhart Campus, 3rd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Computing")){
		    	textView4.setText("BSc (Hons) Computing (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BEng (Hons) Computing (Merchiston Campus, 2nd year Entry)" +
		    			"BSc (Hons) Information Technology (Merchiston Campus, 2nd year Entry");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Computing")){
		    	textView4.setText("BSc (Hons) Computing (Merchiston Campus, 3rd year Entry)" + "\n" +
		    			"BEng (Hons) Computing (Merchiston Campus, 3rd year Entry)" + "\n" +
		    			"BSc (Hons) Computer Science (Merchiston Campus, 3rd year Entry)" + "\n" +
		    			"BSc (Hons) Information Technology (Merchiston Campus, 3rd year Entry");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Construction Management")){
		    	textView4.setText("BSc (Hons) Construction Management (Merchiston Campus, 2nd year Entry)");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Construction Management")){
		    	textView4.setText("BSc (Hons) Construction Management (Merchiston Campus, 3rd year Entry)");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Television")){
		    	textView4.setText("BA (Hons) Television (Merchiston Campus, 2nd year Entry)");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Television")){
		    	textView4.setText("BA (Hons) Television (Merchiston Campus, 3rd year Entry)");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Electrical Engineering")){
		    	textView4.setText("BEng (Hons) Electrical Engineering (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BEng (Hons) Energy and Environmental Engineering (Merchiston Campus, 2nd year Entry) ");
		    } 
		    else if (spinner1.getSelectedItem().toString().equals("HND Electrical Engineering")){
		    	textView4.setText("BEng (Hons) Electrical Engineering (Merchiston Campus, 3rd year Entry)" + "\n" +
		    			"BEng (Hons) Energy and Environmental Engineering (Merchiston Campus, 3rd year Entry) ");
		    } 
		    else if (spinner1.getSelectedItem().toString().equals("HNC Engineering Systems")){
		    	textView4.setText("BEng (Hons) Electrical Engineering (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BEng (Hons) Energy and Environmental Engineering Merchiston Campus, 2nd year Entry) " + "\n" +
		    			"BEng (Hons) Mechincal Engineering (Merchiston Campus, 2nd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Engineering Systems")){
		    	textView4.setText("BEng (Hons) Electrical Engineering (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BEng (Hons) Energy and Environmental Engineering Merchiston Campus, 2nd year Entry) " + "\n" +
		    			"BEng (Hons) Mechincal Engineering (Merchiston Campus, 2nd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Events")){
		    	textView4.setText("BA (Hons) Business Management (Craiglockhart Campus, 2nd year Entry)" + "\n" +
		    			"BA (Hons) Festival and Events Management (Craiglockhart Campus, 2nd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Events")){
		    	textView4.setText("BA (Hons) Business Management (Craiglockhart Campus, 3rd year Entry)" + "\n" +
		    			"BA (Hons) Festival and Events Management (Craiglockhart Campus, 3rd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Events Management")){
		    	textView4.setText("BA (Hons) Business Management (Craiglockhart Campus, 2nd year Entry)" + "\n" +
		    			"BA (Hons) Festival and Events Management (Craiglockhart Campus, 2nd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Events Management")){
		    	textView4.setText("BA (Hons) Business Management (Craiglockhart Campus, 3rd year Entry)" + "\n" +
		    			"BA (Hons) Festival and Events Management (Craiglockhart Campus, 3rd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Fitness, Health and Exercise")){
		    	textView4.setText("BSc (Hons) Sport and Exercise Science (Sighthill Campus, 2nd year Entry)" + "\n" +
		    			"BSc (Hons) Sport and Exercise Science (Exercise Physiology) (Sighthill Campus, 2nd year Entry) " + "\n" +
		    			"BSc (Hons) Sport and Exercise Science (Sport Psychology) (Sighthill Campus, 2nd year Entry) "+ "\n" +
		    			"BSc (Hons) Sport and Exercise Science (Sports Coaching) (Edinburgh College, 2nd year Entry) " +
		    			"BSc (Hons) Sport and Exercise Science (Sports Coaching) (Sighthill Campus, 2nd year Entry) "+
		    			"BSc (Hons) Sport and Exercise Science (Sports Injuries) (Edinburgh College, 2nd year Entry) " +
		    			"BSc (Hons) Sport and Exercise Science (Sports Injuries) (Sighthill Campus, 2nd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Fitness, Health and Exercise")){
		    	textView4.setText("BSc (Hons) Sport and Exercise Science (Sighthill Campus, 3rd year Entry)" + "\n" +
		    			"BSc (Hons) Sport and Exercise Science (Exercise Physiology) (Sighthill Campus, 3rd year Entry) " + "\n" +
		    			"BSc (Hons) Sport and Exercise Science (Sport Psychology) (Sighthill Campus, 3rd year Entry) "+ "\n" +
		    			"BSc (Hons) Sport and Exercise Science (Sports Coaching) (Edinburgh College, 3rd year Entry) " +
		    			"BSc (Hons) Sport and Exercise Science (Sports Coaching) (Sighthill Campus, 3rd year Entry) "+
		    			"BSc (Hons) Sport and Exercise Science (Sports Injuries) (Edinburgh College, 3rd year Entry) " +
		    			"BSc (Hons) Sport and Exercise Science (Sports Injuries) (Sighthill Campus, 3rd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Graphic Design")){
		    	textView4.setText("BDes (Hons) Graphic Design (Merchiston Campus, 2nd year Entry)");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Graphic Design")){
		    	textView4.setText("BDes (Hons) Graphic Design (Merchiston Campus, 2nd year Entry)");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Digital Design")){
		    	textView4.setText("BSc (Hons) Digital Media (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BSc (Hons) Creative Computing (Merchiston Campus, 2nd year Entry)" + "\n" +
		    "BEng (Hons) Web Technologies (Merchiston Campus, 2nd year Entry)"  + "\n" +
		    			"BEng (Hons) Web Technologies (Sandwich) (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BSc (Hons) Interactive Media Design (Merchiston Campus, 2nd year entry" );
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Digital Design")){
		    	textView4.setText("BSc (Hons) Digital Media (Merchiston Campus, 3rd year Entry)" + "\n" +
		    			"BSc (Hons) Creative Computing (Merchiston Campus, 3rd year Entry)" + "\n" +
		    "BEng (Hons) Web Technologies (Merchiston Campus, 3rd year Entry)"  + "\n" +
		    			"BEng (Hons) Web Technologies (Sandwich) (Merchiston Campus, 3rd year Entry)" + "\n" +
		    			"BSc (Hons) Interactive Media Design (Merchiston Campus, 3rd year entry" );
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Health Care")){
		    	textView4.setText("BN (Hons) Nursing (various types of care on offer) (Sighthill Campus, 2nd year Entry)" + "\n" +
		    			"BSc (Hons) Nursing Studies (Sighthill Campus, 2nd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Health Care")){
		    	textView4.setText("BN (Hons) Nursing (various types of care on offer) (Sighthill Campus, 3rd year Entry)" + "\n" +
		    			"BSc (Hons) Nursing Studies (Sighthill Campus, 3rd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Hospitality Management")){
		    	textView4.setText("BA (Hons) Hospitality Management (Craiglockhart Campus, 2nd year Entry)" + "\n" +
		    			"BA (Hons) Hospitality Management with Language (Craiglockhart Campus, 2nd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Hospitality Management")){
		    	textView4.setText("BA (Hons) Hospitality Management (Craiglockhart Campus, 2nd year Entry)" + "\n" +
		    			"BA (Hons) Hospitality Management with Language (Craiglockhart Campus, 2nd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Interactive Media")){
		    	textView4.setText("BSc (Hons) Digital Media (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BSc (Hons) Creative Computing (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BSc (Hons) Interactive Media Design (Merchiston Campus, 2nd year entry");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Interactive Media")){
		    	textView4.setText("BSc (Hons) Digital Media (Merchiston Campus, 3rd year Entry)" + "\n" +
		    			"BSc (Hons) Creative Computing (Merchiston Campus, 3rd year Entry)" + "\n" +
		    			"BSc (Hons) Interactive Media Design (Merchiston Campus, 3rd year entry");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Mechinicial Engineering")){
		    	textView4.setText("BEng (Hons) Mechinicial Engineering (Merchiston Campus, 2nd year Entry)");
		    }
		    	else if (spinner1.getSelectedItem().toString().equals("HNC Mechinicial Engineering")){
		    		textView4.setText("BEng (Hons) Mechinicial Engineering (Merchiston Campus, 3rd year Entry)");
		    	}
		    else if (spinner1.getSelectedItem().toString().equals("HNC Multimedia Computing: Web Development")){
		    	textView4.setText("BEng (Hons) Web Technologies (Merchiston Campus, 2nd year Entry)"  + "\n" +
		    			"BEng (Hons) Web Technologies (Sandwich) (Merchiston Campus, 2nd year Entry)" + "\n" +
		    			"BSc (Hons) Interactive Media Design (Merchiston Campus, 2nd year entry");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Multimedia Computing: Web Development")){
		    	textView4.setText("BEng (Hons) Web Technologies (Merchiston Campus, 3rd year Entry)"  + "\n" +
		    			"BEng (Hons) Web Technologies (Sandwich) (Merchiston Campus, 3rd year Entry)" + "\n" +
		    			"BSc (Hons) Interactive Media Design (Merchiston Campus, 3rd year entry");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Social Care")){
		    	textView4.setText("BN (Hons) Nursing (various types of care on offer) (Sighthill Campus, 3rd year Entry)" + "\n" +
		    			"BSc (Hons) Nursing Studies (Sighthill Campus, 3rd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Social Care")){
		    	textView4.setText("BN (Hons) Nursing (various types of care on offer) (Sighthill Campus, 3rd year Entry)" + "\n" +
		    			"BSc (Hons) Nursing Studies (Sighthill Campus, 3rd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Social Sciences")){
		    	textView4.setText("BA (Hons) Social Sciences (Sighthill Campus, 2nd year Entry)");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Social Sciences")){
		    	textView4.setText("BA (Hons) Social Sciences (Sighthill Campus, 3rd year Entry)");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Sports Coaching with Development of Sport")){
		    	textView4.setText("BSc (Hons) Sport and Exercise Science (Sighthill Campus, 2nd year Entry)" + "\n" +
		    			"BSc (Hons) Sport and Exercise Science (Exercise Physiology) (Sighthill Campus, 2nd year Entry) " + "\n" +
		    			"BSc (Hons) Sport and Exercise Science (Sport Psychology) (Sighthill Campus, 2nd year Entry) "+ "\n" +
		    			"BSc (Hons) Sport and Exercise Science (Sports Coaching) (Edinburgh College, 2nd year Entry) " +
		    			"BSc (Hons) Sport and Exercise Science (Sports Coaching) (Sighthill Campus, 2nd year Entry) "+
		    			"BSc (Hons) Sport and Exercise Science (Sports Injuries) (Edinburgh College, 2nd year Entry) " +
		    			"BSc (Hons) Sport and Exercise Science (Sports Injuries) (Sighthill Campus, 2nd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Sports Coaching with Development of Sport")){
		    	textView4.setText("BSc (Hons) Sport and Exercise Science (Sighthill Campus, 3rd year Entry)" + "\n" +
		    			"BSc (Hons) Sport and Exercise Science (Exercise Physiology) (Sighthill Campus, 3rd year Entry) " + "\n" +
		    			"BSc (Hons) Sport and Exercise Science (Sport Psychology) (Sighthill Campus, 3rd year Entry) "+ "\n" +
		    			"BSc (Hons) Sport and Exercise Science (Sports Coaching) (Edinburgh College, 3rd year Entry) " +
		    			"BSc (Hons) Sport and Exercise Science (Sports Coaching) (Sighthill Campus, 3rd year Entry) "+
		    			"BSc (Hons) Sport and Exercise Science (Sports Injuries) (Edinburgh College, 3rd year Entry) " +
		    			"BSc (Hons) Sport and Exercise Science (Sports Injuries) (Sighthill Campus, 3rd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Sport Therapy")){
		    	textView4.setText("BSc (Hons) Sport and Exercise Science (Sighthill Campus, 2nd year Entry)" + "\n" +
		    			"BSc (Hons) Sport and Exercise Science (Exercise Physiology) (Sighthill Campus, 2nd year Entry) " + "\n" +
		    			"BSc (Hons) Sport and Exercise Science (Sport Psychology) (Sighthill Campus, 2nd year Entry) "+ "\n" +
		    			"BSc (Hons) Sport and Exercise Science (Sports Injuries) (Edinburgh College, 2nd year Entry) " +
		    			"BSc (Hons) Sport and Exercise Science (Sports Injuries) (Sighthill Campus, 2nd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Sport Therapy")){
		    	textView4.setText("BSc (Hons) Sport and Exercise Science (Sighthill Campus, 3rd year Entry)" + "\n" +
		    			"BSc (Hons) Sport and Exercise Science (Exercise Physiology) (Sighthill Campus, 3rd year Entry) " + "\n" +
		    			"BSc (Hons) Sport and Exercise Science (Sport Psychology) (Sighthill Campus, 3rd year Entry) "+ "\n" +
		    			"BSc (Hons) Sport and Exercise Science (Sports Injuries) (Edinburgh College, 3rd year Entry) " +
		    			"BSc (Hons) Sport and Exercise Science (Sports Injuries) (Sighthill Campus, 3rd year Entry) ");
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HNC Travel and Tourism")){
		    	textView4.setText("BA (Hons) Tourism and Airline Management (Craiglockhart Campus, 2nd year Entry)" + "\n" +
		    			"BA (Hons) Tourism Management (Craiglockhart Campus, 2nd year Entry) " + "\n" +
		    			"BA (Hons) Tourism Management and Hospitality Management (Craiglockhart Campus, 2nd year Entry) " + "\n" +
		    			"BA (Hons) Tourism Management with Entrepreneurship (Craiglockhart Campus, 2nd year Entry) " + "\n" +
		    			"BA (Hons) Tourism Management with Language (Craiglockhart Campus, 2nd year Entry) "  );
		    }
		    else if (spinner1.getSelectedItem().toString().equals("HND Travel and Tourism")){
		    	textView4.setText("BA (Hons)  Tourism and Airline Management (Craiglockhart Campus, 3rd year Entry)" + "\n" +
		    			"BA (Hons)  Tourism Management (Craiglockhart Campus, 3rd year Entry) " + "\n" +
		    			"BA (Hons) Tourism Management and Hospitality Management (Craiglockhart Campus, 3rd year Entry) " + "\n" +
		    			"BA (Hons) Tourism Management with Entrepreneurship (Craiglockhart Campus, 3rd year Entry) " + "\n" +
		    			"BA (Hons) Tourism Management with Language (Craiglockhart Campus, 3rd year Entry) "  );
		    }
		    else if (spinner1.getSelectedItem().toString().equals("Other- Course not listed")){
		    	textView4.setText("Contact d.meharg@napier.ac.uk for more information.");
		    }
		   
	      }
	
	 
	
	    });
	
	  }
	
	}

	


