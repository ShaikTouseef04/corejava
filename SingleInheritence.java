package javacore;

class Animal1{
	void eat() {
		System.out.println("Eating");
	}
}
class Dog1 extends Animal1{
	void bark() {
		System.out.println("Barking");
	}
}

public class SingleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d = new Dog1();
		d.eat();
		d.bark();

	}

}
