package sec04.exam01;

import java.util.Scanner;

public class AccountEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Account acc = new Account();
		
		System.out.println("이름,생년월일,전화번호 순으로 입력");
		acc.name = scan.nextLine();
		acc.ssn = scan.nextLine();
		acc.tel = scan.nextLine();

		System.out.println(acc);
		System.out.println(acc.name);

		Account acc1 = new Account("최성욱", "960518", "010-90345093", 29);
		System.out.println(acc1);

	}

}
