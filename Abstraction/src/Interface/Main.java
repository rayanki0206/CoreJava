package Interface;

public class Main {

	public static void main(String[] args) {
		ArithmeticImpl arithmeticImpl=new ArithmeticImpl();
		arithmeticImpl.add(20, 30);
		arithmeticImpl.sub(20, 30);
		arithmeticImpl.mul(20, 30);
		arithmeticImpl.div(20, 30);
		arithmeticImpl.rem(20, 30);
	}

}
