package sec01.exam10;

public class ByteToStringEx {

	public static void main(String[] args) {
		String str = new String("가나 다");
		System.out.println(str.charAt(3));
		
		byte [] bytes = {72,101,108,108,111,32,74,97,118,97};
		
		String str1 = new String (bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes,6,4);
		System.out.println(str2);
		
		char[] chars = {'H','e','l','l','o'};
		str = new String(chars);
		System.out.println(str);

	}

}
