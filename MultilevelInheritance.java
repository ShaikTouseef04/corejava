package javacore;

class Animal5{
	void eat() {
		System.out.println("Eating");
	}
}
class dog extends Animal5{
	void bark() {
		System.out.println("Barking");
	}
}
class puppy extends dog{
	void weep() {
		System.out.println("Weeping");
	}
	
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		puppy p = new puppy();
		
		p.eat();
		p.bark();
		p.weep();

	}

}
