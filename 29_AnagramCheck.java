Write a program to check if two strings are anagrams in Java.
// Import necessary classes
import java.util.Arrays;
import java.util.Scanner;

// Define the main class
public class AnagramChecker {

   // Main method: program entry point
    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask user for the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Ask user for the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Convert both strings to character arrays
        char[] firstCharArray = firstString.toCharArray();
        char[] secondCharArray = secondString.toCharArray();

        // Sort both character arrays
        Arrays.sort(firstCharArray);
        Arrays.sort(secondCharArray);

        // Compare the sorted arrays to check for anagram status
        if (Arrays.equals(firstCharArray, secondCharArray)) {
            System.out.println(firstString + " and " + secondString + " are anagrams.");
        } else {
            System.out.println(firstString + " and " + secondString + " are not anagrams.");
        }
    }
}

