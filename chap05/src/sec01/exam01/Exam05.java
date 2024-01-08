package sec01.exam01;

public class Exam05 {

	public static void main(String[] args) {
		double [] array = new double[] { 83, 90, 87 };
		int[] array2 = { 80, 78, 97 };

		double sum = 0;
		double avg = 0;

		for (double num : array) {
			sum += num;
		}

		System.out.println("총합" + sum);
		avg = sum / array.length;
		System.out.println("평균" + avg);

	}

}
