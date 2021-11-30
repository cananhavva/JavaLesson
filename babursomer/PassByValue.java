package babursomer;

public class PassByValue {
	
	public static void main(String[] args) {
		int number = 1;
		
	}
	
	private static int changeNumber(int number) {
		number = number * number;
		System.out.println("In method: " + number);
		return number;
		
	}
	
}
