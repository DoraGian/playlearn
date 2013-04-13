package com.dora.dora;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class prscor extends Activity {
	
	

	SQLiteDatabase mydb;
    private static String DBNAME = "GAME.db";    // THIS IS THE SQLITE DATABASE FILE NAME.
    private static String TABLE2 = "STATISTIC2";   // THIS IS THE TABLE NAME
    String   plays , wins , loses ;
    TextView showplays , showwins , showloses ;
    Button reset ;
    

    
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.scor) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		
		
		createTable2();
		insertIntoTable2(0,0,0);
			
		showplays = (TextView) findViewById(R.id.showplays);
		showwins = (TextView) findViewById(R.id.showwins);
		showloses = (TextView) findViewById(R.id.showloses);
		reset = (Button) findViewById(R.id.button1);
	
		

		//set up the button sound		
		final MediaPlayer mpButtonClick = MediaPlayer.create(this , R.raw.click) ;

		reset.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				dropTable2();	
				createTable2();
				insertIntoTable2(0,0,0);
				showplays.setText("Παιχνίδια : " + sumP());
				showwins.setText("Νίκες :  " + sumR());
				showloses.setText("Ήττες : " + sumW());
				mpButtonClick.start() ;
			}
		}) ;
		
	
		showplays.setText("Παιχνίδια : " + sumP());
		showwins.setText("Νίκες :  " + sumR());
		showloses.setText("Ήττες : " + sumW());
		
		
	}    
	

	//THIS FUNCTION BRINGS THE PLAYS FROM THE DATABASE 
	public int sumP()
	{
		int sum=0;
		  
	try{
		mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
		Cursor cursor = mydb.rawQuery("SELECT SUM(P) FROM "+TABLE2, null);
			if(cursor.moveToFirst()) 
			{
			     sum = cursor.getInt(0);
			}
			else
			{
				sum = 0;
			}
		
			mydb.close();
	 }
	  catch(Exception e)
	  {
	  Toast.makeText(getApplicationContext(), "Error encountered.", Toast.LENGTH_LONG).show();          
	  }
	  return sum ;
	  } 

	
	
	 //THIS FUNCTION BRINGS THE WINS FROM THE DATABASE 
	public int sumR()
	{
		int sum=0;
		  
	try{
		mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
		Cursor cursor = mydb.rawQuery("SELECT SUM(R) FROM "+TABLE2, null);
			if(cursor.moveToFirst()) 
			{
			     sum = cursor.getInt(0);
			}
			else
			{
				sum = 0;
			}
		
			mydb.close();
	 }
	  catch(Exception e)
	  {
	  Toast.makeText(getApplicationContext(), "Error encountered.", Toast.LENGTH_LONG).show();          
	  }
	  return sum ;
	  } 
	
	 
	//THIS FUNCTION BRINGS THE WRONG FROM THE DATABASE 
	public int sumW()
	{
		int sum=0;
		  
	try{
		mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
		Cursor cursor = mydb.rawQuery("SELECT SUM(W) FROM "+TABLE2, null);
			if(cursor.moveToFirst()) 
			{
			     sum = cursor.getInt(0);
			}
			else
			{
				sum = 0;
			}
		
			mydb.close();
	 }
	  catch(Exception e)
	  {
	  Toast.makeText(getApplicationContext(), "Error encountered.", Toast.LENGTH_LONG).show();          
	  }
	  return sum ;
	  } 
	
	
   
    // CREATE TABLE IF NOT EXISTS 
    public void createTable2(){
        try{
        mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
        mydb.execSQL("CREATE TABLE IF  NOT EXISTS "+ TABLE2 +" ( P INTEGER , R INTEGER, W INTEGER );");
        mydb.close();
        }catch(Exception e){
            Toast.makeText(getApplicationContext(), "Error in creating table2", Toast.LENGTH_LONG).show();
        }
    }  
    
    // THIS FUNCTION INSERTS DATA TO THE DATABASE
    public void insertIntoTable2(int a , int b , int c){
        try{
            mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
            mydb.execSQL("INSERT INTO " + TABLE2 + "(P,R,W) VALUES("+a+","+b+","+c+")");             
            mydb.close();
        }catch(Exception e){
            Toast.makeText(getApplicationContext(), "Error in inserting into table2", Toast.LENGTH_LONG).show();
        }            
    }
       
 
    // THIS FUNTION DROPS A TABLE 
    public void dropTable2(){
        try{
            mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
            mydb.execSQL("DROP TABLE " + TABLE2);
            mydb.close();
        }catch(Exception e){
            Toast.makeText(getApplicationContext(), "Error encountered while dropping2.", Toast.LENGTH_LONG).show();
        }
    }          
   
    public void onBackPressed() 
	{
     super.onBackPressed();
     finish();
	} 
    
}
