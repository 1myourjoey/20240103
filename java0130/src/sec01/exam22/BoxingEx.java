package sec01.exam22;

public class BoxingEx {

	public static void main(String[] args) {
		Integer num1 = 128;
		Integer num2 = 128;
		System.out.println(num1==num2);
		System.out.println(num1.equals(num2)); // 이콜즈로 비교해야한다.
		
		
		int x = 100;
		String str = "가나다";
		Integer obj2 = Integer.valueOf("100");
		Integer obj1 = 300;
		System.out.println(obj1);
		int y = obj1.intValue();
		System.out.println(y);
		int z = x + obj1;
	}

}
