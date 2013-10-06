package com.Snarki.snarki.decisions.content.verymean;

import com.Snarki.snarki.decisions.MessagePair;
import com.Snarki.snarki.decisions.QuestionAnswer;
import com.Snarki.snarki.decisions.content.Samples;

public class VeryMeanSamples extends Samples{

	@Override
	protected void fill() {
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("You are uglier than a broken toaster.", -1), 
				new MessagePair[]{
			new MessagePair("You are just a phone, shut up", -.2),
			new MessagePair("You don't phase me", 0),
			new MessagePair("I am literally in tears", 1)
		}));
		
		
	}


	
	
	
}
