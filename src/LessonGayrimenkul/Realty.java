package LessonGayrimenkul;

import java.time.LocalDate;

import com.babursomer.lesson_027.Address;

public class Realty {
	private String name;
	private Adress adr;
	private Dimension dim;
	private LocalDate listingDate;
	private double price;
	
	public Realty(String name, Adress adr, Dimension dim, LocalDate listingDate, double price) {
		super();
		this.name = name;
		this.adr = adr;
		this.dim = dim;
		this.listingDate = listingDate;
		this.price = 0.0;
	}
	
	public Realty(String name2, Address adr2, com.babursomer.lesson_027.Dimension dim2, LocalDate listingDate2) {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	
	public Adress getAdr() {
		return adr;
	}
	
	public Dimension getDim() {
		return dim;
	}
	
	public LocalDate getListingDate() {
		return listingDate;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Realty [name=" + name + ", adr=" + adr + ", dim=" + dim + ", listingDate=" + listingDate + ", price="
				+ price + "]";
	}
	
}
