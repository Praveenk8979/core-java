package ThreadMethod;

public class InterruptMethod extends Thread{
	public void run() {
		try {
			for(int i=1; i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println("Thread interrupted :-"+e);
		}
	}

	public static void main(String[] args) {
		InterruptMethod m=new InterruptMethod();
		m.start();
		m.interrupt();//1
                      //Thread interrupted :-java.lang.InterruptedException: sleep interrupted
        
	}

}
