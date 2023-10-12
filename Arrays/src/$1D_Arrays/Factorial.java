package $1D_Arrays;


import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number to check if it's a factorial :: ");
            int num = sc.nextInt();

            if (isFactorial(num)) {
                System.out.println(num + " is a factorial number.");
            } else {
                System.out.println(num + " is not a factorial number.");
            }

            System.out.println("Enter '1' to check another number, '0' to exit");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Program terminated.");
                break;
            } else if (choice != 1) {
                System.out.println("Enter valid input.");
            }
        }

        sc.close();
    }

    private static boolean isFactorial(int num) {
        int factorial = 1;
        int i = 1;

        while (factorial <= num) {
            if (factorial == num) {
                return true;
            }

            i++;
            factorial *= i;
        }

        return false;
    }
}
