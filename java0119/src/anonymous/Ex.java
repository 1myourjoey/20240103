package anonymous;

class AnyClass {
	void mmm() {
		
	}
}

public class Ex extends AnyClass{
	
	public static void main (String [] args) {
		AnyClass any = new AnyClass () {
			
		};
				
		new AnyClass () { // 익명의 자식객체인 것

			@Override
			void mmm() {
				// TODO Auto-generated method stub
				super.mmm();
			}
			
		};
	}

}
