package com.dora.dora;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class prakseis extends Activity{
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.prakseis) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
	
		
		//set up the button sound		
		final MediaPlayer mpButtonClick = MediaPlayer.create(this , R.raw.click) ;
		

		Button bOdigies = (Button) findViewById(R.id.prodigies) ;
		
		bOdigies.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.dora.dora.PRODIGIES")) ;
				mpButtonClick.start() ;
			}
		}) ;
		
		
		Button bScor = (Button) findViewById(R.id.prscor) ;
		
		bScor.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.dora.dora.PRSCOR")) ;
				mpButtonClick.start() ;
			}
		}) ;
		
	
		Button bPlay = (Button) findViewById(R.id.prplay) ;
		
		bPlay.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.dora.dora.PRPLAY")) ;
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
