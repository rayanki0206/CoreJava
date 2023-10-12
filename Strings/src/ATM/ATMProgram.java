package ATM;
import java.util.Scanner;

public class ATMProgram {
    public static void main(String[] args) {

        String username = "user123";
        String password = "pass123";


//        int accountBalance = 10000;
        int[] denominations = {2000, 500, 100};
        int[] denominationCounts = {5, 5, 5}; 


        int attempts = 3;

        Scanner scanner = new Scanner(System.in);


        while (attempts > 0) {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            if (username.equals(inputUsername) && password.equals(inputPassword)) {
                System.out.println("Authentication successful.");
                break;
            } else {
                attempts--;
                System.out.println("Authentication failed. Attempts left: " + attempts);
            }

            if (attempts == 0) {
                System.out.println("Account locked. Contact customer support.");
                return;
            }
        }

        while (true) {
            System.out.print("Enter amount to withdraw (multiples of 100, 500, 2000): ");
            int amountToWithdraw = scanner.nextInt();

            if (amountToWithdraw % 100 != 0 ) {
                System.out.println("Invalid amount ");
                continue;
            }

 
            boolean enoughDenominations = true;
            for (int i = 0; i < denominations.length; i++) {
                if (amountToWithdraw >= denominations[i] && denominationCounts[i] == 0) {
                    enoughDenominations = false;
                    break;
                }
            }

            if (!enoughDenominations) {
                System.out.println("Not enough denominations available. Enter a different amount.");
                continue;
            }

            for (int i = 0; i < denominations.length; i++) {
                while (amountToWithdraw >= denominations[i] && denominationCounts[i] > 0) {
                    amountToWithdraw -= denominations[i];
                    denominationCounts[i]--;
                    System.out.println("Dispensing: " + denominations[i]);
                }
            }
            
            //or insufficient balance.
//            || amountToWithdraw > accountBalance
//            accountBalance -= amountToWithdraw; 
//            System.out.println("Transaction successful. Updated balance: " + accountBalance);


            System.out.print("Do you want to perform another transaction? (yes/no): ");
            String continueTransaction = scanner.next();

            if (continueTransaction.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using our ATM. Goodbye!");
                break;
            }
        }
        scanner.close();
    }
}
