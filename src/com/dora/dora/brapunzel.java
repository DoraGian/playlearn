package com.dora.dora;

import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.text.Html;
import android.text.Html.ImageGetter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class brapunzel extends Activity implements OnInitListener {
	
	LinearLayout Linear;
	private Button btnSpeak;
	private TextToSpeech tts;
	
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
        t0.setText(Html.fromHtml("<img src='hale0'> " +
        "<br>The Hare was once boasting of his speed before the other animals" +
        "<br>-'I have never yet been beaten,' said he, 'when I put forth my full speed. I challenge any one here to race with me.' " +
        "<br>-The Tortoise said quietly, 'I accept your challenge.'" +
        "<br>-'That is a good joke,' said the Hare; 'I could dance round you all the way.'" +
        "<br>-'Keep your boasting till you've beaten,' answered the Tortoise. 'Shall we race?'" +
        "<br>So a course was fixed and a start was made. The Hare darted almost out of sight at once, but soon stopped and," +
        " to show his contempt for the Tortoise, lay down to have a nap.<br><img src='hale1'><br> " +
        "<br>The Tortoise plodded on and plodded on, and when the Hare" +
        " awoke from his nap, he saw the Tortoise just near the winning-post and could not run up in time to save the race. Then said the Tortoise:" +
        " <br><b>Plodding wins the race.</b>" +
        "<br><img src='hale2'>", new ImageGetter() {
        	
        	public Drawable getDrawable(String source) {
            Drawable drawFromPath;
            int path = brapunzel.this.getResources().getIdentifier(source, "drawable", "com.dora.dora"); 
            drawFromPath = (Drawable) brapunzel.this.getResources().getDrawable(path);
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
	   text = "The Hare was once boasting of his speed before the other animals. I have never yet been beaten,said he," +
	   		" when I put forth my full speed. I challenge any one here to race with me. The Tortoise said quietly, I accept" +
	   		" your challenge. That is a good joke, said the Hare; I could dance round you all the way. Keep your boasting till" +
	   		" you've beaten, answered the Tortoise. Shall we race? So a course was fixed and a start was made. The Hare darted" +
	   		" almost out of sight at once, but soon stopped and, to show his contempt for the Tortoise, lay down to have a nap." +
	   		" The Tortoise plodded on and plodded on, and when the Hare awoke from his nap, he saw the Tortoise just near the " +
	   		"winning post and could not run up in time to save the race. Then said the Tortoise , Plodding wins the race. ";

		tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
	}
}
