/* Method to read integers & multiply them by 2
Assignment 7, Question 1 */
import java.util.Scanner;

public class ReadingIntegers {
    //Question 1 -- simple method to read integers & multiply them by 2
    public static void readIntegers(/*String[] args*/) {
        System.out.println("Enter your numbers.");
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int i = in.nextInt();
            System.out.println(i * 2);
        }
        in.close();
    }

    public static void main(String[] args) {
        readIntegers();
    }
}
