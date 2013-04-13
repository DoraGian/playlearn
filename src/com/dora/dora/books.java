package com.dora.dora;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class books extends Activity {
	
	
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.books) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	
		

		//set up the button sound
		final MediaPlayer mpButtonClick = MediaPlayer.create(this , R.raw.click) ;
		
		Button butgram = (Button) findViewById(R.id.butgram) ;
		
		butgram.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.dora.dora.GRAMMAR")) ;	
				mpButtonClick.start() ;
			}
		}) ;
	
		
		Button butvoc = (Button) findViewById(R.id.butvocb) ;
		
		butvoc.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.dora.dora.VOCABULARY")) ;	
				mpButtonClick.start() ;
			}
		}) ;
	
		
		Button butbeast = (Button) findViewById(R.id.butbeast) ;
		
		butbeast.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.dora.dora.BBEAST")) ;	
				mpButtonClick.start() ;
			}
		}) ;
		
		
		Button butcinderella = (Button) findViewById(R.id.butcinderela) ;
		
		butcinderella.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.dora.dora.BCINDERELLA")) ;	
				mpButtonClick.start() ;
			}
		}) ;
		
		Button butrapunzel = (Button) findViewById(R.id.butrapunzel) ;
		
		butrapunzel.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.dora.dora.BRAPUNZEL")) ;	
				mpButtonClick.start() ;
			}
		}) ;	
		
		
		Button butred = (Button) findViewById(R.id.butred) ;
		
		butred.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.dora.dora.BRED")) ;	
				mpButtonClick.start() ;
			}
		}) ;	
		
		
		Button butsleeping = (Button) findViewById(R.id.butsleeping) ;
		
		butsleeping.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.dora.dora.BSLEEPING")) ;	
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