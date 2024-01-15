package sec02.exam03;

public class Car {
	int gas;

	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {

			System.out.println("NO GAS");
			return false;
		}
		System.out.println("GAS");
		return true;
	}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("Runnig with"+gas+"left");
				gas-=1;
			} else {
				System.out.println("Stop"+gas+"left");
				return; // 의미상 break; 와 같음 
			}
		}
	}
}