package ThreadMethod;

public class Consume {
	
	Company c;
	Consume(Company c){
		this.c=c;
	}
	public void start() throws Exception {
		
		while(true) {
			this.c.consume_item();
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	

}
