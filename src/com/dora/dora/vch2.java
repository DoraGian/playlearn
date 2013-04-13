package com.dora.dora;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class vch2 extends Activity {
	
	LinearLayout Linear;
	
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notebook) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	

		Linear  = (LinearLayout)findViewById(R.id.linear);	 
        
        TextView t0 = new TextView(this);
        t0.setText(Html.fromHtml("<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Οι αριθμοί</u></h5>"));
        	setalign0(t0);
        	Linear.addView(t0);
    	
    	 TextView t1 = new TextView(this);  
	     t1.setText(Html.fromHtml("(<font color='#00FF00'>ζίροου</font>)" +
	     "<br><b> Zero </b> (<font color='#0000FF'> Μηδέν </font>)" +
	     "<br>(<font color='#00FF00'>γουάν</font>)" +
	     "<br><b> One </b> (<font color='#0000FF'> Ένα </font>)" +
	     "<br>(<font color='#00FF00'>του</font>)" +
	     "<br><b> Two </b> (<font color='#0000FF'> Δύο </font>) " +
	     "<br>(<font color='#00FF00'>θρι</font>)" +
	     "<br><b> Three </b> (<font color='#0000FF'> Τρία </font>) " +
	     "<br>(<font color='#00FF00'>φορ</font>)" +
	     "<br><b> Four </b> (<font color='#0000FF'> Τέσσερα </font>) " +
	     "<br>(<font color='#00FF00'>φάιβ</font>)" +
	     "<br><b> Five </b> (<font color='#0000FF'> Πέντε </font>) " +
	     "<br>(<font color='#00FF00'>σιξ</font>)" +
	     "<br><b> Six </b> (<font color='#0000FF'> Έξι </font>)" +
	     "<br>(<font color='#00FF00'>σέβεν</font>)" +
	     "<br><b> Seven </b> (<font color='#0000FF'> Εφτά </font>) " +
	     "<br>(<font color='#00FF00'>έιτ</font>)" +
	     "<br><b> Eight </b> (<font color='#0000FF'> Οχτώ </font>) " +
	     "<br>(<font color='#00FF00'>νάιν</font>)" +
	     "<br><b> Nine </b> (<font color='#0000FF'> Εννέα </font>) " +
	     "<br>(<font color='#00FF00'>τεν</font>)" +
	     "<br><b> Ten </b> (<font color='#0000FF'> Δέκα </font>) " +
	     "<br>(<font color='#00FF00'>ηλέβεν</font>)" +
	     "<br><b> Eleven </b> (<font color='#0000FF'> Έντεκα </font>) " +
	     "<br>(<font color='#00FF00'>τουέλβ</font>)" +
	     "<br><b> Twelve </b> (<font color='#0000FF'> Δώδεκα </font>) " +
	     "<br>(<font color='#00FF00'>θερτίν</font>)" +
	     "<br><b> Thirteen </b> (<font color='#0000FF'> Δεκατρία </font>) " +
	     "<br>(<font color='#00FF00'>φορτίν</font>)" +
	     "<br><b> Fourteen </b> (<font color='#0000FF'> Δεκατέσσερα </font>) " +
	     "<br>(<font color='#00FF00'>φιφτίν</font>)" +
	     "<br><b> Fifteen </b> (<font color='#0000FF'> Δεκαπέντε </font>) " +
	     "<br>(<font color='#00FF00'>σιξτίν</font>)" +
	     "<br><b> Sixteen </b> (<font color='#0000FF'> Δεκαέξι </font>) " +
	     "<br>(<font color='#00FF00'>σεβεντίν</font>)" +
	     "<br><b> Seventeen </b> (<font color='#0000FF'> Δεκαεφτά </font>) " +
	     "<br>(<font color='#00FF00'>ειτίν</font>)" +
	     "<br><b> Eighteen </b> (<font color='#0000FF'> Δεκαοχτώ </font>) " +
	     "<br>(<font color='#00FF00'>ναιντίν</font>)" +
	     "<br><b> Neinteen </b> (<font color='#0000FF'> Δεκαεννέα </font>) " +
	     "<br>(<font color='#00FF00'>τουέντι</font>)" +
	     "<br><b> Twenty </b> (<font color='#0000FF'> Είκοσι </font>) " +
	     "<br>(<font color='#00FF00'>τουέντι γουάν</font>)" +
	     "<br><b> Twenty one </b> (<font color='#0000FF'> Είκοσι ένα </font>) " +
	     "<br>(<font color='#00FF00'>τουέντι του</font>)" +
	     "<br><b> Twenty two </b> (<font color='#0000FF'> Είκοσι δύο</font>) " +
	     "<br>(<font color='#00FF00'>τουέντι θρι</font>)" +
	     "<br><b> Twenty three </b> (<font color='#0000FF'> Είκοσι τρία</font>) " +
	     "<br>(<font color='#00FF00'>τουέντι φορ</font>)" +
	     "<br><b> Twenty four </b> (<font color='#0000FF'> Είκοσι τέσσερα</font>) " +
	     "<br>(<font color='#00FF00'>τουέντι φάιβ</font>)" +
	     "<br><b> Twenty five </b> (<font color='#0000FF'> Είκοσι πέντε</font>) " +
	     "<br>(<font color='#00FF00'>τουέντι σιξ</font>)" +
	     "<br><b> Twenty six </b> (<font color='#0000FF'> Είκοσι έξι</font>) " +
	     "<br><b>." +
	     "<br>." +
	     "<br>.</b>" +
	     "<br>(<font color='#00FF00'>θέρτι</font>)" +
	     "<br><b> Thirty </b> (<font color='#0000FF'> Τριάντα</font>)" +
	     "<br>(<font color='#00FF00'>θέρτι γουάν</font>)" +
	     "<br><b> Thirty one </b> (<font color='#0000FF'> Τριάντα ένα</font>) " +
	     "<br>(<font color='#00FF00'>θέρτι του</font>)" +
	     "<br><b> Thirty two </b> (<font color='#0000FF'> Τριάντα δύο</font>) " +
	     "<br><b>." +
	     "<br>." +
	     "<br>.</b>" +
	     "<br>(<font color='#00FF00'>φόρτι</font>)" +
	     "<br><b> Fourty </b> (<font color='#0000FF'> Σαράντα</font>) " +
	     "<br>(<font color='#00FF00'>φίφτι</font>)" +
	     "<br><b> Fifty </b> (<font color='#0000FF'> Πενήντα</font>) " +
	     "<br>(<font color='#00FF00'>σίξτι</font>)" +
	     "<br><b> Sixty </b> (<font color='#0000FF'> Εξήντα</font>) " +
	     "<br>(<font color='#00FF00'>σέβεντι</font>)" +
	     "<br><b> Seventy </b> (<font color='#0000FF'> Εβδομήντα</font>) " +
	     "<br>(<font color='#00FF00'>έιτι</font>)" +
	     "<br><b> Eighty </b> (<font color='#0000FF'> Ογδόντα</font>) " +
	     "<br>(<font color='#00FF00'>νάιντι</font>)" +
	     "<br><b> Ninety </b> (<font color='#0000FF'> Ενενήντα</font>) " +
	     "<br>(<font color='#00FF00'>γουάν χάντρεντ</font>)" +
	     "<br><b> One hundred </b> (<font color='#0000FF'> Εκατό</font>) " +
	     "<br>(<font color='#00FF00'>γουάν χάντρεντ τουέντι γουάν</font>)" +
	     "<br><b> One hundred twenty one </b> (<font color='#0000FF'> Εκατό είκοσι ένα</font>) " +
	     "<br>(<font color='#00FF00'>του χάντρεντ</font>)" +
	     "<br><b> Two hundred </b> (<font color='#0000FF'> Διακόσια</font>) " +
	     "<br>(<font color='#00FF00'>θρι χάντρεντ</font>)" +
	     "<br><b> Three hundred </b> (<font color='#0000FF'> Τριακόσια</font>) " +
	     "<br><b>." +
	     "<br>." +
	     "<br>.</b>" +
	     "<br>(<font color='#00FF00'>γουάν μίλιον</font>)" +
	     "<br><b> One million </b> (<font color='#0000FF'> Ένα εκατομμύριο</font>) " +
	     "<br>(<font color='#00FF00'>του μίλιον</font>)" +
	     "<br><b> Two million </b> (<font color='#0000FF'> Δύο εκατομμύρια</font>) " +
	     "<br>" +
	     "<br><b>." +
	     "<br>." +
	     "<br>.</b>" +
	     "<br>(<font color='#00FF00'>γουάν μπίλιον</font>)" +
	     "<br><b> One billion </b> (<font color='#0000FF'> Ένα δισεκατομμύριο</font>) " +
	     "<br>(<font color='#00FF00'>ντέι</font>)" +
	     "<br><b> day </b> (<font color='#0000FF'> μέρα</font>) " +
	     "<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Η ώρα</u></h5>" +
	     "<br><br>(<font color='#00FF00'>γουάτ τάιμ ιζ ιτ?</font>)" +
	     "<br><b> What time is it? </b> (<font color='#0000FF'> Τι ώρα είναι? </font>)" +
	     "<br><br>(<font color='#00FF00'>γουάτς δε τάιμ?</font>)" +
	     "<br><b> What's the time? </b> (<font color='#0000FF'> Τι ώρα είναι? </font>)" +
	     "<br><br>(<font color='#00FF00'>Ιτς του ο-κλοκ </font>)" +
	     "<br><b> It's two o'clock </b> (<font color='#0000FF'> Είναι δύο η ώρα </font>)" +
	     "<br>(<font color='#00FF00'>Ιτ ιζ του έι εμ</font>)" +
	     "<br><b> (It is) 2 AM </b> (<font color='#0000FF'> Είναι 2 π.μ. </font>)" +
	     "<br>(<font color='#00FF00'>Ιτ ιζ του πι εμ</font>)" +
	     "<br><b> (It is) 2 PM </b> (<font color='#0000FF'> Είναι 2 μ.μ. </font>)" +
	     "<br>(<font color='#00FF00'>Ιτ ιζ τουέντι παστ σιξ</font>)" +
	     "<br><b> It is twenty past six </b> (<font color='#0000FF'> Είναι έξι και είκοσι </font>)" +
	     "<br>(<font color='#00FF00'>γουάτ τάιμ ισ ιτ?</font>)" +
	     "<br><b> It is five to 10 </b> (<font color='#0000FF'> Είναι δέκα παρά πέντε </font>)" +
	     "<br>(<font color='#00FF00'>ιτς κουάρτερ παστ του</font>)" +
	     "<br><b> It's quarter past two </b> (<font color='#0000FF'> Είναι δύο και τέταρτο </font>)" +
	     "<br>(<font color='#00FF00'>ιτς κουάρτερ του νάιν</font>)" +
	     "<br><b> It's quarter too nine </b> (<font color='#0000FF'> Είναι εννέα παρά τέταρτο </font>)" +
	     "<br><br> <h6>***Τέλος δεύτερου κεφαλαίου***</h6>"   ));
	     
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
