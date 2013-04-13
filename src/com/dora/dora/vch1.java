package com.dora.dora;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class vch1 extends Activity {
	
	LinearLayout Linear;
	
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notebook) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		Linear  = (LinearLayout)findViewById(R.id.linear);	 
        
        TextView t0 = new TextView(this);
        t0.setText(Html.fromHtml("<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Η αλφαβήτα </u></h5>"));
        	setalign0(t0);
        	Linear.addView(t0);
    	
    	 TextView t1 = new TextView(this);  
	     t1.setText(Html.fromHtml("<b> A  , a </b>(<font color='#00FF00'>έι</font>) " +
	     "<br><b> B , b </b>(<font color='#00FF00'>μπίι</font>)" +
	     "<br><b> C , c </b>(<font color='#00FF00'>σίι</font>)" +
	     "<br><b> D , d </b>(<font color='#00FF00'>ντίι</font>)" +
	     "<br><b> E , e </b>(<font color='#00FF00'>ίι</font>)" +
	     "<br><b> F , f </b>(<font color='#00FF00'>εφ</font>)" +
	     "<br><b> G , g </b>(<font color='#00FF00'>τζίι</font>)" +
	     "<br><b> E , e </b>(<font color='#00FF00'>ίι</font>)" +
	     "<br><b> H , h </b>(<font color='#00FF00'>έιτς</font>)" +
	     "<br><b> I , i </b>(<font color='#00FF00'>άι</font>)" +
	     "<br><b> J , j </b>(<font color='#00FF00'>τζέι</font>)" +
	     "<br><b> K , k </b>(<font color='#00FF00'>κέι</font>)" +
	     "<br><b> L , l </b>(<font color='#00FF00'>ελ</font>)" +
	     "<br><b> M , m </b>(<font color='#00FF00'>εμ</font>)" +
	     "<br><b> N , n </b>(<font color='#00FF00'>εν</font>)" +
	     "<br><b> O , o </b>(<font color='#00FF00'>όου</font>)" +
	     "<br><b> P , p </b>(<font color='#00FF00'>πίι</font>)" +
	     "<br><b> Q , q </b>(<font color='#00FF00'>κιού</font>)" +
	     "<br><b> R , r </b>(<font color='#00FF00'>αρ</font>)" +
	     "<br><b> S , s </b>(<font color='#00FF00'>ες</font>)" +
	     "<br><b> T , t </b>(<font color='#00FF00'>τίι</font>)" +
	     "<br><b> U , u </b>(<font color='#00FF00'>γιού</font>)" +
	     "<br><b> V , v </b>(<font color='#00FF00'>βίι</font>)" +
	     "<br><b> W , w </b>(<font color='#00FF00'>ντάμπλγιου</font>)" +
	     "<br><b> X , x </b>(<font color='#00FF00'>εξ</font>)" +
	     "<br><b> Y , y </b>(<font color='#00FF00'>γουάι</font>)" +
	     "<br><b> Z , z </b>(<font color='#00FF00'>ζεντ</font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Βασικές Εκφράσεις </u></h5>" +
	     "(<font color='#00FF00'>γες</font>)" +
	     "<br> Yes   (<font color='#0000FF'> Ναι</font>)" +
	     "<br><br> (<font color='#00FF00'>νο</font>) " +
	     "<br> No   (<font color='#0000FF'> Όχι</font>) " +
	     "<br><br> (<font color='#00FF00'>εντ</font>)"+
	     "<br> And   (<font color='#0000FF'> Και</font>) " +
	     "<br><br> (<font color='#00FF00'>χελόου</font>)"+
    	 "<br> Hello   (<font color='#0000FF'> Γεια</font>) " +
    	 "<br><br> (<font color='#00FF00'>γκουντ μόρνινγκ</font>)"+
    	 "<br> Good Morning   (<font color='#0000FF'> Καλημέρα</font>) " +
    	 "<br><br> (<font color='#00FF00'>γκουντ ιβνινγκ</font>)" +
    	 "<br> Good Evening   (<font color='#0000FF'> Καλησπέρα</font>) " +
    	 "<br><br> (<font color='#00FF00'>γκουντ νάιτ</font>" +
    	 "<br> Good Night     (<font color='#0000FF'> Καληνύχτα</font>) )" +
    	 "<br><br> (<font color='#00FF00'>γκουντ-μπάι</font>)" +
    	 "<br> Goodbye        (<font color='#0000FF'> Αντίο</font>) " +
    	 "<br><br> (<font color='#00FF00'>σι γιου λέιτερ</font>)" +
    	 "<br> See you later  (<font color='#0000FF'> Τα λέμε αύριο</font>) " +
    	 "<br><br> (<font color='#00FF00'>σι γιου σουν</font>)" +
    	 "<br> See you soon  (<font color='#0000FF'> Τα λέμε σύντομα</font>) " +
    	 "<br><br> (<font color='#00FF00'>θενκ γιου</font>)" +
    	 "<br> Thank you      (<font color='#0000FF'> Ευχαριστώ</font>) " +
    	 "<br><br> (<font color='#00FF00'>γιορ γουέλκαμ</font>)" +
    	 "<br> You're welcome (<font color='#0000FF'> Παρακαλώ</font> " +
    	 "<br><br> (<font color='#00FF00'>πλιζ</font>)" +
    	 "<br> Please   (<font color='#0000FF'> Σε/Σας παρακαλώ</font>) " +
    	 "<br><br> (<font color='#00FF00'>άι εμ σόρι</font>)" +
    	 "<br> I am sorry   (<font color='#0000FF'> Συγγνώμη</font>)" +
    	 "<br><br> (<font color='#00FF00'>εξκιούζ μι </font>)" +
    	 "<br> Excuse me   (<font color='#0000FF'> Με συγχωρείτε</font>)" +
    	 "<br><br> (<font color='#00FF00'>μίστερ</font>)" +
    	 "<br> Mister   (<font color='#0000FF'> Κύριος</font>)" +
    	 "<br><br> (<font color='#00FF00'>μις</font>)" +
    	 "<br> Miss     (<font color='#0000FF'> Κυρία</font>)" +
    	 "<br><br> (<font color='#00FF00'>χάου αρ γιου</font>)" +   	 
    	 "<br> How are you?  (<font color='#0000FF'> Τι κάνεις?</font>)" +
    	 "<br><br> (<font color='#00FF00'>φάιν</font>)" +
    	 "<br> Ι am fine   (<font color='#0000FF'> Είμαι καλά</font>)" +
    	 "<br><br> (<font color='#00FF00'>νάις του μιτ γιου</font>)" +
    	 "<br> Nice to meet you  (<font color='#0000FF'> Χάρηκα</font>)" +
    	 "<br><br> (<font color='#00FF00'>Γουάτς γιορ νέιμ</font>)" +
    	 "<br> What's your name?  (<font color='#0000FF'> Ποιο είναι το όνομά σου?</font>)" +
    	 "<br><br> (<font color='#00FF00'>μάι νέιμ ιζ</font>)" +
    	 "<br> My name is...    (<font color='#0000FF'> Το όνομά μου είναι...</font>)" +
    	 "<br><br> (<font color='#00FF00'>γουέρ αρ γιου φρομ</font>)" +
    	 "<br> Where are you from?   (<font color='#0000FF'> Από που κατάγεσαι?</font>)" +
    	 "<br><br> (<font color='#00FF00'>άι εμ φρομ</font>)" +
    	 "<br> I am from...   (<font color='#0000FF'> Κατάγομαι από...</font>)" +
    	 "<br><br> (<font color='#00FF00'>γουέρ ντου γιου λιβ</font>)" +
    	 "<br> Where do you live?   (<font color='#0000FF'> Πού μένεις?</font>)" +
    	 "<br><br> (<font color='#00FF00'>άι λιβ ιν</font>)" +
    	 "<br> I live in...   (<font color='#0000FF'> Μένω ...</font>)" +
    	 "<br><br> (<font color='#00FF00'>χάου ολντ αρ γιου</font>)" +
    	 "<br> How old are you?   (<font color='#0000FF'> Πόσο χρονών είσαι?</font>)" +
    	 "<br><br> (<font color='#00FF00'>άι εμ ... γίαρς ολντ</font>)" +
    	 "<br> I am ... years old   (<font color='#0000FF'> Είμαι ... χρονών</font>)" +
    	 "<br><br> (<font color='#00FF00'>ντου γιου σπικ ίνγκλις</font>)" +
    	 "<br> Do you speak English?   (<font color='#0000FF'> Μιλάς αγγλικά?</font>)" +
    	 "<br><br> (<font color='#00FF00'>άι σπικ ίνγκλις</font>)" +
    	 "<br> I speak English  (<font color='#0000FF'>Μιλάω αγγλικά</font>)" +
    	 "<br><br> (<font color='#00FF00'>άι αντερστλαντ</font>)" +
    	 "<br> I understand  (<font color='#0000FF'> Καταλαβαίνω </font>)" +
    	 "<br><br> (<font color='#00FF00'>άι ντοντ αντερσταντ</font>)" +
    	 "<br> I understand  (<font color='#0000FF'> Δεν καταλαβαίνω </font>)" +
    	 "<br><br> (<font color='#00FF00'>άι νόου</font>)" +
    	 "<br> I  know  (<font color='#0000FF'> Ξέρω </font>)" +
    	 "<br><br> (<font color='#00FF00'>άι ντοντ νόου</font>)" +
    	 "<br> I don't know.  (<font color='#0000FF'> Δεν ξέρω </font>)" +
	     "<br><br><b>Ας γράψουμε το πρώτο μας διάλογο με τις εκφράσεις που μόλις μάθαμε.</b>" +
	     "<br><br> - Good morning miss!" +
	     "<br> - Good morning mister." +
	     "<br> - What is your name?" +
	     "<br> - My name is Maria." +
	     "<br> - And my name is Janek, nice to meet you." +
	     "<br> - Where do you come from?" +
	     "<br> - I come from Egland, and you?" +
	     "<br> - I come from Greece." +
	     "<br><br><font color='#0000FF'> - Καλημέρα κυρία!" +
	     "<br> - Καλημέρα κύριε." +
	     "<br> - Ποιο είναι το όνομά σας?" +
	     "<br> - Το όνομά μου είναι Μαρία." +
	     "<br> - Και το δικό μου είναι Γιάνεκ, χάρηκα." +
	     "<br> - Από που είσαι?" +
	     "<br> - Από Αγγλία και εσύ?" +
	     "<br> - Από Ελλάδα.</font>" +
	     "<br>." +
	     "<br><br> <h6>***Τέλος πρώτου κεφαλαίου***</h6>"));
	     
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
