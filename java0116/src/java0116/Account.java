package java0116;

public class Account {

	private String name; // 현업에서 필드에는 무조건 프라이빗 붙임
	private int balance; //

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance > 0) {
			this.balance = balance;
		}
	}

}
