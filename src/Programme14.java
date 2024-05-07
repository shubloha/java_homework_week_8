public class Programme14 {
    /**
     * Write a program in Java to display the pattern like a diamond.
     * While loop
     *              *
     *             ***
     *            *****
     *           *******
     *          *********
     *         ***********
     *        *************
     *         ***********
     *          *********
     *           *******
     *            *****
     *             ***
     *              *
     */
    public static void main(String[] args) {
        int rows = 13; // Number of rows in the diamond

        // Printing the upper half of the diamond
        printUpperDiamond(rows);

        // Printing the lower half of the diamond
        printLowerDiamond(rows);
    }

    // Method to print the upper half of the diamond
    public static void printUpperDiamond(int rows) {
        int i = 1; // Initialize row counter
        int spaces = rows / 2; // Initial number of spaces before stars in each row
        int stars = 1; // Initial number of stars in the first row

        // Loop to print each row of the upper half
        while (i <= rows / 2 + 1) {
            int j = 1;
            // Printing spaces before stars in each row
            while (j <= spaces) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            // Printing stars in each row
            while (k <= stars) {
                System.out.print("*");
                k++;
            }
            System.out.println(); // Moving to the next line after printing each row
            spaces--; // Decreasing spaces for the next row
            stars += 2; // Increasing stars for the next row
            i++; // Move to the next row
        }
    }

    // Method to print the lower half of the diamond
    public static void printLowerDiamond(int rows) {
        int i = 1; // Initialize row counter
        int spaces = 1; // Initial number of spaces before stars in each row
        int stars = rows - 2; // Initial number of stars in the first row of the lower half

        // Loop to print each row of the lower half
        while (i <= rows / 2) {
            int j = 1;
            // Printing spaces before stars in each row
            while (j <= spaces) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            // Printing stars in each row
            while (k <= stars) {
                System.out.print("*");
                k++;
            }
            System.out.println(); // Moving to the next line after printing each row
            spaces++; // Increasing spaces for the next row
            stars -= 2; // Decreasing stars for the next row
            i++; // Move to the next row
        }
    }
}
