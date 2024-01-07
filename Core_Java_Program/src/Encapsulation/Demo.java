package Encapsulation;
//use -4: this can be to pass as an argument in the method call.

class DemoA{
	void m1(DemoA d) {
		System.out.println("I'm m1 Method");
	}
	void m2() {
		m1(this);
	}
}
public class Demo {

	public static void main(String[] args) {
		DemoA d=new DemoA();
		d.m2();
		//d.m1(d);
	}

}
