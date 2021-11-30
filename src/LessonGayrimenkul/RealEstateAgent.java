package LessonGayrimenkul;

import java.util.HashMap;

public class RealEstateAgent {
	private String name;
	private HashMap<String, Realty> realties;
	private Adress adress;
	
	public RealEstateAgent() {
		this.name = name;
		this.realties = new HashMap<>();
		this.adress = adress;
	}
	
	public void addRealty(Realty realty) {
		this.realties.put(realty.getName(), realty);
	}
	
	public Realty getRealty(String name) {
		return this.realties.get(name);
		
	}
}
