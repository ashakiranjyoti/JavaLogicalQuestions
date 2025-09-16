import java.util.Arrays;
import java.util.List;

public class OddChecker {

    // This method checks whether all numbers in the list are odd
    public static boolean onlyOddNumbers(List<Integer> list) {
        // Loop through each number in the list
        for (int i : list) {
           // If any number is divisible by 2, it's even — return false
            if (i % 2 == 0)
                return false;
        }

        // If loop completes, all numbers are odd — return true
        return true;
    }

    public static void main(String[] args) {
        // Example test cases
        List<Integer> numbers1 = Arrays.asList(1, 3, 5, 7, 9);   // all odd
        List<Integer> numbers2 = Arrays.asList(2, 4, 6);         // all even
        List<Integer> numbers3 = Arrays.asList(1, 2, 3);         // mixed

        // Calling onlyOddNumbers and printing the result
        System.out.println("All numbers are odd (Test 1): " + onlyOddNumbers(numbers1)); // true
        System.out.println("All numbers are odd (Test 2): " + onlyOddNumbers(numbers2)); // false
        System.out.println("All numbers are odd (Test 3): " + onlyOddNumbers(numbers3)); // false
    }
}

