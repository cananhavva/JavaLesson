package LessonGayrimenkul;

import java.time.LocalDate;

public class House extends Realty {
	private int numOfRooms;
	private int levelNumber;
	
	public House(String name, Adress adr, Dimension dim, LocalDate listingDate, double price) {
		super(name, adr, dim, listingDate, price);
		this.numOfRooms = 0;
		this.levelNumber = 0;
		
	}
	
	public int getNumOfRooms() {
		return numOfRooms;
	}
	
	public int getLevelNumber() {
		return levelNumber;
	}
	
	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}
	
	public void setLevelNumber(int levelNumber) {
		this.levelNumber = levelNumber;
	}
	
	@Override
	public String toString() {
		return "House [getNumOfRooms()=" + getNumOfRooms() + ", getLevelNumber()=" + getLevelNumber() + ", getName()="
				+ getName() + ", getAdr()=" + getAdr() + ", getDim()=" + getDim() + ", getListingDate()="
				+ getListingDate() + ", getPrice()=" + getPrice() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
