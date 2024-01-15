package sec04.exam05;

class MyClass {

	void method1() {
		System.out.println("m1");
	}

	static void method2() {
		System.out.println("m2");
	}

}

public class StaticClass {
	static void method3 () {
		System.out.println("m3");
	}
	public static void main(String[] args) {
		MyClass.method2();
		MyClass mc = new MyClass();
		mc.method1();
		mc.method2();
		StaticClass.method3();
	
		MyClass mc2 = new MyClass();
		mc2.method1();
		mc2.method2();
	}
}