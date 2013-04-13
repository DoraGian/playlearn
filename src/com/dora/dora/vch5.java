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
	     "<br>(<font color='#00FF00'>���</font>)" +
	     "<br><b> apple </b> (<font color='#0000FF'> ���� </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;B</h5>" +
	     "<br>(<font color='#00FF00'> ������ </font>)" +
	     "<br><b> bird </b> (<font color='#0000FF'> ����� </font>)" +
	     "<br>(<font color='#00FF00'> ����� </font>)" +
	     "<br><b> bottle </b> (<font color='#0000FF'> �������� </font>)" +
	     "<br>(<font color='#00FF00'> ����� </font>)" +
	     "<br><b> breath </b> (<font color='#0000FF'> ������� </font>)" +
	     "<br>(<font color='#00FF00'> ������� </font>)" +
	     "<br><b> brother </b> (<font color='#0000FF'> ������� </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;C</h5>" +
	     "<br>(<font color='#00FF00'> ���� </font>)" +
	     "<br><b> chair </b> (<font color='#0000FF'> ������� </font>)" +
	     "<br>(<font color='#00FF00'> ������� </font>)" +
	     "<br><b> child </b> (<font color='#0000FF'> ����� </font>)" +
	     "<br>(<font color='#00FF00'> ���� </font>)" +
	     "<br><b> coffee </b> (<font color='#0000FF'> ����� </font>)" +
	     "<br>(<font color='#00FF00'> ������� </font>)" +
	     "<br><b> cloud </b> (<font color='#0000FF'> ������� </font>)" +
	     "<br>(<font color='#00FF00'> ������ </font>)" +
	     "<br><b> couch </b> (<font color='#0000FF'> ������� </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;F</h5>" +
	     "<br>(<font color='#00FF00'> ����� </font>)" +
	     "<br><b> father </b> (<font color='#0000FF'> ������� </font>)" +
	     "<br>(<font color='#00FF00'> ������ </font>)" +
	     "<br><b> forest </b> (<font color='#0000FF'> ����� </font>)" +
	     "<br>(<font color='#00FF00'> ������� </font>)" +
	     "<br><b> flower </b> (<font color='#0000FF'> �������� </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;G</h5>" +
	     "<br>(<font color='#00FF00'> ����� </font>)" +
	     "<br><b> glass </b> (<font color='#0000FF'> ������ </font>)" +
	     "<br>(<font color='#00FF00'> ����� </font>)" +
	     "<br><b> grass </b> (<font color='#0000FF'> ������� </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;H</h5>" +
	     "<br>(<font color='#00FF00'> ��� </font>)" +
	     "<br><b> hair </b> (<font color='#0000FF'> ������ </font>)" +
	     "<br>(<font color='#00FF00'> ���� </font>)" +
	     "<br><b> heart </b> (<font color='#0000FF'> ������ </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;L</h5>" +
	     "<br>(<font color='#00FF00'> ���� </font>)" +
	     "<br><b> lamp </b> (<font color='#0000FF'> ����� </font>)" +
	     "<br>(<font color='#00FF00'> ��� </font>)" +
	     "<br><b> laugh </b> (<font color='#0000FF'> �����/�� </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;M</h5>" +
	     "<br>(<font color='#00FF00'> ����� </font>)" +
	     "<br><b> mother </b> (<font color='#0000FF'> ������ </font>)" +
	     "<br>(<font color='#00FF00'> ����� </font>)" +
	     "<br><b> mouth </b> (<font color='#0000FF'> ����� </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;P</h5>" +
	     "<br>(<font color='#00FF00'> ������ </font>)" +
	     "<br><b> pencil </b> (<font color='#0000FF'> ������ </font>)" +
	     "<br>(<font color='#00FF00'> ����� </font>)" +
	     "<br><b> phone </b> (<font color='#0000FF'> �������� </font>)" +
	     "<br>(<font color='#00FF00'> ���� </font>)" +
	     "<br><b> play </b> (<font color='#0000FF'> ����� </font>)" +
	     "<br>(<font color='#00FF00'> ���� </font>)" +
	     "<br><b> purse </b> (<font color='#0000FF'> ������ </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;R</h5>" +
	     "<br>(<font color='#00FF00'> ������� </font>)" +
	     "<br><b> radio </b> (<font color='#0000FF'> ����� </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;S</h5>" +
	     "<br>(<font color='#00FF00'> ������ </font>)" +
	     "<br><b> sister </b> (<font color='#0000FF'> ������ </font>)" +
	     "<br>(<font color='#00FF00'> ����� </font>)" +
	     "<br><b> snake </b> (<font color='#0000FF'> ���� </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;T</h5>" +
	     "<br>(<font color='#00FF00'> ������ </font>)" +
	     "<br><b> table </b> (<font color='#0000FF'> ������� </font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;W</h5>" +
	     "<br>(<font color='#00FF00'> ������� </font>)" +
	     "<br><b> water </b> (<font color='#0000FF'> ���� </font>)" +
	     "<br>(<font color='#00FF00'> ������� </font>)" +
	     "<br><b> woman </b> (<font color='#0000FF'> ������� </font>)" +
	     "<br>(<font color='#00FF00'> �������� </font>)" +
	     "<br><b> wonder </b> (<font color='#0000FF'> ����������� </font>)" +	     
	     "<br><br> <h6>***����� ������� ���������***</h6>"   ));
	     
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
