//  How do you remove spaces from a string in Java?

// Method to remove all white space characters from a given string
String removeWhiteSpaces(String input) {
    // Use StringBuilder for efficient string concatenation
    StringBuilder output = new StringBuilder();

    // Convert the input string to a character array for easy traversal
    char[] charArray = input.toCharArray();

    // Loop through each character in the array
    for (char c : charArray) {
        // Check if the character is not a whitespace
        if (!Character.isWhitespace(c)) {
            // Append the non-whitespace character to the output
            output.append(c);
        }
    }

    // Convert StringBuilder back to a String and return the result
    return output.toString();
}
