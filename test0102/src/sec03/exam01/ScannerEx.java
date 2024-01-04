package sec03.exam01;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			System.out.print("입력>");
			inputData = scanner.nextLine();
			System.out.printf("입력된 문자열:%s\n", inputData);
			if(inputData.equals("q")) {
				break;
			}
		}
		
		System.out.println("finish");
	} 
}
