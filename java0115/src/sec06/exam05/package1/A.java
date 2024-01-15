package sec06.exam05.package1;

public class A {
	
	public int field1;
	int field2;
	private int field3;
	


	public A() {
		field1=1;
		field2=1;
		field3=1;
					// 클래스 내부이기에 접근제한 받지 않음
		method1();
		method2();
		method3();
	}
	
	public void method1() {} 
	void method2() {}
	private void method3()	{}
}