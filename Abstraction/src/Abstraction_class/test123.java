package Abstraction_class;

public class test123{
	
	static MobilePhoneAbstractImpl mobilePhoneAbstractImpl = new MobilePhoneAbstractImpl();


	public static void main(String[] args) {
		
		MobilePhoneAbstractImpl mobilePhoneAbstractImpl = new MobilePhoneAbstractImpl();
		mobilePhoneAbstractImpl.processor();
		mobilePhoneAbstractImpl.application();
		mobilePhoneAbstractImpl.homePage(7);
		mobilePhoneAbstractImpl.memory();

	}

}
