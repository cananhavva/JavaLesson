package com.babursomer.lesson_019;

import java.util.ArrayList;

public class TheCache<T> {
	private ArrayList<T> data = new ArrayList<>();
	
	public void add(T item) {
		data.add(item);
	}
	
	public T get(int index) {
		return data.get(index);
	}
}
