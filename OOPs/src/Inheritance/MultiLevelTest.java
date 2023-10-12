package Inheritance;

import java.util.Scanner;

public class MultiLevelTest extends MultiLevel2 {

	public static void main(String[] args) {
		MultiLevel2 multiLevel2=new MultiLevel2();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the type of buyer for ex\nWholesaler\nRetailer\nConsumer");
		String one="Wholesaler";
		String Two="Retailer";
		String Three="Consumer";
		
		String str=sc.nextLine();
		
		if(str.equalsIgnoreCase(one)){
			System.out.println("-->"+multiLevel2.wholeSale(str));
			System.out.println("-->"+multiLevel2.Quantity1());
		}
		else if(str.equalsIgnoreCase(Two)) {
			System.out.println("-->"+multiLevel2.retailers(str));
			System.out.println("-->"+multiLevel2.Quantity2());
		}
		else if(str.equalsIgnoreCase(Three)) {
			System.out.println("-->"+multiLevel2.Consumer(str));
			System.out.println("-->"+multiLevel2.Quantity3());
		}
		else {
			System.out.println("Enter a valid input from the above");
		}
		
		sc.close();

	}

}
