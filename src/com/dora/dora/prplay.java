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


public class prplay extends Activity 
{
	
	 SQLiteDatabase mydb;
	 private static String DBNAME = "GAME.db";    // THIS IS THE SQLITE DATABASE FILE NAME.	 
	 private static String TABLE2 = "STATISTIC2";
	 Button     ok , h1 , h2 , h3 ;
	 EditText   result ;
	 TextView   first , second , message, plus ;
	 int r ,a , b , d ;  
	 int j = 0  ;
	 int lose , wrong=0 , correct=0  , play=0;; 
	 int x =0 ;
	 int win=0  ;
	 int state=1 ; 
	 String  plays , wins , loses;
	 MediaPlayer  sound ;	
	
	
	 String string;
     String st1[] = { "", "one", "two", "three", "four", "five", "six", "seven",
                     "eight", "nine", };
     String st2[] = { "hundred", "thousand", "lakh", "crore" };
     String st3[] = { "ten", "eleven", "twelve", "thirteen", "fourteen",
                     "fifteen", "sixteen", "seventeen", "eighteen", "ninteen", };
     String st4[] = { "twenty", "thirty", "fourty", "fifty", "sixty", "seventy",
                     "eighty", "ninty" };

     public String convert(int number) {
             int n = 1;
             int word;
             string = "";
             while (number != 0) {
                     switch (n) {
                     case 1:
                             word = number % 100;
                             pass(word);
                             if (number > 100 && number % 100 != 0) {
                                     show("and ");
                             }
                             number /= 100;
                             break;

                     case 2:
                             word = number % 10;
                             if (word != 0) {
                                     show(" ");
                                     show(st2[0]);
                                     show(" ");
                                     pass(word);
                             }
                             number /= 10;
                             break;

                     case 3:
                             word = number % 100;
                             if (word != 0) {
                                     show(" ");
                                     show(st2[1]);
                                     show(" ");
                                     pass(word);
                             }
                             number /= 100;
                             break;

                     case 4:
                             word = number % 100;
                             if (word != 0) {
                                     show(" ");
                                     show(st2[2]);
                                     show(" ");
                                     pass(word);
                             }
                             number /= 100;
                             break;

                     case 5:
                             word = number % 100;
                             if (word != 0) {
                                     show(" ");
                                     show(st2[3]);
                                     show(" ");
                                     pass(word);
                             }
                             number /= 100;
                             break;

                     }
                     n++;
             }
             return string;
     }

     public void pass(int number) {
             int word, q;
             if (number < 10) {
                     show(st1[number]);
             }
             if (number > 9 && number < 20) {
                     show(st3[number - 10]);
             }
             if (number > 19) {
                     word = number % 10;
                     if (word == 0) {
                             q = number / 10;
                             show(st4[q - 2]);
                     } else {
                             q = number / 10;
                             show(st1[word]);
                             show(" ");
                             show(st4[q - 2]);
                     }
             }
     }

     public void show(String s) {
             String st;
             st = string;
             string = s;
             string += st;
     }
	 
	 
		public void onCreate(Bundle savedInstanceState) 
		 {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.prplay) ;
			this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
			
			
	
			 			
			
			first = (TextView) findViewById(R.id.first);
			second = (TextView) findViewById(R.id.second);
			plus = (TextView) findViewById(R.id.plus) ;
			message = (TextView) findViewById(R.id.message);
			result = (EditText) findViewById(R.id.result);
			ok = (Button) findViewById(R.id.ok);
			h1=(Button) findViewById(R.id.h1);
			h2=(Button) findViewById(R.id.h2);
			h3=(Button) findViewById(R.id.h3);
			
			
		    //dropTable2();
		    createTable2();
		    			
		    insertIntoTable2(1, 0, 0) ;	
		    

				Random randomGenerator = new Random();
				r = randomGenerator.nextInt(2);
				
			if (r==0)
			{
				plus.setText("+") ;
							
				a = randomGenerator.nextInt(10)+j;
				b = randomGenerator.nextInt(6)+j;
				    
				first.setText("" + a) ;
				second.setText("" + b)   ;
				d = a+b ;
				             
								
					ok.setOnClickListener(new View.OnClickListener() 
					{				
						
						public void onClick(View v)						
						{
									

						       
							if (lose==3)
							{
								//setup sound									  
								sound = MediaPlayer.create(prplay.this, R.raw.trombone) ;
						        sound.start() ;
								message.setText("Λυπάμαι, έχασες!");
								result.setText("");
								lose=0;
								insertIntoTable2(0, 0, 1) ;								
								state=3;
							}
								
							else if (state==3)
							{
								
							}
							
								
									else if (state==1)
									{
										
										String c  ;			          
										c = result.getText().toString().replace(" ","").toLowerCase();;
										
										
										// ChHECK IF INPUT IS NUMERIC 
										try 
										{
											Integer.parseInt(c);
											Toast.makeText(getApplicationContext(), "Δώσε την απάντηση ολογράφως στα αγγλικά.", Toast.LENGTH_LONG).show();
											result.setText("");	    
										}
										catch (NumberFormatException e) 
										{
										   // s is not numeric
											
											
										prplay w = new prplay();										
										String inwords = w.convert(d);
							             
											if (c.equals(inwords)) 
												{
													message.setText("Σωστό!") ;

													//setup sound									  
											        sound = MediaPlayer.create(prplay.this, R.raw.win) ;
											        sound.start() ;
											        insertIntoTable2(0, 1, 0) ;
												}   
											else
											{
												message.setText("Λάθος, η σωστή απάντηση είναι:  " + inwords);	
												//setup sound									  
												sound = MediaPlayer.create(prplay.this, R.raw.lose) ;
										        sound.start() ;
												lose = lose + 1 ;
													if (lose==1)
													{
														h1.setVisibility(View.INVISIBLE);													
													}
													else if (lose==2)
													{
														h2.setVisibility(View.INVISIBLE);
													}
													else if (lose==3)
													{
														h3.setVisibility(View.INVISIBLE);
													}
											}
										state = 0;
										}
									}
					
									else if (state==0)
									{	
										//setup sound
										final MediaPlayer ButtonClick = MediaPlayer.create(prplay.this , R.raw.click) ;
										ButtonClick.start() ;
										result.setText("");
										message.setText("") ;
									
											Random randomGenerator = new Random();
											r = randomGenerator.nextInt(2);

												if (r==0)
												{
													plus.setText("+") ;
													a = randomGenerator.nextInt(10)+j;
													b = randomGenerator.nextInt(6)+j;
										    
													first.setText("" + a) ;
													second.setText("" + b)   ;
													d = a+b ;
												}
												else
												{
													plus.setText("-") ;
										        
													a = randomGenerator.nextInt(10)+j;
													b = randomGenerator.nextInt(6)+j;
														if(a>b)
														{
															first.setText("" + a) ;
															second.setText("" + b)   ;
															d = a-b ;		
														}
														else
														{
															first.setText("" + b) ;
															second.setText("" + a)   ;
															d = b-a ;
														}													
												}	
												state = 1 ;
											}								
									j=j+2 ;	
									
						}
							
					});																		
			}							
			else
			{
				plus.setText("-") ;
								        
				a = randomGenerator.nextInt(10)+j;
				b = randomGenerator.nextInt(6)+j;
			    

					if(a>b)
					{
						first.setText("" + a) ;
						second.setText("" + b)   ;
						d = a-b ;
					}
					else
					{
						first.setText("" + b) ;
						second.setText("" + a)   ;
						d = b-a ;
					}
									
				ok.setOnClickListener(new View.OnClickListener() 
				{
					public void onClick(View v) 
					{ 	
						if (lose==3)
						{
							//setup sound									  
							sound = MediaPlayer.create(prplay.this, R.raw.trombone) ;
					        sound.start() ;
							message.setText("Λυπάμαι, έχασες!");
							result.setText("");
							lose=0;
							insertIntoTable2(0, 0, 1) ;							
						}
						
						else if (state==3)
						{
								
						}				
						
							else if (state==1)
							{
								String c  ;			          
								c = result.getText().toString().replace(" ","").toLowerCase(); ;
								
							
								
								// ChHECK IF INPUT IS NUMERIC 
								try 
								{
									Integer.parseInt(c);
									Toast.makeText(getApplicationContext(), "Δεν επιτρέπονται αριθμοί.", Toast.LENGTH_LONG).show();
									result.setText("");	    
								}
								catch (NumberFormatException e) 
								{
								   // s is not numeric
									
								
								prplay w = new prplay();							
								String inwords = w.convert(d);
					             
									if (c.equals(inwords))  
										{
											message.setText("Σωστό!") ;
											//setup sound									  
									        sound = MediaPlayer.create(prplay.this, R.raw.win) ;
									        sound.start() ;
												
											insertIntoTable2(0, 1, 0) ;
										}   
									else
									{
										message.setText("Λάθος,	η σωστή απάντηση είναι:  " + inwords);	
										//setup sound									  
								        sound = MediaPlayer.create(prplay.this, R.raw.lose) ;
								        sound.start() ;
										lose = lose + 1 ;
											if (lose==1)
											{
												h1.setVisibility(View.INVISIBLE);													
											}
											else if (lose==2)
											{
												h2.setVisibility(View.INVISIBLE);
											}
											else if (lose==3)
											{
												h3.setVisibility(View.INVISIBLE);
											}
									}
								state = 0;
							}
							}
							else if (state==0)
								{		
								//setup sound
									final MediaPlayer ButtonClick = MediaPlayer.create(prplay.this , R.raw.click) ;
									ButtonClick.start() ;
									result.setText("");
									message.setText("") ;
									
										Random randomGenerator = new Random();
										r = randomGenerator.nextInt(2);

											if (r==0)
											{
												plus.setText("+") ;
												a = randomGenerator.nextInt(10)+j;
												b = randomGenerator.nextInt(6)+j;
									    
												first.setText("" + a) ;
												second.setText("" + b)   ;
												d = a+b ;
												
											}
											else
											{
												plus.setText("-") ;
									        
												a = randomGenerator.nextInt(10)+j;
												b = randomGenerator.nextInt(6)+j;
													if(a>b)
													{
														first.setText("" + a) ;
														second.setText("" + b)   ;
														d = a-b ;		
													}
													else
													{
														first.setText("" + b) ;
														second.setText("" + a)   ;
														d = b-a ;
													}												
											}
											state = 1 ;
										}								
								j=j+2 ;	
					}								
				});							
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
