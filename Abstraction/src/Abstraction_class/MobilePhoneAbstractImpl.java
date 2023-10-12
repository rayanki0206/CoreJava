package Abstraction_class;

public class MobilePhoneAbstractImpl extends MobilePhone {
	void processor() {
		System.out.println("Processor is Snapdragon 8 gen2");
	}
	
	void memory() {
		System.out.println("8GB RAM SSD");
	}
	
	void homePage(int a) {
		System.out.println("New overridden Homepage method :: "+a);
	}
	void application() {
		System.out.println("New overridden applications method");
	}
	

}
