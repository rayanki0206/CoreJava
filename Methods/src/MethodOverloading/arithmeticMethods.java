package MethodOverloading;

public class arithmeticMethods {
	
	public static void main(String[] args) {
		
		Test1 test1=new Test1();
		int input1=Integer.parseInt(args[0]);
		int input2=Integer.parseInt(args[1]);
		test1.input1=input1;
		test1.input2=input2;
        test1 = methodAdd(test1);
        test1 = subMethod(test1);
        test1 = methodMul(test1);
        test1 = methodDiv(test1);
        test1 = methodRem(test1);
		

		
	}
	
	Test1 test1=new Test1();
	
	static Test1  methodAdd(Test1 test1) {
		int result=test1.input1+test1.input2;
		System.out.println("Addition of "+test1.input1+" & "+test1.input2+" is "+result);
		test1.addResult=result;
		return test1;
		}
	
	static Test1 subMethod(Test1 test1) {
		int result1=test1.input1-test1.input2;
		System.out.println("Subtraction of "+test1.input1+" & "+test1.input2+" is "+result1);
		test1.subResult=result1;
		return test1;
	}
	
	static Test1 methodMul(Test1 test1) {
		int result=test1.input1*test1.input2;
		System.out.println("Multiplication of "+test1.input1+" & "+test1.input2+" is "+result);
		test1.Mulresult=result;
		return test1;
	}
	static Test1 methodDiv(Test1 test1) {
		int result=test1.input1/test1.input2;
		System.out.println("Divisionn of "+test1.input1+" & "+test1.input2+" is "+result);
		test1.divResult=result;
		return test1;
	}
	static Test1 methodRem(Test1 test1) {
		int result=test1.input1%test1.input2;
		System.out.println("Remainder of "+test1.input1+" & "+test1.input2+" is "+result);
		test1.remResult=result;
		return test1;
	}

}
