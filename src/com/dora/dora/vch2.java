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
        t0.setText(Html.fromHtml("<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>�� �������</u></h5>"));
        	setalign0(t0);
        	Linear.addView(t0);
    	
    	 TextView t1 = new TextView(this);  
	     t1.setText(Html.fromHtml("(<font color='#00FF00'>������</font>)" +
	     "<br><b> Zero </b> (<font color='#0000FF'> ����� </font>)" +
	     "<br>(<font color='#00FF00'>�����</font>)" +
	     "<br><b> One </b> (<font color='#0000FF'> ��� </font>)" +
	     "<br>(<font color='#00FF00'>���</font>)" +
	     "<br><b> Two </b> (<font color='#0000FF'> ��� </font>) " +
	     "<br>(<font color='#00FF00'>���</font>)" +
	     "<br><b> Three </b> (<font color='#0000FF'> ���� </font>) " +
	     "<br>(<font color='#00FF00'>���</font>)" +
	     "<br><b> Four </b> (<font color='#0000FF'> ������� </font>) " +
	     "<br>(<font color='#00FF00'>����</font>)" +
	     "<br><b> Five </b> (<font color='#0000FF'> ����� </font>) " +
	     "<br>(<font color='#00FF00'>���</font>)" +
	     "<br><b> Six </b> (<font color='#0000FF'> ��� </font>)" +
	     "<br>(<font color='#00FF00'>�����</font>)" +
	     "<br><b> Seven </b> (<font color='#0000FF'> ���� </font>) " +
	     "<br>(<font color='#00FF00'>���</font>)" +
	     "<br><b> Eight </b> (<font color='#0000FF'> ���� </font>) " +
	     "<br>(<font color='#00FF00'>����</font>)" +
	     "<br><b> Nine </b> (<font color='#0000FF'> ����� </font>) " +
	     "<br>(<font color='#00FF00'>���</font>)" +
	     "<br><b> Ten </b> (<font color='#0000FF'> ���� </font>) " +
	     "<br>(<font color='#00FF00'>������</font>)" +
	     "<br><b> Eleven </b> (<font color='#0000FF'> ������ </font>) " +
	     "<br>(<font color='#00FF00'>������</font>)" +
	     "<br><b> Twelve </b> (<font color='#0000FF'> ������ </font>) " +
	     "<br>(<font color='#00FF00'>������</font>)" +
	     "<br><b> Thirteen </b> (<font color='#0000FF'> �������� </font>) " +
	     "<br>(<font color='#00FF00'>������</font>)" +
	     "<br><b> Fourteen </b> (<font color='#0000FF'> ����������� </font>) " +
	     "<br>(<font color='#00FF00'>������</font>)" +
	     "<br><b> Fifteen </b> (<font color='#0000FF'> ��������� </font>) " +
	     "<br>(<font color='#00FF00'>������</font>)" +
	     "<br><b> Sixteen </b> (<font color='#0000FF'> ������� </font>) " +
	     "<br>(<font color='#00FF00'>��������</font>)" +
	     "<br><b> Seventeen </b> (<font color='#0000FF'> �������� </font>) " +
	     "<br>(<font color='#00FF00'>�����</font>)" +
	     "<br><b> Eighteen </b> (<font color='#0000FF'> �������� </font>) " +
	     "<br>(<font color='#00FF00'>�������</font>)" +
	     "<br><b> Neinteen </b> (<font color='#0000FF'> ��������� </font>) " +
	     "<br>(<font color='#00FF00'>�������</font>)" +
	     "<br><b> Twenty </b> (<font color='#0000FF'> ������ </font>) " +
	     "<br>(<font color='#00FF00'>������� �����</font>)" +
	     "<br><b> Twenty one </b> (<font color='#0000FF'> ������ ��� </font>) " +
	     "<br>(<font color='#00FF00'>������� ���</font>)" +
	     "<br><b> Twenty two </b> (<font color='#0000FF'> ������ ���</font>) " +
	     "<br>(<font color='#00FF00'>������� ���</font>)" +
	     "<br><b> Twenty three </b> (<font color='#0000FF'> ������ ����</font>) " +
	     "<br>(<font color='#00FF00'>������� ���</font>)" +
	     "<br><b> Twenty four </b> (<font color='#0000FF'> ������ �������</font>) " +
	     "<br>(<font color='#00FF00'>������� ����</font>)" +
	     "<br><b> Twenty five </b> (<font color='#0000FF'> ������ �����</font>) " +
	     "<br>(<font color='#00FF00'>������� ���</font>)" +
	     "<br><b> Twenty six </b> (<font color='#0000FF'> ������ ���</font>) " +
	     "<br><b>." +
	     "<br>." +
	     "<br>.</b>" +
	     "<br>(<font color='#00FF00'>�����</font>)" +
	     "<br><b> Thirty </b> (<font color='#0000FF'> �������</font>)" +
	     "<br>(<font color='#00FF00'>����� �����</font>)" +
	     "<br><b> Thirty one </b> (<font color='#0000FF'> ������� ���</font>) " +
	     "<br>(<font color='#00FF00'>����� ���</font>)" +
	     "<br><b> Thirty two </b> (<font color='#0000FF'> ������� ���</font>) " +
	     "<br><b>." +
	     "<br>." +
	     "<br>.</b>" +
	     "<br>(<font color='#00FF00'>�����</font>)" +
	     "<br><b> Fourty </b> (<font color='#0000FF'> �������</font>) " +
	     "<br>(<font color='#00FF00'>�����</font>)" +
	     "<br><b> Fifty </b> (<font color='#0000FF'> �������</font>) " +
	     "<br>(<font color='#00FF00'>�����</font>)" +
	     "<br><b> Sixty </b> (<font color='#0000FF'> ������</font>) " +
	     "<br>(<font color='#00FF00'>�������</font>)" +
	     "<br><b> Seventy </b> (<font color='#0000FF'> ���������</font>) " +
	     "<br>(<font color='#00FF00'>����</font>)" +
	     "<br><b> Eighty </b> (<font color='#0000FF'> �������</font>) " +
	     "<br>(<font color='#00FF00'>������</font>)" +
	     "<br><b> Ninety </b> (<font color='#0000FF'> ��������</font>) " +
	     "<br>(<font color='#00FF00'>����� ��������</font>)" +
	     "<br><b> One hundred </b> (<font color='#0000FF'> �����</font>) " +
	     "<br>(<font color='#00FF00'>����� �������� ������� �����</font>)" +
	     "<br><b> One hundred twenty one </b> (<font color='#0000FF'> ����� ������ ���</font>) " +
	     "<br>(<font color='#00FF00'>��� ��������</font>)" +
	     "<br><b> Two hundred </b> (<font color='#0000FF'> ��������</font>) " +
	     "<br>(<font color='#00FF00'>��� ��������</font>)" +
	     "<br><b> Three hundred </b> (<font color='#0000FF'> ���������</font>) " +
	     "<br><b>." +
	     "<br>." +
	     "<br>.</b>" +
	     "<br>(<font color='#00FF00'>����� ������</font>)" +
	     "<br><b> One million </b> (<font color='#0000FF'> ��� �����������</font>) " +
	     "<br>(<font color='#00FF00'>��� ������</font>)" +
	     "<br><b> Two million </b> (<font color='#0000FF'> ��� �����������</font>) " +
	     "<br>" +
	     "<br><b>." +
	     "<br>." +
	     "<br>.</b>" +
	     "<br>(<font color='#00FF00'>����� �������</font>)" +
	     "<br><b> One billion </b> (<font color='#0000FF'> ��� ��������������</font>) " +
	     "<br>(<font color='#00FF00'>����</font>)" +
	     "<br><b> day </b> (<font color='#0000FF'> ����</font>) " +
	     "<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>� ���</u></h5>" +
	     "<br><br>(<font color='#00FF00'>����� ���� �� ��?</font>)" +
	     "<br><b> What time is it? </b> (<font color='#0000FF'> �� ��� �����? </font>)" +
	     "<br><br>(<font color='#00FF00'>������ �� ����?</font>)" +
	     "<br><b> What's the time? </b> (<font color='#0000FF'> �� ��� �����? </font>)" +
	     "<br><br>(<font color='#00FF00'>��� ��� �-���� </font>)" +
	     "<br><b> It's two o'clock </b> (<font color='#0000FF'> ����� ��� � ��� </font>)" +
	     "<br>(<font color='#00FF00'>�� �� ��� �� ��</font>)" +
	     "<br><b> (It is) 2 AM </b> (<font color='#0000FF'> ����� 2 �.�. </font>)" +
	     "<br>(<font color='#00FF00'>�� �� ��� �� ��</font>)" +
	     "<br><b> (It is) 2 PM </b> (<font color='#0000FF'> ����� 2 �.�. </font>)" +
	     "<br>(<font color='#00FF00'>�� �� ������� ���� ���</font>)" +
	     "<br><b> It is twenty past six </b> (<font color='#0000FF'> ����� ��� ��� ������ </font>)" +
	     "<br>(<font color='#00FF00'>����� ���� �� ��?</font>)" +
	     "<br><b> It is five to 10 </b> (<font color='#0000FF'> ����� ���� ���� ����� </font>)" +
	     "<br>(<font color='#00FF00'>��� �������� ���� ���</font>)" +
	     "<br><b> It's quarter past two </b> (<font color='#0000FF'> ����� ��� ��� ������� </font>)" +
	     "<br>(<font color='#00FF00'>��� �������� ��� ����</font>)" +
	     "<br><b> It's quarter too nine </b> (<font color='#0000FF'> ����� ����� ���� ������� </font>)" +
	     "<br><br> <h6>***����� �������� ���������***</h6>"   ));
	     
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
