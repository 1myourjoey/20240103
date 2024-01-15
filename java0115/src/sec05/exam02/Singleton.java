package sec05.exam02;

public class Singleton {
	// private 접근제한은 자신 클래스 내에서만 접근 가능
	private static Singleton singleton = new Singleton();
	
	private Singleton () {}	// 생성자를 private으로 하면?
	static Singleton getInstance() {//오직 이 메소드만 호출로 사용하는 것
		return singleton;
	}
	
	// 1 지가 객체 생성함 
	// 2 남이 못하게 해버림
	// 3 오직 get으로만 호출가능


}
