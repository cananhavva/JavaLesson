package LessonGayrimenkul;

import java.time.LocalDate;

public class Land extends Realty {
	
	public Land(String name, Adress adr, Dimension dim, LocalDate listingDate, double price) {
		super(name, adr, dim, listingDate, price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Land [getName()=" + getName() + ", getAdr()=" + getAdr() + ", getDim()=" + getDim()
				+ ", getListingDate()=" + getListingDate() + ", getPrice()=" + getPrice() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
