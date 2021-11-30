package com.babursomer.lesson_030;

public class Animal {
	private String name;
	private int numberOfLegs;
	
	public Animal(String name, int numOfLegs) {
		this.name = name;
		this.numberOfLegs = numOfLegs;
	}
	
	public void giveSound() {
		System.out.println("ses çıkarrıyorum");
	}
}
