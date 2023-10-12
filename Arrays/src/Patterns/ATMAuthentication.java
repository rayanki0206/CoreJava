package Patterns;

import java.util.Scanner;

public class ATMAuthentication extends ATMOperation {
	public void authentication() {
		Scanner sc=new Scanner(System.in);
		byte count=0;
		System.out.println("Welcome To SBI");
		System.out.print("Enter Username :");
		String username=sc.next();
		System.out.println("Enter Password : ");
		String password=sc.next();
		
		if(count==3) {
			System.out.println("Your account is locked");
		}
		
		if(username.equals("Admin678") && password.equals("password@567")) {
			atmFunction();
		}
		else {
			System.out.println("Enter valid input credentials");
			count++;
		}
		
		sc.close();
		
	}

}
