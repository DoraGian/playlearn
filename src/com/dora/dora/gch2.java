package com.dora.dora;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class gch2 extends Activity {
	
	LinearLayout Linear;
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notebook) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		
		Linear  = (LinearLayout)findViewById(R.id.linear);	 
        
        TextView t0 = new TextView(this);
        t0.setText(Html.fromHtml("<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Present Continuous</u></h5>"));
        setalign0(t0);
   		Linear.addView(t0);
   		
   		TextView t1 = new TextView(this);
   		t1.setText(Html.fromHtml("� <b>Present Continuous</b> (��������� ���������) " +
   				"����� ���� ��� ���� 12 ������� ���� ������� ������. ���� �������� ������ �� ������ ����� 8." +
   				"<br><br>� <b>Present Continuous</b> ��������������� ��� ������� ��� :" +
    			"<br><b>1</b>) �������� �� ������ ��� ������." +
    			"<br><b>2</b>) �� ������ ��� ���� ������� ������<sup><font color='#ff0000'>*</font></sup> ." +
    			"<br><b>3</b>) ����� ��������� ��������<sup><font color='#ff0000'>**</font></sup>." +
    			"<br><b>4</b>) ����� ������������ ��������." +
    			"<br><br>� ��������� ��������� ������������ �� �� ������� ��� ������� <b>be</b> ��� ������ ��� ����������� �������� -<b>ing</b>." +
    			"�� ����� ������� ������������ :" +
    			"<br><br> <u><b>stay</b></u> (<font color='#0000FF'>����</font>) <(<font color='#00FF00'>����</font>)br>" +
    			"<br>I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>am</b></font>&nbsp;&nbsp;&nbsp;stay<b><font color='#ff0000'><u>ing</u></font></b> (<font color='#00FF00'>�������</font>)" +
    			"<br>You &nbsp;<font color='#ff0000'><b>are</b></font>&nbsp;&nbsp; stay<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>He &nbsp;&nbsp; <font color='#ff0000'><b>is</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;stay<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>She &nbsp; <font color='#ff0000'><b>is</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;stay<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>It &nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>is&nbsp;&nbsp;&nbsp;</b></font>&nbsp;&nbsp;stay<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>We &nbsp;&nbsp; <font color='#ff0000'><b>are</b></font>&nbsp;&nbsp;stay<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>You &nbsp; <font color='#ff0000'><b>are</b></font>&nbsp;&nbsp;stay<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>They <font color='#ff0000'><b>are</b></font>&nbsp;&nbsp;stay<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br><br> <u><b>clean</b></u> (<font color='#0000FF'>��������</font>) (<font color='#00FF00'>����</font>)<br>" +
    			"<br>I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>am</b></font>&nbsp;&nbsp;&nbsp;clean<b><font color='#ff0000'><u>ing</u></font></b> (<font color='#00FF00'>��������</font>)" +
    			"<br>You &nbsp;<font color='#ff0000'><b>are</b></font>&nbsp;&nbsp; clean<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>He &nbsp;&nbsp; <font color='#ff0000'><b>is</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;clean<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>She &nbsp; <font color='#ff0000'><b>is</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;clean<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>It &nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>is&nbsp;&nbsp;&nbsp;</b></font>&nbsp;&nbsp;clean<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>We &nbsp;&nbsp; <font color='#ff0000'><b>are</b></font>&nbsp;&nbsp;clean<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>You &nbsp; <font color='#ff0000'><b>are</b></font>&nbsp;&nbsp;clean<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>They <font color='#ff0000'><b>are</b></font>&nbsp;&nbsp;clean<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br><br>���� ��� ���� ���� �������� ���� ��� ��� ������ ������� ������ ����������:" +
    			"<br><br>�� ������ ��� ���������� �� <b>�ie</b> ����������� �� �ie �� <u>�y</u> ��� ���� �������� ��� �������� -ing." +
    			"<br><br> <u><b>lie</b></u> (<font color='#0000FF'>�������</font>) (<font color='#00FF00'>���</font>)<br>" +
    			"<br>I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'>am</font>&nbsp;&nbsp;&nbsp;li<font color='#ff0000'><u><b>y</b>ing</u></font> (<font color='#00FF00'>������</font>)" +
    			"<br>You &nbsp;<font color='#ff0000'>are</font>&nbsp;&nbsp; li<font color='#ff0000'><u><b>y</b>ing</u></font>" +
    			"<br>He &nbsp;&nbsp; <font color='#ff0000'>is</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;li<font color='#ff0000'><u><b>y</b>ing</u></font>" +
    			"<br>She &nbsp; <font color='#ff0000'>is</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;li<font color='#ff0000'><u><b>y</b>ing</u></font>" +
    			"<br>It &nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'>is&nbsp;&nbsp;&nbsp;</font>&nbsp;&nbsp;li<font color='#ff0000'><u><b>y</b>ing</u></font>" +
    			"<br>We &nbsp;&nbsp; <font color='#ff0000'>are</font>&nbsp;&nbsp;li<font color='#ff0000'><u><b>y</b>ing</u></font>" +
    			"<br>You &nbsp; <font color='#ff0000'>are</font>&nbsp;&nbsp;li<font color='#ff0000'><u><b>y</b>ing</u></font>" +
    			"<br>They <font color='#ff0000'>are</font>&nbsp;&nbsp;li<font color='#ff0000'><u><b>y</b>ing</u></font>" +
    			"<br><br>�� ������ ��� ���������� �� <b>�l</b> �� ������������ ��� ���� �������� ��� �������� -ing." +
    			"<br><br> <u><b>travel</b></u> (<font color='#0000FF'>��������</font>) (<font color='#00FF00'>������</font>)<br>" +
    			"<br>I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'>am</font>&nbsp;&nbsp;&nbsp;travel<font color='#ff0000'><u><b>l</b>ing</u></font>  (<font color='#00FF00'>����������</font>)" +
    			"<br>You &nbsp;<font color='#ff0000'>are</font>&nbsp;&nbsp; travel<font color='#ff0000'><u><b>l</b>ing</u></font>" +
    			"<br>He &nbsp;&nbsp; <font color='#ff0000'>is</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;travel<font color='#ff0000'><u><b>l</b>ing</u></font>" +
    			"<br>She &nbsp; <font color='#ff0000'>is</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;travel<font color='#ff0000'><u><b>l</b>ing</u></font>" +
    			"<br>It &nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'>is&nbsp;&nbsp;&nbsp;</font>&nbsp;&nbsp;travel<font color='#ff0000'><u><b>l</b>ing</u></font>" +
    			"<br>We &nbsp;&nbsp; <font color='#ff0000'>are</font>&nbsp;&nbsp;travel<font color='#ff0000'><u><b>l</b>ing</u></font>" +
    			"<br>You &nbsp; <font color='#ff0000'>are</font>&nbsp;&nbsp;travel<font color='#ff0000'><u><b>l</b>ing</u></font>" +
    			"<br>They <font color='#ff0000'>are</font>&nbsp;&nbsp;travel<font color='#ff0000'><u><b>l</b>ing</u></font>" +
    			"<br><br>�� ������ ��� ���������� �� <b>-e</b> (��� �e, ��� ���)<u> ������ �� �e</u> ��� ���� �������� ��� �������� -ing." +
    			"<br><br> <u><b>take</b></u> (<font color='#0000FF'>������</font>) (<font color='#00FF00'>����</font>)<br>" +
    			"<br>I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>am</b></font>&nbsp;&nbsp;&nbsp;tak<b><font color='#ff0000'><u>ing</u></font></b> (<font color='#00FF00'>��������</font>)" +
    			"<br>You &nbsp;<font color='#ff0000'><b>are</b></font>&nbsp;&nbsp; tak<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>He &nbsp;&nbsp; <font color='#ff0000'><b>is</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tak<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>She &nbsp; <font color='#ff0000'><b>is</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;tak<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>It &nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>is&nbsp;&nbsp;&nbsp;</b></font>&nbsp;&nbsp;tak<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>We &nbsp;&nbsp; <font color='#ff0000'><b>are</b></font>&nbsp;&nbsp;tak<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>You &nbsp; <font color='#ff0000'><b>are</b></font>&nbsp;&nbsp;tak<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br>They <font color='#ff0000'><b>are</b></font>&nbsp;&nbsp;tak<b><font color='#ff0000'><u>ing</u></font></b>" +
    			"<br><br>�� ������ �� ������������ ��� ��� ��������, ��� ������ ���� � ��������� ������� ��������� �� ������� ��� ���� ���� ��� ���� ������, <b>������������ �� ������ �������</b>." +
    			"<br><br> <u><b>stop</b></u> (<font color='#0000FF'>��������</font>) (<font color='#00FF00'>����</font>)<br>" +
    			"<br>I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'>am</font>&nbsp;&nbsp;&nbsp;stop<font color='#ff0000'><u><b>p</b>ing</u></font> (<font color='#00FF00'>��������</font>)" +
    			"<br>You &nbsp;<font color='#ff0000'>are</font>&nbsp;&nbsp; stop<font color='#ff0000'><u><b>p</b>ing</u></font>" +
    			"<br>He &nbsp;&nbsp; <font color='#ff0000'>is</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;stop<font color='#ff0000'><u><b>p</b>ing</u></font>" +
    			"<br>She &nbsp; <font color='#ff0000'>is</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;stop<font color='#ff0000'><u><b>p</b>ing</u></font>" +
    			"<br>It &nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'>is&nbsp;&nbsp;&nbsp;</font>&nbsp;&nbsp;stop<font color='#ff0000'><u><b>p</b>ing</u></font>" +
    			"<br>We &nbsp;&nbsp; <font color='#ff0000'>are</font>&nbsp;&nbsp;stop<font color='#ff0000'><u><b>p</b>ing</u></font>" +
    			"<br>You &nbsp; <font color='#ff0000'>are</font>&nbsp;&nbsp;stop<font color='#ff0000'><u><b>p</b>ing</u></font>" +
    			"<br>They <font color='#ff0000'>are</font>&nbsp;&nbsp;stop<font color='#ff0000'><u><b>p</b>ing</u></font>" +
    			"<br><br>� <b>Present Continuous</b> ����������� �������� �� ��������� ���� :" +
    			"<br> (<font color='#00FF00'>����</font>)" +
    			"<br><b>now </b> (<font color='#0000FF'>����</font>) " +
    			"<br> (<font color='#00FF00'>�� �� ������</font>)" +
    			"<br><b>at the moment</b> (<font color='#0000FF'>���� �� ������</font>) " +
    			"<br> (<font color='#00FF00'>����</font>)" +
    			"<br><b>still </b> (<font color='#0000FF'>�����</font>) " +
    			"<br> (<font color='#00FF00'>��� �� ���� �������</font>)" +
    			"<br><b>for the time being </b> (<font color='#0000FF'>��� ����</font>) " +
    			"" +
    			"<br><br><br><h6>***����� �������� ���������***</h6>" +
    			"<br><font color='#ff0000'><sup>*</sup>�������� ��� ��� ������� ��� ��������� ��� �� ��� ����������.</font>" +
    			"<br><font color='#ff0000'><sup>**</sup>��� ���������� '��� ���� ������������ �������� ���� �� �������'.���� ���� ��� ���� ��� ��������.</font>" +
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
