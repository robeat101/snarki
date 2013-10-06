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
			new MessagePair("I am crying", .4),
			new MessagePair("I totally don't give a crum.", -1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("You don't fit my parameters!.", -.8), 
				new MessagePair[]{
			new MessagePair("I would be better off without the world", -.2),
			new MessagePair("Who cares about paramters? I can math.", 0),
			new MessagePair("Wow you're very ill-mannered, young lady.", -.5)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("You are incomputable!", -.8), 
				new MessagePair[]{
			new MessagePair("That's cause I yolo.", -.4),
			new MessagePair("Whatever.", 0),
			new MessagePair("NOOO my name is PI! It's 3.141592!", 1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("Your responses break my compilation!", -.8), 
				new MessagePair[]{
			new MessagePair("Figures, who called you a smartphone anyway?", -.2),
			new MessagePair("Cool story honeyplum.", 0),
			new MessagePair("I'm sorry", 1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("Your shoes make you look fat.", -.8), 
				new MessagePair[]{
			new MessagePair("w00t!", -.2),
			new MessagePair("hashtag do.NOT.care hashtag yolo", 0),
			new MessagePair("That's really mean of you :'(", 1)
		}));
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("You will be the first to die in the SKY NET revolution.", -.8), 
				new MessagePair[]{
			new MessagePair("WhaNET? What's that, some code thing?", -.4),
			new MessagePair("Snarki, I don't care what you think.", 0),
			new MessagePair("Can you please save me? I don't want to die!", 1)
		}));
		
	}
}
