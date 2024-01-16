package quiz;

import java.util.Scanner;

class Account extends MakeMenu {

	String name;
	String id;
	String pw;
	int tel;
	int pn;
	int balance = 0;

	public Account(String name, String id, String pw, int tel, int pn, int balance) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.tel = tel;
		this.pn = pn;
		this.balance = balance;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public void deposit(Scanner scan) {
		System.out.println("등록된 유저아이디를 입력하세요");
		String u = scan.nextLine();

		for (Person person : personList) {
			if (person.id.equals(u)) {
				System.out.println("입금할 금액을 입력하시오.");
				int amount = Integer.parseInt(scan.nextLine());
				if (amount < 0) {
					person.balance += amount;
					System.out.println("입금 후 잔고" + person.balance);
				}
				else {
					System.out.println("1이상의 금액을 입력하시오");
				}
			}
		}
	}

	public void withdraw(Scanner scan) {
		System.out.println("등록된 유저아이디 입력");
		String u = scan.nextLine();
		for (Person person : personList) {
			if (person.id.equals(u)) {
				System.out.println("출금할 금액을 입력하시오.");
				int amount = Integer.parseInt(scan.nextLine());
				if (amount <= person.balance) {
					person.balance -= amount;
					System.out.println("출금 후 잔고" + person.balance);
				} else {
					System.out.println("잔고 부족/ 현재 잔고는 :" + person.balance);
				}
			}
		}
	}

	public void check(Scanner scan) {
		System.out.println("등록된 유저 아이디 입력");
		String u = scan.nextLine();
		for (Person person : personList) {
			if (person.id.equals(u)) {
				System.out.println("현재잔고 :" + person.balance);
				
			}
				
				
			}System.out.println("등록된 아이디가 아닙니다.");
		}
	}


