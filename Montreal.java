
public class Montreal extends City {
	private String language;
	
	Montreal(int numberOfPeople,String language){
		super(numberOfPeople);
		this.language=language;
	}

	@Override
	public String toString() {
		
		return "Official language of Montreal is "+this.language+" and "+super.toString();
	}
	
	
}
