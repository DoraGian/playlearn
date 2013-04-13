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


public class prodigies extends Activity {
	

	TextView odigies ; 
	
	protected void onCreate (Bundle savedInstanceState){
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.prodigies) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		odigies = (TextView) findViewById(R.id.odigies);
		
		odigies.setText(Html.fromHtml("Υπολόγισε σωστά τις πράξεις και δώσε τη σωστή απάντηση ολογράφως στα αγγλικά!" +
				"<br><br>Προσοχή! Έχεις μόνο 3 ευκαιρίες. Εάν χάσεις ξεκινάς από την αρχή." +
				"<br><br>Οι αριθμοί στους οποίους εξετάζεσαι υπάρχουν στην αντίστοιχη θεωρία."));

		
		//set up the button sound		
		final MediaPlayer mpButtonClick = MediaPlayer.create(this , R.raw.click) ;
		

		Button bGreek = (Button) findViewById(R.id.greek) ;
		
		bGreek.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub			
				odigies.setText(Html.fromHtml("Υπολόγισε σωστά τις πράξεις και δώσε τη σωστή απάντηση ολογράφως στα αγγλικά!" +
						"<br><br>Προσοχή! Έχεις μόνο 3 ευκαιρίες. Εάν χάσεις ξεκινάς από την αρχή." +
						"<br><br>Οι αριθμοί στους οποίους εξετάζεσαι υπάρχουν στην αντίστοιχη θεωρία."));
				mpButtonClick.start() ;
			}
		}) ;
		

				Button bEnglish = (Button) findViewById(R.id.english) ;
				
				bEnglish .setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub			
						odigies.setText(Html.fromHtml("Calculate the arithmetic operations and give the correct answer in english." +
								"<br><br>Attention, You have only 3chances. Once you lose you have to start a new game!" +
								"<br><br>The numbers you will be examined at exist in theory."));
						mpButtonClick.start() ;
					}
				}) ;
		
		
				Button butvch2 = (Button) findViewById(R.id.butvch2) ;
				
				butvch2 .setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub			
						startActivity(new Intent("com.dora.dora.VCH2")) ;

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
