import java.util.*;     // needed to use ArrayLists

public class StudentDriver {

	public static void main(String[] args) {
		// We can create arrays of objects...
		Person[] peopleArray = new Person[3];
		/*
		 * Since Student is a subclass of Person, peopleArray can hold
		 * both types of objects
		 */
		peopleArray[0] = new Person("John Smith", "Male");
		peopleArray[1] = new Student("Jane Adams", "Female", 11);
		peopleArray[2] = new Person("Julie Andrews", "Female");
	
		// We can also create ArrayLists of objects
		ArrayList<Person> peopleArrayList = new ArrayList<Person>();
		/*
		 * Just as with arrays of objects, arraylists of objects can hold
		 * objects of subclasses as well
		 */
		peopleArrayList.add(new Person("Albert Einstein", "Male"));
		peopleArrayList.add(new Student("Ada Lovelace", "Female", 10));
		peopleArrayList.add(new Student("Elon Musk", "Male", 9));
		/*
		 * Check out the API for ArrayLists to find out all of the neat
		 * and useful methods that are defined for them.
		 */
		
		/*
		 * Here's a neat trick with for loops using arrays or arraylists
		 */
		System.out.println("ARRAY CONTENTS");
		for (Person personInArray : peopleArray) {
			System.out.println(personInArray.toString() + "\n");
		}
		System.out.println("ARRAYLIST CONTENTS");
		System.out.println();
		for (Person personInArrayList: peopleArrayList) {
			System.out.println(personInArrayList.toString() + "\n");
		}
	}
	
}
