package java0116;

class Aa{
	
	private int y;
	final int x=0;

}

public class Bb extends Aa {
	void method() {
//		x = 40; // final 필드 값 변경 불가
//	System.out.println(y); // private 접근 불가	
	}
}
