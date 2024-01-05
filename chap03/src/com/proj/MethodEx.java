package com.proj;

public class MethodEx {
	
	public static int input() {
		return 900; // return 은 메소드랑 같이 씀 void랑 같이 쓰면 둘중하나가 문제 
		
	}
	
	public static String input2() { // return은 하나만 리턴 가능
		//return "abc"; // or
		
		String str= "aaa";
		return str;
		
	}

	public static void main(String[] args) { // 메인은 실행부 메소드는 선언부
		String str = input2 ();
		System.out.println(str);
		System.out.println(input());

	}

}
