package sec02.exam01;

import java.util.Random;
import java.util.Scanner;

public class RandomMultiple {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rd = new Random();

		for (int i = 0;; i++) {
			int num1 = rd.nextInt(9) + 1;
			int num2 = rd.nextInt(9) + 1;

			System.out.println("정답을 입력하시오");
			System.out.printf("%dX%d=\n", num1, num2);

			int sum = scan.nextInt();

			if (sum == num1 * num2) {
				System.out.printf("정답 종료합니다");
				break;

			}

		}

	}

}
