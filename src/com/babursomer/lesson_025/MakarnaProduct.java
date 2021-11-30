package com.babursomer.lesson_025;

import com.babursomer.lesson_023.Product;

public class MakarnaProduct extends Product {
	private String brandName;
	private MakarnaType type;
	
	public MakarnaProduct(String name, double price, String productionDate) {
		super(name, price, productionDate);
	}
	
	public String getBrandName() {
		return this.brandName;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public MakarnaType getType() {
		return this.type;
	}
	
	public void setType(MakarnaType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "MakarnaProduct [brandName=" + brandName + ", type=" + type + ", getBrandName()=" + getBrandName()
				+ ", getType()=" + getType() + ", getPrice()=" + getPrice() + ", getVATRate()=" + getVATRate()
				+ ", getCurrentStock()=" + getCurrentStock() + ", getMinStock()=" + getMinStock() + ", getEAN()="
				+ getEAN() + ", getName()=" + getName() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	public void sell(int i) {
		// TODO Auto-generated method stub
		
	}
	
}
