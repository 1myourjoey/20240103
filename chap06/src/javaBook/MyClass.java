package javaBook;

public class MyClass {

	int x;
	int y;
	int z;

	public MyClass(int x) {
//		this.x = x;
		this(x, 0, 0);
		System.out.println("1번째 생성자");
	}

	public MyClass(int x, int y) {
//		this.x = x;
//		this.y = y; // 이건 지칭하는 것임
		this(x, y, 0); // 다른 생성자를 뜻함
		System.out.println("2번째 생성자");
	}

	public MyClass(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("3번째 생성자");
	}

	@Override
	public String toString() {
		return "MyClass [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

	public static void main(String[] args) {
		MyClass mc = new MyClass(100);
		MyClass mc2 = new MyClass(100,200);
		System.out.println(mc2);
		
		
	}

}
