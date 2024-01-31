package thread.exam;

public class BeepPrint2 {

	public static void main(String[] args) {

		Thread th = new Thread(new BeepTask());
		th.start();

		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // 잠시 멈춤 0.5초
			} catch (InterruptedException e) {
				// 실행 중간에 0.5초씩 재우고 재 실행한다 보면 됨.
			}

		}
		System.out.println("main 종료");
	}
}
