// Find the greatest of three numbers

// Import the Scanner class for user input
import java.util.Scanner;

public class Greatest {

  public static void main(String[] args) {
    // Create a Scanner object to read input from the user
    Scanner in = new Scanner(System.in);

    // Prompt the user to enter the first number
    System.out.print("Input the 1st number: ");
    int num1 = in.nextInt(); // Read the first number

    // Prompt the user to enter the second number
    System.out.print("Input the 2nd number: ");
    int num2 = in.nextInt(); // Read the second number

    // Prompt the user to enter the third number
    System.out.print("Input the 3rd number: ");
    int num3 = in.nextInt(); // Read the third number

    // Compare num1 with num2 and num3
    if (num1 > num2) // Check if num1 is greater than num2
      if (num1 > num3) // Then check if num1 is also greater than num3
        System.out.println("The greatest: " + num1); // num1 is the greatest

    // Compare num2 with num1 and num3
    if (num2 > num1) // Check if num2 is greater than num1
      if (num2 > num3) // Then check if num2 is also greater than num3
        System.out.println("The greatest: " + num2); // num2 is the greatest

    // Compare num3 with num1 and num2
    if (num3 > num1) // Check if num3 is greater than num1
      if (num3 > num2) // Then check if num3 is also greater than num2
        System.out.println("The greatest: " + num3); // num3 is the greatest

  }
}


