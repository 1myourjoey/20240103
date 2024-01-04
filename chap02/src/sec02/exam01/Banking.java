package sec02.exam01;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		boolean run = true;
		String username = null;
		int password = 0;
		int balance = 0;
		boolean loggedIn = false;

		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.회원가입 | 2.로그인 | 3.에금 | 4.출금 | 5.조회 | 6.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				System.out.println("회원가입");
				System.out.println("아이디");
				username = scanner.nextLine();

				System.out.println("비밀번호");
				password = Integer.parseInt(scanner.nextLine());

				System.out.println("회원가입 완료");
				break;

			case 2:
				System.out.println("로그인 시도");
				System.out.println("아이디");
				String name = scanner.nextLine();

				System.out.println("비밀번호");
				String strPassword = scanner.nextLine();
				int pwd = Integer.parseInt(strPassword);

				if (username != null && name.equals(username) && pwd == password) {
					System.out.println("로그인 성공");
					loggedIn = true;
				} else {
					System.out.println("로그인 실패");
				}
				break;

			case 3:
				if (loggedIn) {
					System.out.print("예금액> ");
					balance += Integer.parseInt(scanner.nextLine());
				} else {
					System.out.println("로그인 필요");
				}
				break;
			case 4:
				if (loggedIn) {
					System.out.print("출금액> ");
					balance -= Integer.parseInt(scanner.nextLine());
				} else {
					System.out.println("로그인 필요");
				}
				break;
			case 5:
				if (loggedIn) {
					System.out.print("조회> ");
					System.out.println(balance);
				} else {
					System.out.println("로그인 필요");
				}
				break;
			case 6:
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}