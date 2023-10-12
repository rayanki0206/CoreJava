package StringMethods;

public class ArmstrongNumber {
	private static boolean armstrongCheck(int num) {
	
		int originalNum=num;
		int digits=String.valueOf(num).length();
		int sum=0;
		while(num>0) {
			int digit=num%10;
			sum +=Math.pow(digit, digits);
			num /=10;
			
		}
		
		return sum==originalNum;
		
		
	}
	
	public static void main(String[] args) {
        int number = 370;
        
        if (armstrongCheck(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
	}
}
