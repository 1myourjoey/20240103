package sec02.exam01;

import java.util.Random;
import java.util.Scanner;

public class GameMulti {
	public static int creategenNumber(Random random) {
		//Random random = new Random();
		return random.nextInt(10) + 1;
	}

	public static void multiple() {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		int num1 = creategenNumber(random);
		int num2 = random.nextInt(10) + 1;
		int multi = num1 * num2;

		System.out.printf("%dX%d =?\n", num1, num2);
		for (;;) { // 무한루프
			System.out.print("입력");
//			int answer = scan.nextInt();
			int answer = Integer.parseInt(scan.nextLine());
			if (answer == multi) {
				System.out.println("정답");
				break;// 루프탈출

			} else {
				System.out.println("오답");
			}
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {

			multiple();

		}
		System.out.println("종료");
	}
}
