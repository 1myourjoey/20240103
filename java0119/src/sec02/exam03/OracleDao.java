package sec02.exam03;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("OR DB검색");
		
	}

	@Override
	public void insert() {
		System.out.println("OR DB삽");
		
	}

	@Override
	public void update() {
		System.out.println("OR DB업");
		
	}

	@Override
	public void delete() {
		System.out.println("OR DB삭");
		
	}

}
