public class Programme13 {
    /**
     *
     *  Write a method named hasSharedDigit with two parameters of type int.
     *  Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
     *  within the range, the method should return false.
     *  The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
     *  otherwise, the method should return false.
     *  EXAMPLE INPUT/OUTPUT:
     * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
     * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
     * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
     *  NOTE: The method hasSharedDigit should be defined as public static
     *
     *
     */
    public static boolean hasSharedDigit(int num1, int num2) {
        // Check if either number is not within the range of 10-99
        if (!isValid(num1) || !isValid(num2))
            return false;

        // Extracting digits from num1 and num2
        int digit1 = num1 % 10;
        int tens1 = num1 / 10;
        int digit2 = num2 % 10;
        int tens2 = num2 / 10;

        // Checking if any digit from num1 matches any digit from num2
        return digit1 == digit2 || digit1 == tens2 || tens1 == digit2 || tens1 == tens2;
    }

    // Method to check if a number is within the range of 10-99
    public static boolean isValid(int number) {
        return number >= 10 && number <= 99;
    }

    // Main method to test the hasSharedDigit method
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); // true
        System.out.println(hasSharedDigit(9, 99)); // false
        System.out.println(hasSharedDigit(15, 55)); // true
    }
}
