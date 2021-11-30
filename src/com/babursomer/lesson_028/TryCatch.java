package com.babursomer.lesson_028;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatch {
	
	public static void main(String[] args) {
		
		try {
			while (true) {
				try {
					methodA();
				} catch (FileNotFoundException ex) {
					System.out.println("In the loop");
				}
				methodB();
				methodC();
			}
		} catch (IOException ex) {
			System.out.println("dslkcşldskfşlsdkşlf");
		}
	}
	
	private static void methodC() throws IOException {
		System.out.println("metod C");
		throw new IOException("Saçma sapan");
	}
	
	private static void methodB() {
		System.out.println("metod B");
		
	}
	
	private static void methodA() throws FileNotFoundException {
		System.out.println("metod A");
		throw new FileNotFoundException("Saçma sapan");
	}
	
}
