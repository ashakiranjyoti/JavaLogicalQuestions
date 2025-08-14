//  Write a program to print a date in specific format in Java?

import java.text.SimpleDateFormat; // Import class for date formatting
import java.util.Date;             // Import Date class to get current date

public class DateFormatExample {
    public static void main(String[] args) {
        // Define the date format pattern: MM = month, dd = day, yyyy = year
        String pattern = "MM-dd-yyyy";
        
        // Create a SimpleDateFormat object using the pattern
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        // Get the current date and format it according to the pattern
        String date = simpleDateFormat.format(new Date());

        // Print the formatted date, e.g., 08-14-2025
        System.out.println(date);
    }
}

