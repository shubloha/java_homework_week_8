public class Programme11 {
    /**
     * Even Digit Sum
     * Write a method named getEvenDigitSum with one parameter of type int called number.
     * The method should return the sum of the even digits within the number.
     * If the number is negative, the method should return -1 to indicate an invalid value.
     * EXAMPLE INPUT/OUTPUT:
     * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
     * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
     * * getEvenDigitSum(-22); → should return -1 since the number is negative
     * NOTE: The method getEvenDigitSum should be defined as public static
     */
    public static void main(String[] args) {
        // Example usage of getEvenDigitSum method
        System.out.println(getEvenDigitSum(123456789)); // Output: 20
        System.out.println(getEvenDigitSum(252)); // Output: 4
        System.out.println(getEvenDigitSum(-22)); // Output: -1
    }

    // Method to calculate the sum of even digits in a number
    public static int getEvenDigitSum(int number) {
        // Check if the number is negative
        if (number < 0) {
            return -1; // Return -1 for negative numbers
        }

        int sum = 0; // Initialize sum variable to store the sum of even digits
        while (number > 0) {
            int digit = number % 10; // Extract the last digit of the number
            if (digit % 2 == 0) {
                sum += digit; // Add even digits to the sum
            }
            number /= 10; // Remove the last digit from the number
        }
        return sum; // Return the sum of even digits
    }
}
