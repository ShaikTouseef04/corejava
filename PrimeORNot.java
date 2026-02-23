package javacore;

public class PrimeORNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 8;
		boolean isPrime = true;
		
		if(num <= 1) {
			isPrime = false;
		}
		for(int i = 2;i <= 2; i++) {
			if(num % i ==0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println("Prime");
		}
		else{
			System.out.println("Not Prime");
		}

	}

}
