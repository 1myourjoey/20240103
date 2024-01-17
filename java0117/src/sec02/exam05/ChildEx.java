package sec02.exam05;

public class ChildEx {

	public static void main(String[] args) {
		Parent parent = new Child(); // 자식으로 객체생성 변수는 부모
		parent.field1 = "data";
		parent.method1();
		parent.method2();
		
		Child child = (Child) parent; // 문법상 오류 없음
		child.field2="yyy";
		child.method3();
		
}

}
