package mycodes;

public class FindingZerosInaFactorial {

	public static void main(String[] args) {
		int n = 100;
		int count = 0;
		while(n>5) {
			n = n/5;
			count = count+n;
		}
		System.out.println(count);

	}

}
