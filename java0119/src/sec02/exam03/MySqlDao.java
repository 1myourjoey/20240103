package sec02.exam03;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("sql 검색");
		
	}

	@Override
	public void insert() {
		System.out.println("sql 삽입");		
	}

	@Override
	public void update() {
		System.out.println("sql 수정");		
	}

	@Override
	public void delete() {
		System.out.println("sql 삭제");		
	}
	

}
