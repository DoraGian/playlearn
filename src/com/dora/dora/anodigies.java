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


public class anodigies extends Activity {
	
	TextView odigies ; 
	
	
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.anodigies) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	
		odigies = (TextView) findViewById(R.id.odigies);
		
		odigies.setText(Html.fromHtml("Προσπαθησε να μαντέψεις σωστά τη λέξη που κρύβεται στα ανακατεμένα γράμματα!" +
				"<br><br>Προσοχή! Έχεις μόνο 3 ευκαιρίες. Εάν χάσεις ξεκινάς από την αρχή." +
				"<br><br>Οι λέξεις στις οποίες εξετάζεσαι υπάρχουν στην αντίστοιχη θεωρία."));
		
		//set up the button sound		
		final MediaPlayer mpButtonClick = MediaPlayer.create(this , R.raw.click) ;
		

		Button bGreek = (Button) findViewById(R.id.greek) ;
		
		bGreek.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub			
				odigies.setText(Html.fromHtml("Προσπαθησε να μαντέψεις σωστά τη λέξη που κρύβεται στα ανακατεμένα γράμματα!" +
						"<br><br>Προσοχή! Έχεις μόνο 3 ευκαιρίες. Εάν χάσεις ξεκινάς από την αρχή." +
						"<br><br>Οι λέξεις στις οποίες εξετάζεσαι υπάρχουν στην αντίστοιχη θεωρία."));
				mpButtonClick.start() ;
			}
		}) ;
		

				Button bEnglish = (Button) findViewById(R.id.english) ;
				
				bEnglish .setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub			
						odigies.setText(Html.fromHtml("Try to guess the word which is hidden beween the letters in the cloud !" +
								"<br><br>Attention,  you have 3 chances! Once you lose you have to start a new game." +
								"<br><br>The words  you will be examined at exist in theory."));
						mpButtonClick.start() ;
					}
				}) ;
		
		
				Button butvch5 = (Button) findViewById(R.id.butvch5) ;
				
				butvch5 .setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub			
						startActivity(new Intent("com.dora.dora.VCH5")) ;

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
