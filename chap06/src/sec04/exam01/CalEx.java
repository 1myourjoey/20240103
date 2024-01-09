package sec04.exam01;

public class CalEx {

	public static void main(String[] args) {
		Calculator.sx = 500;
		Calculator cal = new Calculator();
		cal.power();
		cal.printX();
		cal.x = 100;

		Calculator ca12 = new Calculator();
		System.out.println(ca12.x);
		ca12.power();

	}

}
