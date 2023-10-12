package $1D_Arrays;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number to check for prime :: ");
            int num = sc.nextInt();
            
            if (isPrime(num)) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }

            System.out.println("Enter '1' to search again, '0' to exit");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Program terminated");
                break;
            } else if (choice != 1) {
                System.out.println("Enter valid input");
            }
        }
        
        sc.close();
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
