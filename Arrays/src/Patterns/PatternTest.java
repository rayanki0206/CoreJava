package Patterns;

public class PatternTest {
	
	
	protected void ascendingPattern(int num){
		for(int i=1;i<=num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	protected void descendingPattern(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=num;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	protected void reverseAscending(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=num-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	protected void reverseDescending(int num) {
		for(int i=num;i>=1;i--) {
			for(int j=num-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
