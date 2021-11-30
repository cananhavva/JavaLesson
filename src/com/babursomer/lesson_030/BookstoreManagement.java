package com.babursomer.lesson_030;

public class BookstoreManagement {
	
	public static void main(String[] args) {
		int a = 3;
		double b = 3.0;
		double x = add(a, b);
		devide(add(a, b), b);
		multiply((int) add(a, b), x);
	}
	
	static void multiply(int x, double y) {
		double z = x * y;
	}
	
	static double add(int x, double y) {
		return x + y;
	}
	
	static double devide(double x, double y) {
		if (y != 0)
			return x / y;
		else
			return 0;
	}
}
