package eightball.mvc.model;

import org.springframework.stereotype.Component;

@Component
public class EightballDTO  {
	private String question;
	private String answer;
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		if (answer == null){
			setAnswer("This is a default answer");
		}
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	

}
