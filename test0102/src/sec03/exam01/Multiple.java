package sec03.exam01;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
//
//		for (int i=2; i<=9; i++) {
//			for (int j=1; j<=9; j++) {
//				System.out.printf("%dX%d = %d\n", i,j,i*j); %d는 정수 출력임
//			}
//		}
// 여기까진 일반 구구단 출력
		
		Scanner scan = new Scanner(System.in);
		
		String str;
		for(;;) {
			System.out.print("단을 입력하시오(q)입력시 종료");
			str = scan.nextLine();
			
			if (str.equals("q")) {
			break;
		}
			int dan=Integer.parseInt(str);
		for (int i=1;i<=9; i++) {
			System.out.printf("%dX%d = %d\n",dan,i,dan * i);
	// 여기 까지는 단 입력받고 구구단 출력
			 
				
				
			}
		}		
	}
}

