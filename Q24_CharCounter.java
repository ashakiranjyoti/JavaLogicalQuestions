// Write a program to count the number of

import java.util.Scanner;

public class CharCounter {  // Class name suggests it counts characters

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);  // Create Scanner object to read input from user
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();  // Read the whole line as input string
        
        System.out.print("Enter a character to count: ");
        char targetChar = scanner.nextLine().charAt(0);  // Read the next line and take the first character
        
        int charCount = 0;  // Initialize counter to zero
        
        // Loop through each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {  // If character matches target
                charCount++;  // Increment counter
            }
        }
        
        // Display the total count of the target character
        System.out.println("The character " + targetChar + " appears " + charCount + " times in " + inputString + ".");
    }
}

