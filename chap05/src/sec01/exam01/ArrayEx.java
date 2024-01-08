package sec01.exam01;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
//		int[]scores= {83,90,87};
//		System.out.println(scores.length);
		Scanner scan = new Scanner(System.in);
		System.out.println("생성할 뱁열 수 :");
		int num=scan.nextInt();
		int[] scores = new int[num]; // 힙 영역 생성 개수
		
//		System.out.println(scores[0]);
//		System.out.println(scores[1]);
//		System.out.println(scores[2]);
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
//		for (int i = 0; i < 3; i++) {
//			System.out.println(scores[i]);
		
		String[] names = new String[5];
		for (int i=0;i<5;i++) {
			System.out.println(names[i]);
		
		}
		
		

	}
}

		

