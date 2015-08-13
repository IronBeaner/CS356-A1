package cS356A1;
/**
 * This class creates a student instance that contains an identifying string ID 
 * and a submission array.
 * @author Oscar Nevarez
 * @version 1.0
 *
 */
public class CPPStudent implements Student{
	private String ID;
	private String[] submission;
	
	/**
	 * This constructor creates an instance of CPPStudent and assigns
	 * the ID and answer parameters to the instance object.
	 * @param ID the id number of the student, as a string
	 * @param answer a string array of the students submission
	 */
	public CPPStudent(String ID, String[] answer){
		setID(ID);
		setSubmission(answer);
	}
	
	
	
	@Override
	public void setID(String ID) {
		this.ID=ID;
	}
	
	
	@Override
	public String getID() {
		return this.ID;
	}
	
	

	@Override
	public void setSubmission(String[] answers) {
		this.submission=answers;
	}
	
	
	@Override
	public String[] getSubmissions() {
		return this.submission;
	}
	
	/**
	 * Checks two objects for equivalence
	 * @param o the specified object
	 * @return true if this object equals the specified  object
	 */
	@Override
	public boolean equals(Object o) {
	    if(o == null)
	        return false;
	    if (o == this)
	        return true;
	    if (getClass() != o.getClass())
	        return false;
	 
	    CPPStudent e = (CPPStudent) o;
	    return (this.getID() == e.getID());     
	}
	
	/**
	 * Compares this object with the specified object for order.
	 * @param o the specified object
	 * @return an integer representing the order of this object, 1 if greater 0 if equal and -1 if less than 
	 */
	public int compareTo(Object o){
		CPPStudent e = (CPPStudent)o;
		return this.ID.compareTo(e.ID);
	}
	
	/**
	 * This method returns the hash code for this object.
	 * @return the hash code for this object
	 */
	@Override
	public int hashCode(){
		return this.ID.hashCode();
	}
}
