package excepEx;

public class ArrayOOBExecp {

	public static void main(String[] args) {
//		int [] arr = new int [4];
//		for (int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println(arr[4]);
	
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println(data1);
			System.out.println(data2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("예외 발생 !");
		}
		
		
	}

}
