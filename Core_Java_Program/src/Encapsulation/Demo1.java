package Encapsulation;
//use-3 : this keyword can be used to invoke current class constructor.
class Demo2{
Demo2()
{
	this(10);
	System.out.println("No argument Constructer");
}
Demo2(int a){
	System.out.println("Perameterized Constructor");
}
}

public class Demo1 {
	
	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.hashCode();

	}

}
