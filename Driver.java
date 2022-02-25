
public class Driver {
	public static void main(String[] args) {
		City[] array= {new Montreal(250000,"French"),new Ottawa(150000,5)};
		for(City x:array) {
			System.out.println(x);
		}
		
	}
}
