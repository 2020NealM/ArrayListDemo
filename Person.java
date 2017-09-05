
public class Person {
	
	private String name;
	private String gender;
	
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public String toString() {
		return "Name: " + name + "\nGender: " + gender;
	}

}
