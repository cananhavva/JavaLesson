package com.babursomer.lesson_019;

public class CacheString {
	private String[] message = new String[10];
	private int count = 0;
	
	public void add(String msg) {
		message[count] = msg;
		count++;
	}
	
	public String get(int index) {
		return message[index];
	}
	
}
