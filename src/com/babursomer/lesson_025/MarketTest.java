package com.babursomer.lesson_025;

public class MarketTest {
	
	public static void main(String[] args) {
		Market bakkal = new Market();
		
		Vegetable veg = new Vegetable("Marul", 2.5, "2021-10-01");
		veg.setType("Sebze");
		bakkal.addProduct(veg);
		bakkal.addProduct(new Vegetable("Salatalık", 10.0, "2020-12-01"));
		
		MilkProduct mP = new MilkProduct("Süt", 2.5, "2020-12-01");
		mP.setBrandName("Sütaş");
		mP.setDuration(10);
		bakkal.addProduct(mP);
		
		MakarnaProduct makarna = new MakarnaProduct("Makarna", 12.0, "2020-12-01");
		makarna.setBrandName("Nuhun Ankara Makarnası");
		makarna.setType(MakarnaType.SPAGETTI);
		bakkal.addProduct(makarna);
		
		makarna.buy(10);
		makarna.sell(5);
		
		veg.buy(20);
		
		bakkal.addProduct(new FrozenProduct("Dondurulmuş Sütlü Makarna", 200, "2020-12-01"));
		bakkal.listProducts();
		
		bakkal.addProduct(new MilkProduct("Peynir", 45.0, "2021-10-08"));
		bakkal.listSpoiledProducts();
	}
	
}
