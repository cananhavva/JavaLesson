package com.babursomer.lesson_010;

import java.util.Scanner;

public class PolygonArea {
	
	public static void main(String[] args) {
		System.out.println("\t\t=======================");
		System.out.println("\t\tPolygon Area Calculator");
		System.out.println("\t\t=======================\n\n");
		
		double length;
		int numOfSides;
		boolean correctInput = true;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\t\tLütfen çokgenin kenar uzunluğunu santimetre cinsinden giriniz : ");
		do {
			length = scan.nextDouble();
			if (length <= 0.0) {
				System.err.println("Kenar uzunluğu 0 veya sıfırdan küçük olamaz!");
			}
		} while (length <= 0.0);
		
		System.out.print("\t\tLütfen çokgenin kenar adedini                                 : ");
		numOfSides = scan.nextInt();
		
		double area = (numOfSides * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / numOfSides));
		String typeOfPolygon = switch (numOfSides) {
			case 3: {
				yield "Üçgenin ";
			}
			case 4: {
				yield "Dörtgenin ";
			}
			case 5: {
				yield "Beşgenin ";
			}
			case 6: {
				yield "Altıgenin ";
			}
			case 7: {
				yield "Yedigenin ";
			}
			case 8: {
				yield "Sekizgenin ";
			}
			case 9: {
				yield "Dokuzgenin ";
			}
			case 10: {
				yield "Ongenin ";
			}
			default: {
				correctInput = false;
				yield numOfSides + "-gen'in ";
			}
		};
		if (correctInput)
			System.out.printf(typeOfPolygon + "alanı %.2f'dir", area);
		else
			System.out.println("Yanlış kenar adedi veya kenar uzunluğu girdiniz");
		scan.close();
		
	}
}
