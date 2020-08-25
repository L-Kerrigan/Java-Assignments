/* A person object to be extended by other classes. Contains custom equals, compareTo and toString methods.
Assignment 6, Question 1 */
public class Person implements Human {
	private int age;
	private String name;
	
	public Person(String n, int a) {
		if(n == null || n.trim().equals("")) {
			throw new IllegalArgumentException("Name can't be empty.");
		}
		name = n;
		if(a < 0 || a > 130) {
			throw new IllegalArgumentException("Age can't be negative or greater than 130.");
		}
		age = a;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return getClass().getName() + " :[" + getName() + ", " + getAge() + "]";
	}

	//Checks if 2 Person objects have the same name & age
	public boolean equals(Object o) {
		if(o instanceof Person) {
			return ((Person) o).getAge() == this.getAge() && ((Person) o).getName().equals(this.getName());
		} else {
			return false;
		}
	}

	//Compares 2 Human objects by age
	public int compareTo(Human h) {
		return Integer.compare(this.getAge(), h.getAge());
	}

	public static void main(String[] args) {
		//A quick test for the Human interface
		try { 
			  Human h = new Person(" ", 22); 
			  System.out.println(h);
			} catch (IllegalArgumentException ex) {
			  System.out.println("failure");
			}
	}
}
