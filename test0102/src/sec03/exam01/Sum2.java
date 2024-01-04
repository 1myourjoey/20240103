package sec03.exam01;

import java.util.Scanner;

public class Sum2 {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("숫자입력>");
//		int num1 = Integer.parseInt(scan.nextLine());
//		
//		System.out.println("숫자입력>");
//		int num2 = Integer.parseInt(scan.nextLine());
//		
//		int sum = num1+ num2;
//		System.out.printf("두 수의 합은 %d\n", sum); - 여기까진 두 수를 입력 받아 합을 구하는 식

		Scanner scan = new Scanner(System.in);
		int sum =0;
		System.out.println("숫자입력>");
		int num1 = Integer.parseInt(scan.nextLine()); // int num1= scan.nextInt();와 바꿔서 써도 같음 아래 2도 마찬가지
		
		System.out.println("숫자입력>");
		int num2 = Integer.parseInt(scan.nextLine());
		for(int i=num1; i<=num2; i++) {
			System.out.println("i:"+i); // System.out.printf("num1:%d, num2%d\n", num1,num2);
			sum += i; //sum= sum+i; 와 동일 및 누적계산
	}
		System.out.println(num1+"부터"+num2 +"의 합"+ sum); // 두 수를 입력 받아 사이 값을 다 더하시오
}
}
				