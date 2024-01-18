package sec03.exam01;

public class Ex1 {

	public static void main(String[] args) {

		Phone phone = new SmartPhone2(10,20); // 객체화가 안된다.
		System.out.println(phone.x);
		
		if (phone instanceof SmartPhone2) {
			SmartPhone sp = (SmartPhone) phone;
			System.out.println("Sucess");
		}else {
			System.out.println("Fail");
		}

	}

}
