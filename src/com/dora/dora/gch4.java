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
   		t1.setText(Html.fromHtml("<br><br>� <b>Simple Present</b> (����� ���������) ��������������� ��� �� ������������ ������� ��� �� ������ ��� ������ :" +
    			"<br><b>1</b>) ����������." +
    			"<br><b>2</b>) ���������� ���������" +
    			"<br><b>3</b>) ����������" +
    			"<br><b>4</b>) �������" +
    			"<br><b>5</b>) ���������������" +
    			"<br><b>6</b>) ���� ������� ��� ������� �� ��� ����� ����" +
    			"<br><br>� ����� ��������� ������������ �� �� ������� ��� ����� <b>will</b> (��) ��� �� ���� �� ����������." +
    			"�� ����� ������� ������������ :" +
    			"<br><br> <u><b>buy</b></u> (<font color='#0000FF'>�������</font>) <(<font color='#00FF00'>����</font>)<br>" +
    			"<br>I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;&nbsp;buy (<font color='#00FF00'>����� ����</font>)" +
    			"<br>You &nbsp;<font color='#ff0000'><b>will</b></font>&nbsp;&nbsp; buy" +
    			"<br>He &nbsp;&nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;buy" +
    			"<br>She &nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;buy" +
    			"<br>It &nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>will</b>&nbsp;&nbsp;&nbsp;</font>&nbsp;&nbsp;buy" +
    			"<br>We &nbsp;&nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;buy" +
    			"<br>You &nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;buy" +
    			"<br>They <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;buy" +
    			"<br><br> <u><b>look</b></u> (<font color='#0000FF'>�������</font>) <(<font color='#00FF00'>����</font>)<br>" +
    			"<br>I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;&nbsp;look (<font color='#00FF00'>����� ����</font>)" +
    			"<br>You &nbsp;<font color='#ff0000'><b>will</b></font>&nbsp;&nbsp; look" +
    			"<br>He &nbsp;&nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;look" +
    			"<br>She &nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;look" +
    			"<br>It &nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>will</b>&nbsp;&nbsp;&nbsp;</font>&nbsp;&nbsp;look" +
    			"<br>We &nbsp;&nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;look" +
    			"<br>You &nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;look" +
    			"<br>They <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;look" +
    			"<br><br> <u><b>wait</b></u> (<font color='#0000FF'>��������</font>) <(<font color='#00FF00'>������</font>)<br>" +
    			"<br>I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;&nbsp;wait (<font color='#00FF00'>����� ������</font>)" +
    			"<br>You &nbsp;<font color='#ff0000'><b>will</b></font>&nbsp;&nbsp; wait" +
    			"<br>He &nbsp;&nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;wait" +
    			"<br>She &nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;wait" +
    			"<br>It &nbsp;&nbsp;&nbsp;&nbsp; <font color='#ff0000'><b>will</b>&nbsp;&nbsp;&nbsp;</font>&nbsp;&nbsp;wait" +
    			"<br>We &nbsp;&nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;wait" +
    			"<br>You &nbsp; <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;wait" +
    			"<br>They <font color='#ff0000'><b>will</b></font>&nbsp;&nbsp;wait" +
    			"<br>� <b>Simple Future</b> ����������� �������� �� ��������� ���� :" +
	    		"<br> (<font color='#00FF00'>���� �����</font>)" +
	    		"<br><b>next week</b> (<font color='#0000FF'>��� ������� �������� </font>) " +
	    		"<br> (<font color='#00FF00'>�� ��� �����</font>)" +
	    		"<br><b>in three days</b> (<font color='#0000FF'>�� ����� ����� </font>) " +
	    		"<br> (<font color='#00FF00'>�� �� ��������</font>)" +
	    		"<br><b>in the future</b> (<font color='#0000FF'>��� ������ </font>) " +
	    		"<br> (<font color='#00FF00'>�� �� ��������</font>)" +
	    		"<br><b>at the weekend</b> (<font color='#0000FF'>�� �������������� </font>) " +
	    		"<br><br> � <b>�������</b> ���� ���� �������� ������� �� �� ���� <b>will</b> ���� ���� ��� ��������. ��� ���������� :" +
	    		"<br><br>-He will go shopping(<font color='#0000FF'>�� ���� ��� �����.</font>) " +
	    		"<br>-<font color='#ff0000'>Will</font> he go shopping<font color='#ff0000'>?</font>(<font color='#0000FF'>�� ���� ��� �����;</font>) " +
	    		"<br><br> � <b>������</b> ���� ���� �������� ������� �� �� ���� <b>will</b> ��� �� <b>not</b>. ��� ���������� :" +
	    		"<br><br>-He will go shopping(<font color='#0000FF'>�� ���� ��� �����.</font>) " +
	    		"<br>-He<font color='#ff0000'>will not</font> go shopping< (<font color='#0000FF'>��� �� ���� ��� �����</font>) " +
	    		"<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Simple Past</u></h5>" +
	    		"<br><br>� <b>Simple Past</b> (����� ��������) ��������������� ��� �� ������������ ������� ��� ������ ��� �������� :" +
	    		"<br><b>1</b>) ��� ���������� ���� ������." +
    			"<br><b>2</b>) �������� ��� ������ ��� �������� ���� �� ������� ����" +
    			"<br><b>3</b>) ��� �� ������������ ��������" +
    			"<br><br>� ����� �������� ������������ �� �� �� ����������� ��� �������� <b>-ed</b> ��� ���� ��� :" +
    			"�� ����� ������� ������������ :" +
    			"<br><br> <u><b>finish</b></u> (<font color='#0000FF'>��������</font>) <(<font color='#00FF00'>�����</font>)<br>" +
    			"<br>I &nbsp;&nbsp; finish<font color='#ff0000'><b>ed</b></font> (<font color='#00FF00'>�������</font>)" +
    			"<br>You &nbsp;&nbsp; finish<font color='#ff0000'><b>ed</b></font>" +
    			"<br>He &nbsp;&nbsp; finish<font color='#ff0000'><b>ed</b></font>" +
    			"<br>She &nbsp;&nbsp; finish<font color='#ff0000'><b>ed</b></font>" +
    			"<br>It &nbsp;&nbsp; finish<font color='#ff0000'><b>ed</b></font>" +
    			"<br>We &nbsp;&nbsp; finish<font color='#ff0000'><b>ed</b></font>" +
    			"<br>You &nbsp;&nbsp; finish<font color='#ff0000'><b>ed</b></font>" +
    			"<br>They &nbsp;&nbsp; finish<font color='#ff0000'><b>ed</b></font>" +
    			"<br><br> <u><b>dance</b></u> (<font color='#0000FF'>������</font>) <(<font color='#00FF00'>�����</font>)<br>" +
    			"<br>I &nbsp;&nbsp; dance<font color='#ff0000'><b>ed</b></font> (<font color='#00FF00'>�������</font>)" +
    			"<br>You &nbsp;&nbsp; dance<font color='#ff0000'><b>ed</b></font>" +
    			"<br>He &nbsp;&nbsp; dance<font color='#ff0000'><b>ed</b></font>" +
    			"<br>She &nbsp;&nbsp; dance<font color='#ff0000'><b>ed</b></font>" +
    			"<br>It &nbsp;&nbsp; dance<font color='#ff0000'><b>ed</b></font>" +
    			"<br>We &nbsp;&nbsp; dance<font color='#ff0000'><b>ed</b></font>" +
    			"<br>You &nbsp;&nbsp; dance<font color='#ff0000'><b>ed</b></font>" +
    			"<br>They &nbsp;&nbsp; dance<font color='#ff0000'><b>ed</b></font>" +
    			"<br><br> <u><b>ask</b></u> (<font color='#0000FF'>�����</font>) <(<font color='#00FF00'>���</font>)<br>" +
    			"<br>I &nbsp;&nbsp; ask<font color='#ff0000'><b>ed</b></font> (<font color='#00FF00'>�����</font>)" +
    			"<br>You &nbsp;&nbsp; ask<font color='#ff0000'><b>ed</b></font>" +
    			"<br>He &nbsp;&nbsp; ask<font color='#ff0000'><b>ed</b></font>" +
    			"<br>She &nbsp;&nbsp; ask<font color='#ff0000'><b>ed</b></font>" +
    			"<br>It &nbsp;&nbsp; ask<font color='#ff0000'><b>ed</b></font>" +
    			"<br>We &nbsp;&nbsp; ask<font color='#ff0000'><b>ed</b></font>" +
    			"<br>You &nbsp;&nbsp; ask<font color='#ff0000'><b>ed</b></font>" +
    			"<br>They &nbsp;&nbsp; ask<font color='#ff0000'><b>ed</b></font>" +
    			"<br>� <b>Simple Past</b> ����������� �������� �� ��������� ���� :" +
	    		"<br> (<font color='#00FF00'>����������</font>)" +
	    		"<br><b>yesterday</b> (<font color='#0000FF'>����</font>) " +
	    		"<br> (<font color='#00FF00'>���� ����</font>)" +
	    		"<br><b>last year</b> (<font color='#0000FF'>������</font>) " +
	    		"<br> (<font color='#00FF00'>���� ������ ����</font>)" +
	    		"<br><b>five minutes ago</b> (<font color='#0000FF'>����� ����� ����</font>) " +
	    		"<br> (<font color='#00FF00'>�� ���� ����</font>)" +
	    		"<br><b>the other day</b> (<font color='#0000FF'>��� ��������</font>) " +
	    		"<br> (<font color='#00FF00'>�� �� ����</font>)" +
	    		"<br><b>in the past</b> (<font color='#0000FF'>��� ��������</font>) " +
	    		"<br> (<font color='#00FF00'>���� �����</font>)" +
	    		"<br><b>last week</b> (<font color='#0000FF'>��� ����������� ��������</font>) " +
	    		"<br> (<font color='#00FF00'>�� ����� �����</font>)" +
	    		"<br><b>in those days</b> (<font color='#0000FF'>������� ��� �����</font>) " +
	    		"<br><br> � <b>�������</b> ���� ���� ������� ������� �� �� ���� <b>did</b>(do) ���� ���� ��� �������� ��� �� ���� �� ����������. ��� ���������� :" +
	    		"<br><br>-He asked a question.(<font color='#0000FF'>������ ��� �������</font>) " +
	    		"<br>-<font color='#ff0000'>Did</font> he ask a question<font color='#ff0000'>?</font>(<font color='#0000FF'>������ ��� �������;</font>) " +
	    		"<br><br> � <b>������</b> ���� ���� ������� ������� �� �� ���� <b>did</b> ��� �� <b>not</b>. ��� ���������� :" +
	    		"<br><br>-He closed the door(<font color='#0000FF'>������� �� �����</font>) " +
	    		"<br>-He<font color='#ff0000'>did not</font> close the door< (<font color='#0000FF'>��� ������� �� �����</font>) " +
    			"<br><br><br><h6>***����� �������� ���������***</h6>" +
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
