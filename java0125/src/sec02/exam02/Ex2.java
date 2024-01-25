package sec02.exam02;

class AnyClass2 {
	void anyMethod() throws ClassNotFoundException {
		throw new ClassNotFoundException();
	}
	
	
	}

public class Ex2 {

	public static void main(String[] args) {
		AnyClass2 ac = new AnyClass2();
		try {
			ac.anyMethod();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
