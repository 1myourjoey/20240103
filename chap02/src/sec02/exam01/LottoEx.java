package sec02.exam01;

import java.util.Random;

public class LottoEx {

	public static void main(String[] args) {
//		System.out.println(Math.PI);
//		
		for(int i=0; i<6;i++) {
			int num=(int) (Math.random()*45+1);
			System.out.println(num);
		}
		System.out.println("------------------");
		Random random = new Random();
		for(int i=0; i<6;i++) {
			System.out.println(random.nextInt(45)+1);
		}
	}

}
