package LessonGayrimenkul;

public class Adress {
	private String firstName;
	private String lastName;
	private String middleName;
	
	public Adress(String firstName, String lastName, String middleName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}
	
	public Adress(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = " ";
	}
	
	@Override
	public String toString() {
		return "Adress [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName + "]";
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
}
