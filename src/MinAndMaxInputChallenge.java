import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] minMax = findMinMax(scanner); // Call method to find minimum and maximum numbers
        if (minMax != null) {
            System.out.println("Minimum number entered: " + minMax[0]); // Print minimum number
            System.out.println("Maximum number entered: " + minMax[1]); // Print maximum number
        } else {
            System.out.println("No valid numbers entered."); // Print message if no valid numbers entered
        }
        scanner.close(); // Close the scanner
    }

    // Method to find minimum and maximum numbers entered by the user
    public static int[] findMinMax(Scanner scanner) {
        int min = Integer.MAX_VALUE; // Initialize min to the maximum possible value
        int max = Integer.MIN_VALUE; // Initialize max to the minimum possible value

        System.out.println("Enter numbers (type any non-integer to exit):");

        while (true) { // Infinite loop until a non-integer input is encountered
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) { // Check if the input is an integer
                int number = scanner.nextInt();
                min = Math.min(min, number); // Update minimum if necessary
                max = Math.max(max, number); // Update maximum if necessary
            } else {
                System.out.println("Invalid input. Exiting..."); // Print error message for non-integer input
                if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
                    return new int[]{min, max}; // Return minimum and maximum numbers if valid numbers entered
                } else {
                    return null; // Return null if no valid numbers entered
                }
            }
        }
    }
}
