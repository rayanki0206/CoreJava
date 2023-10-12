package MethodOverloading;

class Arithmetic_Operations{
	
	int add(int a, int b) {
		int add_result=a+b;
		return add_result;
	}
	
	int sub(int a, int b) {
		int sub_result=a-b;
		return sub_result;
	}
	
	int multiplication(int a, int b) {
		int multiplication_result=a*b;
		return multiplication_result;
	}
	
	int division(int a, int b) {
		int division_result=a/b;
		return division_result;
	}
	
	int modulo(int a, int b) {
		int modulo_result=a%b;
		return modulo_result;
	}
}

public class return_types {

	public static void main(String[] args) {
		
		int a=15, b=5;
		
		Arithmetic_Operations arithmetic_Operations= new Arithmetic_Operations();
		int addition=arithmetic_Operations.add(a, b);
		int subtraction=arithmetic_Operations.sub(a, b);
		int multiplication=arithmetic_Operations.multiplication(a, b);
		int division=arithmetic_Operations.division(a, b);
		int modulous=arithmetic_Operations.modulo(a, a);
		
		
		System.out.println("Addition result of "+a+" and "+b+" is: "+addition);
		System.out.println("Subtraction result of "+a+" and "+b+" is: "+subtraction);
		System.out.println("Multiplication result of "+a+" and "+b+" is: "+multiplication);
		System.out.println("Division result of "+a+" and "+b+" is: "+division);
		System.out.println("Modulous result of "+a+" and "+b+" is: "+modulous);


	}

}
