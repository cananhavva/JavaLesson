package com.babursomer.lesson_009;

import java.util.Scanner;

public class Exchange {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.print("Lütfen güncel dolar kurunu virgüllü sayı olarak giriniz: ");
		double exchangeRate = klavye.nextDouble();
		
		System.out.print("Lütfen bozdurmak istediğiniz TL miktarını tam sayı olarak giriniz: ");
		int amount = klavye.nextInt();
		klavye.close();
		
		System.out.println("\n" + amount + "TL'nin karşılığı " + amount / exchangeRate + "$'dır.");
		
		System.out.printf("\n%d TL'nin karşılığı %.1f $'dır.", amount, amount / exchangeRate);
		
	}
	
}
