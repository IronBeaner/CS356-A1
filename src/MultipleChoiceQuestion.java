
public class MultipleChoiceQuestion implements Question{
	private String question;
	private String[] choices;
	private String[] answer;
	public MultipleChoiceQuestion(String question, String[] choices, String[] answer){
		InputFormatting format=new InputFormatting();
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
	public void setAnswer(String[] answer2) {
		this.answer=answer2;
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
