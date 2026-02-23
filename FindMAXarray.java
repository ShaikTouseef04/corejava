package javacore;

public class FindMAXarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,300,450};
		
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum = "+ max);

	}

}
