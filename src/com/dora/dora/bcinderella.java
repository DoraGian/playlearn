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

public class bcinderella extends Activity implements TextToSpeech.OnInitListener {
	
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
        t0.setText(Html.fromHtml("<img src='wolf0'> " +
        "<br>There was once a young Shepherd Boy who tended his sheep at the foot of a mountain near a dark forest." +
        " It was rather lonely for him all day, so he thought upon a plan by which he could get a little company and some " +
        "excitement. He rushed down towards the village calling out 'Wolf, Wolf,' and the villagers came out to meet him, and " +
        "some of them stopped with him for a considerable time.<br><img src='wolf1'><br> This pleased the boy so much that a few days afterwards he" +
        " tried the same trick, and again the villagers came to his help. But shortly after this a Wolf actually did come out" +
        " from the forest, and began to worry the sheep, and the boy of course cried out 'Wolf, Wolf,' still louder than before. " +
        "<br><img src='wolf2'><br>But this time the villagers, who had been fooled twice before, thought the boy was again deceiving them, and nobody " +
        "stirred to come to his help. So the Wolf made a good meal off the boy’s flock, and when the boy complained, the wise man" +
        " of the village said: " +
        " <br><b>'A liar will not be believed, even when he speaks the truth.'</b>" +
        "<br><img src='wolf3'>", new ImageGetter() {
        	
        	public Drawable getDrawable(String source) {
            Drawable drawFromPath;
            int path = bcinderella.this.getResources().getIdentifier(source, "drawable", "com.dora.dora"); 
            drawFromPath = (Drawable) bcinderella.this.getResources().getDrawable(path);
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
	   text = "There was once a young Shepherd Boy who tended his sheep at the foot of a mountain near a dark forest. " +
	   		"It was rather lonely for him all day, so he thought upon a plan by which he could get a little company and " +
	   		"some excitement. He rushed down towards the village calling out Wolf, Wolf, and the villagers came out to meet him," +
	   		" and some of them stopped with him for a considerable time. This pleased the boy so much that a few days afterwards" +
	   		" he tried the same trick, and again the villagers came to his help. But shortly after this a Wolf actually did come " +
	   		"out from the forest, and began to worry the sheep, and the boy of course cried out Wolf, Wolf, still louder than before." +
	   		" But this time the villagers, who had been fooled twice before, thought the boy was again deceiving them, and nobody stirred" +
	   		" to come to his help. So the Wolf made a good meal off the boy’s flock, and when the boy complained, the wise man of the village" +
	   		" said , A liar will not be believed, even when he speaks the truth.";

		tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
	}
}
