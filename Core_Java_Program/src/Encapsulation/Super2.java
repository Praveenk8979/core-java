package Encapsulation;
//use 3-: Super() can be used to invoke immediate parent class constructor.
class D{
	void A() {
		System.out.println(" i am class A");
	}
}
public class Super2 extends D {
	void B() {
		System.out.println("i am class B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Super2 s=new Super2();
         s.A();
         //s.B();
	}

}
