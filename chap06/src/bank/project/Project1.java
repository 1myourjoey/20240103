package bank.project;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		boolean run2 = true;
		Account acc=null;
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				// 로그인 처리
				System.out.println("로그인 처리");
				System.out.println("아이디:");
				String id = scanner.nextLine();
				System.out.println("패스워드:");
				String pass = scanner.nextLine();
				if (id.equals(acc.name)) {
					if(pass.equals(acc.ssn)) {
						System.out.println("로그인 완료");
					}else {
						System.out.println("로그인 실패");
					}
				} 
				break;
			case 2:
				// 회원 가입
				
				System.out.println("회원 가입");
				System.out.print("이름");
				String name = scanner.nextLine();
				System.out.print("생년");
				String ssn = scanner.nextLine();
				System.out.print("번호");
				String tel = scanner.nextLine();
				
				acc= new Account(name, ssn, tel);
				System.out.print(acc);
				break;
			case 3:
				// 예금 출금
				while (run2) {
					System.out.println("-------------------------------------");
					System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
					System.out.println("-------------------------------------");
					System.out.print("선택> ");
					int menuNum2 = Integer.parseInt(scanner.nextLine());
					switch (menuNum2) {
					case 1:
						System.out.print("예금액> ");
						acc.balance += Integer.parseInt(scanner.nextLine());
						break;
					case 2:
						System.out.print("출금액> ");
						acc.balance -= Integer.parseInt(scanner.nextLine());
						break;
					case 3:
						System.out.print("잔고> ");
						System.out.println(acc.balance);
						break;
					case 4:
						run2 = false;
						break;
					}
					System.out.println();
				}
				break;
			case 4:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
