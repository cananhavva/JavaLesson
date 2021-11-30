package com.babursomer.lesson_025;

import java.util.HashSet;

public class Market {
	private HashSet<Product> products;
	
	public Market() {
		products = new HashSet<>();
	}
	
	public void addProduct(Product frozenProduct) {
		products.add(frozenProduct);
	}
	
	public void listProducts() {
		for (Product product : products) {
			System.out.println(product.toString());
			if (product instanceof MilkProduct) {
				MilkProduct milky = (MilkProduct) product;
				System.out.println(milky.getBrandName());
			}
		}
	}
	
	public void listSpoiledProducts() {
		System.out.println("\nBozulmuş ürünler listesi");
		for (Product product : products) {
			
			if (product instanceof Vegetable) {
				Vegetable vegie = (Vegetable) product;
				if (vegie.isSpoiled()) {
					System.out.println(vegie);
				}
			} else if (product instanceof MilkProduct) {
				MilkProduct milky = (MilkProduct) product;
				if (milky.isSpoiled()) {
					System.out.println(milky);
				}
			}
			
		}
	}
	
	public void addProduct(MakarnaProduct makarna) {
		// TODO Auto-generated method stub
		
	}
	
	public void addProduct(FrozenProduct frozenProduct) {
		// TODO Auto-generated method stub
		
	}
}
