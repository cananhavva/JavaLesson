package com.babursomer.lesson_021;

public class Automobile extends Vehicle implements IVehicles {
	
	public Automobile(String brand, double maxSpeed) {
		super(brand, maxSpeed);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void accelarate() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void slowDown() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void setName() {
		this.name = "Araba";
		
	}
	
	@Override
	public String getName() {
		
		return this.name;
	}
	
	@Override
	public void move(int accelaration) {
		// TODO Auto-generated method stub
		
	}
	
}
