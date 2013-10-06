package com.Snarki.snarki;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class FirstScreen extends Activity{
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Intent i = new Intent(FirstScreen.this, FirstScreen.class);
    	startActivity(i);
        setContentView(R.layout.first);
	}
}
