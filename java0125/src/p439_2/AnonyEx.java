package p439_2;

public class AnonyEx {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() { // 매개변수로 사용한 것 

			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
				
			}
			
		});
			
		

	}

}
