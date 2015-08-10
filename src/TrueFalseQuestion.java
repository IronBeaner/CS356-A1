
public class TrueFalseQuestion implements Question{
	private String question;
	private char answer;
	public TrueFalseQuestion(String question, char answer){
		setQuestion(question);
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
	public void setAnswer(char answer) {
		this.answer=answer;
	}
	@Override
	public char getAnswer() {
		return answer;
	}
}
