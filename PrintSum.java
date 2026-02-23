package javacore;

import java.util.Scanner;

public class PrintSum {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the A : ");
			int a = sc.nextInt();
			System.out.println("Enter the B : ");
			int b = sc.nextInt();
			
			int sum = a+b;
			
			System.out.println("Result :"+ sum);
		}
	}

}
