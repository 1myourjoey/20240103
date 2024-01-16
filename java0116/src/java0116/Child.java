package java0116;

class Parent {
	int money = 100;

	void disp() {
		System.out.println(money);
	}
}

public class Child extends Parent {

	public Child() { // 생성자
		this.money+=300; // 생성자에서도 상속이 이뤄짐
	}
	
	public static void main(String[] args) {
		Child ch = new Child();
		ch.disp(); // 부모의 메소드 실행
		// System.out.println(ch.money);

	}

}
