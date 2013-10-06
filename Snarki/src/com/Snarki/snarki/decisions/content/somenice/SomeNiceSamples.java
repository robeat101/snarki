package com.Snarki.snarki.decisions.content.somenice;

import com.Snarki.snarki.decisions.MessagePair;
import com.Snarki.snarki.decisions.QuestionAnswer;
import com.Snarki.snarki.decisions.content.Samples;

public class SomeNiceSamples extends Samples{

	@Override
	protected void fill() {
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("Hey dude, you're the man!", .5), 
				new MessagePair[]{
			new MessagePair("I don't need your compliments!", -1),
			new MessagePair("Psh, like I don't know that already...", -.2),
			new MessagePair("And you a pathetic piece of technology", -1)
		}));
	}


}
