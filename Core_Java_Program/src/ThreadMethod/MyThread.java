package ThreadMethod;

public class MyThread implements Runnable {
	
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("The value is :"+i);
			try{
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		Thread tt=new Thread(t);
		
		Anotherthread at=new Anotherthread();
		tt.start();
		at.start();
	}

}
