package com.Snarki.snarki;

import com.Snarki.snarki.decisions.Evalulator;
import com.Snarki.snarki.SecondScreen;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class FirstScreen extends Activity{
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.first);

        Button next = (Button) findViewById(R.id.button6);
        next.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				
				SeekBar seek = (SeekBar) findViewById(R.id.seekBar1);
		        int value = seek.getProgress();

		        SecondScreen.index = value;
		        //Add to Eval Function
		        Evalulator.getInstance().getStart();
				
		        Intent i = new Intent(FirstScreen.this, SecondScreen.class);
	        	startActivity(i);
			}});
        
        Button restart = (Button) findViewById(R.id.button5);
        restart.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(FirstScreen.this, FullscreenActivity.class);
	        	startActivity(i);
			}});
        
        Button exit = (Button) findViewById(R.id.button4);
        exit.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				finish();
				System.exit(0);
			}});
        
        
        
	}
}


			
