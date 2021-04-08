package org.padmini.springcore;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	private int QuestionId;
	private String Question;
	// private List<String> Answers;
	//private Set<String> Answers;
	private Map<Integer,String> Answers;
	
	public int getQuestionId() {
		return QuestionId;
	}
	public void setQuestionId(int questionId) {
		QuestionId = questionId;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}

	/* for list<String>
	 * public List<String> getAnswers() { return Answers; } public void
	 * setAnswers(List<String> answers) { Answers = answers; }
	 */
	
	/* for set<string>
	 * public Set<String> getAnswers() { return Answers; } public void
	 * setAnswers(Set<String> answers) { this.Answers = answers; }
	 */
	
	public Map<Integer, String> getAnswers() {
		return Answers;
	}
	public void setAnswers(Map<Integer, String> answers) {
		Answers = answers;
	}
	public void printQuestion() {
		System.out.println("Question Id: "+QuestionId+", Question: "+Question+", Answers: "+getAnswers());
		
	}
	
	
	
	
}
