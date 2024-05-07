public class DigitSumChallenge {
    /**
     * Write a method with the name sumDigits that has one int parameter called number.
     * If the parameter is >= 10 then the method should process the number and return sum of all digits,
     * otherwise return -1 to indicate an invalid value.
     * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
     * negative numbers, so also return -1 for negative numbers.
     * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
     * Calling the method sumDigits(1) should return -1 as per requirements described above.
     * Add some code to the main method to test out the sumDigits method to determine that it is working
     * correctly for valid and invalid values passed as arguments.
     * Hint: Use n % 10 to extract the least-significant digit.
     * Use n = n / 10 to discard the least-significant digit.
     * The method needs to be static
     * Create a class with the name DigitSumChallenge
     */
    public static void main(String[] args) {
        // Testing the sumDigits method with different inputs
        System.out.println(sumDigits(125)); // Output: 8
        System.out.println(sumDigits(1));   // Output: -1 (Single digit)
        System.out.println(sumDigits(-12)); // Output: -1 (Negative number)
        System.out.println(sumDigits(9));   // Output: -1 (Single digit)
        System.out.println(sumDigits(123456789)); // Output: 45
    }

    // Method to calculate sum of digits of a number
    public static int sumDigits(int number) {
        // If the number is less than 10, it's a single digit or negative, return -1
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        // Iterate through each digit of the number
        while (number > 0) {
            // Extract the least significant digit
            int digit = number % 10;
            // Add the digit to the sum
            sum += digit;
            // Remove the least significant digit from the number
            number /= 10;
        }

        // Return the sum of digits
        return sum;
    }
}
