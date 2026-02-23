package javacore;

class Animal{
	void sound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal{
	void sound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal{
	void sound() {
		System.out.println("Cat meow");
	}
}
public class MethodOveriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Dog();
		a.sound();
		Animal b= new Cat();
		b.sound();	
	}

}
