package com.dora.dora;

import java.util.Random;

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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class qplay extends Activity 
{
	
	
		SQLiteDatabase mydb;
	    private static String DBNAME = "GAME.db";    // THIS IS THE SQLITE DATABASE FILE NAME.
	    private static String TABLE = "QUIZ";       // THIS IS THE TABLE NAME
	    private static String TABLE2 = "STATISTIC3";
	    private static String TABLE3 = "MISTAKES";
	    MediaPlayer  sound ;
	    String answer ,ans ; 
	    TextView Question ;
	    RadioButton A , B , C ,D ; 
	    Button check , see;
	    RadioGroup radioGroup;
	    int r , j=0 , correct = 0 , wrong = 0 , count = 0 ;
	   int []id = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
	
		 @Override
		public void onCreate(Bundle savedInstanceState) 
		 {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.qplay) ;
			this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
			
			
			Question = (TextView) findViewById(R.id.Question);
			A = (RadioButton) findViewById(R.id.A);
			B = (RadioButton) findViewById(R.id.B);
			C = (RadioButton) findViewById(R.id.C);
			D = (RadioButton) findViewById(R.id.D);
			check = (Button) findViewById(R.id.check);
			see = (Button) findViewById(R.id.see);
			radioGroup = (RadioGroup) findViewById(R.id.radioGroup);			
					
			//dropTable();
			createTable();
		    insertIntoTable();
		    //dropTable2();
		    createTable2();
		    dropTable3();
		    createTable3();
		   
			
			loadActivity();
			
			see.setVisibility(View.INVISIBLE);
		
			 
		 }
		 
		 
		 private void loadActivity() 
		 {	
			 
			//set up the button sound		
			 final MediaPlayer mpButtonClick = MediaPlayer.create(this , R.raw.click) ;
				
		    Random randomGenerator = new Random();
			r = randomGenerator.nextInt(40)+1; 
				
			answer = ANSWER(r);
			
	

for (int j=0;j<15; j++)
{
	if(id[j]==r)
	{  		
		r = randomGenerator.nextInt(40)+1; 	
		answer = ANSWER(r);
	}
}

		if(count<15)
		{		
			check.setOnClickListener(new View.OnClickListener() 
			{				
				
				public void onClick(View v)						
				{						
					mpButtonClick.start() ;
					
					if(A.isChecked()) 
					{					
						if(answer.equals("A"))
						{
						correct = correct + 1 ;	
						}
						else
						{
							insertIntoTable3(r,1);
							wrong = wrong + 1 ;
						}
					} 
					else if(B.isChecked()) 
					{
						if(answer.equals("B"))
						{
						correct = correct + 1 ;	
						}
						else
						{
							insertIntoTable3(r,1);
							wrong = wrong + 1 ;
						}
					}
					else if(C.isChecked())
					{
						if(answer.equals("C"))
						{
						correct = correct + 1 ;	
						}
						else
						{
							insertIntoTable3(r,1);
							wrong = wrong + 1 ;
						}
					}
					else if(D.isChecked())
					{
						if(answer.equals("D"))
						{
						insertIntoTable3(r,1);
						correct = correct + 1 ;	
						}
						else
						{
							wrong = wrong + 1 ;
						}
					}	
					count = count+1;
					loadActivity();		
					id[j]=r;
					j=j+1;					
				}
			});
		}	 
		else
		{
			A.setVisibility(View.INVISIBLE);
			B.setVisibility(View.INVISIBLE);
			C.setVisibility(View.INVISIBLE);
			D.setVisibility(View.INVISIBLE);
			check.setVisibility(View.INVISIBLE);
			Question.setText("Το σκορ σου είναι : "+correct+"/"+count);
			see.setVisibility(View.VISIBLE);
			
			insertIntoTable2(count,correct,wrong);
			
			
			see.setOnClickListener(new View.OnClickListener() 
			{
				public void onClick(View arg0) 
				{	
					startActivity(new Intent("com.dora.dora.MISTAKES")) ;
					mpButtonClick.start() ;
				}
			});
		}
	
}	
	
	
		 public void onBackPressed() 
			{
		    super.onBackPressed();
		    finish();
			}
		 
		 
			
			// CREATE TABLE IF NOT EXISTS 
		    public void createTable(){
		        try{
		        mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
		        mydb.execSQL("CREATE TABLE IF  NOT EXISTS "+ TABLE +" (ID INTEGER PRIMARY KEY, QUESTION TEXT, A TEXT , B TEXT , C TEXT , D TEXT , ANSWER TEXT );");		        
		        mydb.close();
		        }catch(Exception e){
		            Toast.makeText(getApplicationContext(), "Error in creating table", Toast.LENGTH_LONG).show();
		        }
		    }
		    
		    
		    // THIS FUNCTION INSERTS DATA TO THE DATABASE
		    public void insertIntoTable(){
		        try{
		            mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('Mary always ____ (wake up) early in the morning.','wakes  up','will wake up','wake up','is waking up','A')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('My cousins often ____ (visit) us. They live close to us.','is visiting',' will  visit','visit','visited','C')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('My friend, Manolis, ____ (be) usually late for school.','are','is','will be','was','B')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('Vegetarians ____ (not eat) meat. They support animal rights.','are not eating','did not eat','do not eat','will not eat','C')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('My mother ____ (want) a new dishwasher.','wanted ','wants','want','wanting','B')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('The local supermarket ____ (not sell) imported things.','do not sell','is not sell','does not sell','did not sell','C')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('The weather is bad. It ____ (rain) every day.','is raining','rains','will rain','rained','B')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('On Saturdays all the neighbourhood children ____ (go) to the sea front.','are going','will go','went','go','D')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('____ birds ____ (live) in the desert?','Do - live','Does - live','Are - live','Are - living','A')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('Alexander, the florist, ____ (not sell) books. He sells flowers.','does not sells','did not sell','will not sell','does not sell','D')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('Peter ____ (play) with his toys at the moment.','were playing','plays','played','is playing','D')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('The little girl ____ (draw) a funny picture.','will draw','is drawing','draws','are drawing','B')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('Grandmother ____ (stay) with us until spring.','stays','stayed','is staying','will stay','C')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('I am angry with Tom. He ____ (talk) during the lesson!','talks','will talk','is talking','talked','C')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('Tonight we ____ (go) to the cinema. There is a good film on.','will go','are going','go',' went','B')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('Look! The cat ____ (chase) a tiny, little house mouse.','will chase','are chasing','is chasing','chases','C')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('Shsss! Put your voice down! The baby ____ (sleep).','sleep','is sleeping','sleeps','will sleep','B')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('At present my parents ____ (not think) of going on holiday.','do not think','did not think','will not think','are not thinking','D')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('This term my brother ____ (do) very well at school.','does','did','is doing','will do','C')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('Listen! There is a bird in our garden. It ____ (sing).','sings','is singing','sung','will sing','B')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('Stay there, I ____ (open) the door.','open','opened','will open','am opening','C')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('Maybe we ____ (stay) in and watch television tonight.','are staying','stay','stayed','will stay','D')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('I don’t think I ____ (buy) that motorbike.','am buying','will buy','are buying','buy','B')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('____ you ____ (shut) that door, please. There is a draught.','Did - shut','Is - shut','Will - shut','Shut - -','C')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('If you behave yourselves, I ____ (take) you to the cinema.','take','will take','am taking','took','B')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('If you go near that cake, I ____ (be) very angry.','am ','was','are','will be','D')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('I bet you ____ (lose) this game.','are losing','lose','will lose','lost','C')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('Wait a minute. I ____ (carry) those boxes.','will carry','am carrying','carry','carried','A')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('One day I ____ (become) a millionaire.','become','became','am becoming','will become','D')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('In the future, people ____ (live) to be 200 years old.','live ','are living','lived','will live','D')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('The front school door ____ (close) four minutes ago.','closed','is closing','closes','will close','A')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('People of all ages ____ (go) to the rock concert last week.','go','are going','will go','went','D')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('Three children ____ (leave) the party very early last night. ','leave','are leaving','left','will leave','C')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('Mary and her friends ____ (visit) the local zoo the other day.','visit','are visiting','will visit','visited','D')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('Tom’s father ____ (not go) to work yesterday. It  was  a Bank Holiday.','did not go','do not go','will not go','is not going','A')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('Last year the Blacks ____ (stay) at home','stayed','stay','stays','will stay','A')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('Dad  ____  (not watch) the whole DVD last night. He  fell asleep halfway.','do not watch ','will not watch','is not watching','did not watch','D')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('When Caroline was a teenager she ____ (hate) mowing the lawn in their front garden.','hates','hated','will hate','hate','B')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('____ Alex ____ (go) to church this morning?','do - go','did -went','will - go','did - go','D')");
		            mydb.execSQL("INSERT INTO " + TABLE + "(QUESTION,A,B,C,D,ANSWER) VALUES('Tania ____ (have) nice presents for Christmas. She liked them all.','has','is having','had','will have','C')");
		            mydb.close();
		        }catch(Exception e){
		            Toast.makeText(getApplicationContext(), "Error in inserting into table", Toast.LENGTH_LONG).show();
		        }
		             
		    }
		    
		    
		    // THIS FUNCTION BRINGS ANSWER FROM THE DATABASE 
		    public String ANSWER(int m){
		    	String answer = "";
		        try{
		            mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
		            Cursor allrows  = mydb.rawQuery("SELECT * FROM "+  TABLE, null);
		                      
					
		            if(allrows.moveToFirst()){
		                do{              
		 
		                   final String ID = allrows.getString(0);
		                   final String QUESTION= allrows.getString(1);
		                   final String a= allrows.getString(2);
		                   final String b= allrows.getString(3);
		                   final String c= allrows.getString(4);
		                   final String d= allrows.getString(5);
		                   final String ANSWER= allrows.getString(6);		               
		                       
		                   
		    			if (m==Integer.parseInt(ID))
		    			   { 
		    				
		    				Question.setText(QUESTION);
		    				A.setText(a);
		    				B.setText(b);
		    				C.setText(c);
		    				D.setText(d);
		    				answer = ANSWER ;
		    				
		    			   }
		                 }		
		                while(allrows.moveToNext());
		            }
		            mydb.close();
		         }
		        catch(Exception e)
		         {
		            Toast.makeText(getApplicationContext(), "Error encountered.", Toast.LENGTH_LONG).show();          
		         }
		        return answer ;
		    }
		    
		    
		 // THIS FUNTION DROPS TABLE 
		    public void dropTable(){
		        try{
		            mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
		            mydb.execSQL("DROP TABLE " + TABLE);
		            mydb.close();
		        }catch(Exception e){
		            Toast.makeText(getApplicationContext(), "Error encountered while dropping.", Toast.LENGTH_LONG).show();
		        }
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
		  
		        
		        // CREATE TABLE IF NOT EXISTS 
			    public void createTable3(){
			        try{
			        mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
			        mydb.execSQL("CREATE TABLE IF  NOT EXISTS "+ TABLE3 +" (I INTEGER PRIMARY KEY , ID INTEGER , MISTAKES INTEGER );");
			        mydb.close();
			        }catch(Exception e){
			            Toast.makeText(getApplicationContext(), "Error in creating table3", Toast.LENGTH_LONG).show();
			        }
			    }
			    
			    
			    
			    // THIS FUNCTION INSERTS DATA TO THE DATABASE
			    public void insertIntoTable3(int a, int b){
			        try{
			            mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
			            mydb.execSQL("INSERT INTO " + TABLE3 + "(ID,MISTAKES) VALUES("+a+","+b+")");             
			            mydb.close();
			        }catch(Exception e){
			            Toast.makeText(getApplicationContext(), "Error in inserting into table3", Toast.LENGTH_LONG).show();
			        }            
			    }
			    
			                                  
			                  
			     // THIS FUNTION DROPS A TABLE 
			        public void dropTable3(){
			            try{
			                mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
			                mydb.execSQL("DROP TABLE " + TABLE3);
			                mydb.close();
			            }catch(Exception e){
			                Toast.makeText(getApplicationContext(), "Error encountered while dropping3.", Toast.LENGTH_LONG).show();
			            }
			        }              
			    	        
		        
		        
}
