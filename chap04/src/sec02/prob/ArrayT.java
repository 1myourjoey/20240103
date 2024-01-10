package sec02.prob;

import java.util.Scanner;

public class ArrayT {

	public static void main(String[] args) {
		int[] arr=null;
		int[] arr2=null;
		Scanner scan = new Scanner(System.in);
		System.out.println("크기");
		
		int size = scan.nextInt();
		
		arr = new int [size];
		arr2=arr; //힙에 있는 메모리 주소값을 복사

		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
				
	}

}
