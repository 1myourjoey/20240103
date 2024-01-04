package sec03.exam01;

public class Sum {

	public static void main(String[] args) {
		
		int sum = 0;
		int start = 1;
		int end = 10;
		
		for(int i=start; i<=end; i++) {
			System.out.println("i:"+i);
			sum += i; //sum= sum+i; 와 동일
			System.out.println("sum:" +sum);
		}
		System.out.println(start+"부터"+end +"의 합"+ sum);
	}

}
