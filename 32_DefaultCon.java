// Define a class named 'Cat'
class Cat {
    // Declare instance variables (also called fields)
    String name; // to store the name of the cat
    int age;     // to store the age of the cat

    // Constructor of the Cat class (no-argument constructor)
    public Cat() {
        // Set default values when a Cat object is created
        this.name = "Unknown"; // Default name
        this.age = 0;          // Default age
    }
}


// Main class that contains the main method (entry point of the program)
public class Main {
    // Main method – execution starts from here
    public static void main(String[] args) {
        // Create a new Cat object using the default constructor
        Cat cat = new Cat();

        // Print the name and age of the cat to the console
        System.out.println("Cat Name : " + cat.name + " Cat Age : " + cat.age);
    }
}
