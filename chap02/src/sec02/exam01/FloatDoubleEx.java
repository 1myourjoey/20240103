package sec02.exam01;

public class FloatDoubleEx {

	public static void main(String[] args) {
	
		float num1=123.456755684654657635432263f;
		double num2=123.456755684654657635432263;
		
		System.out.println("f변수"+num1);
		System.out.println("d변수"+num2);
		
		double var = 0.1;
		for (int i=0;i<10;i++) {
			var +=0.1;
		}System.out.println(var);
	} 

}
