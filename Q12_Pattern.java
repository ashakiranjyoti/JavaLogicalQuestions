// write a program to print the pattern
// This class is named PrintPattern
public class PrintPattern {

    // The main method is the entry point of the Java application
    public static void main(String[] args) {

        // Declare and initialize the number of rows to 5
        int rows = 5;

        // Outer loop: controls the number of rows
        // Starts from 1 and goes up to 'rows' (inclusive)
        for (int i = 1; i <= rows; ++i) {

            // Inner loop: prints '*' in each row
            // Number of '*' in each row is equal to the row number (i)
            for (int j = 1; j <= i; ++j) {

                // Print a star followed by a space, and stay on the same line
                System.out.print("* ");
            }

            // After each row is complete, move to the next line
            System.out.println();
        }
    }
}

