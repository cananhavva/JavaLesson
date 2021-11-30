package com.babursomer.lesson_009;

import java.util.Scanner;

public class ExchangeExtented {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.print("Lütfen güncel dolar kurunu virgüllü sayı olarak giriniz: ");
		double exchangeRate = klavye.nextDouble();
		
		do {
			System.out.print("Lütfen bozdurmak istediğiniz miktarı tam sayı olarak giriniz: ");
			int amount = klavye.nextInt();
			System.out.print("Lütfen dolar bozdurmak için 1, TL bozdurmak için 0 giriniz: ");
			int direction = klavye.nextInt();
			
			switch (direction) {
				case 1:
					System.out.printf("\n%d TL'nin karşılığı %.1f $'dır.", amount, amount * exchangeRate);
					break;
				case 2:
					System.out.printf("\n%d TL'nin karşılığı %.1f $'dır.", amount, amount / exchangeRate);
					break;
				default:
					System.out.println("Yanlış yön TL Bozdurma seçildi");
					System.out.printf("\n%d TL'nin karşılığı %.1f $'dır.", amount, amount / exchangeRate);
			}
			
			System.out.print("\n\nYeni işlem yapmak istiyor musunuz (evet için E): ");
			String yesOrNo = klavye.next();
			
			if (!yesOrNo.equalsIgnoreCase("E")) {
				break;
			}
			
		} while (true);
		
		klavye.close();
		System.out.println("\nBye bye");
	}
	
}
