package Overriding;
//Case7-overriding and synchronized/strictfp method.
//Ans- The presence of synchronized/strictfp modifier with method have no effect on the
//rules of overriding,i.e. it's possible that synchronized/strictfp method can override
//a non synchronized/strictfp one and vice-versa.

class Test6{
	synchronized void show() {
		System.out.println(1);
	}
}
public class Case6 extends Test6{
	void show() {
		System.out.println(2);
	}

	public static void main(String[] args) {
//		Test6 t=new Test6();
//		t.show();
		Case6 c=new Case6();
		c.show();

	}

}
