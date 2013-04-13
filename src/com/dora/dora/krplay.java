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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class krplay extends Activity 
{
	
	Button     pen , head , body , lhand , rhand , lleg , rleg ;
	EditText   edit ;
	TextView letter1 , letter2 , letter3 , letter4 , letter5 , letter6 , line1 , line2 , line3 , line4 , line5 , line6 , word , res;
    SQLiteDatabase mydb;
    private static String DBNAME = "GAME.db";    // THIS IS THE SQLITE DATABASE FILE NAME.
    private static String TABLE = "KREMALA";       // THIS IS THE TABLE NAME
    private static String TABLE2 = "STATISTIC1";
    int wrong=0 , correct=0 , lose=0 , play=0;
    MediaPlayer  sound ;
	int r , lenght , w1=0 , w2=0 , w3=0 , w4=0 ,w5=0 ,w6=0, state=1;
    String l1, l2, l3, l4, l5, l6, c , wrd , plays , wins , loses;
    
    
  
    
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.krplay) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		
		
		//dropTable();     
		createTable();
	    insertIntoTable();
	    //dropTable2();
	    createTable2();
	  			
	    insertIntoTable2(1, 0, 0) ;
	    
		loadActivity();

	    
	}
		
		private void loadActivity() {
		
		letter1 = (TextView) findViewById(R.id.letter1);
		letter2 = (TextView) findViewById(R.id.letter2);
		letter3 = (TextView) findViewById(R.id.letter3);
		letter4 = (TextView) findViewById(R.id.letter4);
		letter5 = (TextView) findViewById(R.id.letter5);
		letter6 = (TextView) findViewById(R.id.letter6);
		letter6 = (TextView) findViewById(R.id.letter6);
		line1 = (TextView) findViewById(R.id.line1);
		line2 = (TextView) findViewById(R.id.line2);
		line3 = (TextView) findViewById(R.id.line3);
		line4 = (TextView) findViewById(R.id.line4);
		line5 = (TextView) findViewById(R.id.line5);
		line6 = (TextView) findViewById(R.id.line6);
		word = (TextView) findViewById(R.id.word);
		res = (TextView) findViewById(R.id.res);
		edit = (EditText) findViewById(R.id.edit);
		pen = (Button) findViewById(R.id.pen);
		head = (Button) findViewById(R.id.head);
		body = (Button) findViewById(R.id.body);
		lhand = (Button) findViewById(R.id.lhand);
		rhand = (Button) findViewById(R.id.rhand);
		lleg = (Button) findViewById(R.id.lleg);
		rleg = (Button) findViewById(R.id.rleg);
		
		

		head.setVisibility(View.INVISIBLE);
		body.setVisibility(View.INVISIBLE);
		lhand.setVisibility(View.INVISIBLE);
		rhand.setVisibility(View.INVISIBLE);
		lleg.setVisibility(View.INVISIBLE);
		rleg.setVisibility(View.INVISIBLE);
		
		line1.setVisibility(View.INVISIBLE);
		line2.setVisibility(View.INVISIBLE);
		line3.setVisibility(View.INVISIBLE);
		line4.setVisibility(View.INVISIBLE);
		line5.setVisibility(View.INVISIBLE);
		line6.setVisibility(View.INVISIBLE);
		
		 correct=0;
		 wrong=0;
		 w1=0;
		 w2=0;
		 w3=0;
		 w4=0;
		 w5=0;
		 w6=0;
		 lenght=0;
		 letter1.setText("");
		 letter2.setText("");
		 letter3.setText("");
		 letter4.setText("");
		 letter5.setText("");
		 letter6.setText("");
			     	
	    
	    Random randomGenerator = new Random();
		r = randomGenerator.nextInt(21)+1; 
		
		
		  wrd = word(r);
		  lenght = lenght(r);

			if (lenght == 5)
			{
				line1.setVisibility(View.VISIBLE);
				line2.setVisibility(View.VISIBLE);
				line3.setVisibility(View.VISIBLE);
				line4.setVisibility(View.VISIBLE);
				line5.setVisibility(View.VISIBLE);
			}
			else if (lenght == 4)
			{
				line1.setVisibility(View.VISIBLE);
				line2.setVisibility(View.VISIBLE);
				line3.setVisibility(View.VISIBLE);
				line4.setVisibility(View.VISIBLE);
			}
			else
			{
				line1.setVisibility(View.VISIBLE);
				line2.setVisibility(View.VISIBLE);
				line3.setVisibility(View.VISIBLE);
				line4.setVisibility(View.VISIBLE);
				line5.setVisibility(View.VISIBLE);
				line6.setVisibility(View.VISIBLE);
			}
			
			
		
		l1 = leter1(r); 
		l2 = leter2(r); 
		l3 = leter3(r); 
		l4 = leter4(r); 
		l5 = leter5(r); 
		l6 = leter6(r); 
		 	
		letter1.setText(l1);

	pen.setOnClickListener(new View.OnClickListener() 
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
	
   
// ChHECK IF INPUT IS ONE LETTER    
 if (c.length()==1 || c.length()==0)   
 {   
 if (state==1)
 {  
	 if (correct != lenght-1)
	 {	

	
		if(c.equals(""))
		{
			//setup sound									  
			sound = MediaPlayer.create(krplay.this, R.raw.lose) ;
			sound.start() ;
			wrong = wrong+1 ;
			edit.setText("");
	    
	    
			if (wrong==1)
			{
				head.setVisibility(View.VISIBLE);
			}
			else if (wrong==2)
			{
				body.setVisibility(View.VISIBLE);
			}
			else if (wrong==3)
			{
				lhand.setVisibility(View.VISIBLE);
			}
			else if (wrong==4)
			{
				rhand.setVisibility(View.VISIBLE);
			}
			else if (wrong==5)
			{
				lleg.setVisibility(View.VISIBLE);
			}
			else if (wrong==6)
			{
				rleg.setVisibility(View.VISIBLE);
			}
			else if(wrong==7)
			{
				//setup sound									  
				sound = MediaPlayer.create(krplay.this, R.raw.trombone) ;
				sound.start() ;
				res.setText("Λυπάμαι,έχασες. Η λέξη είναι η "+wrd );
				insertIntoTable2(0, 0, 1) ;
				edit.setText("") ;
				state=0;
			}
		}

		else if (c.equals(l2)& (w2!=1))
		{
			//setup sound									  
			sound = MediaPlayer.create(krplay.this, R.raw.win) ;
			sound.start() ;
			letter2.setText(l2);
			edit.setText("");
			w2=1;
			correct = correct+1;
		}
		else if (c.equals(l3) & (w3!=1))
		{
			//setup sound									  
			sound = MediaPlayer.create(krplay.this, R.raw.win) ;
			sound.start() ;
			letter3.setText(l3);
			edit.setText("");
			w3=1;
			correct = correct+1;
		}
		else if (c.equals(l4) & (w4!=1))
		{
			//setup sound									  
			sound = MediaPlayer.create(krplay.this, R.raw.win) ;
        	sound.start() ;
        	letter4.setText(l4);
			edit.setText("");
			w4=1;
			correct = correct+1;
		}
		else if (c.equals(l5) & !c.equals("") & (w5!=1))
		{
			//setup sound									  
			sound = MediaPlayer.create(krplay.this, R.raw.win) ;
			sound.start() ;
			letter5.setText(l5);
			edit.setText("");
			w5=1;
			correct = correct+1;
		}
		else if (c.equals(l6) & !c.equals("") & (w6!=1))
		{
			//setup sound									  
			sound = MediaPlayer.create(krplay.this, R.raw.win) ;
        	sound.start() ;
        	letter6.setText(l6);
			edit.setText("");
			w6=1;
			correct = correct+1;
		}
		else
		{
			//setup sound									  
			sound = MediaPlayer.create(krplay.this, R.raw.lose) ;
      	  	sound.start() ;
      	  	wrong = wrong+1 ;
      	 	edit.setText("");
	
      	 	
      	 	if (wrong==1)
      	 	{
      	 		head.setVisibility(View.VISIBLE);
      	 	}
      	 	else if (wrong==2)
      	 	{
      	 		body.setVisibility(View.VISIBLE);
      	 	}
      	 	else if (wrong==3)
      	 	{
      	 		lhand.setVisibility(View.VISIBLE);
      	 	}
      	 	else if (wrong==4)
      	 	{
      	 		rhand.setVisibility(View.VISIBLE);
      	 	}
      	 	else if (wrong==5)
      	 	{
      	 		lleg.setVisibility(View.VISIBLE);
      	 	}
      	 	else if (wrong==6)
      	 	{
      	 		rleg.setVisibility(View.VISIBLE);
      	 	}
      	 	else if(wrong==7)
      	 	{
      	 		//setup sound									  
      	 		sound = MediaPlayer.create(krplay.this, R.raw.trombone) ;
      	 		sound.start() ;
      	 		res.setText("Λυπάμαι,έχασες. Η λέξη είναι η "+wrd );
      	 		insertIntoTable2(0, 0, 1) ;
      			edit.setText("") ;
      	 		state=0;
      	 	}
		}	
	}
	else
	{
		 sound = MediaPlayer.create(krplay.this, R.raw.clap) ;
		 sound.start() ;
		 res.setText("Μπράβο! το βρήκες!" );
		 state=0;
		 insertIntoTable2(0, 1, 0) ;
		 edit.setText("") ;
		 state=0;
	}
}
else if (state==0)
{
	res.setText("");
	loadActivity();	
	state=1;
}
}
else
{
	Toast.makeText(getApplicationContext(), "Μπορείς να πληκτρολογήσεις μόνο ένα γράμμα.", Toast.LENGTH_LONG).show();
	edit.setText("") ;
}
 

} 
		}
		
	});	
}	
		
		
		
	// CREATE TABLE IF NOT EXISTS 
    public void createTable(){
        try{
        mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
        mydb.execSQL("CREATE TABLE IF  NOT EXISTS "+ TABLE +" (ID INTEGER PRIMARY KEY, WORD TEXT, L1 TEXT , L2 TEXT ,L3 TEXT , L4 TEXT ,L5 TEXT , L6 TEXT ,LENGHT INTEGER);");
        mydb.close();
        }catch(Exception e){
            Toast.makeText(getApplicationContext(), "Error in creating table", Toast.LENGTH_LONG).show();
        }
    }
    
    
    // THIS FUNCTION INSERTS DATA TO THE DATABASE
    public void insertIntoTable(){
        try{
            mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('apple','a','p','p','l','e','','5')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('play','p','l','a','y','','','4')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('phone','p','h','o','n','e','','5')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('pencil','p','e','n','c','i','l','6')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('bottle','b','o','t','t','l','e','6')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('purse','p','u','r','s','e','','5')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('cloud','c','l','o','u','d','','5')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('water','w','a','t','e','r','','5')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('lamp','l','a','m','p','','','4')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('coffee','c','o','f','f','e','e','6')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('glass','g','l','a','s','s','','5')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('head','h','e','a','d','','','4')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('orange','o','r','a','n','g','e','6')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('mouth','m','o','u','t','h','','5')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('hair','h','a','i','r','','','4')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('bird','b','i','r','d','','','4')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('radio','r','a','d','i','o','','5')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('couch','c','o','u','c','h','','5')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('table','t','a','b','l','e','','5')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('chair','c','h','a','i','r','','5')");
            mydb.execSQL("INSERT INTO " + TABLE + "(WORD,L1,L2,L3,L4,L5,L6,LENGHT) VALUES('wonder','w','o','n','d','e','r','6')");
            mydb.close();
        }catch(Exception e){
            Toast.makeText(getApplicationContext(), "Error in inserting into table", Toast.LENGTH_LONG).show();
        }
             
    }
    
    
    // THIS FUNCTION BRINGS LENGHT FROM THE DATABASE 
    public int lenght(int m){
    	int l=1;
        try{
            mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
            Cursor allrows  = mydb.rawQuery("SELECT * FROM "+  TABLE, null);
                      
			
            if(allrows.moveToFirst()){
                do{              
 
                   final String ID = allrows.getString(0);
                   final String WORD= allrows.getString(1);
                   final String L1= allrows.getString(2);
                   final String L2= allrows.getString(3);
                   final String L3= allrows.getString(4);
                   final String L4= allrows.getString(5);
                   final String L5= allrows.getString(6);
                   final String L6= allrows.getString(7);
                   final String LENGHT = allrows.getString(8); 
                       
                   
    			if (m==Integer.parseInt(ID))
    			   { 	
    				word.setText(WORD);
    				  				
    				l = Integer.parseInt(LENGHT) ;
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
        return l ;
    }
    
    
    

// THIS FUNCTION BRINGS THE LETTER1 FROM THE DATABASE 
public String leter1(int m){
	String l1="";
    try{
        mydb = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
        Cursor allrows  = mydb.rawQuery("SELECT * FROM "+  TABLE, null);
             
		
        if(allrows.moveToFirst()){
            do{              

               final String ID = allrows.getString(0);
               final String WORD= allrows.getString(1);
               final String L1= allrows.getString(2);
               final String L2= allrows.getString(3);
               final String L3= allrows.getString(4);
               final String L4= allrows.getString(5);
               final String L5= allrows.getString(6);
               final String L6= allrows.getString(7);
               final String LENGHT = allrows.getString(8); 
                  
               
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
            final String WORD= allrows.getString(1);
            final String L1= allrows.getString(2);
            final String L2= allrows.getString(3);
            final String L3= allrows.getString(4);
            final String L4= allrows.getString(5);
            final String L5= allrows.getString(6);
            final String L6= allrows.getString(7);
            final String LENGHT = allrows.getString(8); 
              
            
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
            final String WORD= allrows.getString(1);
            final String L1= allrows.getString(2);
            final String L2= allrows.getString(3);
            final String L3= allrows.getString(4);
            final String L4= allrows.getString(5);
            final String L5= allrows.getString(6);
            final String L6= allrows.getString(7);
            final String LENGHT = allrows.getString(8); 
              
            
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
            final String WORD= allrows.getString(1);
            final String L1= allrows.getString(2);
            final String L2= allrows.getString(3);
            final String L3= allrows.getString(4);
            final String L4= allrows.getString(5);
            final String L5= allrows.getString(6);
            final String L6= allrows.getString(7);
            final String LENGHT = allrows.getString(8); 
             
            
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



 // THIS FUNTION DROPS A TABLE 
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
       
        public void onBackPressed() 
		{
         super.onBackPressed();
         finish();
		}
}
