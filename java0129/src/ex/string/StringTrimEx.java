package ex.string;

public class StringTrimEx {

	public static void main(String[] args) {
		String str = "    가나 다     ";
		System.out.println(str.length());
		System.out.println(str.trim().length());
				
		String ss = 2+"";
		String str1 = String.valueOf(10); // 숫자가 아니라 문자열 10으로 나타냄
		System.out.println(str1+30);
		
	}

}
