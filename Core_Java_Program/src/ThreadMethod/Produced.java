package ThreadMethod;

public class Produced  extends Thread{
 
	Company c;
	public Produced(Company c) {
		this.c=c;
		
	}
	public void run() {
		int i=1;
		while(true) {
			try {
				this.c.produce_item(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
			i++;
		}
	}
}
