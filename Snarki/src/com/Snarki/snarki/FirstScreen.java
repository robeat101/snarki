package com.Snarki.snarki;

import com.Snarki.snarki.decisions.Evalulator;
import com.Snarki.snarki.SecondScreen;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
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
		        double value = seek.getProgress();
		        value /= seek.getMax();
		        value-=.5;
		        value*=2;
		        
		        //SecondScreen.index = value;
		        //IF GOOD IS TICKED SecondScreen.index = 0
		        //IF OKAY IS TICKED SecondScreen.index = 1
		        //IF BAD IS TICKED SecondScreen.index = 2
		        
		        RadioButton r1 = (RadioButton) findViewById(R.id.rbutton1);
		        RadioButton r2 = (RadioButton) findViewById(R.id.button2);
		        RadioButton r3 = (RadioButton) findViewById(R.id.button3);
		        if (r1.isChecked()){
		        	SecondScreen.index = -1;
		        }else if (r2.isChecked()){
		        	SecondScreen.index = 0;
		        } else if (r3.isChecked()){
		        	SecondScreen.index = 1;
		        }
		        
		        //Add to Eval Function
		        Evalulator.getInstance().getStart();
				Evalulator.getInstance().setCpuFeeling(value);
				
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
        

        
        
        
	}
}


			
