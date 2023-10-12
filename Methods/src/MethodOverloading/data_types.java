package MethodOverloading;

class ArithmeticOperations{
	void add(int a, int b) {
		int add_result=a+b;
		System.out.println("Result of addition of "+a+" and "+b+" is: "+add_result);
	}
	
	void sub(int a, int b) {
		int sub_result=a-b;
		System.out.println("Result of subtraction of "+a+" and "+b+" is: "+sub_result);
		
	}
	
	void multiplication(int a, int b) {
		int multiplication_result=a*b;
		System.out.println("Result of multiplication of "+a+" and "+b+" is: "+multiplication_result);
		
	}
	
	void division(int a, int b) {
		int division_result=a/b;
		System.out.println("Result of division of "+a+" and "+b+" is: "+division_result);
		
	}
	
	void modulo(int a, int b) {
		int modulo_result=a%b;
		System.out.println("Result of modulous of "+a+" and "+b+" is: "+modulo_result);
		
	}
	
}

public class data_types {

	public static void main(String[] args) {
		
		int a=15, b=5;
		ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
		arithmeticOperations.add(a, b);
		arithmeticOperations.sub(a, b);
		arithmeticOperations.multiplication(a, b);
		arithmeticOperations.division(a, b);
		arithmeticOperations.modulo(a, b);
	}

}
