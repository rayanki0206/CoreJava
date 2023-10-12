package MethodOverloading;

import java.util.Scanner;

public class ExecuteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Did you pass Intermediaten : Yes(enter 1)/No(enter 0)");
		int interPassStatus = sc.nextInt();
		System.out.println("interPassStatus : "+ interPassStatus +" - Passed");
		if(interPassStatus==1) {
			System.out.println("Please select you course :: ");
			System.out.println("CSC - 120");
			System.out.println("ECE - 121");
			System.out.println("CIVIL - 122");
			System.out.println("MECHANICAL - 123");
			System.out.println("EEE - 124");
			//String courseName = sc.next();
			
			String selectedCourse = sc.next();
			System.out.println("selectedCourse :  "+selectedCourse);
			
			if(selectedCourse=="CSS" || selectedCourse=="120") {
				System.out.println("Your Cource confirmed :: in B.Tech -  CSS ");
			}else if(selectedCourse=="ECE" || selectedCourse=="121") {
				System.out.println("Your Cource confirmed :: in B.Tech -  ECE ");
			}else if(selectedCourse=="CIVIL" || selectedCourse=="122") {
				System.out.println("Your Cource confirmed :: in B.Tech -  CIVIL ");
			}else if(selectedCourse=="MECHANICAL" || selectedCourse=="123") {
				System.out.println("Your Cource confirmed :: in B.Tech -  MECHANICAL ");
			}else if(selectedCourse=="EEE" || selectedCourse=="124") {
				System.out.println("Your Cource confirmed :: in B.Tech -  EEE ");
			}
			
			
			
			
			
		}else {
			
			System.out.println("Not Qualified for any course :: ");

			
		}
		sc.close();


	}

}
