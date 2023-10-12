package constructors;

public class Class1 {
	int a;
	int b;
	String c;
	String d;
	public Class1(int a,int b, String c, String d) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	public Class1(String c, String d) {
		this.c=c;
		this.d=d;
		System.out.println(c+" "+d);
	}
	
	public Class1(int a) {
		System.out.println(a);
	}
	
	public Class1() {
		
	}
	
//Class1 class1=new Class1();
}
