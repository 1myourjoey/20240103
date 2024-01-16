	package java0116;
	
	class A {
		public A() {
			super();
			System.out.println("생A");
		}
	}
	
	class B extends A {
		public B() {
			super();
			System.out.println("생B");
		}
	}
	
	class C extends B {
		public C() {
			super();
			System.out.println("생C");
		}
	}
	
	public class ConstructorEx {
	
		public static void main(String[] args) {
	
			C c = new C();
	
		}
	
	}
