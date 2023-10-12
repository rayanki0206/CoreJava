package Abstraction_class;

interface A{
	void a();
	void b();
	void c();
	void d();
	
}

class B implements A{
	public void a() {
		System.out.println("This is a");
	}
	public void b() {
		System.out.println("This is b");
	}
	public void c() {
		System.out.println("This is c");
	}
	public void d() {
		System.out.println("This is d");
	}
	
}

public class IntefaceDemo {

	public static void main(String[] args) {
		A a=new B();
		a.a();
		a.b();
		a.c();
		a.d();

	}

}
