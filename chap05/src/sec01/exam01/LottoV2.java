package sec01.exam01;

import java.util.Random;

public class LottoV2 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		Random rand = new Random();

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rand.nextInt(45) + 1;
			System.out.println(lotto[i]);
		}
		System.out.println("==========================");
		for (int val : lotto) {
			System.out.println(val);
		}
	}

}
