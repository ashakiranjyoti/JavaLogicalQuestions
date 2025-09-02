import java.util.Arrays; // For printing the array
import java.util.Random; // For generating random numbers

public class ArrayShuffle {
    public static void main(String[] args) {
         // Original array to shuffle
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };

        // Create a Random object for generating random indices
        Random rand = new Random();

         // Loop through the array
        for (int i = 0; i < array.length; i++) {
            // Generate a random index within the bounds of the array
            int randomIndexToSwap = rand.nextInt(array.length);

            // Swap the current element with the randomly chosen element
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }

        // Print the shuffled array
        System.out.println(Arrays.toString(array));
    }
}

