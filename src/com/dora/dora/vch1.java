package com.dora.dora;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class vch1 extends Activity {
	
	LinearLayout Linear;
	
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notebook) ;
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		Linear  = (LinearLayout)findViewById(R.id.linear);	 
        
        TextView t0 = new TextView(this);
        t0.setText(Html.fromHtml("<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>� �������� </u></h5>"));
        	setalign0(t0);
        	Linear.addView(t0);
    	
    	 TextView t1 = new TextView(this);  
	     t1.setText(Html.fromHtml("<b> A  , a </b>(<font color='#00FF00'>��</font>) " +
	     "<br><b> B , b </b>(<font color='#00FF00'>����</font>)" +
	     "<br><b> C , c </b>(<font color='#00FF00'>���</font>)" +
	     "<br><b> D , d </b>(<font color='#00FF00'>����</font>)" +
	     "<br><b> E , e </b>(<font color='#00FF00'>��</font>)" +
	     "<br><b> F , f </b>(<font color='#00FF00'>��</font>)" +
	     "<br><b> G , g </b>(<font color='#00FF00'>����</font>)" +
	     "<br><b> E , e </b>(<font color='#00FF00'>��</font>)" +
	     "<br><b> H , h </b>(<font color='#00FF00'>����</font>)" +
	     "<br><b> I , i </b>(<font color='#00FF00'>��</font>)" +
	     "<br><b> J , j </b>(<font color='#00FF00'>����</font>)" +
	     "<br><b> K , k </b>(<font color='#00FF00'>���</font>)" +
	     "<br><b> L , l </b>(<font color='#00FF00'>��</font>)" +
	     "<br><b> M , m </b>(<font color='#00FF00'>��</font>)" +
	     "<br><b> N , n </b>(<font color='#00FF00'>��</font>)" +
	     "<br><b> O , o </b>(<font color='#00FF00'>���</font>)" +
	     "<br><b> P , p </b>(<font color='#00FF00'>���</font>)" +
	     "<br><b> Q , q </b>(<font color='#00FF00'>����</font>)" +
	     "<br><b> R , r </b>(<font color='#00FF00'>��</font>)" +
	     "<br><b> S , s </b>(<font color='#00FF00'>��</font>)" +
	     "<br><b> T , t </b>(<font color='#00FF00'>���</font>)" +
	     "<br><b> U , u </b>(<font color='#00FF00'>����</font>)" +
	     "<br><b> V , v </b>(<font color='#00FF00'>���</font>)" +
	     "<br><b> W , w </b>(<font color='#00FF00'>����������</font>)" +
	     "<br><b> X , x </b>(<font color='#00FF00'>��</font>)" +
	     "<br><b> Y , y </b>(<font color='#00FF00'>�����</font>)" +
	     "<br><b> Z , z </b>(<font color='#00FF00'>����</font>)" +
	     "<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>������� ��������� </u></h5>" +
	     "(<font color='#00FF00'>���</font>)" +
	     "<br> Yes   (<font color='#0000FF'> ���</font>)" +
	     "<br><br> (<font color='#00FF00'>��</font>) " +
	     "<br> No   (<font color='#0000FF'> ���</font>) " +
	     "<br><br> (<font color='#00FF00'>���</font>)"+
	     "<br> And   (<font color='#0000FF'> ���</font>) " +
	     "<br><br> (<font color='#00FF00'>������</font>)"+
    	 "<br> Hello   (<font color='#0000FF'> ����</font>) " +
    	 "<br><br> (<font color='#00FF00'>������ ��������</font>)"+
    	 "<br> Good Morning   (<font color='#0000FF'> ��������</font>) " +
    	 "<br><br> (<font color='#00FF00'>������ �������</font>)" +
    	 "<br> Good Evening   (<font color='#0000FF'> ���������</font>) " +
    	 "<br><br> (<font color='#00FF00'>������ ����</font>" +
    	 "<br> Good Night     (<font color='#0000FF'> ���������</font>) )" +
    	 "<br><br> (<font color='#00FF00'>������-����</font>)" +
    	 "<br> Goodbye        (<font color='#0000FF'> �����</font>) " +
    	 "<br><br> (<font color='#00FF00'>�� ���� ������</font>)" +
    	 "<br> See you later  (<font color='#0000FF'> �� ���� �����</font>) " +
    	 "<br><br> (<font color='#00FF00'>�� ���� ����</font>)" +
    	 "<br> See you soon  (<font color='#0000FF'> �� ���� �������</font>) " +
    	 "<br><br> (<font color='#00FF00'>���� ����</font>)" +
    	 "<br> Thank you      (<font color='#0000FF'> ���������</font>) " +
    	 "<br><br> (<font color='#00FF00'>���� ��������</font>)" +
    	 "<br> You're welcome (<font color='#0000FF'> ��������</font> " +
    	 "<br><br> (<font color='#00FF00'>����</font>)" +
    	 "<br> Please   (<font color='#0000FF'> ��/��� ��������</font>) " +
    	 "<br><br> (<font color='#00FF00'>�� �� ����</font>)" +
    	 "<br> I am sorry   (<font color='#0000FF'> ��������</font>)" +
    	 "<br><br> (<font color='#00FF00'>������� �� </font>)" +
    	 "<br> Excuse me   (<font color='#0000FF'> �� ����������</font>)" +
    	 "<br><br> (<font color='#00FF00'>������</font>)" +
    	 "<br> Mister   (<font color='#0000FF'> ������</font>)" +
    	 "<br><br> (<font color='#00FF00'>���</font>)" +
    	 "<br> Miss     (<font color='#0000FF'> �����</font>)" +
    	 "<br><br> (<font color='#00FF00'>���� �� ����</font>)" +   	 
    	 "<br> How are you?  (<font color='#0000FF'> �� ������?</font>)" +
    	 "<br><br> (<font color='#00FF00'>����</font>)" +
    	 "<br> � am fine   (<font color='#0000FF'> ����� ����</font>)" +
    	 "<br><br> (<font color='#00FF00'>���� ��� ��� ����</font>)" +
    	 "<br> Nice to meet you  (<font color='#0000FF'> ������</font>)" +
    	 "<br><br> (<font color='#00FF00'>������ ���� ����</font>)" +
    	 "<br> What's your name?  (<font color='#0000FF'> ���� ����� �� ����� ���?</font>)" +
    	 "<br><br> (<font color='#00FF00'>��� ���� ��</font>)" +
    	 "<br> My name is...    (<font color='#0000FF'> �� ����� ��� �����...</font>)" +
    	 "<br><br> (<font color='#00FF00'>����� �� ���� ����</font>)" +
    	 "<br> Where are you from?   (<font color='#0000FF'> ��� ��� ���������?</font>)" +
    	 "<br><br> (<font color='#00FF00'>�� �� ����</font>)" +
    	 "<br> I am from...   (<font color='#0000FF'> ��������� ���...</font>)" +
    	 "<br><br> (<font color='#00FF00'>����� ���� ���� ���</font>)" +
    	 "<br> Where do you live?   (<font color='#0000FF'> ��� ������?</font>)" +
    	 "<br><br> (<font color='#00FF00'>�� ��� ��</font>)" +
    	 "<br> I live in...   (<font color='#0000FF'> ���� ...</font>)" +
    	 "<br><br> (<font color='#00FF00'>���� ���� �� ����</font>)" +
    	 "<br> How old are you?   (<font color='#0000FF'> ���� ������ �����?</font>)" +
    	 "<br><br> (<font color='#00FF00'>�� �� ... ����� ����</font>)" +
    	 "<br> I am ... years old   (<font color='#0000FF'> ����� ... ������</font>)" +
    	 "<br><br> (<font color='#00FF00'>���� ���� ���� �������</font>)" +
    	 "<br> Do you speak English?   (<font color='#0000FF'> ����� �������?</font>)" +
    	 "<br><br> (<font color='#00FF00'>�� ���� �������</font>)" +
    	 "<br> I speak English  (<font color='#0000FF'>����� �������</font>)" +
    	 "<br><br> (<font color='#00FF00'>�� �����������</font>)" +
    	 "<br> I understand  (<font color='#0000FF'> ����������� </font>)" +
    	 "<br><br> (<font color='#00FF00'>�� ����� ����������</font>)" +
    	 "<br> I understand  (<font color='#0000FF'> ��� ����������� </font>)" +
    	 "<br><br> (<font color='#00FF00'>�� ����</font>)" +
    	 "<br> I  know  (<font color='#0000FF'> ���� </font>)" +
    	 "<br><br> (<font color='#00FF00'>�� ����� ����</font>)" +
    	 "<br> I don't know.  (<font color='#0000FF'> ��� ���� </font>)" +
	     "<br><br><b>�� �������� �� ����� ��� ������� �� ��� ��������� ��� ����� ������.</b>" +
	     "<br><br> - Good morning miss!" +
	     "<br> - Good morning mister." +
	     "<br> - What is your name?" +
	     "<br> - My name is Maria." +
	     "<br> - And my name is Janek, nice to meet you." +
	     "<br> - Where do you come from?" +
	     "<br> - I come from Egland, and you?" +
	     "<br> - I come from Greece." +
	     "<br><br><font color='#0000FF'> - �������� �����!" +
	     "<br> - �������� �����." +
	     "<br> - ���� ����� �� ����� ���?" +
	     "<br> - �� ����� ��� ����� �����." +
	     "<br> - ��� �� ���� ��� ����� ������, ������." +
	     "<br> - ��� ��� �����?" +
	     "<br> - ��� ������ ��� ���?" +
	     "<br> - ��� ������.</font>" +
	     "<br>." +
	     "<br><br> <h6>***����� ������ ���������***</h6>"));
	     
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
