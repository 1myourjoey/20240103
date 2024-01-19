package anonymous;

class Parent {
	void method() {
		
	}
}

public class Child extends Parent {

	@Override
	void method() {
		// TODO Auto-generated method stub
		super.method();
	}

	public static void main(String[] args) {

		new Child(); // 익명개체

		Parent parent1 = new Parent(); //부모객체 생성
		
		Parent parent = new Parent() { // 상속관계 내에서 지금 이 개체도 자식으로됨

			@Override
			void method() {
				// TODO Auto-generated method stub
				super.method();
			}

		};
	}

}
