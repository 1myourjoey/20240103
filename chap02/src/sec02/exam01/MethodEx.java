package sec02.exam01;

public class MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(100, 200); // 메소드를 호출 하는 것
		int ret = method2(300, 400);
		System.out.println(ret);
	}

	public static int method2(int x, int y) {
		return x + y;

	}

	public static void method(int x, int y) { // 메소드를 정의한 것
		System.out.println(x + y);
	}
}
