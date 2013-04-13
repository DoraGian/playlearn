package com.dora.dora;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class qodigies extends Activity {
	

	TextView odigies ; 
	
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.qodigies) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		odigies = (TextView) findViewById(R.id.odigies);
		
		odigies.setText(Html.fromHtml("Εξέτασε τη γραμματική σου! Επέλεξε τη σωστή απάντηση από τις 4 επιλογές που εμφανίζονται στην οθόνη σου." +
				"<br><br>Στο τέλος του κουίζ θα δεις το σκορ σου." +
				"<br><br>Η γραμματική στην οποία εξετάζεσαι υπάρχει στην αντίστοιχη θεωρία."));
		
		//set up the button sound		
		final MediaPlayer mpButtonClick = MediaPlayer.create(this , R.raw.click) ;
		

		Button bGreek = (Button) findViewById(R.id.greek) ;
		
		bGreek.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub			
				odigies.setText(Html.fromHtml("Εξέτασε τη γραμματική σου! Επέλεξε τη σωστή απάντηση από τις 4 επιλογές που εμφανίζονται στην οθόνη σου." +
						"<br><br>Στο τέλος του κουίζ θα δεις το σκορ σου." +
						"<br><br>Η γραμματική στην οποία εξετάζεσαι υπάρχει στην αντίστοιχη θεωρία."));
				mpButtonClick.start() ;
			}
		}) ;
		

				Button bEnglish = (Button) findViewById(R.id.english) ;
				
				bEnglish .setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub			
						odigies.setText(Html.fromHtml("Test your grammar! Choose the correct answer from the 4 choices will be given." +
								"<br><br>At the end of the quiz your score will be given." +
								"<br><br>The grammar  you will be examined at exist in theory."));
						mpButtonClick.start() ;
					}
				}) ;
		
		
				Button gram = (Button) findViewById(R.id.btgram) ;
				
				gram.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub			
						startActivity(new Intent("com.dora.dora.GRAMMAR")) ;

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
