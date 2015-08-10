
public class CPPStudent implements Student{
	private String ID;
	@Override
	public void setID(String ID) {
		this.ID=ID;
	}
	@Override
	public String getID() {
		return this.ID;
	}
}
