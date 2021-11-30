package com.babursomer.lesson_009;

import java.util.Scanner;

public class InputExample {
	
	public static void main(String[] args) {
		System.out.print("Lütfen bir değer giriniz: ");
		Scanner inp = new Scanner(System.in);
		int x = inp.nextInt();
		System.out.println(x);
		System.out.print("Lütfen bir metin giriniz: ");
		String xyz = inp.next();
		System.out.print("Lütfen bir virgüllü sayı giriniz: ");
		double d = inp.nextDouble();
		
		System.out.println("String: " + xyz + " Double: " + d);
		inp.close();
	}
}
