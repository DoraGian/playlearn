package com.dora.dora;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class gch3 extends Activity {
	
	LinearLayout Linear;
	
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notebook) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
	
Linear  = (LinearLayout)findViewById(R.id.linear);	 
        
        TextView t0 = new TextView(this);
        t0.setText(Html.fromHtml("<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>�����������</u></h5>"));
        setalign0(t0);
   		Linear.addView(t0);
   		
   		TextView t1 = new TextView(this);
   		t1.setText(Html.fromHtml("���� ������� ������ ���������� ������ ���� ��� ����������. �� �������, �� �������, �� ��������� ���������� ���� �������, ����� ��� ��� �����." +
   		"<br><br>���� ������������ ������ � ����������� ����������� ���� ������������ �� ������ <b>-s</b> ��� ����� ��� �����. �� ����� ������� ������������ :" +
   		"<br><br>(<font color='#00FF00'>����� - ������</font>)" +
   		"<br>  book &nbsp;&nbsp; - &nbsp;&nbsp; book<b><font color='#ff0000'><u>s</u></font></b> (<font color='#0000FF'>������-�</font>) " +
   		"<br><br>(<font color='#00FF00'>����� - ������</font>)" +
   		"<br>  dog &nbsp;&nbsp; - &nbsp;&nbsp; dog<b><font color='#ff0000'><u>s</u></font></b> (<font color='#0000FF'>������-��</font>) " +
   		"<br><br>(<font color='#00FF00'>���� - �����</font>)" +
   		"<br>  door &nbsp;&nbsp; - &nbsp;&nbsp; door<b><font color='#ff0000'><u>s</u></font></b> (<font color='#0000FF'>�����-��</font>) " +
   		"<br><br>(<font color='#00FF00'>���� - �����</font>)" +
   		"<br>  chair &nbsp;&nbsp; - &nbsp;&nbsp; chair<b><font color='#ff0000'><u>s</u></font></b> (<font color='#0000FF'>������� - �������� </font>) " +
   		"<br><br>�������� ���� ��� ������� ����������.��� �� ���������� ���������� �� <b>-�, -ss, -sh -ch, -x </b>�������� <b>-es</b> ���� ����������)" +
   		"<br><br>(<font color='#00FF00'>������� - ��������</font>)" +
   		"<br>  potato &nbsp;&nbsp; - &nbsp;&nbsp; potato<b><font color='#ff0000'><u>es</u></font></b> (<font color='#0000FF'>������-��</font>) " +
   		"<br><br>(<font color='#00FF00'>��� - �����</font>)" +
   		"<br>  kiss &nbsp;&nbsp; - &nbsp;&nbsp; kiss<b><font color='#ff0000'><u>es</u></font></b> (<font color='#0000FF'>����-�</font>) " +
   		"<br><br>(<font color='#00FF00'>���� - ������</font>)" +
   		"<br>  dish &nbsp;&nbsp; - &nbsp;&nbsp; dish<b><font color='#ff0000'><u>es</u></font></b> (<font color='#0000FF'>�����-�</font>) " +
   		"<br><br>(<font color='#00FF00'>���� - ������</font>)" +
   		"<br>  match &nbsp;&nbsp; - &nbsp;&nbsp; match<b><font color='#ff0000'><u>es</u></font></b> (<font color='#0000FF'>������-�</font>) " +
   		"<br><br>(<font color='#00FF00'>���� - ������</font>)" +
   		"<br>  box &nbsp;&nbsp; - &nbsp;&nbsp; box<b><font color='#ff0000'><u>es</u></font></b> (<font color='#0000FF'>�����-�</font>) " +
   		"<br><br>�� ���������� ��� ���������� �� <b>-y</b> ��� ���� ��� �� -y ������� <u>�������</u>, ���������� �� -y ��� �������� <b>-ies</b>. " +
   		"<br><br>(<font color='#00FF00'>������ - �������</font>)" +
   		"<br>  lady &nbsp;&nbsp; - &nbsp;&nbsp; lad<b><font color='#ff0000'><u>ies</u></font></b> (<font color='#0000FF'>���������-���</font>) " +
   		"<br><br>(<font color='#00FF00'>������� - ��������</font>)" +
   		"<br>  baby &nbsp;&nbsp; - &nbsp;&nbsp; bab<b><font color='#ff0000'><u>ies</u></font></b> (<font color='#0000FF'>����-�</font>) " +
   		"<br><br>���� �� ���������� ��� ���������� �� <b>�y</b> ��� ���� ��� �� -y ������� <u>������</u> ���� �������� �������� <b>-s</b> " +
   		"<br><br>(<font color='#00FF00'>���� - �����</font>)" +
   		"<br>  boy &nbsp;&nbsp; - &nbsp;&nbsp; boy<b><font color='#ff0000'><u>s</u></font></b> (<font color='#0000FF'>�����-��</font>) " +
   		"<br><br>(<font color='#00FF00'>���� - �����</font>)" +
   		"<br>  day &nbsp;&nbsp; - &nbsp;&nbsp; day<b><font color='#ff0000'><u>s</u></font></b> (<font color='#0000FF'>����-��</font>) " +
   		"<br><br> ������ ���������� ��� ���������� �� <b>-f</b> � -fe ���������� �� -f � �� -fe ��� �������� �������� <b>-ves</b> " +
   		"<br><br>(<font color='#00FF00'>������ - �������</font>)" +
   		"<br>  wife &nbsp;&nbsp; - &nbsp;&nbsp; wi<b><font color='#ff0000'><u>ves</u></font></b> (<font color='#0000FF'>�������-��</font>) " +
   		"<br><br>(<font color='#00FF00'>���� - �����</font>)" +
   		"<br>  knife &nbsp;&nbsp; - &nbsp;&nbsp; kni<b><font color='#ff0000'><u>ves</u></font></b> (<font color='#0000FF'>�������-��</font>) " +
   		"<br><br>(<font color='#00FF00'>��� - ����</font>)" +
   		"<br>  thief &nbsp;&nbsp; - &nbsp;&nbsp; thi<b><font color='#ff0000'><u>ves</u></font></b> (<font color='#0000FF'>�������-��</font>) " +
   		"<br><br>(<font color='#00FF00'>���� - �����</font>)" +
   		"<br>  life &nbsp;&nbsp; - &nbsp;&nbsp; li<b><font color='#ff0000'><u>ves</u></font></b> (<font color='#0000FF'>���-��</font>) " +
   		"<br><br> ����� �������� ��� ������ ������� �����������" +
   		"<br><br>(<font color='#00FF00'>��� - ���</font>)" +
   		"<br>  man &nbsp;&nbsp; - &nbsp;&nbsp; m<b><font color='#ff0000'><u>e</u></font></b>n (<font color='#0000FF'>������-��</font>) " +
   		"<br><br>(<font color='#00FF00'>������ - �������</font>)" +
   		"<br>  woman &nbsp;&nbsp; - &nbsp;&nbsp; wom<b><font color='#ff0000'><u>e</u></font></b>n (<font color='#0000FF'>�������-��</font>) " +
   		"<br><br>(<font color='#00FF00'>������� - ���������</font>)" +
   		"<br>  child &nbsp;&nbsp; - &nbsp;&nbsp; child<b><font color='#ff0000'><u>ren</u></font></b> (<font color='#0000FF'>�����-��</font>) " +
   		"<br><br>(<font color='#00FF00'>����� - ����</font>)" +
   		"<br>  mouse &nbsp;&nbsp; - &nbsp;&nbsp; m<b><font color='#ff0000'><u>ice</u></font></b> (<font color='#0000FF'>�������-��</font>) " +
   		"<br><br>(<font color='#00FF00'>���� - ���</font>)" +
   		"<br>  foot &nbsp;&nbsp; - &nbsp;&nbsp; f<b><font color='#ff0000'><u>ee</u></font></b>t (<font color='#0000FF'>�������-��</font>) " +
   		"<br><br>(<font color='#00FF00'>���� - ���</font>)" +
   		"<br>  tooth- &nbsp;&nbsp; - &nbsp;&nbsp; t<b><font color='#ff0000'><u>ee</u></font></b>th (<font color='#0000FF'>�����-��</font>) " +
   		"<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>�����</u></h5>" +
   		"<br><br>�� ����� ��� ���������� � ������� ��� ��������� ���� ������� ������. ������ �� ����� ��� �� ������� ����� ���� ��� ��� �� ����������" +
   		"���� ����� ��������, ���� ������, ���� ������� (���� ��� ���� ����������). ��� ���������� :" +
   		"<br><br> (<font color='#00FF00'>��� ��� �� ������</font>)" +
		"<br>This man is <font color='#ff0000'>clever</font> <br>(<font color='#0000FF'>����� � ������ ����� �������</font>) " +
		"<br><br> (<font color='#00FF00'>��� ������� �� ������</font>)" +
		"<br>This woman is <font color='#ff0000'>clever</font> <br>(<font color='#0000FF'>����� � ������ ����� ������</font>) " +
		"<br><br> (<font color='#00FF00'>��� ���� �� ������</font>)" +
		"<br>This child is <font color='#ff0000'>clever</font> <br>(<font color='#0000FF'>����� � ������ ����� ������</font>) " +
   		"<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>���� ��������</u></h5>" +
   		"<br><br>���� ������� ������ ������� ������� �� ���� <br> - <b> ���������� - ���� - ����������� </b> -." +
   		" ���� ������ ��� ��� ��� ����������� �������� �� ���� ��������� ������ ���� �� ��� �� �������, ����� ��� ������ �������," +
   		" ����� �� ���������� ����� ���������� ��� �� ��������� � ����������� ��� �� ����� ������������." +
   		"�� ����� ������ ������������ ����� ���������." +
   		"<br><br> (<font color='#00FF00'>�� ���� ��� ����</font>)" +
		"<br><b><u>I</u></b> like ice-cream. <br>(<font color='#0000FF'>��� ������ �� ������</font>) " +
		"<br><br> (<font color='#00FF00'>�� �� ��������</font>)" +
		"<br><b><u>It</u></b> is raining. <br>(<font color='#0000FF'>������</font>) " +
		"<br><br> (<font color='#00FF00'>���� �� �����������</font>)" +
		"<br><b><u>You</u></b> are beautiful. <br>(<font color='#0000FF'>����� �������/�</font>) " +
		"<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>�������</u></h5>" +
		"<br><br>��� �� �������������� ������� ���� ���� �������� ������������ ��� ��������� ���� <b>do</b>" +
		"<br><br> <b>do</b> (<font color='#0000FF'>����</font>) (<font color='#00FF00'>����</font>)" +
		"<br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; do" +
		"<br> You &nbsp; do" +
		"<br> He &nbsp;&nbsp;&nbsp; do<b><font color='#ff0000'><u>es</u></font></b> (<font color='#00FF00'>����</font>)" +
		"<br> She &nbsp;&nbsp; do<b><font color='#ff0000'><u>es</u></font></b>" +
		"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; do<b><font color='#ff0000'><u>es</u></font></b>" +
		"<br> We &nbsp;&nbsp;&nbsp; do" +
		"<br> You &nbsp;&nbsp; do" +
		"<br> They &nbsp; do" +
		"<br><br>��� �� ������� ��� ������� ��� ������� ����������� �� ���� <b>do</b> ���� ���� ��� ��������. ������ :" +
		"<br><br> (<font color='#00FF00'>�� ���� ������</font>)" +
		"<br>I like books(<font color='#0000FF'>��� ������� �� ������</font>) " +
		"<br><font color='#ff0000'>Do</font> I like books<font color='#ff0000'>?</font>(<font color='#0000FF'>��� ������� �� ������;</font>) " +
		"<br><br>��� �� ��� ������� �������������� �� ���� <b>be</b> ���� ���� ������� �� ���� ��� ���������� <b>do</b>." +
		"<br><br> (<font color='#00FF00'>���� �� �������</font>)" +
		"<br>You are hungry(<font color='#0000FF'>������</font>) " +
		"<br><font color='#ff0000'>Are</font> you are hungry<font color='#ff0000'>?</font>(<font color='#0000FF'>������;</font>) " +
		"<br><br>��� �������� ������ �� ������������ ��� ��� �� �������������� ������� ���� ������ �������� ����� ���� �� ���� <b>be</b>." +
		"<br><br> (<font color='#00FF00'>��� �� ������� ��� �����</font>)" +
		"<br>They are going to school(<font color='#0000FF'>��������� ��� �������.</font>) " +
		"<br><font color='#ff0000'>Are</font> they going to school<font color='#ff0000'>?</font>(<font color='#0000FF'>��������� ��� �������;</font>) " +
		"<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>������</u></h5>" +
		"<br><br>��� �� �������������� ������ ���� ���� �������� ���� ��� ��� ��� �������, ������������ �� ��������� ���� <b>do</b> ����� ��� �� ���� <b>not</b>" +
		"<br><br> (<font color='#00FF00'>�� ���� ��� ���� ������</font>)" +
		"<br>I <font color='#ff0000'>do not</font> like books<br>" +
		"(<font color='#0000FF'>��� ��� ������� �� ������</font>) " +
		"<br><br>��� �� ��� ������� �������������� �� ���� <b>be</b> ���� ���� ������� �� ���� ��� ���������� <b>do</b>." +
		"<br><br> (<font color='#00FF00'>���� �� ��� �������</font>)" +
		"<br>You <font color='#ff0000'>are not</font> hungry<br>" +
		"(<font color='#0000FF'>��� ������</font>) " +
		"<br><br>��� �������� ������ �� ������������ ��� ��� �� �������������� ������ ���� ������ �������� ����� ���� �� ���� <b>be</b>." +
		"<br><br> (<font color='#00FF00'>��� �� ��� ������� ��� �����</font>)" +
		"<br>They <font color='#ff0000'>are not</font> going to school" +
		"<br>(<font color='#0000FF'>��� ��������� ��� �������.</font>) " +
		"" +
		""));
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
