package cS356A1;
/**
 * Interface for questions.
 * @author Oscar Nevarez
 * @version 1.0
 *
 */
public interface Question {
	/**
	 * This method assigns the parameter to this instances question field.
	 * @param question the string that will be assigned to this instances question field
	 */
	public void setQuestion(String question);
	
	/**
	 * This method returns this Questions 'question' field.
	 * @return this instances question field as string
	 */
	public String getQuestion();
	
	/**
	 * This method sets this instance choices field to that of the parameter.
	 *@param choices the string array of choices that will be assigned to this instance choices field 
	 */
	public void setChoices(String[] choices);
	
	/**
	 * This method returns the choices field of the attached question object.
	 * @return this questions available choices as a string array.
	 */
	public String[] getChoices();
	
	/**
	 * This method assigns the string array parameter to this Questions answer field
	 * @param answer the string array that represents this Questions answer field
	 */
	public void setAnswer(String[] answer);
	
	/**
	 * This method returns the answers field of the attached question object.
	 * @return this questions available answers as a string array
	 */
	public String[] getAnswer();
}
