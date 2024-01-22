package sec01.exam02;

public class A {
	
	B field1 = new B();
	C field2 = new C();
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
//	static B field3 = new B(); 아래 쪽 class B 때문에 불가
// A가 객체생성이 되어야 B도 객체 생성이 된다.
	static B field3 = new A() .new B(); // 강제로 되게 한 것
	static C field4 = new C();
	
	
	static void method2() {
//		B var1 = new B(); 안되는건 위 필드와 같은 이유
		B var1 = new A(). new B(); // 위 처럼 강제로 되게 만든 것
		C var2 = new C();
	}
	
	class B{}
	static class C{}
	

}
