package com.babursomer.lesson_027;

import java.time.LocalDate;

import LessonGayrimenkul.Realty;

public class House extends Realty {
	private static final long serialVersionUID = 1L;
	private int numOfRooms;
	private int levelNumber;
	
	public House(String name, Address adr, Dimension dim, LocalDate listingDate) {
		super(name, adr, dim, listingDate);
		this.numOfRooms = 0;
		this.levelNumber = 0;
	}
	
	public void setPrice(double price) { // bu gereksiz. zaten realty'nin setPrice'ı public olduğundan her herde
											// çağırabilirdim
		super.setPrice(price); // sadece super kullanımına örnek olsun diye
	}
	
	public int getNumOfRooms() {
		return this.numOfRooms;
	}
	
	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}
	
	public int getLevelNumber() {
		return this.levelNumber;
	}
	
	public void setLevelNumber(int levelNumber) {
		this.levelNumber = levelNumber;
	}
	
	@Override
	public String toString() {
		return "House [getNumOfRooms()=" + this.getNumOfRooms() + ", getLevelNumber()=" + this.getLevelNumber()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
