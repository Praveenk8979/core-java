package ThreadMethod;

public class JoinMethod extends Thread{
	public void run() {
		try {
			for(int i=1; i<=5;i++) {
				System.out.println("Child Thread :"+i);
				Thread.sleep(1000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException{
		JoinMethod j=new JoinMethod();
		j.start();
		
		j.join();
		
		try {
			for(int i=1; i<=5;i++) {
				System.out.println("Main Thread :"+i);
				Thread.sleep(1000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
