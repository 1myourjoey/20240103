package sec01.exam02;

public class MyClass implements InterTest {

	@Override
	public void test1() {
		System.out.println("새로운 test1");
	}
	
	@Override
	public void test() {
		
	}
	
	
	public static void main(String[] args) {
		InterTest.test5();
		InterTest it = new MyClass();
		it.test1();
	}

	
}
