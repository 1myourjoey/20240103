package sec02.exam01;

public class TypeEx {

	public static void main(String[] args) {
		String str3="3.14";
		double value = Double.parseDouble(str3);
		
		String str2 =""+10+2; // 문자열 생성후 각10 및 2출력 =>102출력
		System.out.println(str2); // 괄호(10+2)로 할시 결과는 12 출력
		
		int num1=Integer.parseInt(str2); //정수로 만들기
		
		
		String str=10+2+""; // 앞에서 12 계산 후 문자열 생성
		System.out.println(str);
		
		String str1 = String.valueOf(10+2); // 문자열로 만들기 정석
		
		System.out.println("---------------");
		
		byte var1=100;
		int var2 = var1; // 자동 타입 변환된 것임.
		
		long var3=100000000L;
		float var4=var3;
		
		var1=(byte) var2; // 작은 애들은 큰 범위에 들어가도 깨지지 않음
							// 하지만 큰 방에있는 애들은 작은방에 가지 못함
							// 강제 타입변환 필요
		System.out.println(var1);
		
				

	}

}
