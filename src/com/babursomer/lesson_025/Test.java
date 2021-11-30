package com.babursomer.lesson_025;

import java.util.HashSet;

public class Test {
	
	public static void main(String[] args) {
		
		// Product pr = new Product();
		// pr.name = "Çivi";
		// pr.price = 12.5;
		// pr.productionDate = "2021-10-08";
		
		HashSet<Product> bucket = new HashSet<>();
		
		Vegetable veg = new Vegetable("Marul", 2.5, "2021-10-01");
		veg.setType("Sebze");
		bucket.add(veg);
		
		MilkProduct mP = new MilkProduct("Süt", 2.5, "2020-12-01");
		mP.setBrandName("Sütaş");
		mP.setDuration(10);
		bucket.add(mP);
		
		MakarnaProduct makarna = new MakarnaProduct("Makarna", 12.0, "2020-12-01");
		makarna.setBrandName("Nuhun Ankara Makarnası");
		makarna.setType(MakarnaType.BURGULU);
		bucket.add(makarna);
		
		System.out.println(mP.toString());
		System.out.println(makarna);
		System.out.println(veg);
		System.out.println("----------------");
		
		for (Product product : bucket) {
			System.out.println(product);
			
			if (product instanceof Vegetable) {
				Vegetable vegie = (Vegetable) product;
				vegie.setType("Salatalık");
				System.out.println(vegie.getType());
			}
		}
	}
}
