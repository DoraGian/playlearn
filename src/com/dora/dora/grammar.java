package com.dora.dora;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class grammar extends Activity {
	
	
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grammar) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		

		//set up the button sound
		final MediaPlayer mpButtonClick = MediaPlayer.create(this , R.raw.click) ;
		
		Button ch1 = (Button) findViewById(R.id.chapter1) ;
		
		ch1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.dora.dora.GCH1")) ;	
				mpButtonClick.start() ;
			}
		}) ;
	
	

		Button ch2 = (Button) findViewById(R.id.chapter2) ;
	
		ch2.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			startActivity(new Intent("com.dora.dora.GCH2")) ;	
			mpButtonClick.start() ;
		}
	}) ;

	
		Button ch3 = (Button) findViewById(R.id.chapter3) ;
	
		ch3.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			startActivity(new Intent("com.dora.dora.GCH3")) ;	
			mpButtonClick.start() ;
		}
	}) ;
	
	

		Button ch4 = (Button) findViewById(R.id.chapter4) ;
	
		ch4.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			startActivity(new Intent("com.dora.dora.GCH4")) ;	
			mpButtonClick.start() ;
		}
	}) ;
		
	}
	
	public void onBackPressed() 
	{
    super.onBackPressed();
    finish();
	}
	
}

