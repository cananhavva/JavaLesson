package com.babursomer.lesson_013;

public class SymbolTest {
	public static void main(String[] args) {
		Symbol.maxLength++;
		
		System.out.println("Max symbol length: " + Symbol.maxLength);
		Symbol ücgen = new Symbol();
		ücgen.setName("Üçgen");
		ücgen.numEdges = 3;
		System.out.println("Max symbol length: " + Symbol.maxLength);
		Symbol dikdörtgen = new Symbol();
		dikdörtgen.setName("Dikdörtgen");
		dikdörtgen.numEdges = 4;
		
		Symbol elips = new Symbol();
		elips.setName("Elips");
		elips.numEdges = 360;
		
		System.out.println();
		
	}
	
}
