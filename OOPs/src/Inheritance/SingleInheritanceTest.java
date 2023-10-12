package Inheritance;

import java.util.Scanner;

public class SingleInheritanceTest {

	public static void main(String[] args) {
		
		SingleInheritance2 singleInheritance2=new SingleInheritance2();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input1 and input2");
		
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		
		System.out.println("Addition of "+input1+" and "+input2+" is "+singleInheritance2.add(input1, input2));
		System.out.println("Subtraction of "+input1+" and "+input2+" is "+singleInheritance2.subtraction(input1, input2));
		System.out.println("Multiplication of "+input1+" and "+input2+" is "+singleInheritance2.multiplication(input1, input2));
		System.out.println("Division of "+input1+" and "+input2+" is "+singleInheritance2.division(input1, input2));
		
		sc.close();
	}

}
