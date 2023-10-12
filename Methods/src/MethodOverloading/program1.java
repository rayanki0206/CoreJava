package MethodOverloading;

public class program1 {
	public static void main(String[] args) {
//		Object obj= new Object();
		
		add(24,25,48);
		add("Hello","World");
		add(20,"vignesh","chowdary");
		
	}
	 static void add(int a, int b, int c) {
		int c1=a+b+c;
		System.out.println(c1);
	}
	
	static void add(String a1, String a2) {
		String a3= a1+a2;
		System.out.println(" "+a3);
	}
	
	static void add(int c1, String a1, String a2) {
		String a3= a1+a2;
		System.out.println("String a1 and string a2 is "+a3+"and number is "+c1);
	}
	


}
