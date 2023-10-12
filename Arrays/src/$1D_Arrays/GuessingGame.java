package $1D_Arrays;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		int TargetNum=random.nextInt(100)+1;
		int attempts=0;
		boolean found=false;
		
		System.out.println("Enter the guessing game");
		System.out.print("Enter the guess number :: ");
		while(!found) {
			int guess=sc.nextInt();
			if(TargetNum==guess) {
				System.out.print("Success! You guess is right in "+attempts+" attempts");
			}
			else if(guess<TargetNum) {
				System.out.print("Your guess is less than target. Try with higher number");
			}
			else {
				System.out.print("Try with less number");
			}	
			attempts++;
			
		}		
	}

}
