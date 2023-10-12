/*
 *****
 ****
  ***
   **
    *
 */


package Patterns;

import java.util.Scanner;

public class Pattern3 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
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
