package com.babursomer.lesson_021;

public class LandVehicle extends Vehicle {
	protected int numOfTires;
	
	public LandVehicle(String brand, double maxSpeed) {
		super(brand, maxSpeed);
		
		this.numOfTires = 0;
	}
	
	@Override
	public String toString() {
		return "LandVehicle [numOfTires=" + numOfTires + ", name=" + name + ", brand=" + brand + ", mass=" + mass
				+ ", color=" + color + ", maxSpeed=" + maxSpeed + ", currSpeed=" + currSpeed + "]";
	}
	
	@Override
	public void setName() {
		this.name = "Kara Taşıtı";
	}
	
	@Override
	public void move(int accelaration) {
		System.out.println("yürüyorum");
		this.currSpeed += accelaration;
	}
	
}
