package chap7.prob4;

public class Service {
	public void login() {
		System.out.println("login");
	}
	public class MemberService extends Service{
		public void login() {
			System.out.println("MemLogin");
		}
	}
	public class AService extends MemberService {
		public void login() {
			System.out.println("A Login");
		}
	}
	
	
}

