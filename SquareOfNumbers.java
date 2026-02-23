package mycodes;

public class SquareOfNumbers {

	public static void main(String[] args) {
		int exp = 4;
		int base = 2;
		int ans = 1;
		while(exp>0) {
			ans=ans*base;
			exp--;
		}
		System.out.println("Result = " + ans);
	}

}
