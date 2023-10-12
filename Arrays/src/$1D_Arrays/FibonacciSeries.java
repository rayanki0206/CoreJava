package $1D_Arrays;
//
//import java.util.Scanner;
//
//public class FibonacciSeries {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		long firstNum=0, secondNum=1;
//		long nextNum;
//		System.out.println("Enter number to get fibonacci series");
//		int fseries=sc.nextInt();
//		
//		for(int i=1;i<=fseries;i++) {
//			System.out.print(firstNum + ", ");
//			nextNum=firstNum+secondNum;
//			firstNum=secondNum;
//			secondNum=nextNum;
//		}
//	}
//
//}



import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number to check if it's in the Fibonacci series:");
            int num = sc.nextInt();

            if (isFibonacci(num)) {
                System.out.println(num + " is in the Fibonacci series.");
            } else {
                System.out.println(num + " is not in the Fibonacci series.");
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

    private static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x;
    }

    private static boolean isFibonacci(int num) {
        // A number is in the Fibonacci series if and only if one of (5 * num^2 + 4) or (5 * num^2 - 4) is a perfect square.
        return isPerfectSquare(5 * num * num + 4) || isPerfectSquare(5 * num * num - 4);
    }
}


