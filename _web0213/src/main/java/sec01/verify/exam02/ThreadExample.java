package sec01.verify.exam02;

public class ThreadExample {

	public static void main(String[] args) {
		Thread mth = Thread.currentThread();
		System.out.println(mth.getName());
		
		
		Thread thread1 = new MovieThread();
		System.out.println(thread1.getName());
		thread1.start();
		
		
		Runnable ra = new MusicRunnable();
		Thread thread2 = new Thread(ra);
		thread2.setName("Music");
		thread2.start();
	}

}
