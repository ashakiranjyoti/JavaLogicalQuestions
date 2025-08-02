// Write a program to display weekday between 1 and 7

// Import the Scanner class to read input from the user
import java.util.Scanner;

// Define the class named Exercise5
public class Exercise5 {

    // Main method - starting point of the program
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Input number: ");
        
        // Read an integer input from the user and store it in the variable 'day'
        int day = in.nextInt();

        // Call the getDayName method with the user's input and print the result
        System.out.println(getDayName(day));
    }

    // Method to return the name of the day based on the input number
    public static String getDayName(int day) {
        // Declare a variable to hold the name of the day
        String dayName = "";

        
        switch (day) {
            case 1: dayName = "Monday"; break;      // If day = 1, set to Monday
            case 2: dayName = "Tuesday"; break;     // If day = 2, set to Tuesday
            case 3: dayName = "Wednesday"; break;   // If day = 3, set to Wednesday
            case 4: dayName = "Thursday"; break;    // If day = 4, set to Thursday
            case 5: dayName = "Friday"; break;      // If day = 5, set to Friday
            case 6: dayName = "Saturday"; break;    // If day = 6, set to Saturday
            case 7: dayName = "Sunday"; break;      // If day = 7, set to Sunday
            default:                                // If input is not in 1-7 range
                dayName = "Invalid day range";      // Set message for invalid input
        }

        // Return the resulting day name
        return dayName;
    }
}

