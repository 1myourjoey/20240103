package sec01;

import java.util.Scanner;

public class PracFindIndex {

	public static void main(String[] args) {

		int a[] = { 10, 3, 1, 4, 2 };

//		System.out.println(a[3]);
		
		int q=0;
		for (int i=0; i<a.length;i++) {
			if (a[i]==4) {
				q=i;
				System.out.println("값 '4'를 찾았다");
			}
		}
		System.out.println(q);
//		System.out.println("배열안 확인할 숫자를 입력하시오");
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		
//		for (int j = 0; j < a.length; j++) {
//
//			if (a[j] == num) {
//				
//				System.out.println(num + "가 배열안에 있다.");
//				
//				break;
//			} 
//				
//			
//		}
		
	}

}
