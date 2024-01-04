package sec02.exam01;

public class LoopEx {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		int k = 0;
		for (; k < 10;) {
			System.out.println(k);
			k++; // for문을 해체히면 이런식임
		}

		System.out.println("======================");
		int i = 0;
		while (i < 10) {

			System.out.println(i);
			i++; // 시스템 출력 위쪽으로 옮길경우 1부터10까지 출력됨
		}
		System.out.println("======================");
		int j = 0;
		do {
			System.out.println(j);
			j++;

		} while (j < 10);
	} // 위 3개의 반복문은 결과값이 다 같음

}
