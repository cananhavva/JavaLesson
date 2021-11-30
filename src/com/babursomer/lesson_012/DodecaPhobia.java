package com.babursomer.lesson_012;

public class DodecaPhobia {
	
	public static void main(String[] args) {
		System.out.println("Seçilen sayı: " + createRandomNumber());
		
		System.out.println(createRandomNumber());
	}
	
	private static int createRandomNumber() {
		int retVal = 0;
		
		retVal = (int) (Math.random() * 20) + 1;
		if (retVal == 12)
			retVal = createRandomNumber();
			
		// do {
		// retVal = (int) (Math.random() * 20) + 1;
		// } while (retVal == 12);
		
		return retVal;
	}
	
}