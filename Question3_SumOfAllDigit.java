import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int sum = 0;
        int originalNum = num; // Store original number for output
        
        // Loop until number becomes 0
        while (num != 0) {
            int digit = num % 10; // Extract last digit
            sum += digit;        // Add digit to sum
            num = num / 10;      // Remove last digit
        }
        
        System.out.println("Sum of digits of " + originalNum + " is: " + sum);
    }
}
