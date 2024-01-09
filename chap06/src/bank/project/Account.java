package bank.project;

public class Account {
	
	String name;
	String ssn;
	String tel;
	
	int balance;
	public Account(String name, String ssn, String tel) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.tel = tel; 
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", ssn=" + ssn + ", tel=" + tel + ", balance=" + balance + "]";
	}

}
