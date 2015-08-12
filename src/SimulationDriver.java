import java.util.HashSet;
import java.util.Set;
import java.util.Random;
public class SimulationDriver {
	public static void main(){
		InputFormatting format=new InputFormatting();
		Set<Student> s = new HashSet<Student>();
		Question currentQuestion=new MultipleChoiceQuestion("test?",format.formatQuestion("A-B-C-D-E-F"),format.formatQuestion("A"));
		Random generate = new Random();
		if(generate.nextInt(2)==1)
			currentQuestion=new TrueFalseQuestion("test?",format.formatQuestion("A-B"),format.formatQuestion("A"));
		iVoteService voteService=new iVoteService(currentQuestion,s);
		Student temp;
		for (int x=0;x<39;x++){
			generate.nextInt(1000)+1000;
			
		}
		
	}
}
