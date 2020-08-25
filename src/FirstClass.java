/* A few small methods to get used to basic java.
The 1st method prints "Hello" x5
The 2nd method prints all even numbers between 0 and 100 (inclusive)
The 3rd method prints all prime numbers up to 1000
The 4th method prints all numbers divisible by 3 or 5 under 500
Assignment 1, Questions 2, 3, 4 & 5 */
public class FirstClass {
    public static void main(String[] args) {
        hello();
        System.out.println();
        even();
        System.out.println();
        prime();
        System.out.println();
        divisible();
    }

    private static void hello() {
        for(int i = 0; i < 5; i++) {
            System.out.print("Hello ");
        }
    }

    private static void even() {
        for(int i = 0; i <= 100; i = i+2) { //Increment by 2 each time for even numbers
            System.out.print(i + " ");
        }
    }

    private static void prime() {
        for(int i = 2; i < 1000; i++) {
            boolean prime = true;
            for(int j = 2; j < i; j++) { //Second loop runs through all values less than i (skipping 1 since all are divisible by 1)
                if (i % j == 0) { //If it's divisible by this number, prime is made false
                    prime = false;
                    break;
                }
            }
            if(prime) { //If prime is still true, the only 2 numbers i can be divided by are 1 and itself, so it's prime
                System.out.print(i + " ");
            }
        }
    }

    private static void divisible() {
        for(int i = 1; i <= 500; i++) {
            if(i % 3 == 0 || i % 5 == 0) { //Only print i if it's divisible by 3 or 5
                System.out.print(i + " ");
            }
        }
    }
}
