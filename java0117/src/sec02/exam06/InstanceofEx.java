package sec02.exam06;

public class InstanceofEx {
	
	

	public static void main(String[] args) {
//		Parent parentA = new Child();	
//		method2(parentA);
//		Parent parentB = new Child();
		Parent parentB = new Parent();
		if (parentB instanceof Child) {
			method2(parentB);
		} else {
			System.out.println("변환불가");
		}
		

	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child 변환성공");
	}

}
