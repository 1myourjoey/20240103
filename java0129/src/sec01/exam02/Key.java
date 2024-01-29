package sec01.exam02;


public class Key {
	public int number;

	public Key(int number) {
		super();
		this.number = number;
	}


	@Override
	public boolean equals(Object obj) { // 매개변수의 다형성(Obj로부터 상속)
		if (obj instanceof Key)	 { // key클래스의 객체인가?
			Key compareKey = (Key)obj; // key 클래스 변수에 대입
			if (this.number == compareKey.number) { // number 비교하기위함
				return true;
			}
		}
		return false;
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return number;
	}
	
}
