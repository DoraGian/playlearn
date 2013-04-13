package com.dora.dora;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class vch4 extends Activity {
	
	LinearLayout Linear;
	
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notebook) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	
Linear  = (LinearLayout)findViewById(R.id.linear);	 
        
        TextView t0 = new TextView(this);
        t0.setText(Html.fromHtml("<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Χρώματα</u></h5>"));
        	setalign0(t0);
        	Linear.addView(t0);
    	
    	 TextView t1 = new TextView(this);  
	     t1.setText(Html.fromHtml("(<font color='#00FF00'>όραντζ</font>) " +
	    		 "<br><b> orange </b> (<font color='#0000FF'> πορτοκαλί </font>)" +
	    	     "<br>(<font color='#00FF00'>πινκ</font>)" +
	    	     "<br><b> pink </b> (<font color='#0000FF'> ροζ </font>)" +
	    	     "<br>(<font color='#00FF00'>περπλ</font>)" +
	    	     "<br><b> purple </b> (<font color='#0000FF'> μωβ </font>) " +
	    	     "<br>(<font color='#00FF00'>μπλου</font>)" +
	    	     "<br><b> blue </b> (<font color='#0000FF'> μπλε </font>) " +
	    	     "<br>(<font color='#00FF00'>γέλοου</font>)" +
	    	     "<br><b> yellow </b> (<font color='#0000FF'> κίτρινο </font>) " +
	    	     "<br>(<font color='#00FF00'>ρεντ</font>)" +
	    	     "<br><b> red </b> (<font color='#0000FF'> κόκκινο </font>) " +
	    	     "<br>(<font color='#00FF00'>μπλακ</font>)" +
	    	     "<br><b> black </b> (<font color='#0000FF'> μαύρο </font>)" +
	    	     "<br>(<font color='#00FF00'>μπράουν</font>)" +
	    	     "<br><b> brown </b> (<font color='#0000FF'> καφέ </font>) " +
	    	     "<br>(<font color='#00FF00'>γκρέι</font>)" +
	    	     "<br><b> gray </b> (<font color='#0000FF'> γκρι </font>) " +
	    	     "<br>(<font color='#00FF00'>γουάιτ</font>)" +
	    	     "<br><b> white </b> (<font color='#0000FF'> άσπρο </font>) " +
	    	     "<br>(<font color='#00FF00'>γκριν</font>)" +
	    	     "<br><b> green </b> (<font color='#0000FF'> πράσινο </font>) " +
	    	     "<br>(<font color='#00FF00'>σίλβερ</font>)" +
	    	     "<br><b> silver </b> (<font color='#0000FF'> ασημένιο </font>) " +
	    	     "<br>(<font color='#00FF00'>γκολντ</font>)" +
	    	     "<br><b> gold </b> (<font color='#0000FF'> χρυσό </font>) " +	    	     
	    	     "<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Σχήματα</u></h5>" +
	    	     "<br>(<font color='#00FF00'>σκουέαρ</font>)" +
	    	     "<br><b> square </b> (<font color='#0000FF'> τετράγωνο </font>) " + 
	    	     "<br>(<font color='#00FF00'>σιρκλ</font>)" +
	    	     "<br><b> circle </b> (<font color='#0000FF'> κύκλος </font>) " +
	    	     "<br>(<font color='#00FF00'>τρίανγκλ</font>)" +
	    	     "<br><b> triangle </b> (<font color='#0000FF'> τρίγωνο </font>) " +
	    	     "<br>(<font color='#00FF00'>ρεκτάνγκλ</font>)" +
	    	     "<br><b> rectangle </b> (<font color='#0000FF'> ορθογώνιο </font>) " +
	    	     "<br>(<font color='#00FF00'>οβάλ</font>)" +
	    	     "<br><b> oval </b> (<font color='#0000FF'> οβάλ </font>) " +
	    	     "<br>(<font color='#00FF00'>όκταγκον</font>)" +
	    	     "<br><b> octagon </b> (<font color='#0000FF'> οκτάγωνο </font>) " +
	    	     "<br>(<font color='#00FF00'>κιουμπ</font>)" +
	    	     "<br><b> cube </b> (<font color='#0000FF'> κύβος </font>) " +
	    	     "<br>(<font color='#00FF00'>σφερ</font>)" +
	    	     "<br><b> sphere </b> (<font color='#0000FF'> σφαίρα </font>) " +
	    	     "<br>(<font color='#00FF00'>κόουν</font>)" +
	    	     "<br><b> cone </b> (<font color='#0000FF'> κώνος </font>) " +
	    	     "<br>(<font color='#00FF00'>σίλιντερ</font>)" +
	    	     "<br><b> cylinder </b> (<font color='#0000FF'> κύλινδρος </font>) " +	    	    
	    	     "<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Κατευθύνσεις</u></h5>" +
	    	     "<br>(<font color='#00FF00'>νορθ</font>)" +
	    	     "<br><b> North </b> (<font color='#0000FF'> βόρεια</font>) " +  
	    	     "<br>(<font color='#00FF00'>σάουθ</font>)" +
	    	     "<br><b> South </b> (<font color='#0000FF'> νότια</font>) " +
	    	     "<br>(<font color='#00FF00'>ιστ</font>)" +
	    	     "<br><b> East </b> (<font color='#0000FF'> ανατολικά</font>) " +
	    	     "<br>(<font color='#00FF00'>γουέστ</font>)" +
	    	     "<br><b> West </b> (<font color='#0000FF'> δυτικά</font>) " +
	    	     "<br>(<font color='#00FF00'>ράιτ</font>)" +
	    	     "<br><b> right </b> (<font color='#0000FF'> δεξιά</font>) " +
	    	     "<br>(<font color='#00FF00'>λεφτ</font>)" +
	    	     "<br><b> left </b> (<font color='#0000FF'> αριστερά</font>) " + 
	    	     "<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Ο καιρός</u></h5>" +
	    	     "<br>(<font color='#00FF00'>χάου ιζ δε γουέδερ τουντέι?</font>)" +
	    	     "<br><b> How is the weather today? </b> (<font color='#0000FF'> Πώς είναι ο καιρός σήμερα?</font>) " +  
	    	     "<br>(<font color='#00FF00'>ιτ λουκςλάικ ρέιν</font>)" +
	    	     "<br><b> It looks like rain. </b> (<font color='#0000FF'> Φαίνεται θα βρέξει</font>) " +
	    	     "<br>(<font color='#00FF00'>ιτ ιζ κολντ</font>)" +
	    	     "<br><b> It is cold </b> (<font color='#0000FF'> Κάνει κρύο</font>) " +
	    	     "<br>(<font color='#00FF00'>χοτ</font>)" +
	    	     "<br><b> hot </b> (<font color='#0000FF'> ζεστά (πολύ)</font>) " +
	    	     "<br>(<font color='#00FF00'>κλίαρ</font>)" +
	    	     "<br><b> clear </b> (<font color='#0000FF'> καθαρά</font>) " + 
	    	     "<br>(<font color='#00FF00'>άισι</font>)" +
	    	     "<br><b> icy </b> (<font color='#0000FF'> παγωμένα</font>) " + 
	    	     "<br>(<font color='#00FF00'>γουάρμ</font>)" +
	    	     "<br><b> warm </b> (<font color='#0000FF'> ζεστά</font>) " + 
	    	     "<br>(<font color='#00FF00'>γουίντι</font>)" +
	    	     "<br><b> windy </b> (<font color='#0000FF'> ανεμώδης</font>) " + 
	    	     "<br>(<font color='#00FF00'>κλάουντι</font>)" +
	    	     "<br><b> cloudy </b> (<font color='#0000FF'> συννεφιά</font>) " + 
	    	     "<br>(<font color='#00FF00'>μάγκι</font>)" +
	    	     "<br><b> muggy </b> (<font color='#0000FF'> κουφόβραση</font>) " + 
	    	     "<br>(<font color='#00FF00'>χιούμιντ</font>)" +
	    	     "<br><b> humid </b> (<font color='#0000FF'> υγρασία</font>) " + 
	    	     "<br>(<font color='#00FF00'>φόγκι</font>)" +
	    	     "<br><b> foggy </b> (<font color='#0000FF'> ομιχλώδης</font>) " + 
	    	     "<br>(<font color='#00FF00'>ιτ ιζ σνόουινγκ</font>)" +
	    	     "<br><b> It is snowing </b> (<font color='#0000FF'> Χιονίζει</font>) " + 
	    	     "<br>(<font color='#00FF00'>ιτ ιζ ρέινινγκ</font>)" +
	    	     "<br><b> It is raining </b> (<font color='#0000FF'> Βρέχει</font>) " + 
	    	     "<br>(<font color='#00FF00'>ιτ ιζ φρίζινγκ</font>)" +
	    	     "<br><b> It is freezing </b> (<font color='#0000FF'> Κάνει κρύο</font>) " + 
	    		 "<br><br><br> <h6>***Τέλος τρίτου κεφαλαίου***</h6>"));
	     
	       setalign1(t1);
       		Linear.addView(t1);
	
		}
	

    // THIS FUNCTION SETS COLOR AND PADDING FOR THE TEXTVIEWS 
    public void setalign0(TextView t){    
        t.setPadding(30, 0, 0, 0);

    }
    
 // THIS FUNCTION SETS COLOR AND PADDING FOR THE TEXTVIEWS 
    public void setalign1(TextView t){    
        t.setPadding(55, 0, 10, 0);

    }
    public void onBackPressed() 
    {
    super.onBackPressed();
    finish();
    } 
 
}

