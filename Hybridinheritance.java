package javacore;

class vehical{
	void move() {
		System.out.println("vehical is moving");
	}
}
interface flyable{
	void fly();
}
interface sailable{
	void sail();
}
class plane extends vehical implements flyable,sailable{
	public void fly() {
		System.out.println("flying in the sky");
	}
	public void sail() {
		System.out.println("sailing in the water");
	}
}
public class Hybridinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		plane p = new plane();
		p.move();
		p.fly();
		p.sail();

	}

}
