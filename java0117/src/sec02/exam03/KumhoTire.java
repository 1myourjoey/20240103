package sec02.exam03;

public class KumhoTire extends Tire{

	public KumhoTire(String location, int maxRotation) {
		super(maxRotation, location);
		
	}

	

	@Override
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "KumhoTire수명:" + (maxRotation - accumulateRotation) + "회");
			return true;

		} else {
			System.out.println("***" + location + "KumhoTire펑크***");
			return false;

		}
		
	}

	
	
}
