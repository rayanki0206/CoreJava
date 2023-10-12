package Operators;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArithmeticOperators arithmeticOperators=new ArithmeticOperators();
		AssignmentOperators assignmentOperators=new AssignmentOperators();
		LogicalOperators logicalOperators=new LogicalOperators();
		RelationalOperators relationalOperators=new RelationalOperators();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input1 and input2");
		int input1=sc.nextInt();
		int input2=sc.nextInt();

		System.out.println("Addition of "+input1+" and "+input2+" is "+arithmeticOperators.add(input1, input2));
		System.out.println("Subtraction of "+input1+" and "+input2+" is "+arithmeticOperators.subtraction(input1, input2));
		System.out.println("Multiplication of "+input1+" and "+input2+" is "+arithmeticOperators.multiplication(input1, input2));
		System.out.println("Division of "+input1+" and "+input2+" is "+arithmeticOperators.division(input1, input2));
		System.out.println("Remainder of "+input1+" and "+input2+" is "+arithmeticOperators.remainder(input1, input2));
		System.out.println("");
		
		System.out.println("Assignement operator :: "+assignmentOperators.assignment(input1, input2));
		System.out.println("Addition Assignement operator :: "+assignmentOperators.addAssignment(input1, input2));
		System.out.println("Subtraction Assignement operator :: "+assignmentOperators.subAssignment(input1, input2));
		System.out.println("Multiplication Assignement operator :: "+assignmentOperators.mulAssignment(input1, input2));
		System.out.println("Division Assignement operator :: "+assignmentOperators.divAssignment(input1, input2));
		System.out.println("Remainder Assignement operator :: "+assignmentOperators.remAssignment(input1, input2));
		System.out.println("");
		
		
		System.out.println("isEqualTo operator :: "+relationalOperators.isEqualTo(input1, input2));
		System.out.println("notEqualTo operator :: "+relationalOperators.notEqualTo(input1, input2));
		System.out.println("lessThan operator :: "+relationalOperators.lessThan(input1, input2));
		System.out.println("greaterThan operator :: "+relationalOperators.greaterThan(input1, input2));
		System.out.println("LessThanEquals operator :: "+relationalOperators.lessThanEquals(input1, input2));
		System.out.println("GreaterThanEquals operator :: "+relationalOperators.greaterThanEquals(input1, input2));
		System.out.println("");
		
		
		System.out.println("Logical And :: "+logicalOperators.logicalAnd(input1, input2));
		System.out.println("Logical OR :: "+logicalOperators.logicalOr(input1, input2));
		System.out.println("Logical NOT :: "+logicalOperators.not(input1, input2));
		sc.close();
	}

}
