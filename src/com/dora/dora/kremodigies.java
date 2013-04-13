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

public class kremodigies extends Activity {

	TextView odigies ; 

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kremodigies) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		odigies = (TextView) findViewById(R.id.odigies);
		
		odigies.setText(Html.fromHtml("Προσπάθησε να μαντέψεις τα σωστά γράμματα για να ανακαλύψεις τη κρυφή λέξη!" +
				"<br><br>Προσοχή!   Έχεις 6 ευκαιρίες.πρωτού βρεθείς στη κρεμάλα!" +
				"<br><br>Οι λέξεις στις οποίες εξετάζεσαι υπάρχουν στην αντίστοιχη θεωρία."));
		
		//set up the button sound		
		final MediaPlayer mpButtonClick = MediaPlayer.create(this , R.raw.click) ;
		

		Button bGreek = (Button) findViewById(R.id.greek) ;
		
		bGreek.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub			
				odigies.setText(Html.fromHtml("Προσπάθησε να μαντέψεις τα σωστά γράμματα για να ανακαλύψεις τη κρυφή λέξη!" +
						"<br><br>Προσοχή!   Έχεις 6 ευκαιρίες.πρωτού βρεθείς στη κρεμάλα!" +
						"<br><br>Οι λέξεις στις οποίες εξετάζεσαι υπάρχουν στην αντίστοιχη θεωρία."));
				mpButtonClick.start() ;
			}
		}) ;
		

				Button bEnglish = (Button) findViewById(R.id.english) ;
				
				bEnglish .setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub			
						odigies.setText(Html.fromHtml("Try to guess the letters so that you will find out the hidden word!" +
								"<br><br>Attention,  you have 6 chances before you will be ‘hunted’." +
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
