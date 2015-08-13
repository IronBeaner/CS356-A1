package cS356A1;

import java.util.Set;

/**
 * This class implements a voting service that can be used to submit Student Submissions 
 * as well as return the result of submissions.
 * @author Oscar Nevarez
 * @version 1.0
 */
public class iVoteService implements VoteService {
	private String[] currentQuestionChoices;
	private Set<Student> submissionData;

	/**
	 * This constructor creates an iVoteService instance that is used to submit and report 
	 * submissions.
	 * contains the set of student submissions and the current question type.
	 * @param currentQuestion the choices available for the current Question.
	 * @param s a set type to be used in storing all student submissions.
	 */
	public iVoteService (Question currentQuestion,Set<Student> s){
		setCurrentQuestionChoices(currentQuestion.getChoices());
		setSubmissionDataType(s);	
	}
	
	/**
	 * This method returns the submission data.
	 * @return this method returns all the submission data
	 */
	private Set<Student> getSubmissionData() {
		return this.submissionData;
	}
	public void setSubmissionDataType(Set<Student> submissionData) {
		this.submissionData = submissionData;
	}
	public void setCurrentQuestionChoices(String[] choices){
		this.currentQuestionChoices=choices;
	}
	public String[] getCurrentQuestionChoices(){
		return this.currentQuestionChoices;
	}
	public void submit(Student student){
		 submissionData.remove(student);
		 submissionData.add(student);
	}
	public void report(){
		Results result=new Results();
		String[] finalReport=result.getResults(getCurrentQuestionChoices(),getSubmissionData());
		
		for(String element: finalReport){
			System.out.println(element);
		}
	}
}
