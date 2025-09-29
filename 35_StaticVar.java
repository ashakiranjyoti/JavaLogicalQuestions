// Define the Counter class
public class Counter {
    
    private static int count = 0;

    
    public Counter() {
        count++;
    }

    
    public static int getCount() {
        return count;
    }

    // Main method to test the Counter class
    public static void main(String[] args) {
        // Create several Counter objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Print the value of count
        System.out.println("Count: " + Counter.getCount());
    }
}

