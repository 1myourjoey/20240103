package sec01.exam26;

public class MathEx {

	public static void main(String[] args) {
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println(v1);
		System.out.println(v2);

		
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println(v3);
		System.out.println(v4);
		
		
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println(v5);
		System.out.println(v6);
		
		
		int v7 = Math.max(5, 9);
		double v8= Math.max(5.3, 2.5);
		System.out.println(v7);
		System.out.println(v8);
		
		int v9 = Math.min(5, 9);
		double v10	= Math.min(5.3, 2.5);
		System.out.println(v9);
		System.out.println(v10);
		
		
		double v11 = Math.random();
		System.out.println(v11);
		
		
		double v12 = Math.rint(5.3);
		double v13= Math.rint(5.7);
		System.out.println(v12);
		System.out.println(v13);
		long v14= Math.round(5.3);
		long v15= Math.round(5.7);
		System.out.println(v14);
		System.out.println(v15);
		
		double value = 12.3456;
		double temp1 = value*100;
		long temp2 = Math.round(temp1);
		double v16 = temp2 / 100.0;
		System.out.println(v16);
	}

}
