package Operators;

public class AssignmentOperators {
	
	int assignment(int input1, int input2) {
		int input3=input1+input2;
		return input3;
	}
	
	int addAssignment(int input1, int input2) {
		input1 += input2;
		return input1;
	}
	
	int subAssignment(int input1, int input2) {
		input1 -= input2;
		return input1;
	}
	
	int mulAssignment(int input1, int input2) {
		input1 *= input2;
		return input1;
	}
	
	int divAssignment(int input1, int input2) {
		input1 /= input2;
		return input1;
	}
	
	int remAssignment(int input1, int input2) {
		input1 %= input2;
		return input1;
	}

}
