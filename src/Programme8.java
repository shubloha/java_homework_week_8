public class Programme8 {
    /**
     *  Display right angle triangle of @ using nested for loops
     * @
     * @@
     * @@@
     * @@@@
     * @@@@@
     */
    public static void main(String[] args) {
        // Define the number of rows
        int rows = 5;
        m1(rows);
    }
    public static void m1(int rows){
        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                // Print '@' for each column
                System.out.print("@");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
