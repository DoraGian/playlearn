package com.dora.dora;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class gch4 extends Activity {
	
	LinearLayout Linear;
	
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notebook) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
	
Linear  = (LinearLayout)findViewById(R.id.linear);	 
        
        TextView t0 = new TextView(this);
        t0.setText(Html.fromHtml("<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Simple Future</u></h5>"));
        setalign0(t0);
   		Linear.addView(t0);
   		
   		TextView t1 = new TextView(this);
   		t1.setText(Html.fromHtml("<br><br>Ο <b>Simple Present</b> (Απλός Μέλλοντας) χρησιμοποιείται για να περιγράψουμε πράξεις που θα γίνουν στο μέλλον :" +
    			"<br><b>1</b>) προβλέψεις." +
    			"<br><b>2</b>) στιγμιαίες αποφάσεις" +
    			"<br><b>3</b>) υποσχέσεις" +
    			"<br><b>4</b>) απειλές" +
    			"<br><b>5</b>) προειδοποιήσεις" +
    			"<br><b>6</b>) όταν ζητούμε από κάποιον να μας κάνει κάτι" +
    			"<br><br>Ο Απλός Μέλλοντας σχηματίζεται με τη βοήθεια της λέξης <b>will</b> (θα) και το ρήμα σε απαρέμφατο." +
    			"Ας δούμε μεροικά παραδείγματα :" +
    			"<br><br> <u><b>buy</b></u> (<font color='#0000FF'>αγοράζω</font>) <(<font color='#00FF00'>μπάι</font>)<br>" +
    			"<br>I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;&nbsp;buy (<font color='#00FF00'>γουίλ μπάι</font>)" +
    			"<br>You &nbsp;<font color='#ff0000'><b>will</b></font>&nbsp;&nbsp; buy" +
    			"<br>He &nbsp;&nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;buy" +
    			"<br>She &nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;buy" +
    			"<br>It &nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>will</b>&nbsp;&nbsp;&nbsp;</font>&nbsp;&nbsp;buy" +
    			"<br>We &nbsp;&nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;buy" +
    			"<br>You &nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;buy" +
    			"<br>They <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;buy" +
    			"<br><br> <u><b>look</b></u> (<font color='#0000FF'>κοιτάζω</font>) <(<font color='#00FF00'>λουκ</font>)<br>" +
    			"<br>I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;&nbsp;look (<font color='#00FF00'>γουίλ λουκ</font>)" +
    			"<br>You &nbsp;<font color='#ff0000'><b>will</b></font>&nbsp;&nbsp; look" +
    			"<br>He &nbsp;&nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;look" +
    			"<br>She &nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;look" +
    			"<br>It &nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>will</b>&nbsp;&nbsp;&nbsp;</font>&nbsp;&nbsp;look" +
    			"<br>We &nbsp;&nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;look" +
    			"<br>You &nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;look" +
    			"<br>They <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;look" +
    			"<br><br> <u><b>wait</b></u> (<font color='#0000FF'>περιμένω</font>) <(<font color='#00FF00'>γουέιτ</font>)<br>" +
    			"<br>I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;&nbsp;wait (<font color='#00FF00'>γουίλ γουέιτ</font>)" +
    			"<br>You &nbsp;<font color='#ff0000'><b>will</b></font>&nbsp;&nbsp; wait" +
    			"<br>He &nbsp;&nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;wait" +
    			"<br>She &nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;wait" +
    			"<br>It &nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>will</b>&nbsp;&nbsp;&nbsp;</font>&nbsp;&nbsp;wait" +
    			"<br>We &nbsp;&nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;wait" +
    			"<br>You &nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;wait" +
    			"<br>They <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;wait" +
    			"<br>Ο <b>Simple Future</b> συνοδεύεται συνληθως με εκφράσεις όπως :" +
	    		"<br> (<font color='#00FF00'>νεξτ γουίκ</font>)" +
	    		"<br><b>next week</b> (<font color='#0000FF'>την επόμενη εβδομάδα </font>) " +
	    		"<br> (<font color='#00FF00'>ιν θρι ντέιζ</font>)" +
	    		"<br><b>in three days</b> (<font color='#0000FF'>σε τρεις μέρες </font>) " +
	    		"<br> (<font color='#00FF00'>ιν δε φιούτσερ</font>)" +
	    		"<br><b>in the future</b> (<font color='#0000FF'>στο μέλλον </font>) " +
	    		"<br> (<font color='#00FF00'>ατ δε γουίκεντ</font>)" +
	    		"<br><b>at the weekend</b> (<font color='#0000FF'>το σαββατοκύριακο </font>) " +
	    		"<br><br> Η <b>ερώτηση</b> στον Απλό Μέλλοντα γίνεται με το ρήμα <b>will</b> στην αρχή της πρότασης. Για παράδειγμα :" +
	    		"<br><br>-He will go shopping(<font color='#0000FF'>Θα πάει για ψώνια.</font>) " +
	    		"<br>-<font color='#ff0000'>Will</font> he go shopping<font color='#ff0000'>?</font>(<font color='#0000FF'>Θα πάει για ψώνια;</font>) " +
	    		"<br><br> Η <b>άρνηση</b> στον Απλό Μέλλοντα γίνεται με το ρήμα <b>will</b> και το <b>not</b>. Για παράδειγμα :" +
	    		"<br><br>-He will go shopping(<font color='#0000FF'>Θα πάει για ψώνια.</font>) " +
	    		"<br>-He<font color='#ff0000'>will not</font> go shopping< (<font color='#0000FF'>Δεν θα πάει για ψώνια</font>) " +
	    		"<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Simple Past</u></h5>" +
	    		"<br><br>Ο <b>Simple Past</b> (Απλός Αόριστος) χρησιμοποιείται για να περιγράψουμε πράξεις που έγιναν στο παρελθόν :" +
	    		"<br><b>1</b>) και γνωρίζουμε πότε έγιναν." +
    			"<br><b>2</b>) πράγματα που κάναμε στο παρελθόν αλλά δε κάνουμε τώρα" +
    			"<br><b>3</b>) για να περιγράψουμε ιστορίες" +
    			"<br><br>Ο Απλός Αόριστος σχηματίζεται με το να προσθέσουμε την κατάληξη <b>-ed</b> στο ρήμα μας :" +
    			"Ας δούμε μεροικά παραδείγματα :" +
    			"<br><br> <u><b>finish</b></u> (<font color='#0000FF'>τελειώνω</font>) <(<font color='#00FF00'>φίνις</font>)<br>" +
    			"<br>I &nbsp;&nbsp; finish<font color='#ff0000'><b>ed</b></font> (<font color='#00FF00'>φίνισντ</font>)" +
    			"<br>You &nbsp;&nbsp; finish<font color='#ff0000'><b>ed</b></font>" +
    			"<br>He &nbsp;&nbsp; finish<font color='#ff0000'><b>ed</b></font>" +
    			"<br>She &nbsp;&nbsp; finish<font color='#ff0000'><b>ed</b></font>" +
    			"<br>It &nbsp;&nbsp; finish<font color='#ff0000'><b>ed</b></font>" +
    			"<br>We &nbsp;&nbsp; finish<font color='#ff0000'><b>ed</b></font>" +
    			"<br>You &nbsp;&nbsp; finish<font color='#ff0000'><b>ed</b></font>" +
    			"<br>They &nbsp;&nbsp; finish<font color='#ff0000'><b>ed</b></font>" +
    			"<br><br> <u><b>dance</b></u> (<font color='#0000FF'>χορεύω</font>) <(<font color='#00FF00'>ντανς</font>)<br>" +
    			"<br>I &nbsp;&nbsp; dance<font color='#ff0000'><b>ed</b></font> (<font color='#00FF00'>ντανσντ</font>)" +
    			"<br>You &nbsp;&nbsp; dance<font color='#ff0000'><b>ed</b></font>" +
    			"<br>He &nbsp;&nbsp; dance<font color='#ff0000'><b>ed</b></font>" +
    			"<br>She &nbsp;&nbsp; dance<font color='#ff0000'><b>ed</b></font>" +
    			"<br>It &nbsp;&nbsp; dance<font color='#ff0000'><b>ed</b></font>" +
    			"<br>We &nbsp;&nbsp; dance<font color='#ff0000'><b>ed</b></font>" +
    			"<br>You &nbsp;&nbsp; dance<font color='#ff0000'><b>ed</b></font>" +
    			"<br>They &nbsp;&nbsp; dance<font color='#ff0000'><b>ed</b></font>" +
    			"<br><br> <u><b>ask</b></u> (<font color='#0000FF'>ρωτάω</font>) <(<font color='#00FF00'>ασκ</font>)<br>" +
    			"<br>I &nbsp;&nbsp; ask<font color='#ff0000'><b>ed</b></font> (<font color='#00FF00'>ασκντ</font>)" +
    			"<br>You &nbsp;&nbsp; ask<font color='#ff0000'><b>ed</b></font>" +
    			"<br>He &nbsp;&nbsp; ask<font color='#ff0000'><b>ed</b></font>" +
    			"<br>She &nbsp;&nbsp; ask<font color='#ff0000'><b>ed</b></font>" +
    			"<br>It &nbsp;&nbsp; ask<font color='#ff0000'><b>ed</b></font>" +
    			"<br>We &nbsp;&nbsp; ask<font color='#ff0000'><b>ed</b></font>" +
    			"<br>You &nbsp;&nbsp; ask<font color='#ff0000'><b>ed</b></font>" +
    			"<br>They &nbsp;&nbsp; ask<font color='#ff0000'><b>ed</b></font>" +
    			"<br>Ο <b>Simple Past</b> συνοδεύεται συνληθως με εκφράσεις όπως :" +
	    		"<br> (<font color='#00FF00'>γέστερντει</font>)" +
	    		"<br><b>yesterday</b> (<font color='#0000FF'>χθες</font>) " +
	    		"<br> (<font color='#00FF00'>λαστ γίαρ</font>)" +
	    		"<br><b>last year</b> (<font color='#0000FF'>πέρισυ</font>) " +
	    		"<br> (<font color='#00FF00'>φάιβ μίνιτς αγκό</font>)" +
	    		"<br><b>five minutes ago</b> (<font color='#0000FF'>πέντε λεπτά πριν</font>) " +
	    		"<br> (<font color='#00FF00'>δη άδερ ντέι</font>)" +
	    		"<br><b>the other day</b> (<font color='#0000FF'>τις προάλλες</font>) " +
	    		"<br> (<font color='#00FF00'>ιν δε παστ</font>)" +
	    		"<br><b>in the past</b> (<font color='#0000FF'>στο παρελθόν</font>) " +
	    		"<br> (<font color='#00FF00'>λαστ γουίκ</font>)" +
	    		"<br><b>last week</b> (<font color='#0000FF'>την προηγούμενη εβδομάδα</font>) " +
	    		"<br> (<font color='#00FF00'>ιν δόουζ ντέιζ</font>)" +
	    		"<br><b>in those days</b> (<font color='#0000FF'>εκείνες τις μέρες</font>) " +
	    		"<br><br> Η <b>ερώτηση</b> στον Απλό Αόριστο γίνεται με το ρήμα <b>did</b>(do) στην αρχή της πρότασης και το ρήμα σε απαρέμφατο. Για παράδειγμα :" +
	    		"<br><br>-He asked a question.(<font color='#0000FF'>Ρώτησε μία ερώτηση</font>) " +
	    		"<br>-<font color='#ff0000'>Did</font> he ask a question<font color='#ff0000'>?</font>(<font color='#0000FF'>Ρώτησε μία ερώτηση;</font>) " +
	    		"<br><br> Η <b>άρνηση</b> στον Απλό Αόριστο γίνεται με το ρήμα <b>did</b> και το <b>not</b>. Για παράδειγμα :" +
	    		"<br><br>-He closed the door(<font color='#0000FF'>Έκλεισε τη πόρτα</font>) " +
	    		"<br>-He<font color='#ff0000'>did not</font> close the door< (<font color='#0000FF'>Δεν έκλεισε τη πόρτα</font>) " +
    			"<br><br><br><h6>***Τέλος τέταρτου κεφαλαίου***</h6>" +
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
        t.setPadding(60, 0, 10, 0);

    }
	
    public void onBackPressed() 
	{
    super.onBackPressed();
    finish();
	}
}
