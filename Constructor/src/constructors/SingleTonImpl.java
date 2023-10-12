package constructors;


public class SingleTonImpl {


	public static void main(String[] args) {
		
		SingleTon singleTon=SingleTon.getInstance();
		singleTon.input1=10;
		singleTon.input3=30;
		System.out.println(singleTon.input1);
		
		SingleTon singleTon1=SingleTon.getInstance();
		singleTon1.input2=20;
		System.out.println(singleTon1.input2);
		
		SingleTon singleTon2=singleTon1;
		System.out.println(singleTon2.input1);
		System.out.println(singleTon2.input2);
		System.out.println(singleTon2.input3);
	}

}