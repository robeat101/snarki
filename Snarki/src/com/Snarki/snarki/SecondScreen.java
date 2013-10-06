package com.Snarki.snarki;

//import java.util.Locale;

import java.util.Locale;

import com.Snarki.snarki.decisions.Evalulator;
import com.Snarki.snarki.decisions.MessagePair;
import com.Snarki.snarki.decisions.QuestionAnswer;

import android.app.Activity;
import android.widget.SeekBar;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.widget.Toast;

public class SecondScreen extends Activity implements OnInitListener{
	//public class SecondScreen extends Activity{

	protected static int index;
	private int MY_DATA_CHECK_CODE = 0;
	private TextToSpeech myTTS;
	private void speakWords(String speech) {
		myTTS.speak(speech, TextToSpeech.QUEUE_FLUSH, null);
		 Toast.makeText(this, "in speak method", Toast.LENGTH_LONG).show();
	}
	
	QuestionAnswer qa;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        
        
        setContentView(R.layout.second);
        
        qa = Evalulator.getInstance().selectResponse(index);
        
        TextView statement = (TextView) findViewById(R.id.textView1);
        
        statement.setText(qa.getQuestion().getMessage());
        
        MessagePair[] messages = qa.getResponses();
    	
        Button one = (Button) findViewById(R.id.button1);
        Button two = (Button) findViewById(R.id.button3);
        Button three = (Button) findViewById(R.id.button2);
        
        one.setText(messages[0].getMessage());
        
        two.setText(messages[1].getMessage());
        three.setText(messages[2].getMessage());
        
        one.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				index = 0;
				Intent i = new Intent(SecondScreen.this, SecondScreen.class);
	        	startActivity(i);
			}});
        two.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				index = 1;
				Intent i = new Intent(SecondScreen.this, SecondScreen.class);
	        	startActivity(i);
			}});
        
        three.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				index = 2;
				Intent i = new Intent(SecondScreen.this, SecondScreen.class);
	        	startActivity(i);
			}});
        
        Button restart = (Button) findViewById(R.id.button5);
        restart.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(SecondScreen.this, FullscreenActivity.class);
	        	startActivity(i);
			}});
        

        Intent checkTTSIntent = new Intent();
        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent, MY_DATA_CHECK_CODE);
//        
//        
//        
        
	}


	@Override
	public void onInit(int initStatus) {
		if (initStatus == TextToSpeech.SUCCESS) {
	        
	        if(myTTS.isLanguageAvailable(Locale.US)==TextToSpeech.LANG_AVAILABLE) {
	        		myTTS.setLanguage(Locale.US);
	        		
	        
	        }
	        speakWords(qa.getQuestion().getMessage());

	    }
	}
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	    if (requestCode == MY_DATA_CHECK_CODE) {
	        if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
	            myTTS = new TextToSpeech(this, this);
	        }
	        else {
	            Intent installTTSIntent = new Intent();
	            installTTSIntent.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
	            startActivity(installTTSIntent);
	        }
	        }
	}
}
