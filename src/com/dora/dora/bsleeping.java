package com.dora.dora;

import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.text.Html;
import android.text.Html.ImageGetter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class bsleeping extends Activity implements TextToSpeech.OnInitListener {
	
	private TextToSpeech tts;
	private Button btnSpeak;
	LinearLayout Linear;
	
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		
		tts = new TextToSpeech(this, this);
		btnSpeak = (Button) findViewById(R.id.btnSpeak);
		Linear  = (LinearLayout)findViewById(R.id.linear);	 

		// button on click event
			btnSpeak.setOnClickListener(new View.OnClickListener() 
			{
				public void onClick(View arg0) 
				{
					tts.stop() ;
				}
			});	 
		

	        TextView t0 = new TextView(this);
	        t0.setText(Html.fromHtml("<img src='fox0'> " +
	        "<br>A Fox once saw a Crow fly off with a piece of cheese in its beak and settle on a branch of a tree. " +
	        "	<br>-'That's for me, as I am a Fox,' said Master Reynard, and he walked up to the foot of the tree. " +
	        "	<br>-'Good-day, Mistress Crow,' he cried. " +
	        "	<br>-'How well you are looking to-day: how glossy your feathers; how bright your eye. I feel sure your" +
	        " voice must surpass that of other birds, just as your figure does; let me hear but one song from you that I " +
	        "may greet you as the Queen of Birds." +
	        "<br>The Crow lifted up her head and began to caw her best, but the moment she opened her mouth the piece" +
	        " of cheese fell to the ground, only to be snapped up by Master Fox. " +
	        "<br><img src='fox1'><br" +
	        "	<br>-'That will do,' said he." +
	        "	<br>-'That was all I wanted. In exchange for your cheese I will give you a piece of advice for the future.'" +
	        " <br><b>Do not trust flatterers.</b>" +
	        "<br><img src='fox2'>", new ImageGetter() {
        	
        	public Drawable getDrawable(String source) {
            Drawable drawFromPath;
            int path = bsleeping.this.getResources().getIdentifier(source, "drawable", "com.dora.dora"); 
            drawFromPath = (Drawable) bsleeping.this.getResources().getDrawable(path);
            drawFromPath.setBounds(0, 0, drawFromPath.getIntrinsicWidth(), drawFromPath.getIntrinsicHeight());
            return drawFromPath;
        }
	}, null));
        
           
        
        	 setalign0(t0);
        	Linear.addView(t0);
	}

		

	 // THIS FUNCTION SETS COLOR AND PADDING FOR THE TEXTVIEWS 
    public void setalign0(TextView t){    
        t.setPadding(25, 0, 10, 0);
        t.setTextSize(13);
    }
 
    public void onBackPressed() 
	{
    super.onBackPressed();
    finish();
	}
    
    
    
    @Override
   	public void onDestroy() {
   		// We need to shutdown!
   		if (tts != null) {
   			tts.stop();
   			tts.shutdown();
   		}
   		super.onDestroy();
   	}

   	public void onInit(int status) {
   		// TODO Auto-generated method stub

   		if (status == TextToSpeech.SUCCESS) {

   			int result = tts.setLanguage(Locale.US);

   			 //tts.setPitch(5); // set pitch level

   			 //tts.setSpeechRate(2); // set speech speed rate

   			if (result == TextToSpeech.LANG_MISSING_DATA
   					|| result == TextToSpeech.LANG_NOT_SUPPORTED) {
   				Log.e("TTS", "Language is not supported");
   			} else {
   				btnSpeak.setEnabled(true);
   				speakOut();
   			}

   		} else {
   			Log.e("TTS", "Initilization Failed");
   		}

   	}

   	private void speakOut() {

   		String text;
   	   text = "A Fox once saw a Crow fly off with a piece of cheese in its beak and settle on a branch of a tree. " +
   	   		"That's for me, as I am a Fox, said Master Reynard, and he walked up to the foot of the tree. Goodday, " +
   	   		"Mistress Crow, he cried. How well you are looking today, how glossy your feather, how bright your eye." +
   	   		" I feel sure your voice must surpass that of other birds, just as your figure does, let me hear but one " +
   	   		"song from you that I may greet you as the Queen of Birds. The Crow lifted up her head and began to caw her " +
   	   		"best, but the moment she opened her mouth the piece of cheese fell to the ground, only to be snapped up by " +
   	   		"Master Fox. That will do, said he.That was all I wanted. In exchange for your cheese I will give you a piece " +
   	   		"of advice for the future. Do not trust flatterers.";

   		tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
   	}
   }

