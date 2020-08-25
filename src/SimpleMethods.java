/* 5 simple methods:
1. Takes 2 integers (x and y) and prints the sum, product, concatenation and x to the power of y
2. Prints the number of characters in a string
3. Changes a string to uppercase and reverses it
4. Prints a triangle of x rows using the character y
5. Replaces all instances of "my" with "your" in a given string
Assignment 2, Questions 1, 3, 4 & 5 - for Q2 see Rect.java*/
public class SimpleMethods {
	public static void main(String[] args) {
		integerFun(2, 3);
		printTriangle(10, 'x');
		printStrings("Hello this is my code");
		System.out.println(reverseChangeCase("Assignment 2 likes strings"));
		printString("This is my code");
	}
	
	//Question 1 -- REMEMBER: Take out static from all questions!!
	private static void integerFun(int x, int y) {
		System.out.println("Sum: " + (x+y));
		System.out.println("Product: " + (x*y));
		System.out.println("Concatenation: " + x + y);
		System.out.println("Power: " + Math.pow(x, y));
	}

	//Question 3
	private static void printStrings(String s) {
		int wordLength = s.length();
		System.out.print(s);
		System.out.println("-> contains " + wordLength + " characters");
	}
	
	//Question 4
	private static String reverseChangeCase(String a) {
		System.out.println(a);
		a = a.toUpperCase();
		StringBuilder b = new StringBuilder(a);
		return b.reverse().toString();
	}
	
	//Question 5
	private static void printTriangle(int x, char y) {
		if(x <= 1 || x >= 11) {
			System.out.println("Not valid input");
		}
		else {
			for(int i = 0; i < x; i++) {
				for(int j = 0; j <= i; j++) {
					System.out.print(y + " ");
				}
				System.out.println();
			}
		}
	}

	//Question 6
	private static void printString(String b) {
		System.out.println(b);
		b = b.replaceAll("my", "your");
		System.out.print(b);
	}
}