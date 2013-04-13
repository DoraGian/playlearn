package com.dora.dora;

import java.util.Random;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class anplay extends Activity
{
	Button    but , h1 , h2 , h3;
	EditText  edit ;
	TextView letter1 , letter2 , letter3 , letter4 , letter5 , letter6 , letter7 , word , sms ;
    SQLiteDatabase mydb;
    private static String DBNAME = "GAME.db";    // THIS IS THE SQLITE DATABASE FILE NAME.
    private static String TABLE = "ANAGRAM";       // THIS IS THE TABLE NAME
    private static String TABLE2 = "STATISTIC";
    int wrong=0 , win=0 , lose=0 , play=0 ;
    MediaPlayer  sound , sound1 ;
    String  wrd , c , plays , wins , loses ;
    int r , state = 1   ;

	public void onCreate(Bundle savedInstanceState) 
	 {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.anplay) ;	
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


		letter1 = (TextView) findViewById(R.id.letter1);
		letter2 = (TextView) findViewById(R.id.letter2);
		letter3 = (TextView) findViewById(R.id.letter3);
		letter4 = (TextView) findViewById(R.id.letter4);
		letter5 = (TextView) findViewById(R.id.letter5);
		letter6 = (TextView) findViewById(R.id.letter6);
		letter7 = (TextView) findViewById(R.id.letter7);
		sms = (TextView) findViewById(R.id.sms);
		word = (TextView) findViewById(R.id.word);
		edit = (EditText) findViewById(R.id.edit);
		but = (Button) findViewById(R.id.but);
		h1 = (Button) findViewById(R.id.h1);
		h2 = (Button) findViewById(R.id.h2);
		h3 = (Button) findViewById(R.id.h3);
		
		
		//dropTable();     
		createTable();
	    insertIntoTable();
	    //dropTable2();
	    createTable2();
	    
	    insertIntoTable2(1, 0, 0) ;
		
	    Random randomGenerator = new Random();
		r = randomGenerator.nextInt(20)+1; 
		
		wrd = word(r);
		
		word.setText(wrd);
		letter1.setText(leter1(r)) ; 
		letter2.setText(leter2(r)) ; 
		letter3.setText(leter3(r)) ; 
		letter4.setText(leter4(r)) ; 
		letter5.setText(leter5(r)) ; 
		letter6.setText(leter6(r)) ; 
		letter7.setText(leter7(r)) ;  
		 
		 
		 
	but.setOnClickListener(new View.OnClickListener() 
			{							
				public void onClick(View v)						
				{	
			
		   c = edit.getText().toString().replace(" ","").toLowerCase();  ;
		  
		   
		   
		   // ChHECK IF INPUT IS NUMERIC 
		   try 
		   {
		   	Integer.parseInt(c);
		   	Toast.makeText(getApplicationContext(), "Δεν επιτρέπονται αριθμοί.", Toast.LENGTH_LONG).show();
		   	edit.setText("") ;	    
		   }
		   catch (NumberFormatException e) 
		   {
		      // if is not numeric		   
		   
		   
if (wrong !=3)	
{
	if (state==1)
	{
	if (c.equals(wrd) )
	{
		//setup sound
		sound1 = MediaPlayer.create(anplay.this, R.raw.win) ;
        sound = MediaPlayer.create(anplay.this, R.raw.clap) ;
        sound1.start() ;
        sound.start() ;
        sms.setText("Μπράβο! Το βρήκες!");
		edit.setText("");
		
		insertIntoTable2(0, 1, 0) ;
		state=0;
			
	}
	else
	{
		//setup sound									  
		sound = MediaPlayer.create(anplay.this, R.raw.lose) ;
		sound.start() ;
		wrong = wrong+1 ;
		edit.setText("");
		
		 
		
		if (wrong==1)
		{
			h1.setVisibility(View.INVISIBLE);
			sms.setText(" Η λέξη είναι η "+wrd );
			state=0;
			
		}
		else if (wrong==2)
		{
			h2.setVisibility(View.INVISIBLE);
			sms.setText(" Η λέξη είναι η "+wrd );
			state=0;
			
		}
		
else
{
	h3.setVisibility(View.INVISIBLE);
	//setup sound									  
	sound = MediaPlayer.create(anplay.this, R.raw.trombone) ;
	sound.start() ;
	sms.setText("Λυπάμαι,έχασες. Η λέξη είναι η "+wrd );

	insertIntoTable2(0, 0, 1) ;
	state=0;
	
}
	}
	}
	else if (state==0)
	{
		
		 Random randomGenerator = new Random();
			r = randomGenerator.nextInt(20)+1; 
			
			wrd = word(r);
			
			word.setText(wrd);
			letter1.setText(leter1(r)) ; 
			letter2.setText(leter2(r)) ; 
			letter3.setText(leter3(r)) ; 
			letter4.setText(leter4(r)) ; 
			letter5.setText(leter5(r)) ; 
			letter6.setText(leter6(r)) ; 
			letter7.setText(leter7(r)) ;
		sms.setText("");
		state=1 ;
	}

}		   
				}
				}	
				
			}); 
	
	
	 }
	
		
	
	
	// CREATE TABLE IF NOT EXISTS 
    public void createTable(){
        try{
        mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
        mydb.execSQL("CREATE TABLE IF  NOT EXISTS "+ TABLE +" (ID INTEGER PRIMARY KEY, WORD TEXT, L1 TEXT , L2 TEXT ,L3 TEXT , L4 TEXT ,L5 TEXT , L6 TEXT , L7 TEXT );");
        mydb.close();
        }catch(Exception e){
            Toast.makeText(getApplicationContext(), "Error in creating table", Toast.LENGTH_LONG).show();
        }
    }
    
    
    
    // THIS FUNCTION INSERTS DATA TO THE DATABASE
    public void insertIntoTable(){
        try{
            mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,L7) VALUES('apple','p','e','a','','p','','l')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,L7) VALUES('woman','m','','w','a','n','o','')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,L7) VALUES('mother','e','o','t','h','r','','m')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,L7) VALUES('sister','s','s','i','e','r','','t')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,L7) VALUES('child','i','l','','h','d','c','')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,L7) VALUES('family','y','f','l','a','i','','m')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,L7) VALUES('bird','','r','','b','','i','d')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,L7) VALUES('animal','a','m','l','i','','a','n')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,L7) VALUES('snake','k','n','s','','a','','e')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,L7) VALUES('forest','s','e','','r','f','t','o')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,L7) VALUES('fruit','u','i','','','f','t','r')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,L7) VALUES('flower','f','','e','r','o','w','l')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,L7) VALUES('grass','s','','r','s','','g','a')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,L7) VALUES('cloud','d','c','','l','u','','o')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,L7) VALUES('tongue','e','o','','n','u','t','g')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,L7) VALUES('heart','e','','t','h','r','','a')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,L7) VALUES('breathe','a','b','e','h','r','','t')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,L7) VALUES('laugh','','a','g','l','h','','u')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,L7) VALUES('brother','o','b','e','r','r','t','h')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,L7) VALUES('father','t','f','','r','a','e','h')");
            mydb.close();
        }catch(Exception e){
            Toast.makeText(getApplicationContext(), "Error in inserting into table", Toast.LENGTH_LONG).show();
        }            
    }
    
    

  //THIS FUNCTION BRINGS THE WORD FROM THE DATABASE 
  public String word(int m){
  	String word="";
  try{
   mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
   Cursor allrows  = mydb.rawQuery("SELECT * FROM "+  TABLE, null);
       
  		
   if(allrows.moveToFirst()){
       do{              

          final String ID = allrows.getString(0);
          final String WORD= allrows.getString(1);
   
           
          
  			if (m==Integer.parseInt(ID))
  			   { 	
  				  				
  				word = WORD ;
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
  return word ;
  }


//THIS FUNCTION BRINGS THE LETTER1 FROM THE DATABASE 
public String leter1(int m){
	String l1="";
   try{
       mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
       Cursor allrows  = mydb.rawQuery("SELECT * FROM "+  TABLE, null);
            
		
       if(allrows.moveToFirst()){
           do{              

              final String ID = allrows.getString(0);
              final String L1= allrows.getString(2);
 
                 
              
			if (m==Integer.parseInt(ID))
			   { 	
				  				
				l1 = L1 ;
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
   return l1 ;
}



//THIS FUNCTION BRINGS THE LETTER2 FROM THE DATABASE 
public String leter2 (int m){
	String l2="";
try{
   mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
   Cursor allrows  = mydb.rawQuery("SELECT * FROM "+  TABLE, null);
       
		
   if(allrows.moveToFirst()){
       do{              

          final String ID = allrows.getString(0);
          final String L2= allrows.getString(3);
  
          
			if (m==Integer.parseInt(ID))
			   { 	
				  				
				l2 = L2 ;
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
return l2 ;
}
 
  
//THIS FUNCTION BRINGS THE LETTER3 FROM THE DATABASE 
public String leter3(int m){
	String l3="";
try{
   mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
   Cursor allrows  = mydb.rawQuery("SELECT * FROM "+  TABLE, null);
      
		
   if(allrows.moveToFirst()){
       do{              

          final String ID = allrows.getString(0);
          final String L3= allrows.getString(4);
   
          
			if (m==Integer.parseInt(ID))
			   { 	
				  				
				l3 = L3 ;
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
return l3 ;
}


//THIS FUNCTION BRINGS THE LETTER4 FROM THE DATABASE 
public String leter4(int m){
	String l4="";
try{
   mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
   Cursor allrows  = mydb.rawQuery("SELECT * FROM "+  TABLE, null);
       
		
   if(allrows.moveToFirst()){
       do{              

          final String ID = allrows.getString(0);
          final String L4= allrows.getString(5);

           
          
			if (m==Integer.parseInt(ID))
			   { 	
				  				
				l4 = L4 ;
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
return l4 ;
}


//THIS FUNCTION BRINGS THE LETTER5 FROM THE DATABASE 
public String leter5(int m){
	String l5="";
try{
 mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
 Cursor allrows  = mydb.rawQuery("SELECT * FROM "+  TABLE, null);
     
		
 if(allrows.moveToFirst()){
     do{              

        final String ID = allrows.getString(0);
        final String L5= allrows.getString(6);
     
         
        
			if (m==Integer.parseInt(ID))
			   { 	
				  				
				l5 = L5 ;
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
return l5 ;
}



//THIS FUNCTION BRINGS THE LETTER6 FROM THE DATABASE 
public String leter6(int m){
	String l6="";
try{
 mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
 Cursor allrows  = mydb.rawQuery("SELECT * FROM "+  TABLE, null);
     
		
 if(allrows.moveToFirst()){
     do{              

        final String ID = allrows.getString(0);
        final String L6= allrows.getString(7);

         
        
			if (m==Integer.parseInt(ID))
			   { 	
				  				
				l6 = L6 ;
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
return l6 ;
}

  
  

//THIS FUNCTION BRINGS THE LETTER7 FROM THE DATABASE 
public String leter7(int m){
	String l7="";
try{
mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
Cursor allrows  = mydb.rawQuery("SELECT * FROM "+  TABLE, null);
   
		
if(allrows.moveToFirst()){
   do{              

      final String ID = allrows.getString(0);
      final String L7 = allrows.getString(8); 
       
      
			if (m==Integer.parseInt(ID))
			   { 	
				  				
				l7 = L7 ;
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
return l7 ;
} 
  
  

   // THIS FUNTION DROPS A TABLE 
      public void dropTable(){
          try{
              mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
              mydb.execSQL("DROP TABLE " + TABLE);
              mydb.close();
          }catch(Exception e){
              Toast.makeText(getApplicationContext(), "Error encountered while dropping2.", Toast.LENGTH_LONG).show();
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
         
          public void onBackPressed() 
  		{
           super.onBackPressed();
           finish();
  		}
}
