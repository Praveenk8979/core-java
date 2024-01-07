package ThreadMethod;

public class IsInterrupted extends Thread {
	public void run() {
		System.out.println("A :-"+Thread.interrupted());
		//System.out.println(Thread.currentThread().isInterrupted());
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
				System.out.println("B :-"+Thread.interrupted());
			}
		} catch (Exception e) {
			System.out.println("Thread IsInterrupeted :-" + e);
		}
	}

	public static void main(String[] args) {
		IsInterrupted i = new IsInterrupted();
		i.start();
	    i.interrupt();
	}

}
