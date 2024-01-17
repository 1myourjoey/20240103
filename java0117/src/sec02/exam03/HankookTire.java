package sec02.exam03;

public class HankookTire extends Tire{

	
	
	public HankookTire(String location, int maxRotation) {
		super(maxRotation, location);
		
	}

	@Override // 재정의
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "HankookTire수명:" + (maxRotation - accumulateRotation) + "회");
			return true;

		} else {
			System.out.println("***" + location + "HankookTire펑크 ***");
			return false;

		}
		
	}

	
}
