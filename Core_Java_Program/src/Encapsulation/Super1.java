package Encapsulation;
//use 2-: "Super" keyword can be used to invoke immediate parent class method.
class s{
	void m1() {
		System.out.println("i'm class s");
	}
}
public class Super1 extends s{
        void m1() {
        	System.out.println("i'm super class");
        }
        void show() {
        	m1();
        	super.m1();
        }
	public static void main(String[] args) {
          Super1 d=new Super1();
          d.show();
          d.m1();
	}

}
