package ThreadMethod;

public class JoinMethod2 extends Thread {
	static Thread mainthread;
	public void run() {
		try {
			mainthread.join();
			for(int i=1; i<=5;i++)
			{
				System.out.println("Child Thread:"+i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		mainthread=Thread.currentThread();
		JoinMethod2 j=new JoinMethod2();
		j.start();
		
		
		try {
			
			for(int i=1; i<=5;i++)
			{
				System.out.println("Main Thread:"+i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
