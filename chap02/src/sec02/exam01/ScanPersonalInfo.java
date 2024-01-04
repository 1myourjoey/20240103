package sec02.exam01;

import java.util.Scanner;

public class ScanPersonalInfo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String f;
		String S;
		String N;

		for (int i = 0; i < 1; i++) {
			System.out.print("이름을 입력하세요");
			f = scan.next();
			System.out.print("주민번호 앞 6자리를 입력하세요");
			S = scan.next();
			System.out.print("휴대폰 번호를 입하세요");
			N = scan.next();
			System.out.println(f + "\n" + S + "\n" + N + "\n");
		}

	}

}
