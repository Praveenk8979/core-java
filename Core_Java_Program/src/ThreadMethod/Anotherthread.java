package ThreadMethod;

public class Anotherthread extends Thread {
	
	public void run()
{
		for(int i=10;i>=1;i--) {
			System.out.println("The value is :"+i);
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
}
}
