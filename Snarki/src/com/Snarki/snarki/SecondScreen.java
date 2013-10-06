package com.Snarki.snarki;

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

public class SecondScreen extends Activity{
	

	protected static int index;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second);
        
        QuestionAnswer qa = Evalulator.getInstance().selectResponse(index);
        
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
        

        
        
	}
	
}
