package com.babursomer.lesson_025;

public class MilkProduct extends Product implements ISpoilable {
	private String brandName;
	private int duration;
	
	public MilkProduct(String name, double price, String productionDate) {
		super(name, price, productionDate);
	}
	
	public String getBrandName() {
		return this.brandName;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public int getDuration() {
		return this.duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	@Override
	public void buy(int number) {
		int currentAmount = this.getNumberOfProduct();
		currentAmount += number;
		this.setNumberOfProduct(currentAmount);
		System.out.println(number + "adet " + this.getName() + " alındı");
	}
	
	@Override
	public void sell(int number) {
		int currentAmount = this.getNumberOfProduct();
		currentAmount -= number;
		this.setNumberOfProduct(currentAmount);
		System.out.println(number + "adet " + this.getName() + " satıldı");
	}
	
	@Override
	public String toString() {
		return "MilkProduct [brandName=" + this.brandName + ", duration=" + this.duration + ", getName()="
				+ this.getName() + ", getPrice()=" + this.getPrice() + ", getProductionDate()="
				+ this.getProductionDate() + "]";
	}
	
	@Override
	public boolean isSpoiled() {
		String prodDate = this.getProductionDate();
		String day = prodDate.substring(8, 10);
		int dd = Integer.parseInt(day);
		if (dd + MAX_DAYS > 10)
			return true;
		else
			return false;
	}
}
