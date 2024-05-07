import java.util.Scanner;

public class Programme10 {
    /**
     * Write a program to input any number and check if it Armstrong number or not
     * 153 = (1*1*1)+(5*5*5)+(3*3*3)
     * where:
     * (1*1*1)=1
     * (5*5*5)=125
     * (3*3*3)=27
     * So:
     * 1+125+27=153
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, digits = 0;

        originalNumber = number;

        // Count number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++digits;
        }

        originalNumber = number;

        // Calculate sum of nth power of digits
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }

        // Check if the number is Armstrong
        if (result == number) {
            return true;
        } else {
            return false;
        }
    }
}
