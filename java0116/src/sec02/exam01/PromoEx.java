package sec02.exam01;

class A {}

class B extends A {}

class C extends A {}

class D extends B {}

class E extends C {}

public class PromoEx {
	public static void main(String[] args) {
		Object obj = new A(); // 모든클래스의 조상 객체생성 다 넣어줄 수 있음
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
//		int y = 100; 이렇게 자동변환을 해주는 것
//		double x = y;
		A a1 = b; // 부모로 변수를 선언하고 자식으로 객체생성을 한다
		A a2 = c;
		A a3 = d;
		A a4 = e;

		B b1 = d;
		C c1 = e;

//		B b3 = e;
//		C c2 = d;
	}

}
