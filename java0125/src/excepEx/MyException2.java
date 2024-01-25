	package excepEx;
	
	public class MyException2 extends RuntimeException{
		public MyException2(String msg) { // 런타임은 그냥 실행시점 오류
			super(msg);
		}
	}
