package sec02.exam03;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼HT로 교체");
				car.frontLeftTire = new HankookTire("앞왼", 15);
				break;
			
			case 2:
				System.out.println("앞오KT로 교체");
				car.frontRightTire = new KumhoTire("앞오", 13);
				break;
			case 3:
				System.out.println("뒤왼HT로 교체");
				car.backLeftTire = new HankookTire("뒤왼", 14);
				break;
			case 4:
				System.out.println("뒤오KT로 교체");
				car.backRightTire = new KumhoTire("뒤오", 17);
				break;
			}
			System.out.println("-----------------------------");
		}

	}

}
