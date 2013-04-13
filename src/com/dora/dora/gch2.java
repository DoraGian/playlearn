package com.dora.dora;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class gch2 extends Activity {
	
	LinearLayout Linear;
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notebook) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		
		Linear  = (LinearLayout)findViewById(R.id.linear);	 
        
        TextView t0 = new TextView(this);
        t0.setText(Html.fromHtml("<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Present Continuous</u></h5>"));
        setalign0(t0);
   		Linear.addView(t0);
   		
   		TextView t1 = new TextView(this);
   		t1.setText(Html.fromHtml("Ο <b>Present Continuous</b> (Ενεστώτας διαρκείας) " +
   				"είναι ένας από τους 12 χρόνους στην Αγγλική γλώσσα. Στην Ελληνική γλώσσα οι χρόνοι είναι 8." +
   				"<br><br>Ο <b>Present Continuous</b> χρησιμοποιείται για πράξεις που :" +
    			"<br><b>1</b>) γίνονται τη στιγμή που μιλάμε." +
    			"<br><b>2</b>) θα γίνουν στο πολύ κοντινό μέλλον<sup><font color='#ff0000'>*</font></sup> ." +
    			"<br><b>3</b>) είναι προσωρινή συνήθεια<sup><font color='#ff0000'>**</font></sup>." +
    			"<br><b>4</b>) είναι εκνευριστική συνήθεια." +
    			"<br><br>Ο Ενεστώτας διαρκείας σχηματίζεται με τη βοήθεια του ρήματος <b>be</b> που μάθαμε στο προηγούμενο κεφάλαιο -<b>ing</b>." +
    			"Ας δούμε μεροικά παραδείγματα :" +
    			"<br><br> <u><b>stay</b></u> (<font color='#0000FF'>μένω</font>) <(<font color='#00FF00'>στέι</font>)br>" +
    			"<br>I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>am</b></font>&nbsp;&nbsp;&nbsp;stay<b><font color='#ff0000'><u>ing</u></font></b> (<font color='#00FF00'>στέινγκ</font>)" +
    			"<br>You &nbsp;<font color='#ff0000'><b>are</b></font>&nbsp;&nbsp; stay<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>He &nbsp;&nbsp; <font color='#ff0000'><b>is</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;stay<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>She &nbsp; <font color='#ff0000'><b>is</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;stay<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>It &nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>is&nbsp;&nbsp;&nbsp;</b></font>&nbsp;&nbsp;stay<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>We &nbsp;&nbsp; <font color='#ff0000'><b>are</b></font>&nbsp;&nbsp;stay<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>You &nbsp; <font color='#ff0000'><b>are</b></font>&nbsp;&nbsp;stay<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>They <font color='#ff0000'><b>are</b></font>&nbsp;&nbsp;stay<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br><br> <u><b>clean</b></u> (<font color='#0000FF'>καθαρίζω</font>) (<font color='#00FF00'>κλιν</font>)<br>" +
    			"<br>I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>am</b></font>&nbsp;&nbsp;&nbsp;clean<b><font color='#ff0000'><u>ing</u></font></b> (<font color='#00FF00'>κλινινγκ</font>)" +
    			"<br>You &nbsp;<font color='#ff0000'><b>are</b></font>&nbsp;&nbsp; clean<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>He &nbsp;&nbsp; <font color='#ff0000'><b>is</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;clean<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>She &nbsp; <font color='#ff0000'><b>is</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;clean<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>It &nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>is&nbsp;&nbsp;&nbsp;</b></font>&nbsp;&nbsp;clean<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>We &nbsp;&nbsp; <font color='#ff0000'><b>are</b></font>&nbsp;&nbsp;clean<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>You &nbsp; <font color='#ff0000'><b>are</b></font>&nbsp;&nbsp;clean<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>They <font color='#ff0000'><b>are</b></font>&nbsp;&nbsp;clean<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br><br>Όπως και στον Απλό Ενεστώτα έτσι και εδώ έχουμε κάποιες μικρές εξαιρέσεις:" +
    			"<br><br>Τα ρήματα που τελειώνουν σε <b>–ie</b> μετατρέπουν το –ie σε <u>–y</u> και μετά παίρνουν την κατάληξη -ing." +
    			"<br><br> <u><b>lie</b></u> (<font color='#0000FF'>ξαπλώνω</font>) (<font color='#00FF00'>λάι</font>)<br>" +
    			"<br>I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'>am</font>&nbsp;&nbsp;&nbsp;li<font color='#ff0000'><u><b>y</b>ing</u></font> (<font color='#00FF00'>λάινγκ</font>)" +
    			"<br>You &nbsp;<font color='#ff0000'>are</font>&nbsp;&nbsp; li<font color='#ff0000'><u><b>y</b>ing</u></font>" +
    			"<br>He &nbsp;&nbsp; <font color='#ff0000'>is</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;li<font color='#ff0000'><u><b>y</b>ing</u></font>" +
    			"<br>She &nbsp; <font color='#ff0000'>is</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;li<font color='#ff0000'><u><b>y</b>ing</u></font>" +
    			"<br>It &nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'>is&nbsp;&nbsp;&nbsp;</font>&nbsp;&nbsp;li<font color='#ff0000'><u><b>y</b>ing</u></font>" +
    			"<br>We &nbsp;&nbsp; <font color='#ff0000'>are</font>&nbsp;&nbsp;li<font color='#ff0000'><u><b>y</b>ing</u></font>" +
    			"<br>You &nbsp; <font color='#ff0000'>are</font>&nbsp;&nbsp;li<font color='#ff0000'><u><b>y</b>ing</u></font>" +
    			"<br>They <font color='#ff0000'>are</font>&nbsp;&nbsp;li<font color='#ff0000'><u><b>y</b>ing</u></font>" +
    			"<br><br>Τα ρήματα που τελειώνουν σε <b>–l</b> το διπλασιάζουν και μετά παίρνουν την κατάληξη -ing." +
    			"<br><br> <u><b>travel</b></u> (<font color='#0000FF'>ταξιδεύω</font>) (<font color='#00FF00'>τράβελ</font>)<br>" +
    			"<br>I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'>am</font>&nbsp;&nbsp;&nbsp;travel<font color='#ff0000'><u><b>l</b>ing</u></font>  (<font color='#00FF00'>τράβελινγκ</font>)" +
    			"<br>You &nbsp;<font color='#ff0000'>are</font>&nbsp;&nbsp; travel<font color='#ff0000'><u><b>l</b>ing</u></font>" +
    			"<br>He &nbsp;&nbsp; <font color='#ff0000'>is</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;travel<font color='#ff0000'><u><b>l</b>ing</u></font>" +
    			"<br>She &nbsp; <font color='#ff0000'>is</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;travel<font color='#ff0000'><u><b>l</b>ing</u></font>" +
    			"<br>It &nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'>is&nbsp;&nbsp;&nbsp;</font>&nbsp;&nbsp;travel<font color='#ff0000'><u><b>l</b>ing</u></font>" +
    			"<br>We &nbsp;&nbsp; <font color='#ff0000'>are</font>&nbsp;&nbsp;travel<font color='#ff0000'><u><b>l</b>ing</u></font>" +
    			"<br>You &nbsp; <font color='#ff0000'>are</font>&nbsp;&nbsp;travel<font color='#ff0000'><u><b>l</b>ing</u></font>" +
    			"<br>They <font color='#ff0000'>are</font>&nbsp;&nbsp;travel<font color='#ff0000'><u><b>l</b>ing</u></font>" +
    			"<br><br>Τα ρήματα που τελειώνουν σε <b>-e</b> (ένα –e, όχι δύο)<u> χάνουν το –e</u> και μετά παίρνουν την κατάληξη -ing." +
    			"<br><br> <u><b>take</b></u> (<font color='#0000FF'>παίρνω</font>) (<font color='#00FF00'>τέικ</font>)<br>" +
    			"<br>I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>am</b></font>&nbsp;&nbsp;&nbsp;tak<b><font color='#ff0000'><u>ing</u></font></b> (<font color='#00FF00'>τέικινγκ</font>)" +
    			"<br>You &nbsp;<font color='#ff0000'><b>are</b></font>&nbsp;&nbsp; tak<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>He &nbsp;&nbsp; <font color='#ff0000'><b>is</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tak<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>She &nbsp; <font color='#ff0000'><b>is</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tak<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>It &nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>is&nbsp;&nbsp;&nbsp;</b></font>&nbsp;&nbsp;tak<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>We &nbsp;&nbsp; <font color='#ff0000'><b>are</b></font>&nbsp;&nbsp;tak<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>You &nbsp; <font color='#ff0000'><b>are</b></font>&nbsp;&nbsp;tak<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>They <font color='#ff0000'><b>are</b></font>&nbsp;&nbsp;tak<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br><br>Τα ρήματα με περισσότερες από μία συλλαβές, των οποίων όμως η τελευταία συλλαβή τελειώνει σε σύμφωνο και πριν έχει ένα μόνο φωνήεν, <b>διπλασιάζουν το τελικό σύμφωνο</b>." +
    			"<br><br> <u><b>stop</b></u> (<font color='#0000FF'>σταματάω</font>) (<font color='#00FF00'>στοπ</font>)<br>" +
    			"<br>I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'>am</font>&nbsp;&nbsp;&nbsp;stop<font color='#ff0000'><u><b>p</b>ing</u></font> (<font color='#00FF00'>στοπινγκ</font>)" +
    			"<br>You &nbsp;<font color='#ff0000'>are</font>&nbsp;&nbsp; stop<font color='#ff0000'><u><b>p</b>ing</u></font>" +
    			"<br>He &nbsp;&nbsp; <font color='#ff0000'>is</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;stop<font color='#ff0000'><u><b>p</b>ing</u></font>" +
    			"<br>She &nbsp; <font color='#ff0000'>is</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;stop<font color='#ff0000'><u><b>p</b>ing</u></font>" +
    			"<br>It &nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'>is&nbsp;&nbsp;&nbsp;</font>&nbsp;&nbsp;stop<font color='#ff0000'><u><b>p</b>ing</u></font>" +
    			"<br>We &nbsp;&nbsp; <font color='#ff0000'>are</font>&nbsp;&nbsp;stop<font color='#ff0000'><u><b>p</b>ing</u></font>" +
    			"<br>You &nbsp; <font color='#ff0000'>are</font>&nbsp;&nbsp;stop<font color='#ff0000'><u><b>p</b>ing</u></font>" +
    			"<br>They <font color='#ff0000'>are</font>&nbsp;&nbsp;stop<font color='#ff0000'><u><b>p</b>ing</u></font>" +
    			"<br><br>Ο <b>Present Continuous</b> συνοδεύεται συνληθως με εκφράσεις όπως :" +
    			"<br> (<font color='#00FF00'>νάου</font>)" +
    			"<br><b>now </b> (<font color='#0000FF'>τώρα</font>) " +
    			"<br> (<font color='#00FF00'>ατ δε μόμεντ</font>)" +
    			"<br><b>at the moment</b> (<font color='#0000FF'>αυτή τη στιγμή</font>) " +
    			"<br> (<font color='#00FF00'>στιλ</font>)" +
    			"<br><b>still </b> (<font color='#0000FF'>ακόμα</font>) " +
    			"<br> (<font color='#00FF00'>φορ δε τάιμ μπίινγκ</font>)" +
    			"<br><b>for the time being </b> (<font color='#0000FF'>για τώρα</font>) " +
    			"" +
    			"<br><br><br><h6>***Τέλος δεύτερου κεφαλαίου***</h6>" +
    			"<br><font color='#ff0000'><sup>*</sup>Ορίζεται από τον ομιλητή και εξαρτάται από το που αναφέρεται.</font>" +
    			"<br><font color='#ff0000'><sup>**</sup>Για παράδειγμα 'Έχω μόνο απογευματινά μαθήματα αυτή τη βδομάδα'.Αλλά μόνο για αυτή την εβδομάδα.</font>" +
    			"<br>."));
   		setalign1(t1);
   		Linear.addView(t1);
   		
		}
	
	
    // THIS FUNCTION SETS COLOR AND PADDING FOR THE TEXTVIEWS 
    public void setalign0(TextView t){    
        t.setPadding(80, 0, 0, 0);

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
