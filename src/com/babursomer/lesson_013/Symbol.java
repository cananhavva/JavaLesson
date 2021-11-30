package com.babursomer.lesson_013;

public class Symbol {
	static int maxLength = 0;
	
	String name;
	int nameLength;
	int numEdges;
	
	void setName(String isim) {
		this.name = isim;
		this.nameLength = name.length();
		int x;
		
		if (this.nameLength > Symbol.maxLength) {
			Symbol.maxLength = nameLength;
		}
	}
	
	void aMethod() {
		System.out.println(name);
	}
}
