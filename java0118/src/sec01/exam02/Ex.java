package sec01.exam02;

public class Ex {

	public static void main(String[] args) {

		RemoteControl rc = new Audio();
		
		rc.turnOn();
		System.out.println(rc.MAX_VOLUME);
//		rc.MAX_VOLUME = 100; 상수라 여기서 값을 고칠 수 없음
		
		

	}

}
