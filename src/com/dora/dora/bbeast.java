package com.dora.dora;

import java.util.Locale;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.text.Html;
import android.text.Html.ImageGetter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class bbeast extends Activity implements TextToSpeech.OnInitListener {
/** Called when the activity is first created. */

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
			// button on click event
			btnSpeak.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) 
			{								
				tts.stop() ;			
			}
			});
			
							
				
		Linear  = (LinearLayout)findViewById(R.id.linear);	 
		
        
        TextView t0 = new TextView(this);
        t0.setText(Html.fromHtml("<img src='ant0'>" +
        " 	 <br>In a field one summer's day a Grasshopper was hopping about, chirping and singing to its heart's content. An Ant passed by, bearing along with great toil an ear of corn he was taking to the nest.  " +
        " 	 <br><br> -'Why not come and chat with me', said the Grasshopper, 'instead of toiling and moiling in that way?'" +
        " 	 <br><br> -'I am helping to lay up food for the winter,' said the Ant, 'and recommend you to do the same.' " +
        " 	 <br><img src='ant1'>" +
        " 	 <br><br> -'Why bother about winter?- said the Grasshopper, we have got plenty of food at present.' " +
        "	<br>But the Ant went on its way and continued its toil. When the winter came the Grasshopper had no food and found itself dying of hunger, while it saw the ants distributing every day corn and " +
        "	grain from the stores they had collected in the summer.  " +
        "  	 <br>Then the Grasshopper knew: <b>It is best to prepare for the days of necessity<b>." +
        "	<br><img src='ant2'>", new ImageGetter() {
        	
        	public Drawable getDrawable(String source) {
            Drawable drawFromPath;
            int path = bbeast.this.getResources().getIdentifier(source, "drawable", "com.dora.dora"); 
            drawFromPath = (Drawable) bbeast.this.getResources().getDrawable(path);
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
		// Don't forget to shutdown!
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

			// tts.setPitch(5); // set pitch level

			// tts.setSpeechRate(2); // set speech speed rate

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
	   text = "In a field one summer's day a Grasshopper was hopping about, chirping and singing to its heart's content. An Ant passed by, bearing along with great toil an ear of corn he " +
	   		"was taking to the nest. Why not come and chat with me, said the Grasshopper, instead of toiling and moiling in that way? I am helping to lay up food for the winter, said the Ant, " +
	   		"and recommend you to do the same. Why bother about winter? said the Grasshopper, we have got plenty of food at present. But the Ant went on its way and continued its toil. " +
	   		"When the winter came the Grasshopper had no food and found itself dying of hunger, while it saw the ants distributing every day corn and grain from the stores they had collected in the summer. " +
	   		"Then the Grasshopper knew: It is best to prepare for the days of necessity.";

		tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
	}
}