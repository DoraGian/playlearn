package com.dora.dora;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class vch3 extends Activity {
	
	LinearLayout Linear;
	
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notebook) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	
		Linear  = (LinearLayout)findViewById(R.id.linear);	 
        
        TextView t0 = new TextView(this);
        t0.setText(Html.fromHtml("<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Οι μέρες</u></h5>"));
        	setalign0(t0);
        	Linear.addView(t0);
    	
    	 TextView t1 = new TextView(this);  
	     t1.setText(Html.fromHtml("(<font color='#00FF00'>μάντει</font>) " +
	    		 "<br><b> Monday </b> (<font color='#0000FF'> Δευτέρα </font>)" +
	    	     "<br>(<font color='#00FF00'>τιούσντει</font>)" +
	    	     "<br><b> Tuesday </b> (<font color='#0000FF'> Τρίτη </font>)" +
	    	     "<br>(<font color='#00FF00'>γουέντνεσντει</font>)" +
	    	     "<br><b> Wednesday </b> (<font color='#0000FF'> Τετάρτη </font>) " +
	    	     "<br>(<font color='#00FF00'>θέρσντει</font>)" +
	    	     "<br><b> Thursday </b> (<font color='#0000FF'> Πέμπτη </font>) " +
	    	     "<br>(<font color='#00FF00'>φράιντει</font>)" +
	    	     "<br><b> Friday </b> (<font color='#0000FF'> Παρασκευή </font>) " +
	    	     "<br>(<font color='#00FF00'>σάτερντει</font>)" +
	    	     "<br><b> Saturday </b> (<font color='#0000FF'> Σάββατο </font>) " +
	    	     "<br>(<font color='#00FF00'>σάντει</font>)" +
	    	     "<br><b> Sunday </b> (<font color='#0000FF'> Κυριακή </font>)" +
	    	     "<br>(<font color='#00FF00'>ντέι</font>)" +
	    	     "<br><b> day </b> (<font color='#0000FF'> Μέρα </font>) " +
	    	     "<br>(<font color='#00FF00'>μότνινγκ</font>)" +
	    	     "<br><b> morning </b> (<font color='#0000FF'> Πρωί </font>) " +
	    	     "<br>(<font color='#00FF00'>άφτερνουν</font>)" +
	    	     "<br><b> afternoon </b> (<font color='#0000FF'> Μεσημέρι </font>) " +
	    	     "<br>(<font color='#00FF00'>ίβνινγκ</font>)" +
	    	     "<br><b> evening </b> (<font color='#0000FF'> Απόγευμα </font>) " +
	    	     "<br>(<font color='#00FF00'>νάιτ</font>)" +
	    	     "<br><b> night </b> (<font color='#0000FF'> Βράδυ </font>) " +
	    	     "<br>(<font color='#00FF00'>τουντέι</font>)" +
	    	     "<br><b> today </b> (<font color='#0000FF'> Σήμερα </font>) " +
	    	     "<br>(<font color='#00FF00'>τουμόροου</font>)" +
	    	     "<br><b> tomorrow </b> (<font color='#0000FF'> Αύριο </font>) " +
	    	     "<br>(<font color='#00FF00'>τουνάιτ</font>)" +
	    	     "<br><b> tonight </b> (<font color='#0000FF'> Σήμερα </font>) " +
	    	     "<br>(<font color='#00FF00'>γέστερντει</font>)" +
	    	     "<br><b> yesterday </b> (<font color='#0000FF'> Χθες </font>) " +
	    	     "<br>(<font color='#00FF00'>λαστ νάιτ</font>)" +
	    	     "<br><b> last night </b> (<font color='#0000FF'> Χθες βράδυ </font>) " +
	    	     "<br>(<font color='#00FF00'>λαστ γουίκ</font>)" +
	    	     "<br><b> week </b> (<font color='#0000FF'> Βδομάδα </font>) " +
	    	     "<br>(<font color='#00FF00'>γουίκεντ</font>)" +
	    	     "<br><b> weekend </b> (<font color='#0000FF'> Σαβ/κύριακο </font>) " +
	    	     "<br>(<font color='#00FF00'>ντέιλι</font>)" +
	    	     "<br><b> daily </b> (<font color='#0000FF'> Καθημερινά </font>) " +
	    	     "<br>(<font color='#00FF00'>γουίκλι</font>)" +
	    	     "<br><b> weekly </b> (<font color='#0000FF'> Εβδομαδιαία </font>) " +
	    	     "<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Οι μήνες</u></h5>" +
	    	     "<br>(<font color='#00FF00'>τζάνουερι</font>)" +
	    	     "<br><b> January </b> (<font color='#0000FF'> Ιανουάριος </font>) " + 
	    	     "<br>(<font color='#00FF00'>φεμπρουάρι</font>)" +
	    	     "<br><b> February </b> (<font color='#0000FF'> Φλεβάρης</font>) " +
	    	     "<br>(<font color='#00FF00'>μαρτς</font>)" +
	    	     "<br><b> March </b> (<font color='#0000FF'> Μάρτης</font>) " +
	    	     "<br>(<font color='#00FF00'>έιπριλ</font>)" +
	    	     "<br><b> April </b> (<font color='#0000FF'> Απρίλης</font>) " +
	    	     "<br>(<font color='#00FF00'>μέι</font>)" +
	    	     "<br><b> May </b> (<font color='#0000FF'> Μάιος</font>) " +
	    	     "<br>(<font color='#00FF00'>τζουν</font>)" +
	    	     "<br><b> June </b> (<font color='#0000FF'> Ιούνιος</font>) " +
	    	     "<br>(<font color='#00FF00'>τζουλάι</font>)" +
	    	     "<br><b> July </b> (<font color='#0000FF'> Ιούλιος</font>) " +
	    	     "<br>(<font color='#00FF00'>όγκουστ</font>)" +
	    	     "<br><b> August </b> (<font color='#0000FF'> Αύγουστος</font>) " +
	    	     "<br>(<font color='#00FF00'>σεπτέμπερ</font>)" +
	    	     "<br><b> September </b> (<font color='#0000FF'> Σεπτέμβρης</font>) " +
	    	     "<br>(<font color='#00FF00'>οκτόμπερ</font>)" +
	    	     "<br><b> October </b> (<font color='#0000FF'> Οκτώβρης</font>) " +
	    	     "<br>(<font color='#00FF00'>νοβέμπερ</font>)" +
	    	     "<br><b> November </b> (<font color='#0000FF'> Νοέμβρης</font>) " +  
	    	     "<br>(<font color='#00FF00'>ντισέμπερ</font>)" +
	    	     "<br><b> December </b> (<font color='#0000FF'> Δεκέμβριος</font>) " +
	    	     "<br>(<font color='#00FF00'>μονθ</font>)" +
	    	     "<br><b> month </b> (<font color='#0000FF'> Μήνας</font>) " +
	    	     "<br>(<font color='#00FF00'>γίαρ</font>)" +
	    	     "<br><b> year </b> (<font color='#0000FF'> Χρόνος</font>) " +
	    	     "<br>(<font color='#00FF00'>μονθλι</font>)" +
	    	     "<br><b> monthly </b> (<font color='#0000FF'> Μηνιαία</font>) " +
	    	     "<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Οι εποχές</u></h5>" +
	    	     "<br>(<font color='#00FF00'>γουίντερ</font>)" +
	    	     "<br><b> Winter </b> (<font color='#0000FF'> Χειμώνας</font>) " +  
	    	     "<br>(<font color='#00FF00'>σπρινγκ</font>)" +
	    	     "<br><b> Spring </b> (<font color='#0000FF'> ’νοιξη</font>) " +
	    	     "<br>(<font color='#00FF00'>σάμερ</font>)" +
	    	     "<br><b> Summer </b> (<font color='#0000FF'> Καλοκαίρι</font>) " +
	    	     "<br>(<font color='#00FF00'>ότομν</font>)" +
	    	     "<br><b> Autumn </b> (<font color='#0000FF'> Φθινόπωρο</font>) " +
	    	     "<br>(<font color='#00FF00'>σίζον</font>)" +
	    	     "<br><b> Season </b> (<font color='#0000FF'> Εποχή</font>) " +
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
