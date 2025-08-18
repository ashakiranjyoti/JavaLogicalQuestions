// Write a code to showcase some case 
// This is the parent class (also called the superclass)
class Animal {
    String color; // Property of Animal class

    // Method to display the color of the animal
    void displayColor() {
        System.out.println("Color: " + color);
    }
}

// This is the subclass Cat which inherits from Animal
class Cat extends Animal {
    
    // Method specific to Cat class
    void meow() {
        System.out.println("Meow");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create an object of Cat
        Cat myCat = new Cat();

        // Set color (inherited from Animal)
        myCat.color = "White";

        // Call method to display color (inherited from Animal)
        myCat.displayColor();

        // Call method defined in Cat class
        myCat.meow();
    }
}

