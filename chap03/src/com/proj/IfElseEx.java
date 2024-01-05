package com.proj;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하시오");
		int score = scan.nextInt();
//		
//		if (score>=90) {
//			System.out.println("A");
//		}
//		else if (score>=80) {
//			System.out.println("B");
//		}
//		else if (score>=70) {
//			System.out.println("C");
//		}
//		else if (score >=60) {
//			System.out.println("D");
//		}
		int grade = score/10;
		switch(grade) {
		case 10: 
			System.out.println("A");
			break;
		case 9: 
			System.out.println("A");
			break;
		case 8: 
			System.out.println("B");
			break;
		case 7: 
			System.out.println("C");
			break;
		default: 
			System.out.println("D");
			break;
					
		}
	}

}
