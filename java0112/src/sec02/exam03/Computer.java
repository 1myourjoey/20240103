package sec02.exam03;



public class Computer {
	int sum1(int[] values) {
		int sum=0; // 변수 선언
//		for(int i=0; i<values.length; i++) {
//			sum += values[i];
//			
//		}
		for (int val : values) { // 변수 누적
			sum += val;
			
		}
		
	return sum;
	}
	int sum2(int ...values) {
		int sum=0;
		for (int i=0; i<values.length;i++) {
			sum+= values[i];
		}
		return sum;
	}

}
