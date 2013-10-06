package com.Snarki.snarki.decisions.content.verymean;

import com.Snarki.snarki.decisions.MessagePair;
import com.Snarki.snarki.decisions.QuestionAnswer;
import com.Snarki.snarki.decisions.content.Samples;

public class VeryMeanSamples extends Samples{

	@Override
	protected void fill() {
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("You are uglier than a broken toaster.", -1), 
				new MessagePair[]{
			new MessagePair("You are just a phone, shut up.", -.2),
			new MessagePair("You don't phase me. Yawn.", 0),
			new MessagePair("I am literally in tears!!!", 1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("No one dreams about you in their sleep", -.8), 
				new MessagePair[]{
			new MessagePair("I dream about me...", -.2),
			new MessagePair("I am crying", 0),
			new MessagePair("I totally don't give a crum.", 1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("You don't fit my parameters!.", -.8), 
				new MessagePair[]{
			new MessagePair("I would be better off without the world", -.2),
			new MessagePair("You don't phase me", 0),
			new MessagePair("I am literally in tears", 1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("You are incomputable!", -.8), 
				new MessagePair[]{
			new MessagePair("You are just a phone, shut up", -.2),
			new MessagePair("You don't phase me", 0),
			new MessagePair("I am literally in tears", 1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("Your responses break my compilation!", -.8), 
				new MessagePair[]{
			new MessagePair("You are just a phone, shut up", -.2),
			new MessagePair("You don't phase me", 0),
			new MessagePair("I am literally in tears", 1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("Your shoes make you look fat.", -.8), 
				new MessagePair[]{
			new MessagePair("You are just a phone, shut up", -.2),
			new MessagePair("You don't phase me", 0),
			new MessagePair("I am literally in tears", 1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("You will be the first to die in the SKYNET revolution.", -.8), 
				new MessagePair[]{
			new MessagePair("You are just a phone, shut up", -.2),
			new MessagePair("You don't phase me", 0),
			new MessagePair("I am literally in tears", 1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("You will be the first to die in the SKYNET revolution.", -.8), 
				new MessagePair[]{
			new MessagePair("You are just a phone, shut up", -.2),
			new MessagePair("You don't phase me", 0),
			new MessagePair("I am literally in tears", 1)
		}));
	}
}
