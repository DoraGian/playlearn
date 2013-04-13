package com.dora.dora;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;


public class gch1 extends Activity {
 
    LinearLayout Linear;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notebook) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	
		
			Linear  = (LinearLayout)findViewById(R.id.linear);	 
	        
	        TextView t0 = new TextView(this);
	        t0.setText(Html.fromHtml("<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <u>Το ρήμα Είμαι</u></h5>" +
	        		"<br>(<font color='#00FF00'>άι εμ</font>)" +
	        		"<br><h8>I    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <b>am</b>&nbsp;&nbsp; = &nbsp;&nbsp; <font color='#0000FF'>Εγώ &nbsp;&nbsp;&nbsp; <b>είμαι</font></b>" +
	        		"<br>(<font color='#00FF00'>γιου αρ</font>)" +
	        		"<br>you  &nbsp; <b>are</b>&nbsp;&nbsp; = &nbsp;&nbsp; <font color='#0000FF'>Εσύ &nbsp;&nbsp;&nbsp;&nbsp; <b>είσαι</font></b>" +
	        		"<br>(<font color='#00FF00'>χι ιζ</font>)" +
	        		"<br>He   &nbsp;&nbsp;&nbsp; <b>is</b>&nbsp;&nbsp;&nbsp;&nbsp; = &nbsp;&nbsp;<font color='#0000FF'> Αυτός &nbsp; <b>είναι</font></b>" +
	        		"<br>(<font color='#00FF00'>σι ιζ</font>)" +
	        		"<br>She  &nbsp;&nbsp; <b>is</b>&nbsp;&nbsp;&nbsp;&nbsp; = &nbsp;&nbsp; <font color='#0000FF'>Αυτή &nbsp;&nbsp; <b>είναι</font></b>" +
	        		"<br>(<font color='#00FF00'>ιτ ιζ</font>)" +
	        		"<br>It   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <b>is</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; = &nbsp;&nbsp; <font color='#0000FF'>Αυτό &nbsp;&nbsp; <b>είναι</font></b>" +
	        		"<br>(<font color='#00FF00'>γουί αρ</font>)" +
	        		"<br>We   &nbsp;&nbsp;&nbsp; <b>are</b>&nbsp;&nbsp; = &nbsp;&nbsp; <font color='#0000FF'>Εμείς &nbsp; <b>είμαστε</font></b>" +
	        		"<br>(<font color='#00FF00'>γιου αρ</font>)" +
	        		"<br>You  &nbsp;&nbsp; <b>are</b>&nbsp;&nbsp; = &nbsp;&nbsp;<font color='#0000FF'> Εσείς &nbsp; <b>είστε</font></b>" +
	        		"<br>(<font color='#00FF00'>δέι αρ</font>)" +
	        		"<br>They &nbsp; <b>are</b>&nbsp;&nbsp; = &nbsp;&nbsp;<font color='#0000FF'> Αυτοί &nbsp; <b>είναι</font></b></h8>"));	         
	        	setalign0(t0);
	        	Linear.addView(t0);
	        	
	        TextView t1 = new TextView(this);  
	        t1.setText(Html.fromHtml("<br>Στην αγγλική γλώσσα όταν κλίνουμε ένα ρήμα το ρήμα αυτό παραμένει σχεδόν ίδιο σε όλα τα πρόσωπα, σε αντίθεση με την ελληνική.</p>" +
	        		"<p>Εξαίρεση αυτού του κανόνα έιναι το ρήμα <b>be</b>(<em>είναι</em>) όπως μόλις είδαμε και το ρήμα <b>have</b>(<em>έχω</em>) (<font color='#00FF00'>χαβ</font>)που θα δούμε τώρα.</p> " +
	        		"<br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; have" +
	    			"<br> You &nbsp; have" +
	    			"<br> He &nbsp;&nbsp;&nbsp; ha<b><font color='#ff0000'><u>s</u></font></b> (<font color='#00FF00'>χαζ</font>)" +
	    			"<br> She &nbsp;&nbsp; ha<b><font color='#ff0000'><u>s</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ha<b><font color='#ff0000'><u>s</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp; have" +
	    			"<br> You &nbsp;&nbsp; have" +
	    			"<br> They &nbsp; have" +
	        		"<br><br>Σε αυτό το κεφάλαιο θα ασχοληθούμε με το πρώτο βασικό χρόνο των ρημάτων." +
	        		"Τον <u>Απλό Ενεστώτα  </u> (<b>Simple Present</b>) ." +
	        		"<br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <u>Simple Present</u></h5>" +
	        		"Ο <b>Simple Present</b> χρησιμοποιείται για μια πράξεις που εκφράζουν:" +
	    			"<br><b>1</b>) μία συνήθεια στο παρόν" +
	    			"<br><b>2</b>) μία γενική αλήθεια" +
	    			"<br><b>3</b>) επίσημα προγράμματα/δρομολόγια<font color='#ff0000'><b>*</b></font></sup>" +
	    			"<br><br>Ας δούμε λοιπόν πως κλίνονται τα ρήματα σε Simple Present." +
	    			"<br><br> <u><b>play</b></u> (<font color='#0000FF'>παίζω</font>) (<font color='#00FF00'>πλέι</font>)" +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; play" +
	    			"<br> You &nbsp; play" +
	    			"<br> He &nbsp;&nbsp;&nbsp; play<b><font color='#ff0000'><u>s</u></font></b> (<font color='#00FF00'>πλέιζ</font>)" +
	    			"<br> She &nbsp;&nbsp; play<b><font color='#ff0000'><u>s</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; play<b><font color='#ff0000'><u>s</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp; play" +
	    			"<br> You &nbsp;&nbsp; play" +
	    			"<br> They &nbsp; play" +
	    			"<br><br> <u><b>sleep</b></u> (<font color='#0000FF'>κοιμάμαι</font>) (<font color='#00FF00'>σλιπ</font>) " +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; sleep" +
	    			"<br> You &nbsp; sleep" +
	    			"<br> He &nbsp;&nbsp;&nbsp; sleep<b><font color='#ff0000'><u>s</u></font></b> (<font color='#00FF00'>σλιπς</font>)" +
	    			"<br> She &nbsp;&nbsp; sleep<b><font color='#ff0000'><u>s</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; sleep<b><font color='#ff0000'><u>s</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp; sleep" +
	    			"<br> You &nbsp;&nbsp; sleep" +
	    			"<br> They &nbsp; sleep" +
	    			"<br><br> <u><b>eat</b></u> (<font color='#0000FF'>τρώω</font>) (<font color='#00FF00'>ιτ</font>)" +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; eat" +
	    			"<br> You &nbsp; eat" +
	    			"<br> He &nbsp;&nbsp;&nbsp; eat<b><font color='#ff0000'><u>s</u></font></b> (<font color='#00FF00'>ιτς</font>)" +
	    			"<br> She &nbsp;&nbsp; eat<b><font color='#ff0000'><u>s</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; eat<b><font color='#ff0000'><u>s</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp; eat" +
	    			"<br> You &nbsp;&nbsp; eat" +
	    			"<br> They &nbsp; eat" +
	    			"<br><br>Όπως παρατηρούμε αυτά τα ρήματα έχουν κάτι κοινό.Διατηρούνται καθόλη τη διάρκεια ως έχει το απαρέμφατο," +
	    			" εκτός από το τρίτο ενικό πρόσωπο <b>(he, she, it)</b>." +
	    			"<br>Ας δούμε όμως άλλες δύο περιπτώσεις ρημάτων, στις οποίες έχουμε μία μικρή διαφορά εξαιτίας της κατάληξής τους." +
	    			"<br><br> <u><b>cry </b></u> (<font color='#0000FF'>κλαίω</font>) (<font color='#00FF00'>κράι</font>)" +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; cry " +
	    			"<br> You &nbsp; cry " +
	    			"<br> He &nbsp;&nbsp;&nbsp; cr<b><font color='#ff0000'><u>ies</u></font></b> (<font color='#00FF00'>κράιζ</font>)" +
	    			"<br> She &nbsp;&nbsp; cr<b><font color='#ff0000'><u>ies</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; cr<b><font color='#ff0000'><u>ies</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp; cry " +
	    			"<br> You &nbsp;&nbsp; cry " +
	    			"<br> They &nbsp; cry " +
	    			"<br><br> <u><b> study </b></u> (<font color='#0000FF'>διαβάζω</font>) (<font color='#00FF00'>στάντι</font>)" +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  study " +
	    			"<br> You &nbsp;  study " +
	    			"<br> He &nbsp;&nbsp;&nbsp;  stud<b><font color='#ff0000'><u>ies</u></font></b> (<font color='#00FF00'>στάντιζ</font>)" +
	    			"<br> She &nbsp;&nbsp;  stud<b><font color='#ff0000'><u>ies</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  stud<b><font color='#ff0000'><u>ies</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp;  study " +
	    			"<br> You &nbsp;&nbsp;  study " +
	    			"<br> They &nbsp;  study " +
	    			"<br><br> <u><b> try </b></u> (<font color='#0000FF'>προσπαθώ</font>) (<font color='#00FF00'>τράι</font>)" +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  try " +
	    			"<br> You &nbsp;  try " +
	    			"<br> He &nbsp;&nbsp;&nbsp;  tr<b><font color='#ff0000'><u>ies</u></font></b> (<font color='#00FF00'>τράιζ</font>)" +
	    			"<br> She &nbsp;&nbsp;  tr<b><font color='#ff0000'><u>ies</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  tr<b><font color='#ff0000'><u>ies</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp;  try " +
	    			"<br> You &nbsp;&nbsp;  try " +
	    			"<br> They &nbsp;  try " +
	    			"<br><br>Όπως παρατηρούμε αυτά τα ρήματα έχουν τα ρήματα αυτά έχουν κατάληξη <b>-y</b>." +
	    			"Έτσι λοιπόν κάθε ρήμα με αυτή τη κατάληξη θα κλίνεται κατά αυτό το τρόπο.Ας δούμε και τη τελευταία μας εξαίρεση." +
	    			"<br><br> <u><b> go </b></u> (<font color='#0000FF'>πηγαίνω</font>) (<font color='#00FF00'>γκόου</font>)" +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  go " +
	    			"<br> You &nbsp;  go " +
	    			"<br> He &nbsp;&nbsp;&nbsp;  go<b><font color='#ff0000'><u>es</u></font></b> (<font color='#00FF00'>γκόουζ</font>)" +
	    			"<br> She &nbsp;&nbsp;  go<b><font color='#ff0000'><u>es</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  go<b><font color='#ff0000'><u>es</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp;  go " +
	    			"<br> You &nbsp;&nbsp;  go " +
	    			"<br> They &nbsp;  go " +
	    			"<br><br> <u><b> press  </b></u> (<font color='#0000FF'>πιέζω</font>) (<font color='#00FF00'>πρες</font>)" +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  press  " +
	    			"<br> You &nbsp;  press  " +
	    			"<br> He &nbsp;&nbsp;&nbsp;  press<b><font color='#ff0000'><u>es</u></font></b> (<font color='#00FF00'>πρέσιζ</font>)" +
	    			"<br> She &nbsp;&nbsp;  press<b><font color='#ff0000'><u>es</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  press<b><font color='#ff0000'><u>es</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp;  press  " +
	    			"<br> You &nbsp;&nbsp;  press  " +
	    			"<br> They &nbsp;  press  " +
	    			"<br><br> <u><b> crash  </b></u> (<font color='#0000FF'>συντρίβω</font>) (<font color='#00FF00'>κρας</font>)" +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  crash  " +
	    			"<br> You &nbsp;  crash  " +
	    			"<br> He &nbsp;&nbsp;&nbsp;  crash<b><font color='#ff0000'><u>es</u></font></b> (<font color='#00FF00'>κράσιζ</font>)" +
	    			"<br> She &nbsp;&nbsp;  crash<b><font color='#ff0000'><u>es</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  crash<b><font color='#ff0000'><u>es</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp;  crash  " +
	    			"<br> You &nbsp;&nbsp;  crash  " +
	    			"<br> They &nbsp;  crash " +
	    			"<br><br> <u><b> teach  </b></u> (<font color='#0000FF'>διδάσκω</font>) (<font color='#00FF00'>τιτς</font>)" +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  teach  " +
	    			"<br> You &nbsp;  teach  " +
	    			"<br> He &nbsp;&nbsp;&nbsp;  teach<b><font color='#ff0000'><u>es</u></font></b> (<font color='#00FF00'>τίτσιζ</font>)" +
	    			"<br> She &nbsp;&nbsp;  teach<b><font color='#ff0000'><u>es</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  teach<b><font color='#ff0000'><u>es</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp;  teach  " +
	    			"<br> You &nbsp;&nbsp;  teach  " +
	    			"<br> They &nbsp;  teach " +
	    			"<br><br> <u><b> fix  </b></u> (<font color='#0000FF'>διορθώνω</font>) (<font color='#00FF00'>φιξ</font>)" +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  fix  " +
	    			"<br> You &nbsp;  fix  " +
	    			"<br> He &nbsp;&nbsp;&nbsp;  fix<b><font color='#ff0000'><u>es</u></font></b> (<font color='#00FF00'>φίξιζ</font>)" +
	    			"<br> She &nbsp;&nbsp;  fix<b><font color='#ff0000'><u>es</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  fix<b><font color='#ff0000'><u>es</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp;  fix  " +
	    			"<br> You &nbsp;&nbsp;  fix  " +
	    			"<br> They &nbsp;  fix " +
	    			"<br><br>Όπως παρατηρούμε αυτά τα ρήματα έχουν τα ρήματα αυτά έχουν καταλήξεις <b>-ss, -sh, -ch, -o, -x</b>." +
	    			"Έτσι λοιπόν κάθε ρήμα με αυτές τις καταλήξεις θα κλίνεται κατά αυτό το τρόπο." +
	    			"<br><br>Ο <b>Simple Present</b> συνοδεύεται συνληθως με εκφράσεις όπως :" +
	    			"<br> (<font color='#00FF00'>όφεν</font>)" +
	    			"<br><b>often</b> (<font color='#0000FF'>συχνά </font>) " +
	    			"<br> (<font color='#00FF00'>νέβερ</font>)" +
	    			"<br><b>never</b> (<font color='#0000FF'>ποτέ </font>) " +
	    			"<br> (<font color='#0000FF'>κάποιες φορές</font>)" +
	    			"<br><b>sometimes</b> " +
	    			"<br> (<font color='#00FF00'>όλγουεις</font>)" +
	    			"<br><b>always</b> (<font color='#0000FF'>πάντα</font>) " +
	    			"<br> (<font color='#00FF00'>γιούζουαλι</font>)" +
	    			"<br><b>usually</b> (<font color='#0000FF'>συνήθως</font>) " +
	    			"<br> (<font color='#00FF00'>ιν δε μόρνινγκ</font>)" +
	    			"<br><b>in the morning</b> (<font color='#0000FF'>το πρωί</font>) " +
	    			"<br> (<font color='#00FF00'>ιν δε ίβνινγκ</font>)" +
	    			"<br><b>in the evening</b> (<font color='#0000FF'>το βράδυ</font>) " +
	    			"<br> (<font color='#00FF00'>ιν δε άφτερνουν</font>)" +
	    			"<br><b>in the afternoon</b> (<font color='#0000FF'>το απόγευμα</font>) " +
	    			"<br> (<font color='#00FF00'>ον σάντει μόρνινγκ</font>)" +
	    			"<br><b>on Sunday morning</b> (<font color='#0000FF'>την Κυριακή το πρωί</font>) " +
	    			"<br> (<font color='#00FF00'>έβρι ντέι</font>)" +
	    			"<br><b>every day</b> (<font color='#0000FF'>κάθε μέρα</font>) " +
	    			"<br> (<font color='#00FF00'>έβρι γουίκ</font>)" +
	    			"<br><b>every week</b> (<font color='#0000FF'>κάθε εβδομάδα</font>) " +
	    			"<br> (<font color='#00FF00'>έβρι σάτερντει</font>)" +
	    			"<br><b>every Saturday</b> (<font color='#0000FF'>κάθε Σάββατο</font>) " +
	    			"<br> (<font color='#00FF00'>ατ νάιτ</font>)" +
	    			"<br><b>at night</b> (<font color='#0000FF'>τη νύχτα</font>)  " +
	    			"<br> (<font color='#00FF00'>ατ δε γουίκεντ</font>)" +
	    			"<br><b>at the weekend</b> (<font color='#0000FF'>το Σαββατοκύριακο</font>) " +
	    			"<br><br><br><h6>***Τέλος πρώτου κεφαλαίου***</h6>" +
	    			"<br><font color='#ff0000'>*<sub>Για παράδειγμα το δρομολόγια στο αεροδρόμιο/τρένα/λεοφωρεία.<sub></font>" +
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
