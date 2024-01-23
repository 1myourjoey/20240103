package page413;

public class A {
	int field1;
	void method1() {
		System.out.println("met1");
	}
	

	static int field2;
	static void method2() {}
	
	class B {
		void method2() {
			field1=10;
			method1();
			System.out.println(field1);
			
			field2 = 10;
			method2();
		}
	}
	
}
