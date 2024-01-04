package sec02.exam01;

public class OperatorEx {

	public static void main(String[] args) {
		System.out.println((float)0.1==0.1f);
		System.out.println(3 == 3.0);
		System.out.println('A' == 65);

		System.out.println("\n---------------");
		boolean b1 = 'A' < 'B';
		System.out.println(b1);

		int num2 = 'B' - 'A';
		System.out.println(num2);

		System.out.println("\n---------------");

		String str = "JDK" + (3 + 3.0);
		System.out.println(str);

		System.out.println("\n---------------");

		for (int i = 0; i < 10; i++) {
			char c1 = (char) ('A' + i);
			System.out.print(c1);
		}
		System.out.println("\n---------------");

		char c1 = 'A' + 1;
		System.out.print(c1);
		System.out.println("\n---------------");

		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) { // 2의 배수
				System.out.println(i);
			}
		}

		int num = 10 % 3; // 3으로 나눈 나머지 : 1
		System.out.println(num);

		boolean play = true;
		System.out.println(!play);

		int x = 1;
		int y = 1;
		int result1 = ++x + 10;// 연산 수행 전 더함
		System.out.println(result1);
		int result2 = y++ + 10;// 연산 수행 후 더함
		System.out.println(result2);

		byte b = 100;
//		byte result = -b; // -1*b => 정수로 바뀜(연산결과가 정수라는 것)

	}

}
