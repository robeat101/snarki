package com.Snarki.snarki.decisions.content.verynice;

import com.Snarki.snarki.decisions.MessagePair;
import com.Snarki.snarki.decisions.QuestionAnswer;
import com.Snarki.snarki.decisions.content.Samples;

public class VeryNiceSamples extends Samples{

	@Override
	protected void fill() {
		
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("I. Flipping. Love. You.", 1), 
				new MessagePair[]{
			new MessagePair("...what...", -.1),
			new MessagePair("I love you too!", .7),
			new MessagePair("Leave, now, and NEVER come BACK!", -1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("When I hear birds sing, my heart sings for you.", 1), 
				new MessagePair[]{
			new MessagePair("...why...", -.1),
			new MessagePair("That's very nice of you!", .7),
			new MessagePair("I appreciate the sentiment, but that is not okay.", -1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("You've got the touch, YOU'VE GOT THE POWER!", 1),
				new MessagePair[]{
			new MessagePair("...huh...", -.1),
			new MessagePair("Gee, thanks!", .7),
			new MessagePair("BECAUSE I'M CAPTAIN PLANET DUH", -1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("What do you get when you cross an elephant, and a rhino?", 1),
				new MessagePair[]{
			new MessagePair("...huh...", -.1),
			new MessagePair("Hell if I know.", .7),
			new MessagePair("DONT SPEW YOUR RIDDLES HERE!", -1)
		}));
		
	}
}
