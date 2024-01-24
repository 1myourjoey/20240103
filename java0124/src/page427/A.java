package page427;

class Parent {
	void parentMethod() {}

}


public class A {
	
	Parent field = new Parent () {
		int childField;
		void childMethod()	{}
	}; 		// A클래스의 필드 / 중괄호를 쳐버리면 Parent의 자식객체가 됨
	
	
	void method () { //메소드
		field.parentMethod();
	}	

}
