package sec03.exam01;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println("점수를 입력하세요");
			int score = scan.nextInt();

			if (score >= 90) {
				System.out.println("A");
			} else if (score >= 80) {
				System.out.println("B");
			} else if (score >= 70) {
				System.out.println("C");
			} else {
				System.out.println("F");
			}
		}

	}
}
