package sec02.exam07;

public class Ex {
	
	public static void method(B b) {
		
	}

	public static void main(String[] args) {
		method(new B()); // 메소드에 객체생성을하면서 값을 넣을 수 있다.
		
		B b1 = new B();
		B b3 = new D();
		B b4 = new E();
		
		// B b2 = (B) new A();
		// 강제변환 불가능 a 부모로 생성했는데 자식 객체는 안된다는 것 
		// 컴파일 오류 모양은 안나오지만 실행시켜보면 오류가 뜸
		
		A a = new A();
		if (a instanceof B) {
			B b = (B) a;
			System.out.println("변환O");
		} else {
			System.out.println("변환X");
		}
		
	}

}
