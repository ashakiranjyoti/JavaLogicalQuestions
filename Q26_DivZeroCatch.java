import java.util.*;  // Importing utility package for Scanner class

class Main {
    public static void main(String args[]) {
        // Creating a Scanner object to take input from the user
        Scanner scn = new Scanner(System.in);

        
        int n = scn.nextInt();

        // Informing user that the program will attempt division by 0
        System.out.println("Dividing this number by 0");

        // Try-catch block to handle the ArithmeticException
        try {
            // This line will cause an ArithmeticException (division by zero)
            System.out.println(n / 0);
        } catch (Exception e) {
            // Catching the exception and printing the exception message
            System.out.println(e);
        }

        // This line will execute regardless of the exception
        System.out.println("Program completed");
    }
}

