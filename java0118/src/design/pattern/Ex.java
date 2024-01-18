package design.pattern;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		
//		CarFactory carFactory = new StateCarFactory();
		
		Scanner scan = new Scanner(System.in);
		CarFactory carFactory = null;
		System.out.println("생산 차종 선택 (1:국산, 2:미국산)");
		System.out.println("선택");
		
		String key = scan.nextLine();
		switch (key) {
		case "1":
			carFactory = new KoreaCarFactory();
			break;
			
		case "2" : 
			carFactory = new StateCarFactory();
			break;
		
		default : 
			System.out.println("다시 선택");
			break;
		}
		
		TireProduct tireProduct = carFactory.createTire();
		DoorProduct doorProduct = carFactory.createDoor();
		
		String tire = tireProduct.makeAssemble();
		String door = doorProduct.makeAssemble();

		System.out.println(tire);
		System.out.println(door);
	}

}
