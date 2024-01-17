package quiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakeMenu {

	static void menu1() {

		System.out.println("1. 회원출력|2. 회원등록|3. 입출금 및 잔고|4. 파일저장|5. 파일읽기|6. 종료");
	}

	static List<Person> personList = new ArrayList<>();

	static class Person implements Serializable{
		String name;
		String id;
		String pw;
		int tel;
		int pn;
		int balance;

		public Person (String name, String id, String pw, int tel, int pn, int balance) {
			super();
			this.name = name;
			this.id = id;
			this.pw = pw;
			this.tel = tel;
			this.pn = pn;
			this.balance = balance;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", id=" + id + ", pw=" + pw + ", tel=" + tel + ", pn=" + pn + ", balance="
					+ balance + "]";
		}

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account ac = new Account();
		Scanner scan = new Scanner(System.in);
		boolean start = true;
		while (start) {
			System.out.println("선택할 메뉴의 숫자를 입력하시오");
			menu1();

			int menuN = Integer.parseInt(scan.nextLine());
			switch (menuN) {
			case 1:
				System.out.println("<회원출력>");
				for (Person person : personList) {
					System.out.print(person + "\n");
				}
				break;

			case 2:
				System.out.print("<회원등록>");
				System.out.print("이름 입력");
				ac.name = scan.nextLine();
				System.out.print("ID 입력");
				ac.id = scan.nextLine();
				System.out.print("PW(숫자) 입력");
				ac.pw = scan.nextLine();
				System.out.print("번호(숫자) 입력");
				ac.tel = Integer.parseInt(scan.nextLine());
				System.out.print("생년월일(숫자) 입력");
				ac.pn = Integer.parseInt(scan.nextLine());

				personList.add(new Person(ac.name, ac.id, ac.pw, ac.tel, ac.pn, 0));
				break;

			case 3:
				System.out.println("<은행 입출금 및 잔고>");
				ac.deposit(scan);
				break;

			case 4:
				System.out.println("<파일저장>");
				FileOutputStream fos = new FileOutputStream("c:/temp/acc.db");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(personList);
				oos.flush();
				oos.close();
				break;

			case 5:
				System.out.println("<파일읽기>");
				FileInputStream fis = new FileInputStream("c:/temp/acc.db");
				ObjectInputStream ois = new ObjectInputStream(fis);
				personList = (List<Person>) ois.readObject();
				for(Person person : personList) {
					System.out.println(person);
				}
				
				break;

			case 6:
				System.out.println("<시스템을 종료합니다.>");
				start = false;
				break;
			}

		}

	}

}
