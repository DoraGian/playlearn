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
        t0.setText(Html.fromHtml("<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>�������</u></h5>"));
        	setalign0(t0);
        	Linear.addView(t0);
    	
    	 TextView t1 = new TextView(this);  
	     t1.setText(Html.fromHtml("(<font color='#00FF00'>������</font>) " +
	    		 "<br><b> orange </b> (<font color='#0000FF'> ��������� </font>)" +
	    	     "<br>(<font color='#00FF00'>����</font>)" +
	    	     "<br><b> pink </b> (<font color='#0000FF'> ��� </font>)" +
	    	     "<br>(<font color='#00FF00'>�����</font>)" +
	    	     "<br><b> purple </b> (<font color='#0000FF'> ��� </font>) " +
	    	     "<br>(<font color='#00FF00'>�����</font>)" +
	    	     "<br><b> blue </b> (<font color='#0000FF'> ���� </font>) " +
	    	     "<br>(<font color='#00FF00'>������</font>)" +
	    	     "<br><b> yellow </b> (<font color='#0000FF'> ������� </font>) " +
	    	     "<br>(<font color='#00FF00'>����</font>)" +
	    	     "<br><b> red </b> (<font color='#0000FF'> ������� </font>) " +
	    	     "<br>(<font color='#00FF00'>�����</font>)" +
	    	     "<br><b> black </b> (<font color='#0000FF'> ����� </font>)" +
	    	     "<br>(<font color='#00FF00'>�������</font>)" +
	    	     "<br><b> brown </b> (<font color='#0000FF'> ���� </font>) " +
	    	     "<br>(<font color='#00FF00'>�����</font>)" +
	    	     "<br><b> gray </b> (<font color='#0000FF'> ���� </font>) " +
	    	     "<br>(<font color='#00FF00'>������</font>)" +
	    	     "<br><b> white </b> (<font color='#0000FF'> ����� </font>) " +
	    	     "<br>(<font color='#00FF00'>�����</font>)" +
	    	     "<br><b> green </b> (<font color='#0000FF'> ������� </font>) " +
	    	     "<br>(<font color='#00FF00'>������</font>)" +
	    	     "<br><b> silver </b> (<font color='#0000FF'> �������� </font>) " +
	    	     "<br>(<font color='#00FF00'>������</font>)" +
	    	     "<br><b> gold </b> (<font color='#0000FF'> ����� </font>) " +	    	     
	    	     "<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>�������</u></h5>" +
	    	     "<br>(<font color='#00FF00'>�������</font>)" +
	    	     "<br><b> square </b> (<font color='#0000FF'> ��������� </font>) " + 
	    	     "<br>(<font color='#00FF00'>�����</font>)" +
	    	     "<br><b> circle </b> (<font color='#0000FF'> ������ </font>) " +
	    	     "<br>(<font color='#00FF00'>��������</font>)" +
	    	     "<br><b> triangle </b> (<font color='#0000FF'> ������� </font>) " +
	    	     "<br>(<font color='#00FF00'>���������</font>)" +
	    	     "<br><b> rectangle </b> (<font color='#0000FF'> ��������� </font>) " +
	    	     "<br>(<font color='#00FF00'>����</font>)" +
	    	     "<br><b> oval </b> (<font color='#0000FF'> ���� </font>) " +
	    	     "<br>(<font color='#00FF00'>��������</font>)" +
	    	     "<br><b> octagon </b> (<font color='#0000FF'> �������� </font>) " +
	    	     "<br>(<font color='#00FF00'>������</font>)" +
	    	     "<br><b> cube </b> (<font color='#0000FF'> ����� </font>) " +
	    	     "<br>(<font color='#00FF00'>����</font>)" +
	    	     "<br><b> sphere </b> (<font color='#0000FF'> ������ </font>) " +
	    	     "<br>(<font color='#00FF00'>�����</font>)" +
	    	     "<br><b> cone </b> (<font color='#0000FF'> ����� </font>) " +
	    	     "<br>(<font color='#00FF00'>��������</font>)" +
	    	     "<br><b> cylinder </b> (<font color='#0000FF'> ��������� </font>) " +	    	    
	    	     "<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>������������</u></h5>" +
	    	     "<br>(<font color='#00FF00'>����</font>)" +
	    	     "<br><b> North </b> (<font color='#0000FF'> ������</font>) " +  
	    	     "<br>(<font color='#00FF00'>�����</font>)" +
	    	     "<br><b> South </b> (<font color='#0000FF'> �����</font>) " +
	    	     "<br>(<font color='#00FF00'>���</font>)" +
	    	     "<br><b> East </b> (<font color='#0000FF'> ���������</font>) " +
	    	     "<br>(<font color='#00FF00'>������</font>)" +
	    	     "<br><b> West </b> (<font color='#0000FF'> ������</font>) " +
	    	     "<br>(<font color='#00FF00'>����</font>)" +
	    	     "<br><b> right </b> (<font color='#0000FF'> �����</font>) " +
	    	     "<br>(<font color='#00FF00'>����</font>)" +
	    	     "<br><b> left </b> (<font color='#0000FF'> ��������</font>) " + 
	    	     "<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>� ������</u></h5>" +
	    	     "<br>(<font color='#00FF00'>���� �� �� ������� �������?</font>)" +
	    	     "<br><b> How is the weather today? </b> (<font color='#0000FF'> ��� ����� � ������ ������?</font>) " +  
	    	     "<br>(<font color='#00FF00'>�� ��������� ����</font>)" +
	    	     "<br><b> It looks like rain. </b> (<font color='#0000FF'> �������� �� ������</font>) " +
	    	     "<br>(<font color='#00FF00'>�� �� �����</font>)" +
	    	     "<br><b> It is cold </b> (<font color='#0000FF'> ����� ����</font>) " +
	    	     "<br>(<font color='#00FF00'>���</font>)" +
	    	     "<br><b> hot </b> (<font color='#0000FF'> ����� (����)</font>) " +
	    	     "<br>(<font color='#00FF00'>�����</font>)" +
	    	     "<br><b> clear </b> (<font color='#0000FF'> ������</font>) " + 
	    	     "<br>(<font color='#00FF00'>����</font>)" +
	    	     "<br><b> icy </b> (<font color='#0000FF'> ��������</font>) " + 
	    	     "<br>(<font color='#00FF00'>������</font>)" +
	    	     "<br><b> warm </b> (<font color='#0000FF'> �����</font>) " + 
	    	     "<br>(<font color='#00FF00'>�������</font>)" +
	    	     "<br><b> windy </b> (<font color='#0000FF'> ��������</font>) " + 
	    	     "<br>(<font color='#00FF00'>��������</font>)" +
	    	     "<br><b> cloudy </b> (<font color='#0000FF'> ��������</font>) " + 
	    	     "<br>(<font color='#00FF00'>�����</font>)" +
	    	     "<br><b> muggy </b> (<font color='#0000FF'> ����������</font>) " + 
	    	     "<br>(<font color='#00FF00'>��������</font>)" +
	    	     "<br><b> humid </b> (<font color='#0000FF'> �������</font>) " + 
	    	     "<br>(<font color='#00FF00'>�����</font>)" +
	    	     "<br><b> foggy </b> (<font color='#0000FF'> ���������</font>) " + 
	    	     "<br>(<font color='#00FF00'>�� �� ���������</font>)" +
	    	     "<br><b> It is snowing </b> (<font color='#0000FF'> ��������</font>) " + 
	    	     "<br>(<font color='#00FF00'>�� �� ��������</font>)" +
	    	     "<br><b> It is raining </b> (<font color='#0000FF'> ������</font>) " + 
	    	     "<br>(<font color='#00FF00'>�� �� ��������</font>)" +
	    	     "<br><b> It is freezing </b> (<font color='#0000FF'> ����� ����</font>) " + 
	    		 "<br><br><br> <h6>***����� ������ ���������***</h6>"));
	     
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

