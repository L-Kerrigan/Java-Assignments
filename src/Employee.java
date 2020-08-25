/* An employee class that extends the Person class. Contains custom equals, compareTo and toString methods.
Assignment 6, Question 2 */
public class Employee extends Person {
	private String employer;
	private int salary;

	public Employee(String n, int a, String emp, int sal) {
		super(n, a);
		if(emp == null || emp.trim().equals("")) {
			throw new IllegalArgumentException("Employer can't be left blank.");
		}
		employer = emp;
		if(sal < 0) {
			throw new IllegalArgumentException("Salary can't be negative.");
		}
		salary = sal;
	}
	
	public String getEmployer() {
		return employer;
	}

	public int getSalary() {
		return salary;
	}

	//Checks if 2 Employee objects have the same name, age, employer & salary
	//or uses the super class to check if 2 Person objects are the same
	@Override
	public boolean equals(Object o) {
		if(o instanceof Employee) {
			return (super.equals(o) && ((Employee) o).getEmployer().equals(this.getEmployer()) && ((Employee) o).getSalary() == this.getSalary());
		} else if (o instanceof Person) {
			return super.equals(o);
		} else {
			return false; //Default response
		}
	}


	//Compares 2 Employee objects by using the super class compareTo as well as the salary
	@Override
	public int compareTo(Human h) {
		if(super.compareTo(h) == 0 && h instanceof Employee) {
			return Integer.compare(this.getSalary(), ((Employee) h).getSalary());
		} else {
			return super.compareTo(h);
		}
	}

	@Override
	public String toString() {
		return super.toString() + "[" + employer + ", " + salary + "]";
	}

	public static void main(String[] args) {
		Employee h = new Employee("Jamie", 22, "EY", 80000);
		Employee i = new Employee("Joyce", 23, "KPMG", 90000);
		System.out.println(h.getSalary() + " " + h.getEmployer());
		System.out.println(i.getSalary() + " " + i.getEmployer());
	}
}
