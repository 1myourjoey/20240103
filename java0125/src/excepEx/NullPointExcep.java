package excepEx;

public class NullPointExcep {

	class MyClass{
		void method () {}
	}
	
	public static void main(String[] args) {
		MyClass mc = null;
		mc.method(); // 객체가 없는 상태에서 객체를 사용하려하여 널포인익셉이 나옴
		
//		String data = null;
//		System.out.println(data.toString());

	}

}
