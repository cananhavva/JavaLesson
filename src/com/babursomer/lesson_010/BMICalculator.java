package com.babursomer.lesson_010;

import java.util.Scanner;

public class BMICalculator {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double weigth, height;
		String inp;
		do {
			for (int i = 0; i < 30; i++)
				System.out.println();
			
			System.out.println("\t\t=============================");
			System.out.println("\t\tWelcome to the BMI Calculator");
			System.out.println("\t\t=============================\n\n");
			
			System.out.print("\t\tLütfen boyunuzu metre cinsinden giriniz       : ");
			height = scan.nextDouble();
			System.out.print("\t\tLütfen ağırlığınızı kilogram cinsinden giriniz: ");
			weigth = scan.nextDouble();
			System.out.println();
			
			double bmi = weigth / Math.pow(height, 2); // (height * height );
			System.out.printf("==> Hesaplanan vücud kütle endeksiniz %.2f 'dir\n\n", bmi);
			
			if (bmi < 18.5) {
				System.out.println("18, 5 kg/m.' nin altında olanlar: Zayıf.");
			} else if (bmi >= 18.5 && bmi < 24.9) {
				System.out.println("18.5 – 24, 9 kg/m. arasında olanlar: Normal kilolu.");
			} else if (bmi >= 25 && bmi < 29.9) {
				System.out.println("25 – 29, 9 kg/m. arasında olanlar: Fazla kilolu.");
			} else if (bmi >= 30 && bmi < 39) {
				System.out.println("30 – 39, 9 kg/m. arasında olanlar: Obez.");
			} else {
				System.out.println("40 kg/m.'nin üzerinde olanlar: İleri derecede obez (morbid obez), olarak görülür.");
			}
			
			System.out.print("\t\tBir hesaplama daha yapmak istiyor musunuz? (Çıkmak için [H/h]ayır       : ");
			inp = scan.next();
		} while (!inp.equalsIgnoreCase("h"));
		
		scan.close();
	}
	
}
