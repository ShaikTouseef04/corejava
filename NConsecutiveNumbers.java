package mycodes;

import java.util.Scanner;

public class NConsecutiveNumbers {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("enter N :");
			int n= sc.nextInt();
			System.out.println(n*(n+1)/2);
		}

	}

}
