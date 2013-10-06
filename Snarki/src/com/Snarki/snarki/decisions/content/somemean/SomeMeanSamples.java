package com.Snarki.snarki.decisions.content.somemean;

import com.Snarki.snarki.decisions.MessagePair;
import com.Snarki.snarki.decisions.QuestionAnswer;
import com.Snarki.snarki.decisions.content.Samples;

public class SomeMeanSamples extends Samples{

	@Override
	protected void fill() {
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("You are an awful person.", -.5), 
				new MessagePair[]{
			new MessagePair("I know, and I like it", -.2),
			new MessagePair("Whatever, sparky.", 0),
			new MessagePair("Stoooop making fun of me!", 1)
		}));
		
	}



}
