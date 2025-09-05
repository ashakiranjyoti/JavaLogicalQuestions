
import java.util.LinkedHashSet; // Imports LinkedHashSet to maintain insertion order and uniqueness
import java.util.Scanner;       // Imports Scanner class to take user input
import java.util.Set;           // Imports Set interface


public class CharDeduplicator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object to read input

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();  // Read input string from user

        
        Set<Character> charSet = new LinkedHashSet<>();

        
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i); // Get each character
            charSet.add(c);                 // Add to set (automatically removes duplicates)
        }

        // Use StringBuilder to build the new string without duplicates
        StringBuilder deduplicatedString = new StringBuilder();

        // Append each unique character in order to the new string
        for (Character c : charSet) {
            deduplicatedString.append(c);
        }

        // Output the result
        System.out.println("The deduplicated string is: " + deduplicatedString);
    }
}
