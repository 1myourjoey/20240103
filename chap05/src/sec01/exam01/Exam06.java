package sec01.exam01;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		double max = 0;
		double avg = 0;
		double total = 0;
		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("===================================");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("===================================");
			System.out.println("선택>");

			int selectNo = Integer.parseInt(scan.nextLine());

			if (selectNo == 1) {
				System.out.print("학생 수 입력");
				studentNum = Integer.parseInt(scan.nextLine());
				scores = new int[studentNum];
				System.out.println(studentNum);
			} else if (selectNo == 2) {
				System.out.print("점수 입력");
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]");
					scores[i] = Integer.parseInt(scan.nextLine());
				}
			} else if (selectNo == 3) {
				for(int i=0;i<scores.length;i++) {
				System.out.println(scores[i]);}

			} else if (selectNo == 4) {
				for (double num : scores) {
					if (max < num) {
						max = num;
						
					}
					total += num;
				}
				
				avg = total/studentNum;
				System.out.println("최고점수 " + max);
				
				System.out.println("평균"+avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
