package ThreadMethod;

public class Company {

	int n;
		boolean f=false;
	synchronized public void produce_item(int n) throws Exception {
		
		if(f) {
			wait();
		}
		this.n=n;
		System.out.println("Produce :"+this.n);
		f=true;
		notify();
	}
	synchronized public int consume_item() throws Exception
	{ 
		
		if(!f) {
			wait();
		}
		System.out.println("Consume :"+this.n);
		f=false;
		notify();
		return this.n;
	}
}
