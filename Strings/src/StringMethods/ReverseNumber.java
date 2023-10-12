package StringMethods;

public class ReverseNumber {
	
	private static void Reverse(int num) {
		if(num<10) {
			System.out.print(num);
			return;
		}
		else {
			System.out.print(num%10);
			
			Reverse(num/10);
		}
	}
	
	public static void main(String[] args) {
		Reverse(34564);
	}

}
