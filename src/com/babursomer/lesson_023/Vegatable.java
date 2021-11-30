package com.babursomer.lesson_023;

public class Vegatable extends PackedUnpackedProduct {
	private int shelfLife; // kaç gün taze kalıyor
	
	public Vegatable(String EAN, String name, float price, int VATRate, int minStock, boolean packed) {
		super(EAN, name, price, VATRate, minStock, packed);
		// TODO Auto-generated constructor stub
	}
	
}
