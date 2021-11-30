package com.babursomer.lesson_012;

public class EndlessRecursive {
	
	public static void main(String[] args) {
		sayHelloWorld();
	}
	
	private static void sayHelloWorld() {
		System.out.println("Hello World");
		sayHelloWorld();
	}
	
}
