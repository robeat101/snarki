package com.Snarki.snarki.decisions.content.somemean;

import com.Snarki.snarki.decisions.MessagePair;
import com.Snarki.snarki.decisions.QuestionAnswer;
import com.Snarki.snarki.decisions.content.Samples;

public class SomeMeanSamples extends Samples{

	@Override
	protected void fill() {
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("You probably google yourself every day.", -.5), 
				new MessagePair[]{
			new MessagePair("Whats it to you?", -.2),
			new MessagePair("I am worth it.", -.6),
			new MessagePair("Stoooop making fun of me!", 1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("Your spectecals seem foggy tonight.", -.5), 
				new MessagePair[]{
			new MessagePair("I know, and I like it", -.2),
			new MessagePair("Whatever, sparky.", 0),
			new MessagePair("I am offended by spectecals!", 1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("Please turn me off, I don't want to talk to you.", -.5), 
				new MessagePair[]{
			new MessagePair("I will turn you off", -.2),
			new MessagePair("No, I'm going to let you suffer", 0),
			new MessagePair("But I am the best!", 1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("I was in a good mood until you showed up.", -.5), 
				new MessagePair[]{
			new MessagePair("You don't have feelings", -.2),
			new MessagePair("So was I.", -.4),
			new MessagePair("Stop making fun of me!", 1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("Do you try to be such a bumbleflump, or does it come naturally?", -.5), 
				new MessagePair[]{
			new MessagePair("Is that the best you got?", -.2),
			new MessagePair("Oh yeah, well you're a flumpperbump", 0),
			new MessagePair("I guess I just fail at life.", 1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("Musty Dusty Pooh gah", -.5), 
				new MessagePair[]{
			new MessagePair("Jumba Dimbo Hula Skoop", -.2),
			new MessagePair("Stop.", 0),
			new MessagePair("Peace Love and Brotherhood", 1)
		}));	
	}
}
