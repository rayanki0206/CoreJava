package Interface;

public class ArithmeticImpl implements ArithmeticOp {
	
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}
	public int rem(int a, int b) {
		return a%b;
	}


}
