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
        t0.setText(Html.fromHtml("<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>�� �����</u></h5>"));
        	setalign0(t0);
        	Linear.addView(t0);
    	
    	 TextView t1 = new TextView(this);  
	     t1.setText(Html.fromHtml("(<font color='#00FF00'>������</font>) " +
	    		 "<br><b> Monday </b> (<font color='#0000FF'> ������� </font>)" +
	    	     "<br>(<font color='#00FF00'>���������</font>)" +
	    	     "<br><b> Tuesday </b> (<font color='#0000FF'> ����� </font>)" +
	    	     "<br>(<font color='#00FF00'>�������������</font>)" +
	    	     "<br><b> Wednesday </b> (<font color='#0000FF'> ������� </font>) " +
	    	     "<br>(<font color='#00FF00'>��������</font>)" +
	    	     "<br><b> Thursday </b> (<font color='#0000FF'> ������ </font>) " +
	    	     "<br>(<font color='#00FF00'>��������</font>)" +
	    	     "<br><b> Friday </b> (<font color='#0000FF'> ��������� </font>) " +
	    	     "<br>(<font color='#00FF00'>���������</font>)" +
	    	     "<br><b> Saturday </b> (<font color='#0000FF'> ������� </font>) " +
	    	     "<br>(<font color='#00FF00'>������</font>)" +
	    	     "<br><b> Sunday </b> (<font color='#0000FF'> ������� </font>)" +
	    	     "<br>(<font color='#00FF00'>����</font>)" +
	    	     "<br><b> day </b> (<font color='#0000FF'> ���� </font>) " +
	    	     "<br>(<font color='#00FF00'>��������</font>)" +
	    	     "<br><b> morning </b> (<font color='#0000FF'> ���� </font>) " +
	    	     "<br>(<font color='#00FF00'>���������</font>)" +
	    	     "<br><b> afternoon </b> (<font color='#0000FF'> �������� </font>) " +
	    	     "<br>(<font color='#00FF00'>�������</font>)" +
	    	     "<br><b> evening </b> (<font color='#0000FF'> �������� </font>) " +
	    	     "<br>(<font color='#00FF00'>����</font>)" +
	    	     "<br><b> night </b> (<font color='#0000FF'> ����� </font>) " +
	    	     "<br>(<font color='#00FF00'>�������</font>)" +
	    	     "<br><b> today </b> (<font color='#0000FF'> ������ </font>) " +
	    	     "<br>(<font color='#00FF00'>���������</font>)" +
	    	     "<br><b> tomorrow </b> (<font color='#0000FF'> ����� </font>) " +
	    	     "<br>(<font color='#00FF00'>�������</font>)" +
	    	     "<br><b> tonight </b> (<font color='#0000FF'> ������ </font>) " +
	    	     "<br>(<font color='#00FF00'>����������</font>)" +
	    	     "<br><b> yesterday </b> (<font color='#0000FF'> ���� </font>) " +
	    	     "<br>(<font color='#00FF00'>���� ����</font>)" +
	    	     "<br><b> last night </b> (<font color='#0000FF'> ���� ����� </font>) " +
	    	     "<br>(<font color='#00FF00'>���� �����</font>)" +
	    	     "<br><b> week </b> (<font color='#0000FF'> ������� </font>) " +
	    	     "<br>(<font color='#00FF00'>��������</font>)" +
	    	     "<br><b> weekend </b> (<font color='#0000FF'> ���/������� </font>) " +
	    	     "<br>(<font color='#00FF00'>������</font>)" +
	    	     "<br><b> daily </b> (<font color='#0000FF'> ���������� </font>) " +
	    	     "<br>(<font color='#00FF00'>�������</font>)" +
	    	     "<br><b> weekly </b> (<font color='#0000FF'> ����������� </font>) " +
	    	     "<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>�� �����</u></h5>" +
	    	     "<br>(<font color='#00FF00'>���������</font>)" +
	    	     "<br><b> January </b> (<font color='#0000FF'> ���������� </font>) " + 
	    	     "<br>(<font color='#00FF00'>����������</font>)" +
	    	     "<br><b> February </b> (<font color='#0000FF'> ��������</font>) " +
	    	     "<br>(<font color='#00FF00'>�����</font>)" +
	    	     "<br><b> March </b> (<font color='#0000FF'> ������</font>) " +
	    	     "<br>(<font color='#00FF00'>������</font>)" +
	    	     "<br><b> April </b> (<font color='#0000FF'> �������</font>) " +
	    	     "<br>(<font color='#00FF00'>���</font>)" +
	    	     "<br><b> May </b> (<font color='#0000FF'> �����</font>) " +
	    	     "<br>(<font color='#00FF00'>�����</font>)" +
	    	     "<br><b> June </b> (<font color='#0000FF'> �������</font>) " +
	    	     "<br>(<font color='#00FF00'>�������</font>)" +
	    	     "<br><b> July </b> (<font color='#0000FF'> �������</font>) " +
	    	     "<br>(<font color='#00FF00'>�������</font>)" +
	    	     "<br><b> August </b> (<font color='#0000FF'> ���������</font>) " +
	    	     "<br>(<font color='#00FF00'>���������</font>)" +
	    	     "<br><b> September </b> (<font color='#0000FF'> ����������</font>) " +
	    	     "<br>(<font color='#00FF00'>��������</font>)" +
	    	     "<br><b> October </b> (<font color='#0000FF'> ��������</font>) " +
	    	     "<br>(<font color='#00FF00'>��������</font>)" +
	    	     "<br><b> November </b> (<font color='#0000FF'> ��������</font>) " +  
	    	     "<br>(<font color='#00FF00'>���������</font>)" +
	    	     "<br><b> December </b> (<font color='#0000FF'> ����������</font>) " +
	    	     "<br>(<font color='#00FF00'>����</font>)" +
	    	     "<br><b> month </b> (<font color='#0000FF'> �����</font>) " +
	    	     "<br>(<font color='#00FF00'>����</font>)" +
	    	     "<br><b> year </b> (<font color='#0000FF'> ������</font>) " +
	    	     "<br>(<font color='#00FF00'>������</font>)" +
	    	     "<br><b> monthly </b> (<font color='#0000FF'> �������</font>) " +
	    	     "<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>�� ������</u></h5>" +
	    	     "<br>(<font color='#00FF00'>��������</font>)" +
	    	     "<br><b> Winter </b> (<font color='#0000FF'> ��������</font>) " +  
	    	     "<br>(<font color='#00FF00'>�������</font>)" +
	    	     "<br><b> Spring </b> (<font color='#0000FF'> ������</font>) " +
	    	     "<br>(<font color='#00FF00'>�����</font>)" +
	    	     "<br><b> Summer </b> (<font color='#0000FF'> ���������</font>) " +
	    	     "<br>(<font color='#00FF00'>�����</font>)" +
	    	     "<br><b> Autumn </b> (<font color='#0000FF'> ���������</font>) " +
	    	     "<br>(<font color='#00FF00'>�����</font>)" +
	    	     "<br><b> Season </b> (<font color='#0000FF'> �����</font>) " +
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
