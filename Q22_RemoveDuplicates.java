Write a program to remove duplicate characters from a string in java.
public class RemoveDuplicates {

    // This method removes duplicate characters from the input string
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder(); // To build the final string without duplicates

        boolean[] seen = new boolean[256]; // Boolean array to track which characters have been seen
                                           // 256 is used for all ASCII characters

        // Convert the input string to a character array and loop through it
        for (char c : input.toCharArray()) {
            // If the character has not been seen before, add it to result
            if (!seen[c]) {
                seen[c] = true;         // Mark this character as seen
                result.append(c);       // Append it to the result string
            }
            // If already seen, skip it
        }

        // Return the string built from non-duplicate characters
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "programming";                // Input string with duplicate characters
        String output = removeDuplicates(input);     // Call the method to remove duplicates

        // Print the original and final strings
        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + output);
    }
}

