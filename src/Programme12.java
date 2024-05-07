import java.util.Scanner;

public class Programme12 {
    /**
     * Write a programme to input any number and check if it is prime or not.
     * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
     * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
     * 17.... are the prime numbers.)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (m1(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    public static boolean m1(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If number is divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true; // If no divisor is found, the number is prime
    }
}
