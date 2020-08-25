/* An manager class that extends the Person class. Contains custom getSalary, equals, compareTo and toString methods.
Assignment 6, Question 3 */
import java.util.ArrayList;
import java.util.Collections;

public class Manager extends Employee {
	private ArrayList<Employee> employ = new ArrayList<>();

	public Manager(String n, int a, String emp, int sal) {
		super(n, a, emp, sal);
	}
	
	public void addEmployee(Employee a) {
		employ.add(a);
	}
	
	public ArrayList<Employee> getTeam() {
		return employ;
	}

	//Retrieves the salary for the manager plus the average salary of their team
	@Override
	public int getSalary() {
		if(employ.size() == 0) {
			return super.getSalary();
		} else {
			int sal = 0;
			for (Employee employee : getTeam()) {
				sal = sal + employee.getSalary();
			}
			return (sal / getTeam().size()) + super.getSalary();
		}
	}

	//Compares 2 Manager objects by using the super class compareTo as well as the team
	@Override
	public int compareTo(Human h) {
		if(h instanceof Manager) {
			if (super.compareTo(h) == 0) {
				return Integer.compare(((Manager) h).getTeam().size(), this.getTeam().size());
			} else {
				return super.compareTo(h);
			}
		} else {
			return super.compareTo(h);
		}
	}

	//Checks if 2 Manager objects have the same name, age, employer, salary & team
	//or uses the super class to check if 2 Person objects are the same
	@Override
	public boolean equals(Object o) {
		if(super.equals(o) && o instanceof Manager) {
			return employ.size() == this.getTeam().size();
		} else {
			return super.equals(o);
		}
	}

	@Override
	public String toString() {
		return super.toString() + "[Team: " + employ.size() + "]";
	}

	public static void main(String[] args) {
		//Some tests for the Manager & Employee classes
		ArrayList<Human> p = new ArrayList<>();
		Manager m1 = new Manager("Matthew", 50, "UCD", 70000);
		Manager m2 = new Manager("Marvin", 50, "UCD", 35000);
		Employee e1 = new Employee("Edward", 24, "UCD", 35000);
		Employee e2 = new Employee("Elliott", 31, "UCD", 48000);
		Employee e3 = new Employee("Ernesto", 28, "UCD", 38000);
		Employee e4 = new Employee("Emily", 34, "UCD", 42000);
		m1.addEmployee(e1);
		m1.addEmployee(e2);
		m2.addEmployee(e3);
		m2.addEmployee(m1);
		m1.addEmployee(e4);	
		p.add(e1); p.add(e2); p.add(e3); p.add(e4);
		p.add(m1); p.add(m2);
		System.out.println(p);
		Collections.sort(p);		
		System.out.println(p);
	}
}
