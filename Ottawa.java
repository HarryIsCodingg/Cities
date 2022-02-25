
public class Ottawa extends City{
	private int numberOfLakes;
	
	Ottawa(int numberOfPeople,int numberOfLakes){
		super(numberOfPeople);
		this.numberOfLakes=numberOfLakes;
	}

	@Override
	public String toString() {
		
		return "Ottawa has "+this.numberOfLakes+" lakes and "+super.toString();
	}
	
	
}
