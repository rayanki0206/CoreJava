package Operators;

public class LogicalOperators {
	
	boolean logicalAnd(int input1, int input2) {
		
		return input1<10 && input2<20;
	}
	
	boolean logicalOr(int input1, int input2) {

		return input1<=10 || input2<=10;
	}
	
	boolean not(int input1, int input2) {
		return !(input1==input2);
	}
	
	

}
