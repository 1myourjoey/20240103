package sec02.exam01;

public class ConditionalOperationEx {

	public static void main(String[] args) {
		
		int score1 =95;
		char grade1=(score1>90)?'A':'B';
		
		
		
		int score = 85;
		char grade = (score>90)?'A' : ((score>80)?'B':'C');
		System.out.println(score+ "=" +grade);
		
		int var1=5;
		int var2=2;
		double var3=(double)var1/var2;
		int var4=(int)(var3*var2);
		System.out.println(var4);

	}

}
