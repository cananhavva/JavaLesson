package com.babursomer.lesson_025;

import com.babursomer.lesson_023.Product;

public class FrozenProduct extends Product {
	private MilkProduct milkyPart;
	private MakarnaProduct makarnaPart;
	
	public FrozenProduct(String name, double price, String productionDate) {
		super(name, price, productionDate);
		milkyPart = new MilkProduct(name, price, productionDate);
		makarnaPart = new MakarnaProduct(name, price, productionDate);
	}
	
	@Override
	public String toString() {
		return "FrozenProduct [milkyPart=" + milkyPart + ", makarnaPart=" + makarnaPart + ", getPrice()=" + getPrice()
				+ ", getVATRate()=" + getVATRate() + ", getCurrentStock()=" + getCurrentStock() + ", getMinStock()="
				+ getMinStock() + ", getEAN()=" + getEAN() + ", getName()=" + getName() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
