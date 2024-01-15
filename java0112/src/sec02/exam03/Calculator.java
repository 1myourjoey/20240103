package sec02.exam03;

public class Calculator {
	
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double avg(int x, int y) {  // 내부호출은 중복을 줄이는 목적 유지보수 쉽게 만듬
		double sum = this.plus(x,y); // 내부호출이니 x+y로만 해두면 모든 메서드를 고쳐야됨
		double result = sum/2;
		return result;
		
	}
	
	void excute() {
		double result = this.avg(7,10); // 내부 호출
		this.println("결과:" +result); // 내부 호출 
	}
	void println(String message) { 
		System.out.println(message);
	}
	
}

