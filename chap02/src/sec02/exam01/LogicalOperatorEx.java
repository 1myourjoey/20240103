package sec02.exam01;

public class LogicalOperatorEx {

	public static void main(String[] args) {

		int charCode = 'A';

		if ((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자");
		}
		if ((charCode > 97) && !(charCode <= 122)) {
			System.out.println("소문자");
		}
		if (!(charCode < 48) && !(charCode > 57)) {
			System.out.println("숫자");
		}

		int value = 6;
		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2or3의 배수");
		}
		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2or3의 배수");
		}
	}

}
