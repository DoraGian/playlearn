package com.dora.dora;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class myMenu extends Activity
{
	
	MediaPlayer  mpMainsound ;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
			
		//set mainsound		  
        mpMainsound = MediaPlayer.create(this, R.raw.mainsound) ;
        mpMainsound.start() ;
         
       
		//set up the button sound
		final MediaPlayer mpButtonClick = MediaPlayer.create(this , R.raw.click) ;
		
		Button bGames = (Button) findViewById(R.id.games) ;
	
		bGames.setOnClickListener(new View.OnClickListener() 
		{		
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				startActivity(new Intent("com.dora.dora.GAMES")) ;
				mpButtonClick.start() ;
			}
		}) ;
	
		
		Button bbooks = (Button) findViewById(R.id.books) ;
		
		bbooks.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				startActivity(new Intent("com.dora.dora.BOOKS")) ;
				mpButtonClick.start() ;
			}
		}) ;	
	}
	
	
		@Override
		protected void onDestroy() 
		{
			super.onDestroy();
			mpMainsound.release() ;
		}

		@Override
		protected void onPause() 
		{
			super.onPause();
			mpMainsound.pause() ;
		}

		@Override
		protected void onResume() 
		{
			super.onResume();
			mpMainsound.start() ;
		}

		public void onBackPressed() 
		{
			super.onBackPressed();
			finish();
		}
	
}

	
	

