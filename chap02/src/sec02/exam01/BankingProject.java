package sec02.exam01;

import java.util.Scanner;

public class BankingProject {
	
	

	public static void login() {
		Scanner scan = new Scanner(System.in);

		System.out.println("아이디");
		String name = scan.nextLine();

		System.out.println("비밀번호");
		String Password = scan.nextLine();
		int pwd = Integer.parseInt(Password);
		String username = null;
		int password = 0;
		if (username != null && name.equals(username) && pwd == password) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

	}

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;

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
				String username = scanner.nextLine();
				
				System.out.println("비밀번호");
				int password = Integer.parseInt(scanner.nextLine());
				
				System.out.printf("회원가입 완료");
				System.out.printf(username, password);
				break;

			case 2:
				System.out.println("로그인 시도");
				login();
				break;

			case 3:
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 4:
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 5:
				System.out.print("조회> ");
				System.out.println(balance);
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
