package sec02.exam03;

public class Tire {

	public int maxRotation;
	public int accumulateRotation;
	public String location;

	public Tire(int maxRotation, String location) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}

	public Tire(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "Tire수명:" + (maxRotation - accumulateRotation) + "회");
			return true;

		} else {
			System.out.println("***" + location + "Tire펑크***");
			return false;

		}
	}

}
