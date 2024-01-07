package Overriding;
//Case5- 	Invoking overridden method from sub-class.
//ans- We can call parent class method in overriding method using super keyword.

class Test5{
	void show() {
		System.out.println(1);
	}
}
public class Case5 extends Test5{
	void show() {
		super.show();
		System.out.println(2);
	}

	public static void main(String[] args) {
		Case5 c=new Case5();
		c.show();
//        Test5 t=new Test5();
//        t.show();
	}

}
