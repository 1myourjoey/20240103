package thread.exam;

public class BeepPrint {

	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(500); // 잠시 멈춤 0.5초
			} catch (InterruptedException e) {
				
			} 
			
		}
		for (int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // 잠시 멈춤 0.5초
			} catch (InterruptedException e) {
				// 실행 중간에 0.5초씩 재우고 재 실행한다 보면 됨.
			} 
		

	}

	}}
