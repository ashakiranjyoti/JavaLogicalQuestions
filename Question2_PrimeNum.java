import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isPrime(num)) {
            System.out.println(num + " is PRIME!");
        } else {
            System.out.println(num + " is NOT PRIME!");
        }
    }

    // Easy-to-understand prime check
    static boolean isPrime(int num) {
        if (num <= 1) return false; // 0, 1, negatives -> Not Prime
        
        // Check divisors from 2 to num-1
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; // Found a divisor -> Not Prime
            }
        }
        return true; // No divisors found -> Prime
    }
}
