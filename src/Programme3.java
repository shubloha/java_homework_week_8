import java.util.Scanner;

public class Programme3 {
    /**
     * 3. Write a Java program that takes the user to provide a single character from the
     * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
     * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
     * error message.
     * For eg:
     * Input an alphabet: p
     * Expected Output:
     * Input letter is Consonant
     */
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Input an alphabet: ");
            String input = scanner.next();
            //Call the method into main method
            checkLetter(input);

        }
        //Method to  check the input is vowel or consonant
        public static void checkLetter(String input){
            // Check if the input is not a single character or is not a letter
            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Error: Please input a single character from the alphabet.");
            } else {
                // Convert the input to lowercase for easier comparison
                char letter = input.toLowerCase().charAt(0);
                // Check if the letter is a vowel
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                    System.out.println("Input letter is Vowel");
                } else {
                    System.out.println("Input letter is Consonant");
                }
            }
        }

    }
