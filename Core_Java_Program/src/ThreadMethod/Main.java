package ThreadMethod;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Company comp=new Company();
		Produced p=new Produced(comp);
		Consume d=new Consume(comp);
		p.start();
		d.start();
	}

}
