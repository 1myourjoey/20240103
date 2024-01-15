package sec02.exam03;

public class CarEx {

	public static void main(String[] args) {

		Car myCar=new Car();
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("Start");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("Don't need to inject");
		}else {
			System.out.println("Need to fuel");
		}
	}

}
