import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        scanner.close();
    }

    /**
     * Checks if a number is prime.
     * A prime number is a number greater than 1 that has no divisors other than 1 and itself.
     * 
     * @param num The number to check
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int num) {
        // 0, 1, and negative numbers are not prime
        if (num <= 1) {
            return false;
        }
        
        // 2 is the only even prime number
        if (num == 2) {
            return true;
        }
        
        // Check for even numbers (optimization)
        if (num % 2 == 0) {
            return false;
        }
        
        // Check divisors from 3 up to √num (optimization)
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
