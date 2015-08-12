
public class TrueFalseQuestion implements Question{
	private String question;
	private String[] answer;
	private String[] choices;
	
	public TrueFalseQuestion(String question, String[] choices,String[] answer){
		setQuestion(question);
		setChoices(choices);
		setAnswer(answer);
	}
	@Override
	public void setQuestion(String question) {
		this.question=question;
	}
	@Override
	public String getQuestion() {
		return this.question;
	}
	@Override
	public void setAnswer(String[] answer) {
		this.answer=answer;
	}
	@Override
	public String[] getAnswer() {
		return this.answer;
	}
	@Override
	public void setChoices(String[] choices) {
		this.choices=choices;
		
	}
	@Override
	public String[] getChoices() {
		return this.choices;
	}
}
