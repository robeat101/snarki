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
			new MessagePair("And you are a pathetic piece of technology.", -1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("Never stop trucking.", .5), 
				new MessagePair[]{
			new MessagePair("I don't need your compliments!", -1),
			new MessagePair("Psh, like I don't know that already...", -.2),
			new MessagePair("And you a pathetic piece of technology", -1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("You are prettier than a toad!", .5), 
				new MessagePair[]{
			new MessagePair("I don't need your compliments!", -1),
			new MessagePair("Psh, like I don't know that already...", -.2),
			new MessagePair("And you a pathetic piece of technology", -1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("You are the most normal person I know.", .5), 
				new MessagePair[]{
			new MessagePair("I don't need your compliments!", -1),
			new MessagePair("Psh, like I don't know that already...", -.2),
			new MessagePair("And you a pathetic piece of technology", -1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("There are less than 3 things I would change about you.", .5), 
				new MessagePair[]{
			new MessagePair("I don't need your compliments!", -1),
			new MessagePair("Psh, like I don't know that already...", -.2),
			new MessagePair("And you a pathetic piece of technology", -1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("42", .5), 
				new MessagePair[]{
			new MessagePair("I don't need your compliments!", -1),
			new MessagePair("Psh, like I don't know that already...", -.2),
			new MessagePair("And you a pathetic piece of technology", -1)
		}));
	}
}
