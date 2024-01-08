package sec01.exam01;

public class StaticEx {

	static int y; // 정적 필드 메소드와는 다름
	
	public static void main(String[] args) {
		System.out.println(y);
		y=300;
		int x=100;
		m1(100);
		System.out.println(x);
	}
	public static void m1(int x) {
		System.out.println(x);
		System.out.println(y);
		x=200;
	}

}
