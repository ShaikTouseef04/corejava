package javacore;
class Animal05{
	void eat() {
		System.out.println("Eating");
	}
}
class Dog5 extends Animal05{
	void bark() {
		System.out.println("Barking");
	}
}
class Cat1 extends Animal05{
	void meow() {
		System.out.println("meowing");
	}
}
public class Hierarchicalinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog5 d = new Dog5();
		d.eat();
		d.bark();
		Cat1 c = new Cat1();
		c.eat();
		c.meow();

	}

}
