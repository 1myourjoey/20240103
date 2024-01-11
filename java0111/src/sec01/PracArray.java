package sec01;

public class PracArray {

	public static void main(String[] args) {
		int sum = 0, count = 0;
		int max = 0;
		double avg;
		int a[] = { 1, 3, 10, 2, 8 };

		for (int num : a) {
			if (max < num) {
				max = num;
			}
			sum += num;
			

//		for (int i = 0; i < a.length; i++) {
//			System.out.printf("(%d)", i);
//
//			sum += a[i];
//			count++;
//			
//			System.out.println("순차 합 : "+sum);
//			
//		}
//		avg = sum / (double) count;
//		System.out.println("평균값 : "+avg);
		}
		avg = (double) sum / a.length;
		System.out.println("최고" + max);
		System.out.println("총합" + sum);
		System.out.println("평균" + avg);
	}
}
