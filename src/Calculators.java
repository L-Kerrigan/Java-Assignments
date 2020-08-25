/* 2 methods:
1. Calculator for 2 integers
2. Calculator for 2 or more integers
Assignment 7, Questions 2 & 3 */
import java.util.Scanner;

public class Calculators {
	//Question 2 -- simple calculator for 2 integers
	public static void calculator(/*String[] args*/) {
		System.out.println("Enter your expression.");
		Scanner inn = new Scanner(System.in);
		int i = inn.nextInt();
		char operator = inn.next().charAt(0);
		int j = inn.nextInt();

		switch (operator) {
			case '+':
				System.out.println(i + j);
				break;
			case '-':
				System.out.println(i - j);
				break;
			case 'x':
				System.out.println(i * j);
				break;
			case '/':
				double result = ((double) i) / ((double) j);
				System.out.println(result);
				break;
			default:
				System.out.println("unknown operator");
		}
		inn.close();
	}
	
	//Question 3 - calculator for 2 or more integers
	public static void calculatorExtended(/*String[] args*/) {
		System.out.println("Enter your expression.");
		Scanner sc = new Scanner(System.in);
		double result = sc.nextDouble();

		while (sc.hasNext()) {
			String operator = sc.next();
			double i = sc.nextDouble();
			int exit = 0;

			switch (operator) {
				case "+":
					result += i;
					break;
				case "-":
					result -= i;
					break;
				case "x":
					result *= i;
					break;
				case "/":
					result /= i;
					break;
				default:
					System.out.println("Unknown operator");
					exit = 1; //To stop it printing out the following results
			}
			if (exit < 1) {
				System.out.println(result);
			} else {
				break;
			}
		}
		sc.close();
	}
	
	
	//Question 3 -- failed attempt
	public static void Q3_1_fail(String[] args) {
		System.out.println("Enter your expression.");
		Scanner sc = new Scanner(System.in);
		boolean next = true;
		
		double result = sc.nextDouble();
		while(next) {
			char operator = sc.next().charAt(0);
			double i = sc.nextDouble();
			int exit = 0;
			
			switch(operator) {
			case '+':
				result += i;
				break;
			case '-':
				result -= i;
				break;
			case 'x':
				result *= i;
				break;
			case '/':
				result /= i;
				break;
			default:
				System.out.println("unknown operator");
				exit = 1; //To stop it printing out the following results
			}
			if(exit < 1) {
				System.out.println(result);
			} else {
				next = false;
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		calculator();
		calculatorExtended();
	}
}
