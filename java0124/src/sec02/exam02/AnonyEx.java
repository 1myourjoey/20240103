package sec02.exam02;

public class AnonyEx {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.turnOn();
		anony.method1();
		
		anony.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("SmartTV ON");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTV OFF");
				
			}
		});
	

	}

}
