package javacore;

import java.util.Scanner;

public class AreaofRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		int width = sc.nextInt();
		
		int Area = length*width;
		
		System.out.println(Area);
		sc.close();

	}

}
