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

public class bred extends Activity implements OnInitListener {
	
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
        t0.setText(Html.fromHtml("<img src='lion0'> " +
        "<br>Once when a Lion was asleep a little Mouse began running up and down upon him; this soon wakened the Lion, " +
        "who placed his huge paw upon him, and opened his big jaws to swallow him.<br><img src='lion1'><br>" +
        "<br>  -'Pardon, O King,' cried the little Mouse: 'forgive me this time, I shall never forget it: who knows but what I may be able to do you a turn some of these days?'" +
        "<br>The Lion was so tickled at the idea of the Mouse being able to help him, that he lifted up his paw and let him go. Some time after the Lion was caught in a trap, " +
        "and the hunters who desired to carry him alive to the King, tied him to a tree while they went in search of a wagon to carry him on. Just then the little Mouse happened to" +
        " pass by, and seeing the sad plight in which the Lion was,<br><img src='lion2'><br> went up to him and soon gnawed away the ropes that bound the King of the Beasts. " +
        "<br>  -'Was I not right?' said the little Mouse" +
        "<br><b>Little friends may prove great friends</b>" +
        "<br><img src='lion3'>", new ImageGetter() {
        	
        	public Drawable getDrawable(String source) {
            Drawable drawFromPath;
            int path = bred.this.getResources().getIdentifier(source, "drawable", "com.dora.dora"); 
            drawFromPath = (Drawable) bred.this.getResources().getDrawable(path);
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
	   text = "Once when a Lion was asleep a little Mouse began running up and down upon him, this soon wakened the Lion, " +
	   		"who placed his huge paw upon him, and opened his big jaws to swallow him. Pardon, O King, cried the little Mouse" +
	   		" ,forgive me this time, I shall never forget it, who knows but what I may be able to do you a turn some of these " +
	   		"days? The Lion was so tickled at the idea of the Mouse being able to help him, that he lifted up his paw and let " +
	   		"him go. Some time after the Lion was caught in a trap, and the hunters who desired to carry him alive to the King," +
	   		" tied him to a tree while they went in search of a wagon to carry him on. Just then the little Mouse happened to " +
	   		"pass by, and seeing the sad plight in which the Lion was, went up to him and soon gnawed away the ropes that bound " +
	   		"the King of the Beasts. Was I not right? said the little Mouse. Little friends may prove great friends ";

		tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
	}
}
