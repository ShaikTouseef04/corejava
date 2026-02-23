package javacore;

class Human{
	private int age;
	private String name;
	public int getAge() {
		return age;
		
	}
	public void  setAge(int a) {
		age = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj = new Human();
		obj.setAge(20);
		obj.setName("Touseef");
		System.out.println(obj.getName() + " :" + obj.getAge());

	}

}
