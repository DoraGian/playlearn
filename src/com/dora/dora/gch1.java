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
	        t0.setText(Html.fromHtml("<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <u>�� ���� �����</u></h5>" +
	        		"<br>(<font color='#00FF00'>�� ��</font>)" +
	        		"<br><h8>I    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <b>am</b>&nbsp;&nbsp; = &nbsp;&nbsp; <font color='#0000FF'>��� &nbsp;&nbsp;&nbsp; <b>�����</font></b>" +
	        		"<br>(<font color='#00FF00'>���� ��</font>)" +
	        		"<br>you  &nbsp; <b>are</b>&nbsp;&nbsp; = &nbsp;&nbsp; <font color='#0000FF'>��� &nbsp;&nbsp;&nbsp;&nbsp; <b>�����</font></b>" +
	        		"<br>(<font color='#00FF00'>�� ��</font>)" +
	        		"<br>He   &nbsp;&nbsp;&nbsp; <b>is</b>&nbsp;&nbsp;&nbsp;&nbsp; = &nbsp;&nbsp;<font color='#0000FF'> ����� &nbsp; <b>�����</font></b>" +
	        		"<br>(<font color='#00FF00'>�� ��</font>)" +
	        		"<br>She  &nbsp;&nbsp; <b>is</b>&nbsp;&nbsp;&nbsp;&nbsp; = &nbsp;&nbsp; <font color='#0000FF'>���� &nbsp;&nbsp; <b>�����</font></b>" +
	        		"<br>(<font color='#00FF00'>�� ��</font>)" +
	        		"<br>It   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <b>is</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; = &nbsp;&nbsp; <font color='#0000FF'>���� &nbsp;&nbsp; <b>�����</font></b>" +
	        		"<br>(<font color='#00FF00'>���� ��</font>)" +
	        		"<br>We   &nbsp;&nbsp;&nbsp; <b>are</b>&nbsp;&nbsp; = &nbsp;&nbsp; <font color='#0000FF'>����� &nbsp; <b>�������</font></b>" +
	        		"<br>(<font color='#00FF00'>���� ��</font>)" +
	        		"<br>You  &nbsp;&nbsp; <b>are</b>&nbsp;&nbsp; = &nbsp;&nbsp;<font color='#0000FF'> ����� &nbsp; <b>�����</font></b>" +
	        		"<br>(<font color='#00FF00'>��� ��</font>)" +
	        		"<br>They &nbsp; <b>are</b>&nbsp;&nbsp; = &nbsp;&nbsp;<font color='#0000FF'> ����� &nbsp; <b>�����</font></b></h8>"));	         
	        	setalign0(t0);
	        	Linear.addView(t0);
	        	
	        TextView t1 = new TextView(this);  
	        t1.setText(Html.fromHtml("<br>���� ������� ������ ���� �������� ��� ���� �� ���� ���� ��������� ������ ���� �� ��� �� �������, �� �������� �� ��� ��������.</p>" +
	        		"<p>�������� ����� ��� ������ ����� �� ���� <b>be</b>(<em>�����</em>) ���� ����� ������ ��� �� ���� <b>have</b>(<em>���</em>) (<font color='#00FF00'>���</font>)��� �� ����� ����.</p> " +
	        		"<br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; have" +
	    			"<br> You &nbsp; have" +
	    			"<br> He &nbsp;&nbsp;&nbsp; ha<b><font color='#ff0000'><u>s</u></font></b> (<font color='#00FF00'>���</font>)" +
	    			"<br> She &nbsp;&nbsp; ha<b><font color='#ff0000'><u>s</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ha<b><font color='#ff0000'><u>s</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp; have" +
	    			"<br> You &nbsp;&nbsp; have" +
	    			"<br> They &nbsp; have" +
	        		"<br><br>�� ���� �� �������� �� ����������� �� �� ����� ������ ����� ��� �������." +
	        		"��� <u>���� ��������  </u> (<b>Simple Present</b>) ." +
	        		"<br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <u>Simple Present</u></h5>" +
	        		"� <b>Simple Present</b> ��������������� ��� ��� ������� ��� ���������:" +
	    			"<br><b>1</b>) ��� �������� ��� �����" +
	    			"<br><b>2</b>) ��� ������ �������" +
	    			"<br><b>3</b>) ������� �����������/����������<font color='#ff0000'><b>*</b></font></sup>" +
	    			"<br><br>�� ����� ������ ��� ��������� �� ������ �� Simple Present." +
	    			"<br><br> <u><b>play</b></u> (<font color='#0000FF'>�����</font>) (<font color='#00FF00'>����</font>)" +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; play" +
	    			"<br> You &nbsp; play" +
	    			"<br> He &nbsp;&nbsp;&nbsp; play<b><font color='#ff0000'><u>s</u></font></b> (<font color='#00FF00'>�����</font>)" +
	    			"<br> She &nbsp;&nbsp; play<b><font color='#ff0000'><u>s</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; play<b><font color='#ff0000'><u>s</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp; play" +
	    			"<br> You &nbsp;&nbsp; play" +
	    			"<br> They &nbsp; play" +
	    			"<br><br> <u><b>sleep</b></u> (<font color='#0000FF'>��������</font>) (<font color='#00FF00'>����</font>) " +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; sleep" +
	    			"<br> You &nbsp; sleep" +
	    			"<br> He &nbsp;&nbsp;&nbsp; sleep<b><font color='#ff0000'><u>s</u></font></b> (<font color='#00FF00'>�����</font>)" +
	    			"<br> She &nbsp;&nbsp; sleep<b><font color='#ff0000'><u>s</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; sleep<b><font color='#ff0000'><u>s</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp; sleep" +
	    			"<br> You &nbsp;&nbsp; sleep" +
	    			"<br> They &nbsp; sleep" +
	    			"<br><br> <u><b>eat</b></u> (<font color='#0000FF'>����</font>) (<font color='#00FF00'>��</font>)" +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; eat" +
	    			"<br> You &nbsp; eat" +
	    			"<br> He &nbsp;&nbsp;&nbsp; eat<b><font color='#ff0000'><u>s</u></font></b> (<font color='#00FF00'>���</font>)" +
	    			"<br> She &nbsp;&nbsp; eat<b><font color='#ff0000'><u>s</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; eat<b><font color='#ff0000'><u>s</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp; eat" +
	    			"<br> You &nbsp;&nbsp; eat" +
	    			"<br> They &nbsp; eat" +
	    			"<br><br>���� ����������� ���� �� ������ ����� ���� �����.������������ ������ �� �������� �� ���� �� ����������," +
	    			" ����� ��� �� ����� ����� ������� <b>(he, she, it)</b>." +
	    			"<br>�� ����� ���� ����� ��� ����������� �������, ���� ������ ������ ��� ����� ������� �������� ��� ��������� ����." +
	    			"<br><br> <u><b>cry </b></u> (<font color='#0000FF'>�����</font>) (<font color='#00FF00'>����</font>)" +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; cry " +
	    			"<br> You &nbsp; cry " +
	    			"<br> He &nbsp;&nbsp;&nbsp; cr<b><font color='#ff0000'><u>ies</u></font></b> (<font color='#00FF00'>�����</font>)" +
	    			"<br> She &nbsp;&nbsp; cr<b><font color='#ff0000'><u>ies</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; cr<b><font color='#ff0000'><u>ies</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp; cry " +
	    			"<br> You &nbsp;&nbsp; cry " +
	    			"<br> They &nbsp; cry " +
	    			"<br><br> <u><b> study </b></u> (<font color='#0000FF'>�������</font>) (<font color='#00FF00'>������</font>)" +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  study " +
	    			"<br> You &nbsp;  study " +
	    			"<br> He &nbsp;&nbsp;&nbsp;  stud<b><font color='#ff0000'><u>ies</u></font></b> (<font color='#00FF00'>�������</font>)" +
	    			"<br> She &nbsp;&nbsp;  stud<b><font color='#ff0000'><u>ies</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  stud<b><font color='#ff0000'><u>ies</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp;  study " +
	    			"<br> You &nbsp;&nbsp;  study " +
	    			"<br> They &nbsp;  study " +
	    			"<br><br> <u><b> try </b></u> (<font color='#0000FF'>��������</font>) (<font color='#00FF00'>����</font>)" +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  try " +
	    			"<br> You &nbsp;  try " +
	    			"<br> He &nbsp;&nbsp;&nbsp;  tr<b><font color='#ff0000'><u>ies</u></font></b> (<font color='#00FF00'>�����</font>)" +
	    			"<br> She &nbsp;&nbsp;  tr<b><font color='#ff0000'><u>ies</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  tr<b><font color='#ff0000'><u>ies</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp;  try " +
	    			"<br> You &nbsp;&nbsp;  try " +
	    			"<br> They &nbsp;  try " +
	    			"<br><br>���� ����������� ���� �� ������ ����� �� ������ ���� ����� �������� <b>-y</b>." +
	    			"���� ������ ���� ���� �� ���� �� �������� �� �������� ���� ���� �� �����.�� ����� ��� �� ��������� ��� ��������." +
	    			"<br><br> <u><b> go </b></u> (<font color='#0000FF'>�������</font>) (<font color='#00FF00'>�����</font>)" +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  go " +
	    			"<br> You &nbsp;  go " +
	    			"<br> He &nbsp;&nbsp;&nbsp;  go<b><font color='#ff0000'><u>es</u></font></b> (<font color='#00FF00'>������</font>)" +
	    			"<br> She &nbsp;&nbsp;  go<b><font color='#ff0000'><u>es</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  go<b><font color='#ff0000'><u>es</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp;  go " +
	    			"<br> You &nbsp;&nbsp;  go " +
	    			"<br> They &nbsp;  go " +
	    			"<br><br> <u><b> press  </b></u> (<font color='#0000FF'>�����</font>) (<font color='#00FF00'>����</font>)" +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  press  " +
	    			"<br> You &nbsp;  press  " +
	    			"<br> He &nbsp;&nbsp;&nbsp;  press<b><font color='#ff0000'><u>es</u></font></b> (<font color='#00FF00'>������</font>)" +
	    			"<br> She &nbsp;&nbsp;  press<b><font color='#ff0000'><u>es</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  press<b><font color='#ff0000'><u>es</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp;  press  " +
	    			"<br> You &nbsp;&nbsp;  press  " +
	    			"<br> They &nbsp;  press  " +
	    			"<br><br> <u><b> crash  </b></u> (<font color='#0000FF'>��������</font>) (<font color='#00FF00'>����</font>)" +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  crash  " +
	    			"<br> You &nbsp;  crash  " +
	    			"<br> He &nbsp;&nbsp;&nbsp;  crash<b><font color='#ff0000'><u>es</u></font></b> (<font color='#00FF00'>������</font>)" +
	    			"<br> She &nbsp;&nbsp;  crash<b><font color='#ff0000'><u>es</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  crash<b><font color='#ff0000'><u>es</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp;  crash  " +
	    			"<br> You &nbsp;&nbsp;  crash  " +
	    			"<br> They &nbsp;  crash " +
	    			"<br><br> <u><b> teach  </b></u> (<font color='#0000FF'>�������</font>) (<font color='#00FF00'>����</font>)" +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  teach  " +
	    			"<br> You &nbsp;  teach  " +
	    			"<br> He &nbsp;&nbsp;&nbsp;  teach<b><font color='#ff0000'><u>es</u></font></b> (<font color='#00FF00'>������</font>)" +
	    			"<br> She &nbsp;&nbsp;  teach<b><font color='#ff0000'><u>es</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  teach<b><font color='#ff0000'><u>es</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp;  teach  " +
	    			"<br> You &nbsp;&nbsp;  teach  " +
	    			"<br> They &nbsp;  teach " +
	    			"<br><br> <u><b> fix  </b></u> (<font color='#0000FF'>��������</font>) (<font color='#00FF00'>���</font>)" +
	    			"<br><br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  fix  " +
	    			"<br> You &nbsp;  fix  " +
	    			"<br> He &nbsp;&nbsp;&nbsp;  fix<b><font color='#ff0000'><u>es</u></font></b> (<font color='#00FF00'>�����</font>)" +
	    			"<br> She &nbsp;&nbsp;  fix<b><font color='#ff0000'><u>es</u></font></b>" +
	    			"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  fix<b><font color='#ff0000'><u>es</u></font></b>" +
	    			"<br> We &nbsp;&nbsp;&nbsp;  fix  " +
	    			"<br> You &nbsp;&nbsp;  fix  " +
	    			"<br> They &nbsp;  fix " +
	    			"<br><br>���� ����������� ���� �� ������ ����� �� ������ ���� ����� ���������� <b>-ss, -sh, -ch, -o, -x</b>." +
	    			"���� ������ ���� ���� �� ����� ��� ���������� �� �������� ���� ���� �� �����." +
	    			"<br><br>� <b>Simple Present</b> ����������� �������� �� ��������� ���� :" +
	    			"<br> (<font color='#00FF00'>����</font>)" +
	    			"<br><b>often</b> (<font color='#0000FF'>����� </font>) " +
	    			"<br> (<font color='#00FF00'>�����</font>)" +
	    			"<br><b>never</b> (<font color='#0000FF'>���� </font>) " +
	    			"<br> (<font color='#0000FF'>������� �����</font>)" +
	    			"<br><b>sometimes</b> " +
	    			"<br> (<font color='#00FF00'>��������</font>)" +
	    			"<br><b>always</b> (<font color='#0000FF'>�����</font>) " +
	    			"<br> (<font color='#00FF00'>����������</font>)" +
	    			"<br><b>usually</b> (<font color='#0000FF'>�������</font>) " +
	    			"<br> (<font color='#00FF00'>�� �� ��������</font>)" +
	    			"<br><b>in the morning</b> (<font color='#0000FF'>�� ����</font>) " +
	    			"<br> (<font color='#00FF00'>�� �� �������</font>)" +
	    			"<br><b>in the evening</b> (<font color='#0000FF'>�� �����</font>) " +
	    			"<br> (<font color='#00FF00'>�� �� ���������</font>)" +
	    			"<br><b>in the afternoon</b> (<font color='#0000FF'>�� ��������</font>) " +
	    			"<br> (<font color='#00FF00'>�� ������ ��������</font>)" +
	    			"<br><b>on Sunday morning</b> (<font color='#0000FF'>��� ������� �� ����</font>) " +
	    			"<br> (<font color='#00FF00'>���� ����</font>)" +
	    			"<br><b>every day</b> (<font color='#0000FF'>���� ����</font>) " +
	    			"<br> (<font color='#00FF00'>���� �����</font>)" +
	    			"<br><b>every week</b> (<font color='#0000FF'>���� ��������</font>) " +
	    			"<br> (<font color='#00FF00'>���� ���������</font>)" +
	    			"<br><b>every Saturday</b> (<font color='#0000FF'>���� �������</font>) " +
	    			"<br> (<font color='#00FF00'>�� ����</font>)" +
	    			"<br><b>at night</b> (<font color='#0000FF'>�� �����</font>)  " +
	    			"<br> (<font color='#00FF00'>�� �� ��������</font>)" +
	    			"<br><b>at the weekend</b> (<font color='#0000FF'>�� ��������������</font>) " +
	    			"<br><br><br><h6>***����� ������ ���������***</h6>" +
	    			"<br><font color='#ff0000'>*<sub>��� ���������� �� ���������� ��� ����������/�����/���������.<sub></font>" +
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
