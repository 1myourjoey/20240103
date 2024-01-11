package sec01;

public class Passing1 {

	public static int method1(int y) { // 함수, 메서드
		y+=1;
		return y;  // void 가 없으면 리턴을 해야함 있으면 안해도됨
					// 리턴할때 값을 줘야함
					//y도 지역 변수 (단, 호출한 곳에서 값 넘겨줘야함)
		
	}				

	public static void main(String[] args) {
		
		int x =100;
		
		int num = method1(x); // 호출(이름으로 실행시킴
		
		System.out.println(num);
		System.out.println(x);
	}

}
