package sec02.exam01;

import java.util.Scanner;

public class ScanPersonalIdPw {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("아이디");
		String name = scan.nextLine();

		System.out.println("비밀번호");
		String strPassword = scan.nextLine();
		int password = Integer.parseInt(strPassword);

		if (name.equals("java")) {
			if (password == 1234) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비번 틀림");
			} 
			}else {
				System.out.println("아디존재안함");
			}
			
		}

}
