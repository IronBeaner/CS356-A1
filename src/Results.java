import java.util.Iterator;
import java.util.Set;


public class Results {
	public String[] getResults(String[] choices,Set<Student> s){
		String[] report = choices.clone();
		int[] logCount= new int[choices.length];
		Iterator<Student> loop =s.iterator();
		
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
			report[x]+=logCount[x];
		}
			
		return report;
	}
}
