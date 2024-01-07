package Overriding;
//Case4- overriding and abstract method
//ans- abstract method in an interface or abstract class are meant to be overridden in 
//derived concrete classes otherwise compile-time error will be thrown .

abstract class Testa{
	abstract void display();
		void show() throws RuntimeException{
			System.out.println(1);
		}
	
}
public class Case4 extends Testa {
	void display() {
		
	}
	void show() {
		System.out.println(2);
	}

	public static void main(String[] args) {
		Case4 e=new Case4();
		e.show();
//		e.display();

	}

}
