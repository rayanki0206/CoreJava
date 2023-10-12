package MethodOverloading;

public class if_else {
	public static void main(String[] args) {
		
		add(60, 30,40);

	}
	private static void add(int i, int j, int k) {
		if(i>j && i>k) {
			System.out.println("greatest of three numbers is "+i);
		}
		else if(j>i && j>k) {
			System.out.println("greatest of three number is "+j);
		}
		else {
			System.out.println("greatest of three number is "+k);
		
		}
		
	}
}
