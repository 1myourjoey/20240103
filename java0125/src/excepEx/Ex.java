package excepEx;

class ThrowClass {
	void method(int x) throws Exception {
		if ( x> 10) {
			throw new Exception("예외발생");
		} else {
			System.out.println(x);
		}
		
	}
}

public class Ex {

	public static void main(String[] args) {

		ThrowClass tc = new ThrowClass();
		try {
			tc.method(11);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
