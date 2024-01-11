package sec01;

import java.util.Scanner;

public class ArrayInArrayPrac {

	public static void main(String[] args) {
		int sum=0,count =0;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 1,2입력");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();

		int[][] scores = new int[n1][n2];

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.printf("(%d,%d)입력:", i, j);
				scores[i][j] = scan.nextInt();

			}
		}
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
				count++;
			}

		}
		avg = sum/(double)count;
		System.out.println("총합:"+sum);
		System.out.println("평균:"+avg);
	}
}