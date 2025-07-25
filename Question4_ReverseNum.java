import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int reversedNum = 0;
        int originalNum = num; // Store original number
        
        while (num != 0) {
            int digit = num % 10; // Extract last digit
            reversedNum = reversedNum * 10 + digit; // Build reversed number
            num = num / 10; // Remove last digit
        }
        
        System.out.println("Reversed number of " + originalNum + " is: " + reversedNum);
    }
}
