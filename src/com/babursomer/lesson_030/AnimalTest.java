package com.babursomer.lesson_030;

public class AnimalTest {
	
	public static void main(String[] args) {
		Animal a1 = new Animal("Kedi", 4);
		a1.giveSound();
		
		Cat a2 = new Cat("Kedi", 4);
		a2.giveSound();
		
	}
}
