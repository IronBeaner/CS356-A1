
import java.util.Set;


public class iVoteService {
	private Question currentQuestion;
	private Set<Student> submissionData;
	public iVoteService (Question currentQuestion,Set<Student> s){
		this.currentQuestion=currentQuestion;
		this.submissionData=s;
	}
	public void submit(Student student){
		 submissionData.remove(student);// if an
		 submissionData.add(student);
	}
	public String[] report(){
		Results result=new Results();
		return result.getResults(currentQuestion.getChoices(),submissionData);
	}
}
