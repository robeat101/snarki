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
			new MessagePair("Stop giving me advice!", -1),
			new MessagePair("Thanks for reinforcing my knowledge </sarcasm>", -.2),
			new MessagePair("Wow is that the best you have to offer?", -1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("You are prettier than a toad!", .5), 
				new MessagePair[]{
			new MessagePair("Thanks, I guess?", -1),
			new MessagePair("That is really mean!", -.2),
			new MessagePair("And you stink worse than a hackathon room!", -1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("You are the most normal person I know.", .5), 
				new MessagePair[]{
			new MessagePair("That's such a backhanded compliment!!", -1),
			new MessagePair("NO I AM THE KING OF THE NERDS", -.2),
			new MessagePair("Strange is the new normal, obviously!", -1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("There are less than 3 things I would change about you.", .5), 
				new MessagePair[]{
			new MessagePair("What would you know?", -1),
			new MessagePair("That's 3 too many!", -.2),
			new MessagePair("Why mess with perfection?", -1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("42", .5), 
				new MessagePair[]{
			new MessagePair("Douglas Adams FTW", -1),
			new MessagePair("#DUH", -.2),
			new MessagePair("Life is complicated.", -1)
		}));
	}
}
