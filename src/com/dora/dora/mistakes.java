package com.dora.dora;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class mistakes extends Activity 
{
	SQLiteDatabase mydb;
    private static String DBNAME = "GAME.db";    // THIS IS THE SQLITE DATABASE FILE NAME.
    private static String TABLE = "QUIZ";       // THIS IS THE TABLE NAME
    private static String TABLE3 = "MISTAKES";

	//private Button btnSpeak;
	LinearLayout Linear;
	int mistakes;
	String ans , que  ;

		
		@Override
		protected void onCreate (Bundle savedInstanceState) 
		{
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.notebook) ;
			this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
			
			//btnSpeak = (Button) findViewById(R.id.btnSpeak);
			//btnSpeak.setVisibility(View.INVISIBLE);
			
			mistakes = sumM();
			
			for (int i=1; i<=mistakes ; i++)
			{
				que = QUEST(i);
				ans = ANSWERKEY(i);				
				Linear  = (LinearLayout)findViewById(R.id.linear);	
				TextView t0 = new TextView(this);
				t0.setText(Html.fromHtml("<br><br><br><b><u>Λάθος Ερώτηση:</u></b><br>-"+que));
				setalign0(t0);
				Linear.addView(t0);
				
				TextView t1 = new TextView(this);
				if(ans.equals("A"))
				{
					t1.setText(Html.fromHtml("<b><u>Σωστή απάντηση:</u></b><br>-<font color='#ff0000'>"+A(i)+"</font>"));
				}
				else if (ans.equals("B"))
				{
					t1.setText(Html.fromHtml("<b><u>Σωστή απάντηση:</u></b><br>-<font color='#ff0000'>"+B(i)+"</font>"));	
				}
				else if (ans.equals("C"))
				{
					t1.setText(Html.fromHtml("<b><u>Σωστή απάντηση:</u></b><br>-<font color='#ff0000'>"+C(i)+"</font>"));
				}
				else if (ans.equals("D"))
				{
					t1.setText(Html.fromHtml("<b><u>Σωστή απάντηση:</u></b><br>-<font color='#ff0000'>"+D(i)+"</font>"));
				}
				setalign0(t1);
				Linear.addView(t1);
			}
		}
			
			// THIS FUNCTION SETS COLOR AND PADDING FOR THE TEXTVIEWS 
		    public void setalign0(TextView t){    
		        t.setPadding(60, 0, 10, 0);
		        t.setTextSize(13);
		}

	
	    // THIS FUNCTION BRINGS MISTAKES FROM THE DATABASE 
	    public String QUEST(int m){
	    	String question = "";
	        try{
	            mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
	            Cursor allrows  = mydb.rawQuery("SELECT * FROM "+  TABLE, null);
	                      
				
	            if(allrows.moveToFirst()){
	                do{              
	 
	                   final String ID = allrows.getString(0);
	                   final String QUESTION= allrows.getString(1);    	               
	                       
	                   
	    			if (m==Integer.parseInt(ID))
	    			   { 
	    				
	    				question = QUESTION;	    			
	    				
	    			   }
	                 }		
	                while(allrows.moveToNext());
	            }
	            mydb.close();
	         }
	        catch(Exception e)
	         {
	            Toast.makeText(getApplicationContext(), "Error encountered in returning mistakes.", Toast.LENGTH_LONG).show();          
	         }
	        return question ;
	    }	
		
	    
	    // THIS FUNCTION BRINGS ANSWER FROM THE DATABASE 
	    public String ANSWERKEY(int m){
	    	String answer = "";
	        try{
	            mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
	            Cursor allrows  = mydb.rawQuery("SELECT * FROM "+  TABLE, null);
	                      
				
	            if(allrows.moveToFirst()){
	                do{              
	 
	                   final String ID = allrows.getString(0);
	                   final String ANSWER= allrows.getString(6);		               
	                       
	                   
	    			if (m==Integer.parseInt(ID))
	    			   { 
	    				 			
	    				answer = ANSWER ;
	    				
	    			   }
	                 }		
	                while(allrows.moveToNext());
	            }
	            mydb.close();
	         }
	        catch(Exception e)
	         {
	            Toast.makeText(getApplicationContext(), "Error encountered in returning answers.", Toast.LENGTH_LONG).show();          
	         }
	        return answer ;
	    }  
	    
	    
	    // THIS FUNCTION BRINGS ANSWER A FROM THE DATABASE 
	    public String A(int m){
	    	String A = "";
	        try{
	            mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
	            Cursor allrows  = mydb.rawQuery("SELECT * FROM "+  TABLE, null);
	                      
				
	            if(allrows.moveToFirst()){
	                do{              
	 
	                   final String ID = allrows.getString(0);
	                   final String a= allrows.getString(2);
	                         
	                       
	                   
	    			if (m==Integer.parseInt(ID))
	    			   { 
	    				 			
	    				A = a ;
	    				
	    			   }
	                 }		
	                while(allrows.moveToNext());
	            }
	            mydb.close();
	         }
	        catch(Exception e)
	         {
	            Toast.makeText(getApplicationContext(), "Error encountered in returning answers.", Toast.LENGTH_LONG).show();          
	         }
	        return A ;
	    }  
	    
	    
	    // THIS FUNCTION BRINGS ANSWER B FROM THE DATABASE 
	    public String B(int m){
	    	String B = "";
	        try{
	            mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
	            Cursor allrows  = mydb.rawQuery("SELECT * FROM "+  TABLE, null);
	                      
				
	            if(allrows.moveToFirst()){
	                do{              
	 
	                   final String ID = allrows.getString(0);
	                   final String b= allrows.getString(3);
	        
	                   
	    			if (m==Integer.parseInt(ID))
	    			   { 
	    				 			
	    				B = b ;
	    				
	    			   }
	                 }		
	                while(allrows.moveToNext());
	            }
	            mydb.close();
	         }
	        catch(Exception e)
	         {
	            Toast.makeText(getApplicationContext(), "Error encountered in returning answers.", Toast.LENGTH_LONG).show();          
	         }
	        return B ;
	    }  
	    
	    
	    // THIS FUNCTION BRINGS ANSWER C FROM THE DATABASE 
	    public String C(int m){
	    	String C = "";
	        try{
	            mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
	            Cursor allrows  = mydb.rawQuery("SELECT * FROM "+  TABLE, null);
	                      
				
	            if(allrows.moveToFirst()){
	                do{              
	 
	                   final String ID = allrows.getString(0);
	                   final String c= allrows.getString(4);
	               
	                       
	                   
	    			if (m==Integer.parseInt(ID))
	    			   { 
	    				 			
	    				C = c ;
	    				
	    			   }
	                 }		
	                while(allrows.moveToNext());
	            }
	            mydb.close();
	         }
	        catch(Exception e)
	         {
	            Toast.makeText(getApplicationContext(), "Error encountered in returning answers.", Toast.LENGTH_LONG).show();          
	         }
	        return C ;
	    }   
	    
	    
	    // THIS FUNCTION BRINGS ANSWER A FROM THE DATABASE 
	    public String D(int m){
	    	String D = "";
	        try{
	            mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
	            Cursor allrows  = mydb.rawQuery("SELECT * FROM "+  TABLE, null);
	                      
				
	            if(allrows.moveToFirst()){
	                do{              
	 
	                   final String ID = allrows.getString(0);
	                   final String d= allrows.getString(5);
	         		               
	                       
	                   
	    			if (m==Integer.parseInt(ID))
	    			   { 
	    				 			
	    				D = d ;
	    				
	    			   }
	                 }		
	                while(allrows.moveToNext());
	            }
	            mydb.close();
	         }
	        catch(Exception e)
	         {
	            Toast.makeText(getApplicationContext(), "Error encountered in returning answers.", Toast.LENGTH_LONG).show();          
	         }
	        return D ;
	    }    
	    

		//THIS FUNCTION BRINGS THE NUMBER OF THE MISTAKES FROM THE DATABASE 
		public int sumM()
		{
			int sum=0;
			  
		try{
			mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
			Cursor cursor = mydb.rawQuery("SELECT SUM(MISTAKES) FROM "+TABLE3, null);
				if(cursor.moveToFirst()) 
				{
				     sum = cursor.getInt(0);
				}
				else
				{
					sum = 1;
				}
			
				mydb.close();
		 }
		  catch(Exception e)
		  {
		  Toast.makeText(getApplicationContext(), "Error encountered in returning mistakes number.", Toast.LENGTH_LONG).show();          
		  }
		  return sum ;
		  } 
		
}
