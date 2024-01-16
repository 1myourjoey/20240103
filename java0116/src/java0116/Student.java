package java0116;

public class Student extends People {
	String hakbun;

	public Student(String name, String hakbun) {
		super(name); // 부모의 생성자 호출 (여기서는 부모의 기본생성자 호출)
		this.hakbun = hakbun;
		
		//부모가 생성자를 만들었다면 자식은 무조건 부모 생성자를 호출해야함
	}

	@Override
	void method1() {
		// TODO Auto-generated method stub
		super.method1();
	}
	
}
