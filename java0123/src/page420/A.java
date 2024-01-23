package page420;

public class A {
	
	void method(int x) {
		String y = "yyy";
		
		class Inner {
			void method() {
				
			}
		}
	}
	
	int x =100;
	static class B{
		void method() {
//			System.out.println(A.this.x);
		}
	}
}
