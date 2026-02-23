package javacore;

class Student{
	String name;
	int age;
	
	void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}

public class ClassandObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name = "Touseef";
		s1.age = 20;
		
		s1.display();
	}

}
