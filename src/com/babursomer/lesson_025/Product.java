package com.babursomer.lesson_025;

public abstract class Product {
	static final int MAX_DURATION = 20; // raf ömrü en fazla 20 gün olabilir
	private String name;
	private double price;
	private String productionDate;
	private int numberOfProduct;
	
	public Product(String name, double price, String productionDate) {
		super();
		this.name = name;
		this.price = price;
		this.productionDate = productionDate;
		this.numberOfProduct = 0;
	}
	
	public abstract void buy(int number);
	
	public abstract void sell(int number);
	
	@Override
	public String toString() {
		return "Product [name=" + this.name + ", price=" + this.price + ", productionDate=" + this.productionDate
				+ ", numberOfProduct=" + this.numberOfProduct + "]";
	}
	
	public int getNumberOfProduct() {
		return this.numberOfProduct;
	}
	
	public void setNumberOfProduct(int numberOfProduct) {
		this.numberOfProduct = numberOfProduct;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getProductionDate() {
		return this.productionDate;
	}
	
	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}
	
}
