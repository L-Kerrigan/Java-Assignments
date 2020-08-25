/* Method to take in a name, age, employer and salary to make an employee object
Assignment 7, Question 4 */
import java.util.Scanner;

public class EmployeeMaker {
    //Question 4 -- method to take in a name, age, employer and salary to make an employee object
    public static void employeeMaker(){
        System.out.println("Enter your Employee.");
        Scanner sc = new Scanner(System.in);

        String name, employer;
        int age, salary;

        while(sc.hasNext()) {
            while(sc.hasNextDouble() || sc.hasNextInt()) {
                String temp = sc.next(); //To get rid of unneeded token
                System.out.println("received int expecting String");
            }
            name = sc.next();

            while(!sc.hasNextDouble() && !sc.hasNextInt()) {
                String temp = sc.next(); //To get rid of unneeded token
                System.out.println("received String expecting int");
            }
            age = sc.nextInt();

            while(sc.hasNextDouble() || sc.hasNextInt()) {
                String temp = sc.next(); //To get rid of unneeded token
                System.out.println("received int expecting String");
            }
            employer = sc.next();

            while(!sc.hasNextDouble() && !sc.hasNextInt()) {
                String temp = sc.next(); //To get rid of unneeded token
                System.out.println("received String expecting int");
            }
            salary = sc.nextInt();

            Employee h = new Employee(name, age, employer, salary); //Blank employee to be filled
            System.out.println(h.toString());
        }
        sc.close();
    }

    public static void main(String[] args) {
        employeeMaker();
    }
}
