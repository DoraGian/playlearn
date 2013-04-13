package com.dora.dora;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class vch5 extends Activity {
	
	LinearLayout Linear;
	
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notebook) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		Linear  = (LinearLayout)findViewById(R.id.linear);
		
		
		 
        TextView t0 = new TextView(this);
        t0.setText(Html.fromHtml("<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Vocabulary</u></h5>"));
        	setalign0(t0);
        	Linear.addView(t0);
    	
    	 TextView t1 = new TextView(this);  
	     t1.setText(Html.fromHtml("<br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>A</u></h5>" +
	     "<br>(<font color='#00FF00'>απλ</font>)" +
	     "<br><b> apple </b> (<font color='#0000FF'> μήλο </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;B</h5>" +
	     "<br>(<font color='#00FF00'> μπερντ </font>)" +
	     "<br><b> bird </b> (<font color='#0000FF'> πουλί </font>)" +
	     "<br>(<font color='#00FF00'> μπότλ </font>)" +
	     "<br><b> bottle </b> (<font color='#0000FF'> μπουκάλι </font>)" +
	     "<br>(<font color='#00FF00'> μπρηθ </font>)" +
	     "<br><b> breath </b> (<font color='#0000FF'> αναπνοή </font>)" +
	     "<br>(<font color='#00FF00'> μπράδερ </font>)" +
	     "<br><b> brother </b> (<font color='#0000FF'> αδερφός </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;C</h5>" +
	     "<br>(<font color='#00FF00'> τσερ </font>)" +
	     "<br><b> chair </b> (<font color='#0000FF'> καρέκλα </font>)" +
	     "<br>(<font color='#00FF00'> τσάιλντ </font>)" +
	     "<br><b> child </b> (<font color='#0000FF'> παιδί </font>)" +
	     "<br>(<font color='#00FF00'> κόφι </font>)" +
	     "<br><b> coffee </b> (<font color='#0000FF'> καφές </font>)" +
	     "<br>(<font color='#00FF00'> κλάουντ </font>)" +
	     "<br><b> cloud </b> (<font color='#0000FF'> σύννεφο </font>)" +
	     "<br>(<font color='#00FF00'> κάουτς </font>)" +
	     "<br><b> couch </b> (<font color='#0000FF'> καναπές </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;F</h5>" +
	     "<br>(<font color='#00FF00'> φάδερ </font>)" +
	     "<br><b> father </b> (<font color='#0000FF'> πατέρας </font>)" +
	     "<br>(<font color='#00FF00'> φόρεστ </font>)" +
	     "<br><b> forest </b> (<font color='#0000FF'> δάσος </font>)" +
	     "<br>(<font color='#00FF00'> φλάουερ </font>)" +
	     "<br><b> flower </b> (<font color='#0000FF'> λουλούδι </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;G</h5>" +
	     "<br>(<font color='#00FF00'> γκλας </font>)" +
	     "<br><b> glass </b> (<font color='#0000FF'> ποτήρι </font>)" +
	     "<br>(<font color='#00FF00'> γκρας </font>)" +
	     "<br><b> grass </b> (<font color='#0000FF'> γρασίδι </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;H</h5>" +
	     "<br>(<font color='#00FF00'> χερ </font>)" +
	     "<br><b> hair </b> (<font color='#0000FF'> μαλλιά </font>)" +
	     "<br>(<font color='#00FF00'> χερτ </font>)" +
	     "<br><b> heart </b> (<font color='#0000FF'> καρδιά </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;L</h5>" +
	     "<br>(<font color='#00FF00'> λαμπ </font>)" +
	     "<br><b> lamp </b> (<font color='#0000FF'> λάμπα </font>)" +
	     "<br>(<font color='#00FF00'> λαφ </font>)" +
	     "<br><b> laugh </b> (<font color='#0000FF'> γέλιο/άω </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;M</h5>" +
	     "<br>(<font color='#00FF00'> μάδερ </font>)" +
	     "<br><b> mother </b> (<font color='#0000FF'> μητέρα </font>)" +
	     "<br>(<font color='#00FF00'> μάουθ </font>)" +
	     "<br><b> mouth </b> (<font color='#0000FF'> στόμα </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;P</h5>" +
	     "<br>(<font color='#00FF00'> πένσιλ </font>)" +
	     "<br><b> pencil </b> (<font color='#0000FF'> μολύβι </font>)" +
	     "<br>(<font color='#00FF00'> φόουν </font>)" +
	     "<br><b> phone </b> (<font color='#0000FF'> τηλέφωνο </font>)" +
	     "<br>(<font color='#00FF00'> πλέι </font>)" +
	     "<br><b> play </b> (<font color='#0000FF'> παίζω </font>)" +
	     "<br>(<font color='#00FF00'> περσ </font>)" +
	     "<br><b> purse </b> (<font color='#0000FF'> τσάντα </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;R</h5>" +
	     "<br>(<font color='#00FF00'> ρέιντιο </font>)" +
	     "<br><b> radio </b> (<font color='#0000FF'> ράδιο </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;S</h5>" +
	     "<br>(<font color='#00FF00'> σίστερ </font>)" +
	     "<br><b> sister </b> (<font color='#0000FF'> αδερφή </font>)" +
	     "<br>(<font color='#00FF00'> σνέικ </font>)" +
	     "<br><b> snake </b> (<font color='#0000FF'> φίδι </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;T</h5>" +
	     "<br>(<font color='#00FF00'> τέιμπλ </font>)" +
	     "<br><b> table </b> (<font color='#0000FF'> τραπέζι </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;W</h5>" +
	     "<br>(<font color='#00FF00'> γουότερ </font>)" +
	     "<br><b> water </b> (<font color='#0000FF'> νερό </font>)" +
	     "<br>(<font color='#00FF00'> γουίμαν </font>)" +
	     "<br><b> woman </b> (<font color='#0000FF'> γυναίκα </font>)" +
	     "<br>(<font color='#00FF00'> γουόντερ </font>)" +
	     "<br><b> wonder </b> (<font color='#0000FF'> αναρωτιέμαι </font>)" +	     
	     "<br><br> <h6>***Τέλος πέμπτου κεφαλαίου***</h6>"   ));
	     
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
