
public class CPPStudent implements Student{
	private String ID;
	private String[] submission;
	public CPPStudent(String ID, String[] answer){
		setID(ID);
		setSubmission(answer);
	}
	public void setID(String ID) {
		this.ID=ID;
	}
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
	public int compareTo(Object o){
		CPPStudent e = (CPPStudent)o;
		return this.ID.compareTo(e.ID);
	}
	@Override
	public int hashCode(){
		return this.ID.hashCode();
	}
}
