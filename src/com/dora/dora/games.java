package com.dora.dora;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class games extends Activity{
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.games) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	
		
		
		
		//set up the button sound		
	final MediaPlayer mpButtonClick = MediaPlayer.create(this , R.raw.click) ;
	

	Button bPrakseis = (Button) findViewById(R.id.prakseis) ;
	
	bPrakseis.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			startActivity(new Intent("com.dora.dora.PRAKSEIS")) ;
			mpButtonClick.start() ;
		}
	}) ;
	
	
	Button bAnagram = (Button) findViewById(R.id.anagram) ;
	
	bAnagram.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			startActivity(new Intent("com.dora.dora.ANAGRAM")) ;
			mpButtonClick.start() ;
		}
	}) ;
	
	
	
Button bKremala = (Button) findViewById(R.id.kremala) ;
	
	bKremala.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			startActivity(new Intent("com.dora.dora.KREMALA")) ;
			mpButtonClick.start() ;
		}
	}) ;
	
	
	
	
	Button bQuiz = (Button) findViewById(R.id.quiz) ;
	
	bQuiz.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			startActivity(new Intent("com.dora.dora.QUIZ")) ;
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
