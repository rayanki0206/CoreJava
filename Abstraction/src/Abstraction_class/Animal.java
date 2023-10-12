package Abstraction_class;

public interface Animal {
	void makeSound();
	void eat();

}

class dog implements Animal{
	public void makeSound() {
		System.out.println("Dog barks!");
	}
	public void eat() {
		System.out.println("Dog eats bones!");
	}
}

class cat implements Animal{
	public void makeSound() {
		System.out.println("cat barks!");
	}
	public void eat() {
		System.out.println("cat eats pancakes!");
	}
}

