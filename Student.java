
public class Student extends Person {
	
	private int gradeLevel;
	
	public Student(String name, String gender, int gradeLevel) {
		super(name, gender);
		this.gradeLevel = gradeLevel;
	}
	
	public String toString() {
		return super.toString() + "\nGrade Level: " + gradeLevel;
	}

}
