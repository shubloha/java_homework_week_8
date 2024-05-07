public class Programme9 {
    /**
     *Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
     *
     */

    public static void main(String[] args) {
        int count = 8; // Number of terms in the sequence
        printFibonacciSequence(count);
    }

    // Method to print Fibonacci sequence
    public static void printFibonacciSequence(int count) {
        int num1 = 1, num2 = 1;
        System.out.print(num1 + " " + num2 + " ");

        for (int i = 2; i < count; i++) {
            int nextNum = num1 + num2;
            System.out.print(nextNum + " ");
            num1 = num2;
            num2 = nextNum;
        }
    }
}
