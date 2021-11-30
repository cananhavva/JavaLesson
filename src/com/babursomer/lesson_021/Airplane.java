package com.babursomer.lesson_021;

public class Airplane extends AirVehicle {
	private int numOfWings;
	private double wingLength;
	
	public Airplane(String name, String brand, double maxSpeed, double mass, Color color, int numOfWings) {
		super(name, brand, maxSpeed, mass, color);
		this.numOfWings = numOfWings;
	}
	
	@Override
	public String toString() {
		return "Airplane [numOfWings=" + numOfWings + ", wingLength=" + wingLength + ", toString()=" + super.toString()
				+ "]";
	}
	
}
