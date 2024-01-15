package sec02.exam03;

public class ComputerEx {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1= {1,2,3,};
		int result1 = myCom.sum1(values1);
		System.out.println("re1:" +result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5,});
		System.out.println("re2:"+result2);
		
		int result3 = myCom.sum2(1,2,3);
		System.out.println("re3:"+result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("re4:"+result4);
		
		
	}

}
