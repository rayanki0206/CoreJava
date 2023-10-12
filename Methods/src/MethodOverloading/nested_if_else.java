package MethodOverloading;

import java.util.Scanner;

public class nested_if_else {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Did you pass Intermediaten : Yes(enter 1)/No()enter 0");
		int inter = sc.nextInt();
		if(inter==1) {
			System.out.println("Did you appeared for eamcet and qualified ");
			int eamcet=sc.nextInt();
			if(inter==1 && eamcet==1) {
				System.out.println("Enter into addmission room and avail concession in course fee");
			}
			else {
				System.out.println("Get the addmission with prescribed course fee");
			}
			if(inter==1 || eamcet==1){
				System.out.println("Select the course from these- 'CSE', 'ECE', 'Civil', 'Mechanical' and pay the course_fee");
				String course=sc.nextLine();
				System.out.println("Did you paid the course_fee");
				int Course_fee=sc.nextInt();
					if(Course_fee==1) {
						if(course=="CSE") {
							System.out.println("Go to room no:101");
						}
						else if(course=="ECE") {
							System.out.println("Go to room no:104");
			
						}
						else if(course=="Civil") {
							System.out.println("Go to room no:202");
						}
						else if(course=="Mechanical") {
							System.out.println("Go to room no:204");
						}
						
					}
					else {
						System.out.println("Please pay the fee to register name in the classroom");
					}
				}
			
		}
		else {
			System.out.println("Sorry, You are not allowed to enter addmission room");
		}
		
		

	}

}
