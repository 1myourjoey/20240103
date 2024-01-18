package sec01.exam02;

public interface RemoteControl {
	// 인터페이스는 변수선언이 안됨. 아래 있는 숫자들은 상수임. 값을 바꿀 수 없는 것
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	int x = 100; // 상수를 의미함.
	public abstract void turnOn();
	void turnOff();
	
}
