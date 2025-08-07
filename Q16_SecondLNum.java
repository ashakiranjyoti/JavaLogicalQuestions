// Write a program to find the second largest number in an array in Java
import java.util.Arrays;  // Needed to use Arrays.toString()
import java.util.Random;  // Needed to use Random

public class ShuffleArray {
    public static void main(String[] args) {
        
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };

        // Create an instance of the Random class to generate random numbers
        Random rand = new Random();

        // Loop through each element of the array
        for (int i = 0; i < array.length; i++) {
            // Generate a random index between 0 (inclusive) and array.length (exclusive)
            int randomIndexToSwap = rand.nextInt(array.length);

            // Swap the current element (at index i) with the element at the random index
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }

        // Print the shuffled array
        System.out.println(Arrays.toString(array));
    }
}
