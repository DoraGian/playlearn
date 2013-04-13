package com.dora.dora;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;


public class MainActivity extends Activity 
{
	
	MediaPlayer mpSplash;
	
	@Override
	    protected void onCreate(Bundle savedInstanceState) 
	{	
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.splash) ;
	        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	        
	        mpSplash = MediaPlayer.create(this, R.raw.logosound) ;
	        mpSplash.start() ;
	        
	        Thread logoTimer = new Thread() 
	        {
	        	public void run()
	        	{
	        		try
	        		{
	        			int logoTimer = 0 ;
	        			while(logoTimer < 3500)
	        			{
	        				sleep(100) ;
	        				logoTimer = logoTimer +100 ;
	        			}
	        		startActivity(new Intent("com.dora.dora.CLEARSCREEN")) ;
	        		} 
	        		catch (InterruptedException e) 
	        		{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        		
	        		finally
	        		{
	        			finish() ;
	        		}
	        	}
	        	
	        } ;
	        logoTimer.start() ;
	 }

	@Override
	protected void onPause() 
	{
		super.onPause();
		mpSplash.pause() ;
	}

	@Override
	protected void onDestroy() 
	{
		super.onDestroy();
		mpSplash.release() ;
	}

	@Override
	protected void onResume() 
	{
		super.onResume() ;
		mpSplash.start() ;
	}

	@Override
	protected void onStart() 
	{
		super.onStart();
	}

	@Override
	protected void onStop() 
	{
		super.onStop();
	}

	

}
