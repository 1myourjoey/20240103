package sec01.exam01;

public class ObjEx {

	public static void main(String[] args) {
		String str = new String("가나다");
		String str1 = new String("가나다");
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		System.out.println(str.equals(str1));
		
		Object obj1 = new Object();
		Object obj2 = new Object();

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		boolean result = obj1.equals(obj2);
		System.out.println(result);
		
		boolean result2 = (obj1 == obj2);
		System.out.println(result2);
	}

}