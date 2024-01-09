package sec04.exam01;

public class Account {
	String name;
	String ssn;
	String tel;
	int age;

	public Account() {
		System.out.println("내가만든 Account()");
	}
	
	
	
	public Account(String ssn) {
		this.ssn=ssn;
	}

	
	public Account(String name, String ssn, String tel, int age) {
		
		this.name = name;
		this.ssn = ssn;
		this.tel = tel;
		this.age = age;
	}

	public Account(String name, String ssn, String tel) {
		
		this.name = name;
		this.ssn = ssn;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", ssn=" + ssn + ", tel=" + tel + ", age=" + age + "]";
	}

}
