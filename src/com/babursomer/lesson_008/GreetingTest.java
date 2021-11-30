package com.babursomer.lesson_008;

import java.util.Scanner;

/**
 * 
 * @author babur.somer
 * @version 1.01
 *          şlkflşdsklfş ldsfşldskşlfkdsşlf dsş
 */

public class GreetingTest {
	
	/**
	 * 
	 * @param args flgjsdglkfjglkjgk
	 */
	public static void main(String[] args) {
		Greeting /* lkdjlksajkdasjkl */ x = new Greeting();
		x.msg = "Hello";
		System.out.println(x);
		Greeting y = x;
		System.out.println(y);
		Greeting z = x;
		System.out.println(z);
		// z = new Greeting();
		System.out.println(z);
		
		if (x == y)
			System.out.println("x y'ye eşittir");
		else
			System.out.println("x y'ye eşit değildir");
		
		if (x == z)
			System.out.println("x z'ye eşittir");
		else
			System.out.println("x z'ye eşit değildir");
		
		z.msg = "Hello";
		
		if (x == z)
			System.out.println("x z'ye eşittir");
		else
			System.out.println("x z'ye eşit değildir");
		
		if (x.equals(z))
			System.out.println("x z'ye eşittir");
		else
			System.out.println("x z'ye eşit değildir");
		
		x.msg = "FFFFFF";
		System.out.println(x);
		System.out.println(y);
		y.msg = "hjkjhkjkj";
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		// int l = 42;
		// {
		// int i = 0;
		// int j = 5, k = 10;
		//
		// int l = i + k;
		// System.out.println(l);
		// }
		// System.out.println(l);
		
		System.out.println("ali \n\nbana \rtopu \"DOĞRU\" at!");
		
		long l = 123_456_789L;
		long ll = 123_456_789L;
		System.out.println(l + ll);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen bir tam sayı giriniz: ");
		double i = input.nextDouble();
		System.out.println("\n" + i);
		
		System.out.println(args[0] + " " + args[1] + " " + args[2] + " " + args[3]);
		input.close();
	}
}
