package MethodOverloading;

public class ThisTest1 extends ThisTest {
	
	ThisTest1(){
	//	super();
		super(10,20);
		System.out.println("ThisTest1 Constructor :: ");
	}
	String FirstName="Prasad - Instance name";
	
	void display() {
		String FirstName="Harsha - Local name";
		System.out.println(FirstName);
		System.out.println(this.FirstName);
		System.out.println(super.FirstName);
	}
	
	//object class
	public static void testOne(ThisTest1 thisTest1) {
		System.out.println("ThisTest1 method :: ");
	}
	public static void testOne(ThisTest thisTest) {
		System.out.println("ThisTest method :: ");
	}
	public static void testOne(Object obj) {
		System.out.println("Object method :: ");
	}
	

}
