package javacore;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10;
			int b = 0;
			int result = a/b;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}
		finally {
			System.out.println("program end");
		}

	}

}
