import java.util.Scanner;

/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge
 */
public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initialize scanner to read input
        int sum = readAndSumNumbers(scanner); // Call the method to read and sum numbers
        System.out.println("Sum of the numbers entered: " + sum); // Print the sum
        scanner.close(); // Close the scanner to release resources
    }

    // Method to read and sum numbers
    public static int readAndSumNumbers(Scanner scanner) {
        int sum = 0; // Initialize sum to 0
        int count = 0; // Initialize count to keep track of number of inputs

        // Continue reading until 10 numbers are entered
        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": "); // Prompt for input
            if (scanner.hasNextInt()) { // Check if input is an integer
                int number = scanner.nextInt(); // Read the integer
                sum += number; // Add the integer to sum
                count++; // Increment count
            } else {
                System.out.println("Invalid Number"); // Print error message for invalid input
                scanner.next(); // Clear the invalid input
            }
        }

        return sum; // Return the sum
    }
}
