package sec04.exam01;

public class CalEx2 {

	public static void main(String[] args) {
		Calculator2 cal = new Calculator2();
		int num1 = cal.plus(100, 200);
		System.out.println(num1);
		
		double num2 = cal.plus(3.14, 0.59);
		System.out.println(num2);
		
		double result1= cal.areaRectangle(10);
		System.out.println(result1);
		double result2= cal.areaRectangle(10,20);
		System.out.println(result2);
	}

}
