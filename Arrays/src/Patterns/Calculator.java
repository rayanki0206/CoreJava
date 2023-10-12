package Patterns;

import java.util.Scanner;

public class Calculator {
	
	private static void calculationProgram() {
		System.out.println(" WELCOME ");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter input1: ");
		double choice1=sc.nextDouble();
		System.out.print("select operators form these + - * / % : ");
		String operator=sc.next();
		System.out.print("Enter input2: ");
		double choice2=sc.nextDouble();
		switch(operator) {
			case "+":
				System.out.println(choice1+choice2);
				break;
			case "-":
				System.out.println(choice1-choice2);
				break;
			case "*":
				System.out.println(choice1*choice2);
				break;
			case "/":
				System.out.println(choice1/choice2);
				break;
			case "%":
				System.out.println(choice1%choice2);
				break;
				
				
		}
		sc.close();
		
	}
	public static void main(String[] args) {
		calculationProgram();
	}


}
