public class Programme15 {
    /**
     * Display left angle triangle of * using nested for loops
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     */
    public static void main(String[] args) {
            m1();
        }

    public static void m1( ) {
        // Outer loop for the number of rows
        for (int i = 0; i < 5; i++) {
            // Inner loop for printing stars in each row
            for (int j = 0; j <= i; j++) {
                System.out.print("* "); // Print a star and a space
            }
            System.out.println(); // Move to the next line after printing stars in a row
        }
    }
}
