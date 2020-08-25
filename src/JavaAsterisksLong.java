/* Very long-winded program to print "JAVA" in asterisks */
public class JavaAsterisksLong {
	public static void main(String[] args) {
		for(int i = 0; i <= 22; i++) {
			if(i < 5 || i == 8 || i == 12 || i == 16 || i == 20) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		
		for(int i = 0; i <= 22; i++) {
			if(i == 2 || i == 7 || i == 9 || i == 12 || i == 16 || i == 19 || i == 21) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		
		for(int i = 0; i <= 22; i++) {
			if(i == 2 || (i >= 6 && i <= 10) || i == 12 || i == 16 || (i >= 18 && i <= 22)) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		
		for(int i = 0; i <= 22; i++) {
			if(i == 2 || i == 6 || i == 10 || i == 12 || i == 16 || i == 18 || i == 22) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		
		for(int i = 0; i <= 22; i++) {
			if(i < 3 || i == 6 || i == 10 || i == 14 || i == 18 || i == 22) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	public static void hello() {
		for(int i = 0; i < 5; i++) {
			System.out.print("hello ");
		}
	}
	
	public static void java() {
		for(int i = 0; i < 22; i++) {
			if(i < 5 || i == 7 || i == 11 || i == 15 || i == 19) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		
		for(int i = 0; i < 22; i++) {
			if(i == 2 || i == 6 || i == 8 || i == 11 || i == 15 || i == 18 || i == 20) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		
		for(int i = 0; i < 22; i++) {
			if(i == 2 || (i >= 5 && i <= 9) || i == 11 || i == 15 || (i >= 17 && i <= 21)) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		
		for(int i = 0; i < 22; i++) {
			if(i == 2 || i == 5 || i == 9 || i == 11 || i == 15 || i == 17 || i == 21) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		
		for(int i = 0; i < 22; i++) {
			if(i < 3 || i == 5 || i == 9 || i == 13 || i == 17 || i == 21) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	
	public static void even() {
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void divisible() {
		for(int i = 1; i <= 500; i++) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
			}
			else if(i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void prime() {
		int count;
		for(int i = 0; i < 1000; i++) {
			count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.print(i + " ");
			}
		}
	}
	
	
}