package cS356A1;
/**
 * This class takes in choice and answer input and formats it into an array.
 * @author Oscar Nevarez
 * @version 1.0
 */
public class InputFormatting {
	/**
	 * This method takes in a String and formats it into a string array
	 * @param format The string will be formatted into an array of strings
	 * @return returns the input parameter formatted as a string array.
	 */
	public String[] formatQuestion(String format){
		String[] parts = format.split("-");
		return parts;
	}

}
