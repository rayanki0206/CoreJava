package Sunday;

public class Patterns {
	
	
	private static void pattern(int num) {
		
		for(int x=num;x>=1;x--) {
			char one='A';
			for(int y=1;y<=x;y++) {
				
				System.out.print(one);
				one++;
			}
			
			System.out.println();
		}
		for(int i=2;i<=num;i++) {
			char one='A';
			for(int j=1;j<=i;j++) {
				System.out.print(one);
				one++;
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		pattern(5);
	}
	

}
