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
        t0.setText(Html.fromHtml("<br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Πληθυντικός</u></h5>"));
        setalign0(t0);
   		Linear.addView(t0);
   		
   		TextView t1 = new TextView(this);
   		t1.setText(Html.fromHtml("Στην αγγλική γλώσσα Πληθυντικό έχουμε μόνο στα ουσιαστικά. Τα επίθετα, τα ονόματα, τα αφηρημένα ουσιαστικά όπως ομορφιά, φόβος κτλ δεν έχουν." +
   		"<br><br>Στις περισσότερες λέξεις ο πληθυντικός συντάσσεται απλά προσθέτοντας το γράμμα <b>-s</b> στο τέλος της λέξης. Ας δούμε μεροικά παραδείγματα :" +
   		"<br><br>(<font color='#00FF00'>μπουκ - μπουκς</font>)" +
   		"<br>  book &nbsp;&nbsp; - &nbsp;&nbsp; book<b><font color='#ff0000'><u>s</u></font></b> (<font color='#0000FF'>βιβλίο-α</font>) " +
   		"<br><br>(<font color='#00FF00'>ντογκ - ντογκς</font>)" +
   		"<br>  dog &nbsp;&nbsp; - &nbsp;&nbsp; dog<b><font color='#ff0000'><u>s</u></font></b> (<font color='#0000FF'>σκύλος-οι</font>) " +
   		"<br><br>(<font color='#00FF00'>ντορ - ντορς</font>)" +
   		"<br>  door &nbsp;&nbsp; - &nbsp;&nbsp; door<b><font color='#ff0000'><u>s</u></font></b> (<font color='#0000FF'>πόρτα-ες</font>) " +
   		"<br><br>(<font color='#00FF00'>τσερ - τσερς</font>)" +
   		"<br>  chair &nbsp;&nbsp; - &nbsp;&nbsp; chair<b><font color='#ff0000'><u>s</u></font></b> (<font color='#0000FF'>καρέκλα - καρέκλες </font>) " +
   		"<br><br>Υπάρχουν όμως και κάποιες εξαιρέσεις.Για τα ουσιαστικά τελειώνουν σε <b>-ο, -ss, -sh -ch, -x </b>παίρνουν <b>-es</b> στον πληθυντικό)" +
   		"<br><br>(<font color='#00FF00'>ποτέιτο - ποτέιτοζ</font>)" +
   		"<br>  potato &nbsp;&nbsp; - &nbsp;&nbsp; potato<b><font color='#ff0000'><u>es</u></font></b> (<font color='#0000FF'>πατάτα-ες</font>) " +
   		"<br><br>(<font color='#00FF00'>κις - κίσιζ</font>)" +
   		"<br>  kiss &nbsp;&nbsp; - &nbsp;&nbsp; kiss<b><font color='#ff0000'><u>es</u></font></b> (<font color='#0000FF'>φιλί-ά</font>) " +
   		"<br><br>(<font color='#00FF00'>ντις - ντίσιζ</font>)" +
   		"<br>  dish &nbsp;&nbsp; - &nbsp;&nbsp; dish<b><font color='#ff0000'><u>es</u></font></b> (<font color='#0000FF'>πιάτο-α</font>) " +
   		"<br><br>(<font color='#00FF00'>ματς - μάτσιζ</font>)" +
   		"<br>  match &nbsp;&nbsp; - &nbsp;&nbsp; match<b><font color='#ff0000'><u>es</u></font></b> (<font color='#0000FF'>σπίρτο-α</font>) " +
   		"<br><br>(<font color='#00FF00'>μποξ - μπόξιζ</font>)" +
   		"<br>  box &nbsp;&nbsp; - &nbsp;&nbsp; box<b><font color='#ff0000'><u>es</u></font></b> (<font color='#0000FF'>κουτί-ά</font>) " +
   		"<br><br>Τα ουσιαστικά που τελειώνουν σε <b>-y</b> και πριν από το -y υπάρχει <u>σύ΅φωνο</u>, αποβάλλουν το -y και παίρνουν <b>-ies</b>. " +
   		"<br><br>(<font color='#00FF00'>λέιντι - λέιντιζ</font>)" +
   		"<br>  lady &nbsp;&nbsp; - &nbsp;&nbsp; lad<b><font color='#ff0000'><u>ies</u></font></b> (<font color='#0000FF'>δεσποινίς-δες</font>) " +
   		"<br><br>(<font color='#00FF00'>μπέιμπι - μπέιμπιζ</font>)" +
   		"<br>  baby &nbsp;&nbsp; - &nbsp;&nbsp; bab<b><font color='#ff0000'><u>ies</u></font></b> (<font color='#0000FF'>μωρό-ά</font>) " +
   		"<br><br>Αλλά τα ουσιαστικά που τελειώνουν σε <b>y</b> και πριν από το -y υπάρχει <u>φωνήεν</u> τότε παίρνουν κανονικά <b>-s</b> " +
   		"<br><br>(<font color='#00FF00'>μπόι - μπόιζ</font>)" +
   		"<br>  boy &nbsp;&nbsp; - &nbsp;&nbsp; boy<b><font color='#ff0000'><u>s</u></font></b> (<font color='#0000FF'>αγόρι-ια</font>) " +
   		"<br><br>(<font color='#00FF00'>ντέι - ντέιζ</font>)" +
   		"<br>  day &nbsp;&nbsp; - &nbsp;&nbsp; day<b><font color='#ff0000'><u>s</u></font></b> (<font color='#0000FF'>μέρα-ες</font>) " +
   		"<br><br> Κάποια ουσιαστικά που τελέιώνουν σε <b>-f</b> ή -fe αποβάλλουν το -f ή το -fe και παίρνουν κατάληξη <b>-ves</b> " +
   		"<br><br>(<font color='#00FF00'>γουάιφ - γουάιβς</font>)" +
   		"<br>  wife &nbsp;&nbsp; - &nbsp;&nbsp; wi<b><font color='#ff0000'><u>ves</u></font></b> (<font color='#0000FF'>σύζυγος-οι</font>) " +
   		"<br><br>(<font color='#00FF00'>νάιφ - νάιβς</font>)" +
   		"<br>  knife &nbsp;&nbsp; - &nbsp;&nbsp; kni<b><font color='#ff0000'><u>ves</u></font></b> (<font color='#0000FF'>μαχαίρι-ια</font>) " +
   		"<br><br>(<font color='#00FF00'>θιφ - θιβς</font>)" +
   		"<br>  thief &nbsp;&nbsp; - &nbsp;&nbsp; thi<b><font color='#ff0000'><u>ves</u></font></b> (<font color='#0000FF'>κλέφτης-ες</font>) " +
   		"<br><br>(<font color='#00FF00'>λάιφ - λάιβς</font>)" +
   		"<br>  life &nbsp;&nbsp; - &nbsp;&nbsp; li<b><font color='#ff0000'><u>ves</u></font></b> (<font color='#0000FF'>ζωή-ές</font>) " +
   		"<br><br> Τέλος υπάρχουν και κάποια ανώμαλα ουσισαστικά" +
   		"<br><br>(<font color='#00FF00'>μαν - μεν</font>)" +
   		"<br>  man &nbsp;&nbsp; - &nbsp;&nbsp; m<b><font color='#ff0000'><u>e</u></font></b>n (<font color='#0000FF'>άνδρας-ες</font>) " +
   		"<br><br>(<font color='#00FF00'>γούμαν - γουίμεν</font>)" +
   		"<br>  woman &nbsp;&nbsp; - &nbsp;&nbsp; wom<b><font color='#ff0000'><u>e</u></font></b>n (<font color='#0000FF'>γυναίκα-ες</font>) " +
   		"<br><br>(<font color='#00FF00'>τσάιλντ - τσίλντρεν</font>)" +
   		"<br>  child &nbsp;&nbsp; - &nbsp;&nbsp; child<b><font color='#ff0000'><u>ren</u></font></b> (<font color='#0000FF'>παιδί-ιά</font>) " +
   		"<br><br>(<font color='#00FF00'>μάους - μάις</font>)" +
   		"<br>  mouse &nbsp;&nbsp; - &nbsp;&nbsp; m<b><font color='#ff0000'><u>ice</u></font></b> (<font color='#0000FF'>ποντίκι-ια</font>) " +
   		"<br><br>(<font color='#00FF00'>φουτ - φιτ</font>)" +
   		"<br>  foot &nbsp;&nbsp; - &nbsp;&nbsp; f<b><font color='#ff0000'><u>ee</u></font></b>t (<font color='#0000FF'>πατούσα-ες</font>) " +
   		"<br><br>(<font color='#00FF00'>τουθ - τιθ</font>)" +
   		"<br>  tooth- &nbsp;&nbsp; - &nbsp;&nbsp; t<b><font color='#ff0000'><u>ee</u></font></b>th (<font color='#0000FF'>δόντι-ια</font>) " +
   		"<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Γένος</u></h5>" +
   		"<br><br>Το γένος στα ουσιαστικά η επίθετα δεν ξεχωρίζει στην αγγλική γλώσσα. Δηλαδή τα άρθρα και τα επίθετα είναι ίδια για όλα τα ουσιαστικά" +
   		"είτε είναι αρσενικά, είτε θυληκά, είτε ουδέτρα (όπως και στον πληθυντικό). Για παράδειγμα :" +
   		"<br><br> (<font color='#00FF00'>δις μαν ιζ κλέβερ</font>)" +
		"<br>This man is <font color='#ff0000'>clever</font> <br>(<font color='#0000FF'>Αυτός ο άνδρας είναι έξυπνος</font>) " +
		"<br><br> (<font color='#00FF00'>δις γουίμαν ιζ κλέβερ</font>)" +
		"<br>This woman is <font color='#ff0000'>clever</font> <br>(<font color='#0000FF'>Αυτός ο άνδρας είναι έξυπνη</font>) " +
		"<br><br> (<font color='#00FF00'>δις μπόι ιζ κλέβερ</font>)" +
		"<br>This child is <font color='#ff0000'>clever</font> <br>(<font color='#0000FF'>Αυτός ο άνδρας είναι έξυπνο</font>) " +
   		"<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Δομή πρότασης</u></h5>" +
   		"<br><br>Στην Αγγλική γλώσσα τηρούμε αυστηρά τη δομή <br> - <b> Υποκείμενο - Ρήμα - Αντικείμενο </b> -." +
   		" Όπως είδαμε και στα δύο προηγούμενα κεφάλαια το ρήμα παραμένει σχεδόν ίδιο σε όλα τα πρόσωπα, εκτός του τρίτου γενικού," +
   		" οπότε το υποκείμενο είναι απαραίτητο για να καταλάβει ο συνομιλητής μας σε ποιον απεθυνόμαστε." +
   		"Ας δούμε κάποια παραδείγματα απλών προτάσεων." +
   		"<br><br> (<font color='#00FF00'>άι λάικ άις κριμ</font>)" +
		"<br><b><u>I</u></b> like ice-cream. <br>(<font color='#0000FF'>Μου αρέσει το παγωτό</font>) " +
		"<br><br> (<font color='#00FF00'>ιτ ιζ ρέινινγκ</font>)" +
		"<br><b><u>It</u></b> is raining. <br>(<font color='#0000FF'>Βρέχει</font>) " +
		"<br><br> (<font color='#00FF00'>γιου αρ μπιούτιφουλ</font>)" +
		"<br><b><u>You</u></b> are beautiful. <br>(<font color='#0000FF'>Είσαι όμορφος/η</font>) " +
		"<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>Ερώτηση</u></h5>" +
		"<br><br>Για να κατασκευάσουμε ερώτηση στον Απλό Ενεστώτα χρειαζόμαστε ένα βοηθητικό ρήμα <b>do</b>" +
		"<br><br> <b>do</b> (<font color='#0000FF'>κάνω</font>) (<font color='#00FF00'>ντου</font>)" +
		"<br> I &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; do" +
		"<br> You &nbsp; do" +
		"<br> He &nbsp;&nbsp;&nbsp; do<b><font color='#ff0000'><u>es</u></font></b> (<font color='#00FF00'>νταζ</font>)" +
		"<br> She &nbsp;&nbsp; do<b><font color='#ff0000'><u>es</u></font></b>" +
		"<br> It &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; do<b><font color='#ff0000'><u>es</u></font></b>" +
		"<br> We &nbsp;&nbsp;&nbsp; do" +
		"<br> You &nbsp;&nbsp; do" +
		"<br> They &nbsp; do" +
		"<br><br>Για να κάνουμε μία ερώτηση στα αγγλικά τοποθετούμε το ρήμα <b>do</b> στην αρχή της πρότασης. Δηλαδή :" +
		"<br><br> (<font color='#00FF00'>άι λάικ μπουκς</font>)" +
		"<br>I like books(<font color='#0000FF'>Μου αρέσουν τα βιβλία</font>) " +
		"<br><font color='#ff0000'>Do</font> I like books<font color='#ff0000'>?</font>(<font color='#0000FF'>Μου αρέσουν τα βιβλία;</font>) " +
		"<br><br>Εάν σε μία πρόταση χρησιμοποιούμε το ρήμα <b>be</b> τότε αυτό παίρνει τη θέση του βοηθητικού <b>do</b>." +
		"<br><br> (<font color='#00FF00'>γιου αρ χάνγκρι</font>)" +
		"<br>You are hungry(<font color='#0000FF'>Πεινάς</font>) " +
		"<br><font color='#ff0000'>Are</font> you are hungry<font color='#ff0000'>?</font>(<font color='#0000FF'>Πεινάς;</font>) " +
		"<br><br>’ρα μπορούμε εύκολα να συμπεράνουμε ότι για να κατασκευάσουμε ερώτηση στον Διαρκή Ενεστώτα αρκεί μόνο το ρήμα <b>be</b>." +
		"<br><br> (<font color='#00FF00'>δέι αρ γκόινγκ του σκουλ</font>)" +
		"<br>They are going to school(<font color='#0000FF'>Πηγαίνουν στο σχολείο.</font>) " +
		"<br><font color='#ff0000'>Are</font> they going to school<font color='#ff0000'>?</font>(<font color='#0000FF'>Πηγαίνουν στο σχολείο;</font>) " +
		"<br><br><br><br><br><h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u>’ρνηση</u></h5>" +
		"<br><br>Για να κατασκευάσουμε άρνηση στον Απλό Ενεστώτα όπως και για την ερώτηση, χρειαζόμαστε το βοηθητικό ρήμα <b>do</b> καθώς και τη λέξη <b>not</b>" +
		"<br><br> (<font color='#00FF00'>άι ντου νοτ λάικ μπουκς</font>)" +
		"<br>I <font color='#ff0000'>do not</font> like books<br>" +
		"(<font color='#0000FF'>Δεν μου αρέσουν τα βιβλία</font>) " +
		"<br><br>Εάν σε μία πρόταση χρησιμοποιούμε το ρήμα <b>be</b> τότε αυτό παίρνει τη θέση του βοηθητικού <b>do</b>." +
		"<br><br> (<font color='#00FF00'>γιου αρ νοτ χάνγκρι</font>)" +
		"<br>You <font color='#ff0000'>are not</font> hungry<br>" +
		"(<font color='#0000FF'>Δεν πεινάς</font>) " +
		"<br><br>’ρα μπορούμε εύκολα να συμπεράνουμε ότι για να κατασκευάσουμε άρνηση στον Διαρκή Ενεστώτα αρκεί μόνο το ρήμα <b>be</b>." +
		"<br><br> (<font color='#00FF00'>δέι αρ νοτ γκόινγκ του σκουλ</font>)" +
		"<br>They <font color='#ff0000'>are not</font> going to school" +
		"<br>(<font color='#0000FF'>Δεν πηγαίνουν στο σχολείο.</font>) " +
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
