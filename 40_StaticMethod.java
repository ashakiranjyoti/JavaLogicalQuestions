public class Initializer {
    // Declare a static variable initialValue
    static int initialValue;

    // Static block to initialize initialValue
    static {
        initialValue = 1000;
        System.out.println("Static block: initialValue initialized to " + initialValue);
    }
