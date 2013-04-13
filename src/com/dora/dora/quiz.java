package com.dora.dora;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class quiz extends Activity {
	
	
	
	protected void onCreate (Bundle savedInstanceState){
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quiz) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
	
		
		
		
		//set up the button sound		
		final MediaPlayer mpButtonClick = MediaPlayer.create(this , R.raw.click) ;
		

		Button bOdigies = (Button) findViewById(R.id.qodigies) ;
		
		bOdigies.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.dora.dora.QODIGIES")) ;
				mpButtonClick.start() ;
			}
		}) ;
		
		
		Button bScor = (Button) findViewById(R.id.qscor) ;
		
		bScor.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.dora.dora.QSCOR")) ;
				mpButtonClick.start() ;
			}
		}) ;
		
		

		

		Button bPlay = (Button) findViewById(R.id.qplay) ;
		
		bPlay.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.dora.dora.QPLAY")) ;
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
