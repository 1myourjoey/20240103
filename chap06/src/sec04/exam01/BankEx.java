package sec04.exam01;

public class BankEx {
	public static void main(String[] args) {
		Member member = new Member();

		// 회원 정보
		String[] ids = { "user1", "user2", "user3" };
		String[] passwords = { "pass1", "pass2", "pass3" };

		// 로그인 시도
		boolean loggedIn = member.login(ids, passwords);

		if (loggedIn) {
			// 로그인 성공 후의 작업을 진행
			System.out.println("로그인 후의 작업을 진행합니다.");
		}
	}
}