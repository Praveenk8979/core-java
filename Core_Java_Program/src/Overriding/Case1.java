package Overriding;
//do overriding method must have 	same return type (or subtype)?
//from java 5.0 onwards it is possible to have diffrent retun type for a overrrinding method 
//in child class, but child's return type of parent's return type. This phenomena is as covariant return type.
class Testd{
	Object show() {
		System.out.println("1");
		return null;
	}
}
public class Case1 extends Testd {
	String show() {
		System.out.println("2");
		return null;
	}

	public static void main(String[] args) {
         Testd d=new Testd();
         d.show();
         Case1 c=new Case1();
         c.show();
	}

}
