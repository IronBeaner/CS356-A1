package cS356A1;
/**
 * This class creates and instance of a MultipleChoiceQuestion which contains 
 * the question, an array or choices as strings, and an array of answers as as strings
 * @author Oscar Nevarez
 * @version 1.0
 *
 */
public class MultipleChoiceQuestion implements Question{
	private String question;
	private String[] choices;
	private String[] answer;
	
	/**
	 * This constructor creates a instance of this class.
	 * It then assigns the parameters to the instance parameters
	 * @param question the question that will be assigned to this instance.
	 * @param choices the array of choices that will be assigned to this instance
	 * @param answer the array of answers that will be assigned to this instance
	 */
	public MultipleChoiceQuestion(String question, String choices, String answer){
		InputFormatting format=new InputFormatting();// used to format question choices and answers
		setQuestion(question);
		setChoices(format.formatQuestion(choices));
		setAnswer(format.formatQuestion(answer));
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
