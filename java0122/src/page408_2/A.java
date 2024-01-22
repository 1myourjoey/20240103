package page408_2;

public class A {
	static class C {
		C() {} // 클래스 C의 생성자
		int field1;
		static int field2;
		void method1() {}
		static void method2 () {}
	}
	void methodA () {
		C c = new C();
		c.field1 = 3;
		c.method1();
//		c.field2 = 103;
		C.field2 = 10;
		
		
	}
}
