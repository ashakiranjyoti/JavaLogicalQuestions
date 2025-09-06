// Define a public class named PrintPattern
public class PrintPattern {

    // Main method - the entry point of any Java application
    public static void main(String[] args) {

        // Declare and initialize a variable 'rows' to define the number of rows in the pattern
        int rows = 5;

        // Outer loop: controls the number of rows (from 1 to 5)
        for (int i = 1; i <= rows; ++i) {

            // Inner loop: prints '*' characters for each column in the current row
            // The number of '*' printed is equal to the current row number (i)
            for (int j = 1; j <= i; ++j) {

                // Print a star followed by a space, stay on the same line
                System.out.print("* ");
            }

            // Move to the next line after printing all stars in the current row
            System.out.println();
        }
    }
}

