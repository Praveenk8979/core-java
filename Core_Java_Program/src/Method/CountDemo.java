package Method;

public class CountDemo {
	static int count=0;
	CountDemo(){
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		CountDemo a=new CountDemo();
		CountDemo b=new CountDemo();
		CountDemo c=new CountDemo();
		CountDemo d=new CountDemo();
		a.hashCode();
		b.hashCode();
		c.hashCode();
		d.hashCode();

	}

}
