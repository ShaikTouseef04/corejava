package javacore;

class sounds{
	void Animal() {
		System.out.println("Animal is eating");
	}
}
interface D{
	void run();
}
interface F{
	void walk();
}
class E extends sounds implements D,F{
	public void run() {
		System.out.println("Running");
	}
	public void walk() {
		System.out.println("Walking");
	}
}
public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E obj = new E();
		obj.run();
		obj.walk();
		obj.Animal();

	}

}
