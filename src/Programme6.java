import java.util.Scanner;

public class Programme6 {
    /**
     * Write a program in Java to display the pattern like a triangle with a number.
     * For eg.
     * Input number of rows: 10
     * Expected Output:
     * 1
     * 12
     * 123
     * 1234
     * 12345
     * 123456
     * 1234567
     * 12345678
     * 123456789
     * 12345678910
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();
        s1(rows);

}
        public static void s1 (int rows) {
            // Outer loop for the rows
            for (int i = 1; i <= rows; i++) {
                // Inner loop for printing numbers in each row
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println(); // Move to the next line after printing each row
            }
        }
    }

