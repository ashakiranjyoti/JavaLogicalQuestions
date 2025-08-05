// Write a Java program to check if a vowel is present in a string

// This class checks if a given string contains any vowels
public class StringContainsVowels {

  // Main method - program execution starts here
  public static void main(String[] args) {
    // "Hello" contains vowels ('e' and 'o'), so this will print true
    System.out.println(stringContainsVowels("Hello")); // true
    
    // "TV" does not contain any vowels, so this will print false
    System.out.println(stringContainsVowels("TV")); // false
  }

  // This method checks whether the input string contains at least one vowel
  public static boolean stringContainsVowels(String input) {
    // Convert the input string to lowercase to make the check case-insensitive
    // The regex ".*[aeiou].*" means:
    // - ".*" → any number of any characters before the vowel
    // - "[aeiou]" → any one vowel (a, e, i, o, or u)
    // - ".*" → any number of any characters after the vowel
    // If this pattern matches, it means the string contains at least one vowel
    return input.toLowerCase().matches(".*[aeiou].*");
  }

}

