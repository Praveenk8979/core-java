package Overriding;
//Case 2- Overrideing and access-modifiers
//ans- the access modifiers for an overriding method can allow more ,but not less ,access
//than the overriding method. for ex- a prototype instance method in the super-class can be made
//public , but not private , in the subclass. doing so , will generate compile-time error.

class Testt {
	void show() {
		System.out.println(1);
	}
}
public class Case2 extends Testt {
	public void show() {
		System.out.println(2);
	}

	public static void main(String[] args) {
      
		Testt t=new Testt();
		t.show();
		Case2 c=new Case2();
		c.show();
	}

}
