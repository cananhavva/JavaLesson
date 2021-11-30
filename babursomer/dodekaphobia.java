package babursomer;

public class dodekaphobia {
	
	public static void main(String[] args) {
		System.out.println("seçilen sayı: " + createRandomNumber());
	}
	
	private static int createRandomNumber() {
		int retVal = 0;
		do {
			retVal = (int) (Math.random() * 20) + 1;
		} while (retVal == 12);
		// if (retVal ==12)
		// retVal = createRandomNumber();
		
		return retVal;
		
	}
}
