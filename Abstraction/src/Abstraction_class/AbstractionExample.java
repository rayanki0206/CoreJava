package Abstraction_class;

abstract class Account{
	private String accountNumber;
	private double amount;
	
	
	public Account(String accountNumber, double amount) {
		this.accountNumber = accountNumber;
		this.amount = amount;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public double getAmount() {
		return amount;
	}
	
	
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	
}

class SavingsAccount extends Account {
	
	private double intrestRate;

	public SavingsAccount(String accountNumber, double amount, double intrestRate) {
		super(accountNumber, amount);
		this.intrestRate = intrestRate;
	}
	

    public void deposit(double amount) {
        setAmount(getAmount() + amount);
    }



	public void withdraw(double amount) {
        if (amount <= getAmount()) {
            setAmount(getAmount() - amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }



}

public class AbstractionExample {

	public static void main(String[] args) {
		SavingsAccount savingsAccount=new SavingsAccount("SA123", 1000, 0.05);
	    savingsAccount.deposit(200);
        savingsAccount.withdraw(150);
        System.out.println("Savings Account Balance: " + savingsAccount.getAmount());

		
		
	}

}
