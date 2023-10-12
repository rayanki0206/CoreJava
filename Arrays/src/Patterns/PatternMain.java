package Patterns;

import java.util.Scanner;

public class PatternMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PatternTest patternTest=new PatternTest();
		System.out.println("Enter your choice below :: ");
		System.out.println("1 -- Ascending pattern\n2 -- descending pattern\n3 -- Reverse ascending pattern\n4 -- Reverse descending pattern");
		int choice=sc.nextInt();
		System.out.println("your choice :: "+choice);
		System.out.println("Enter input length for pattern");
		int num=sc.nextInt();
		while(true) {
			if(choice==1) {
				patternTest.ascendingPattern(num);
				break;
			}
			else if(choice==2) {
				patternTest.descendingPattern(num);
				break;
			}
			else if(choice==3) {
				patternTest.reverseAscending(num);
				break;
			}
			else if(choice==4) {
				patternTest.reverseDescending(num);
				break;
			}
			else {
				System.out.println("Enter valid choice");
				break;
			}
		}
		sc.close();
	}

}
