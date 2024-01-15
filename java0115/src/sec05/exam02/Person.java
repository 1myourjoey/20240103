package sec05.exam02;

public class Person {
	
	final static public double PI	= 3.141592; // public 접근제한자의 자리는 상관이없다
	public static final double PII	= 3.141592; // 다만 맨앞이 나음
	static public final double PIII	= 3.141592;
	
	final String name;
	
	public Person(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		
		Person person = new Person("홍길동");
//		person.name = "홍길동";

		final int x; // 한번 준 값이 최종값인것
		x =300;
//		x =500;
	}

}
