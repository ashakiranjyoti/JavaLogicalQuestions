// This class is used to demonstrate swapping two numbers without using a third (temporary) variable
public class SwapNumbers {

    public static void main(String[] args) {
        // Declare and initialize two integer variables
        int a = 10;
        int b = 20;

        // Print original values before swapping
        System.out.println("a is " + a + " and b is " + b);

        // Swap logic without using a temporary variable
        a = a + b; // a becomes 30 (10 + 20)
        b = a - b; // b becomes 10 (30 - 20), original value of 'a'
        a = a - b; // a becomes 20 (30 - 10), original value of 'b'

        // Print values after swapping
        System.out.println("After swapping, a is " + a + " and b is " + b);
    }
}

