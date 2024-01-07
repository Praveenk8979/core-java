package Encapsulation;
//use-5: this can be used to pass as an argument in the constructor call;
class TestA{
	TestA(Demo3 d){
		System.out.println("Test class constructor");
	}
}
public class Demo3 {
	void m1() {
		TestA d=new TestA(this);
		d.hashCode();
	}

	public static void main(String[] args) {
         Demo3 s=new Demo3();
         s.m1();
	}

}
