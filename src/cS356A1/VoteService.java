package cS356A1;

import java.util.Set;
/**
 * Interface for voting services.
 * @author Oscar Nevarez
 * @version 1.0
 *
 */
public interface VoteService {
	
	/**
	 * This method sets the set type to this VoteService
	 * @param s the set type that will be used to store submission data
	 */
	public void setSubmissionDataType(Set<Student>s );
	
	/**
	 * This method sets the available choices from the current question to this VoteService
	 * @param choices sets the choices available from the current question
	 */
	public void setCurrentQuestionChoices(String[] choices);
	
	/**
	 * This method returns a string array of choices associated with this objects.
	 * @return returns the current String array of choices associated with this object.
	 */
	public String[] getCurrentQuestionChoices();
	
	/**
	 * This method adds the specified student into the submission set. The remove method is used to check for 
	 * student objects that have the same ID, if the method finds an entry that matches the current student it is removed.
	 * The current student is then added. See {@link Set#remove(Object)} and {@link Set#add(Object)}
	 * @param student the current student whose submission will be submitted.
	 */
	public void submit(Student student);
	
	/**
	 * This method outputs the results of the {@link Results#getResults(String[], Set)} method of the {@link Results} class.
	 * It then prints out the submission results to standard output.
	 */
	public void report();
}
