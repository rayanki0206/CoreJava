package Abstraction_class;

abstract class Bike{
	abstract void honda();
	
	void suzuki() {
		System.out.println("Suzuki bike is running");
	}
}

class Tvs extends Bike{
	void honda() {
		System.out.println("Honda bike is Running");
	}
}

public class AbstractionDemo {

	public static void main(String[] args) {
		Tvs tvs=new Tvs();
		tvs.honda();
		tvs.suzuki();
		
	}

}
