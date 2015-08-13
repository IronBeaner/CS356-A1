package cS356A1;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;
/**
 * This class creates a random generator, a set type instance, a question instance, and a voting service instance. It generates 
 * ID for students as well as randomizes their answers. It then submits these student objects to the sumissionData data structure using
 * the iVoteService. 
 * @author Oscar Nevarez
 * @version 1.0
 */
public class SimulationDriver {
	public static void main(String[] args){
		Random generate = new Random();//generator for ID's and choices!
		Set<Student> s = new HashSet<Student>(); // new hash set used to specify type of set
		
		/*Question choices and answers can be formatted in any manner as long as each choice and answer is separated by a '-' character.
		 Example: ("test?","A-B-C-D-E-F","A-B-C-D-E")
		 Example: ("test?","1-2-3-4-5-6","2-3-4")
		 supports multiple choice with multiple answers, multiple choice with one answer, and true or false.*/
		Question currentQuestion=new MultipleChoiceQuestion("test?","A-B-C-D-E-F","A");
		if(generate.nextInt(2)==1)
			currentQuestion=new TrueFalseQuestion("test?","1.Right-2.Wrong","A");
		
		VoteService voteService=new iVoteService(currentQuestion,s);
		
		
		String[] submissions = null;
		String[] choices=currentQuestion.getChoices();
		int generateInt=0;
		int generateId=0;
		for (int x=0;x<40;x++){
			generateId=generate.nextInt(1000)+1000;
		
		if(currentQuestion instanceof TrueFalseQuestion){
			submissions=new String[1];
			generateInt=generate.nextInt(2); //0-1 for answer array.
			submissions[0]=choices[generateInt];
		}
		else if(currentQuestion instanceof MultipleChoiceQuestion){
			//if multiple answers
			if(currentQuestion.getAnswer().length>1){
				// random answers will be stored in here, this stops duplicate random answers to be added.
				Set<String> sub= new HashSet<String>();
				
				// select a random number to select as an answer
				generateInt=generate.nextInt(choices.length);
				
				//generate a random amount of choices to select, since question has more than one answer!
				int generateNumberOfChoicesToSelect=generate.nextInt(choices.length);
				
				for(int y=generateNumberOfChoicesToSelect;y<choices.length;y++){
					generateInt=generate.nextInt(choices.length);
					sub.add(choices[generateInt]);
				}
				submissions=new String[sub.size()]; 
				submissions= sub.toArray(submissions);
			}
			else{
				submissions=new String[1];
				generateInt=generate.nextInt(choices.length);
				submissions[0]=choices[generateInt];		
			}
		}
			
			Student currentStudent= new CPPStudent(generateId+"",submissions);
			voteService.submit(currentStudent);
		}
		
			voteService.report();
	}
}
