package com.Snarki.snarki.decisions.content;

import java.util.ArrayList;
import java.util.List;

import com.Snarki.snarki.decisions.QuestionAnswer;

public abstract class Samples {

	private List<QuestionAnswer> questionAnswers;
	
	public Samples(){
		this.questionAnswers = new ArrayList<QuestionAnswer>();
		this.fill();
	}
	
	protected abstract void fill();
	
	protected final void addQuestionAnswer(QuestionAnswer q){
		this.questionAnswers.add(q);
	}
	
	public final QuestionAnswer[] getQuestionAnswers(){
		return this.questionAnswers.toArray(new QuestionAnswer[]{});
	}
	
}
