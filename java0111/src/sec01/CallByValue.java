package sec01;

public class CallByValue {

	public static void increase(int n, MyClass mc) {
		n = n + 1;
		System.out.println(n);
		mc.n += 1;
		
	}

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		int n = 100;
		System.out.println(mc.n+"d");
//		increase(n, mc);
		increase(n, new MyClass());
		System.out.println(n);
		System.out.println(mc.n);
		

	}

}

class MyClass {
 
	int n; // 초기값 0

}