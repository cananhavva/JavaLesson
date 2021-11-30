package com.babursomer.lesson_025;

public class Vegetable extends Product implements ISpoilable {
	private String type; // meyva, salata, sebze
	
	public Vegetable(String name, double price, String productionDate) {
		super(name, price, productionDate);
	}
	
	@Override
	public String toString() {
		return "Vegetable [type=" + this.type + ", name=" + this.getName() + ", price=" + this.getPrice()
				+ ", productionDate=" + this.getProductionDate() + "]";
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public void buy(int number) {
		int currentAmount = this.getNumberOfProduct();
		currentAmount += number;
		this.setNumberOfProduct(currentAmount);
		System.out.println(number + " kg sebze alındı");
	}
	
	@Override
	public void sell(int number) {
		int currentAmount = this.getNumberOfProduct();
		currentAmount -= number;
		this.setNumberOfProduct(currentAmount);
		System.out.println(number + " kg sebze satıldı");
	}
	
	@Override
	public boolean isSpoiled() {
		String prodDate = this.getProductionDate();
		if (prodDate.startsWith("2020"))
			return true;
		else
			return false;
	}
}
