package cS356A1;
import java.util.Iterator;
import java.util.Set;
/**
 * This class calculates the results of student submissions 
 * @author Oscar Nevarez
 * @version 1.0
 *
 */

public class Results {
	
	
	/**
	 * This method logs all the results of each students submission and returns 
	 * it as a String[] array.
	 * @param choices the available choices for a 
	 * @param submissionData a set containing student objects 
	 * @return the results of student submissions.
	 */
	public String[] getResults(String[] choices,Set<Student> submissionData){
		String[] report = choices.clone();
		int[] logCount= new int[choices.length];
		Iterator<Student> loop =submissionData.iterator();
		
		while(loop.hasNext()){
			
			String[] currentStudentSubmissions=loop.next().getSubmissions();
			for(int x=0; x<choices.length;x++){
				
				for(int y=0;y<currentStudentSubmissions.length;y++){
					if(choices[x].equals(currentStudentSubmissions[y])){
						logCount[x]+=1; //loop through submission array and count the occurence of current option.
					}
				}
			}
			
		}
		
		for(int x=0;x<report.length;x++){
			report[x]+=" : "+logCount[x];
		}
			
		return report;
	}
}
