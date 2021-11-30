package com.babursomer.lesson_019;

import java.util.LinkedList;

public class CacheShirt {
	private LinkedList<Shirt> shirts = new LinkedList<Shirt>();
	
	public void add(Shirt shirt) {
		shirts.add(shirt);
	}
	
	public Shirt get(int index) {
		return shirts.get(index);
	}
}
