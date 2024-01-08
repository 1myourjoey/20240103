package sec01.exam01;

import java.util.Scanner;

public class Exam06_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int student = 0;
		int[] scores = null;
		
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				System.out.print("학생수: ");
				student = Integer.parseInt(scanner.nextLine());
				scores = new int[student];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.print("점수입력" + (i + 1) + ">");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				
				break;
			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.print("점수리스트" + (i + 1) + ">" + scores[i] + "\n");
				}

		   
				break;
				
			case 4:

				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int num : scores) {
					if(max<num) {
						max=num;
					}
					sum+=num;

				}
				avg = sum / (double) student;
				System.out.print("최고"+max);
				System.out.print("총합"+sum);
				System.out.print("최고"+avg);
				break;

			case 5:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
