package Encapsulation;

public class EncapsulationMain {

	public static void main(String[] args) {
		EncapsulationTest encapsulationTest=new EncapsulationTest();
		
		encapsulationTest.setFirstName("Vignesh Chowdary");
		System.out.println("First name :: "+encapsulationTest.getFirstName());
		
		
		encapsulationTest.setLastName("Rayanki");
		System.out.println("Last name :: "+encapsulationTest.getLastName());
		
		encapsulationTest.setBank("Union Bank of India");
		System.out.println("Bank :: "+encapsulationTest.getBank());
		
		encapsulationTest.setAccountNumber(671102010005636l);
		System.out.println("Account number :: "+encapsulationTest.getAccountNumber());
		
		encapsulationTest.setIfsc("UBIN000716");
		System.out.println("IFSC :: "+encapsulationTest.getIfsc());
		
		encapsulationTest.setBranch("Beluguppa");
		System.out.println("Branch :: "+encapsulationTest.getBranch());
		
	}

}
